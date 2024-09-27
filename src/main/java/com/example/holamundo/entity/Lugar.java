package com.example.holamundo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@Entity(name="lugares")
public class Lugar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlugares")
    private int idLugares;

    @Column(name = "nombre_lugar")
    private String nombreLugar;

    @Column(name = "descrip_lugar")
    private String descripLugar;

    @Column(name = "fecha_lugar")
    private Date fechaLugar;





}
