package com.jacyzin.petclinic.service;

import com.jacyzin.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet fundById(Long id);

    Pet findByLastName(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
