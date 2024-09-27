package com.example.holamundo.repository;


import com.example.holamundo.entity.Viajes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViajeRepository extends JpaRepository<Viajes, Integer>{

    /*
    public List<Product> findByCategory(Category category);

    List<Product> findByProductname(String productName);
    */
}

