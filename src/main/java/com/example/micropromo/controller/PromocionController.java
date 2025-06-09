package com.example.micropromo.controller;

import com.example.micropromo.model.Promocion;
import com.example.micropromo.service.PromocionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/promos")
@CrossOrigin
public class PromocionController {

    @Autowired
    private PromocionService service;

    @GetMapping
    public List<Promocion> listar() {
        return service.listar();
    }

    @PostMapping
    public Promocion crear(@RequestBody Promocion p) {
        return service.guardar(p);
    }

    @GetMapping("/{id}")
    public Promocion obtener(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @GetMapping("/producto/{productoId}")
    public List<Promocion> promosPorProducto(@PathVariable Long productoId) {
        return service.obtenerPorProducto(productoId);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
