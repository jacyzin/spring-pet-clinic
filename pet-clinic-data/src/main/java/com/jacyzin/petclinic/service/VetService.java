package com.jacyzin.petclinic.service;

import com.jacyzin.petclinic.model.Vet;

import java.util.Set;

public interface VetService { ;

    Vet findByLastName(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
