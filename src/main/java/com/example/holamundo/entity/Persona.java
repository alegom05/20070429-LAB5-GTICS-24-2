package com.example.holamundo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity (name="persona")
public class Persona {

    @Id
    @Column(name = "idPersona")
    private int idPersona;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "dni")
    private String dni;

    @Column(name = "celular")
    private String celular;

    @Column(name = "tipo_persona")
    private String tipoPersona;


}
