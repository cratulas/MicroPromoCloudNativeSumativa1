package com.example.micropromo.controller;

import com.example.micropromo.model.Promocion;
import com.example.micropromo.service.RabbitSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/promos")
@CrossOrigin
public class PromocionController {

    @Autowired
    private RabbitSenderService rabbitSenderService;

    @PostMapping
    public String enviarPromocion(@RequestBody Promocion promocion) {
        rabbitSenderService.enviarPromocion(promocion);
        return "Promoción enviada a la cola RabbitMQ";
    }
}
