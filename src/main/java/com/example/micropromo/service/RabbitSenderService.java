package com.example.micropromo.service;

import com.example.micropromo.config.RabbitMQConfig;
import com.example.micropromo.model.Promocion;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class RabbitSenderService {

    private final RabbitTemplate rabbitTemplate;

    public RabbitSenderService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void enviarPromocion(Promocion promocion) {
        rabbitTemplate.convertAndSend(
                "",
                RabbitMQConfig.PROMOS_QUEUE,
                promocion
        );
    }
}
