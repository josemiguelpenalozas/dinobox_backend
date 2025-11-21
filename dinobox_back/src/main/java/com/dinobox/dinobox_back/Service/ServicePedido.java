package com.dinobox.dinobox_back.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.dinobox.dinobox_back.Entity.Pedido;
import com.dinobox.dinobox_back.Repository.PedidoRepository;

@Service
public class ServicePedido {
    @Autowired
    private PedidoRepository repository;

    public Pedido savePedido(Pedido p){
        return repository.save(p);
    }

    public List<Pedido> getPedido(){
        return repository.findAll();
    }

    public Pedido getPedidoById(int id){
        return repository.findById(id).orElse(null);
    }


public Pedido updatePedido(int codigo, Pedido p) {

    // Buscar el pedido
    Pedido existingPedido = repository.findById(codigo).orElse(null);

    if (existingPedido == null) {
        return null; 
    }


    existingPedido.setNombreRemi(p.getNombreRemi());
    existingPedido.setNombreDestinatario(p.getNombreDestinatario());
    existingPedido.setDireccionOrigen(p.getDireccionOrigen());
    existingPedido.setDireccionDestino(p.getDireccionDestino());
    existingPedido.setTelefonoOrigen(p.getTelefonoOrigen());
    existingPedido.setTelefonoDestino(p.getTelefonoDestino());
    existingPedido.setDescripcion(p.getDescripcion());
    existingPedido.setPeso(p.getPeso());
    existingPedido.setDimenciones(p.getDimenciones());

    return repository.save(existingPedido);
}


}
