package com.mep.pedidos.controllers;

import com.mep.pedidos.models.PedidoModel;
import com.mep.pedidos.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public ResponseEntity<List<PedidoModel>> findAll() {
        List<PedidoModel> request = pedidoService.findAll();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoModel> findById(@PathVariable Long id) {
        PedidoModel request = pedidoService.findById(id);
        return ResponseEntity.ok().body(request);
    }

    @PostMapping
    public ResponseEntity<PedidoModel> save(@RequestBody PedidoModel pedidoModel) {
        PedidoModel request = pedidoService.save(pedidoModel);
        return ResponseEntity.status(201).body(request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        pedidoService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
