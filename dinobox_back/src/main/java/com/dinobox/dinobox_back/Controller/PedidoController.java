package com.dinobox.dinobox_back.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.dinobox.dinobox_back.Entity.Pedido;
import com.dinobox.dinobox_back.Service.ServicePedido;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
public class PedidoController {
    @Autowired
    private ServicePedido service;

    @PostMapping("/api/v1/encomienda")
    public Pedido savePedido(@RequestBody Pedido p) {
        return service.savePedido(p);
    }
    
    @GetMapping("/api/v1/encomienda/{codigo}")
    public Pedido findById(@PathVariable int codigo) {
        return service.getPedidoById(codigo);
    }

   @PutMapping("/api/v1/encomienda/{codigo}")
    public Pedido actualizarPedido(@PathVariable int codigo, @RequestBody Pedido p) {
    return service.updatePedido(codigo, p);
}

}


    
