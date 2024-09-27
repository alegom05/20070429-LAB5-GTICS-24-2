package com.example.holamundo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="viajes")
public class Viajes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idViajes")
    private int id;

    @Column(name = "punto_recojo")
    private String puntoRecojo;

    @Column(name = "cant_personas")
    private String cantPersonas;

    @Column(name = "cant_perros")
    private String cantPerros;

    @ManyToOne
    @JoinColumn(name = "Persona_idPersona")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "Lugares_idLugares")
    private Lugar lugar;

}
