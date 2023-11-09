package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Compte;


@Repository
public interface CompteRepo extends JpaRepository<Compte, Integer>{
    public Compte findByUsername(String userName);        
    public Compte findByMail(String mail);        
}

