package com.mep.pedidos.services;

import com.mep.pedidos.models.PedidoModel;
import com.mep.pedidos.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<PedidoModel> findAll() {
        return pedidoRepository.findAll();
    }

    public PedidoModel findById(Long id) {
        return pedidoRepository.findById(id).get();
    }

    public PedidoModel save(PedidoModel pedidoModel) {
        return pedidoRepository.save(pedidoModel);
    }

    public void delete(Long id) {
        pedidoRepository.deleteById(id);
    }

}
