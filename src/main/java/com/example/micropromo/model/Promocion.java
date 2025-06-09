package com.example.micropromo.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Promocion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    private BigDecimal descuento; // porcentaje 0.00 - 1.00

    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private Long productoId; // ID del producto al que aplica la promo
}
