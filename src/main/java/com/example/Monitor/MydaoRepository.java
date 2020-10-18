package com.example.Monitor;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface MydaoRepository extends JpaRepository<Product, Integer> {

}
