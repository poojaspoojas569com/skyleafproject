package com.skyleaf.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.skyleaf.beans.BillingDetails;
import com.skyleaf.repository.BillingRepository;



@RestController
@RequestMapping("/billing/details")
public class BillingDetailsControlor {
	
	@Autowired
	private BillingRepository repository;

	@GetMapping("/readAll")
	public String readAll() {
		Iterable<BillingDetails> all = repository.findAll();
		
		Gson gson = new Gson();
		String json = gson.toJson(all);
		//JSONObject j1= new JSONObject(json);
		return json;
		
		
		
	}

	@PostMapping("/create")
	public BillingDetails create(@RequestBody BillingDetails billing) {
		return repository.save(billing);
	}

	@PutMapping("/update")
	public BillingDetails update(@RequestBody BillingDetails billing) {
		return repository.save(billing);
	}

	@DeleteMapping("/delete/{street}")
	public void delete(@PathVariable String street) {
		repository.deleteById(street);
	}


}
