package com.skyleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skyleaf.beans.CardExpiry;
import com.skyleaf.repository.ExpiryRepository;

@RestController
@RequestMapping("/card/Expiry")
public class CardExpiryController {

	@Autowired
	private ExpiryRepository repository;

	@GetMapping("/readAll")
	public Iterable<CardExpiry> readAll() {
		Iterable<CardExpiry> all = repository.findAll();
		return all;
	}

	@PostMapping("/create")
	public CardExpiry create(@RequestBody CardExpiry cardexpiry) {
		return repository.save(cardexpiry);
	}

	@PutMapping("/update")
	public CardExpiry update(@RequestBody CardExpiry cardexpiry) {
		return repository.save(cardexpiry);
	}

	@DeleteMapping("/delete/{street}")
	public void delete(@PathVariable String month) {
		repository.deleteById(month);
	}
}
