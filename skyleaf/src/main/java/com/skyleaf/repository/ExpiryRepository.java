package com.skyleaf.repository;

import org.springframework.data.repository.CrudRepository;

import com.skyleaf.beans.CardExpiry;

public interface ExpiryRepository extends CrudRepository<CardExpiry, String>{

}
