package com.jacyzin.petclinic.service;

import com.jacyzin.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner fundById(Long id);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
