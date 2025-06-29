package com.example.micropromo.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Promocion {
    private Long id;
    private String descripcion;
    private BigDecimal descuento;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Long productoId;
}
