package com.skyleaf.repository;

import org.springframework.data.repository.CrudRepository;

import com.skyleaf.beans.PaymentMethod;

public interface PaymentRepository extends CrudRepository<PaymentMethod, String>{

}
