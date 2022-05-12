package com.nada.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nada.produits.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}