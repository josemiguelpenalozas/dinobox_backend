package com.dinobox.dinobox_back.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PEDIDO")
public class Pedido {
    @Id
    @GeneratedValue
    private int id;

    @Column(name="nombreRemi")
    private String nombreRemi;

    @Column(name="nombreDestinatario")
    private String nombreDestinatario;
    
    @Column(name="direccionOrigen")
    private String direccionOrigen;

    @Column(name="direccionDestino")
    private String direccionDestino;

    @Column(name="telefonoOrigen")
    private int telefonoOrigen;

    @Column(name="telefonoDestino")
    private int telefonoDestino;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="peso")
    private int peso;

    @Column(name="dimenciones")
    private String dimenciones;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreRemi() {
        return nombreRemi;
    }

    public void setNombreRemi(String nombreRemi) {
        this.nombreRemi = nombreRemi;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }

    public String getDireccionOrigen() {
        return direccionOrigen;
    }

    public void setDireccionOrigen(String direccionOrigen) {
        this.direccionOrigen = direccionOrigen;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public int getTelefonoOrigen() {
        return telefonoOrigen;
    }

    public void setTelefonoOrigen(int telefonoOrigen) {
        this.telefonoOrigen = telefonoOrigen;
    }

    public int getTelefonoDestino() {
        return telefonoDestino;
    }

    public void setTelefonoDestino(int telefonoDestino) {
        this.telefonoDestino = telefonoDestino;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getDimenciones() {
        return dimenciones;
    }

    public void setDimenciones(String dimenciones) {
        this.dimenciones = dimenciones;
    }

    @Override
    public String toString() {
        return "Pedido [id=" + id + ", nombreRemi=" + nombreRemi + ", nombreDestinatario=" + nombreDestinatario
                + ", direccionOrigen=" + direccionOrigen + ", direccionDestino=" + direccionDestino
                + ", telefonoOrigen=" + telefonoOrigen + ", telefonoDestino=" + telefonoDestino + ", descripcion="
                + descripcion + ", peso=" + peso + ", dimenciones=" + dimenciones + "]";
    }

    
}
