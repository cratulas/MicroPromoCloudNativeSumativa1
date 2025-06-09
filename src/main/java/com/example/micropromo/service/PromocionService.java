package com.example.micropromo.service;

import com.example.micropromo.model.Promocion;
import com.example.micropromo.repository.PromocionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromocionService {

    @Autowired
    private PromocionRepository repo;

    public List<Promocion> listar() {
        return repo.findAll();
    }

    public Promocion guardar(Promocion p) {
        return repo.save(p);
    }

    public Promocion obtenerPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

    public List<Promocion> obtenerPorProducto(Long productoId) {
        return repo.findByProductoId(productoId);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
