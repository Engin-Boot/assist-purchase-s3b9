package com.example.Monitor;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface mydaoRepository extends JpaRepository<Product, Integer> {

}
