package com.skyleaf.repository;

import org.springframework.data.repository.CrudRepository;

import com.skyleaf.beans.BillingDetails;

public interface BillingRepository extends CrudRepository<BillingDetails, String>{

}
