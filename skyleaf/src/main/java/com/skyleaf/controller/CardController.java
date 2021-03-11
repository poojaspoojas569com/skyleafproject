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

import com.skyleaf.beans.BillingDetails;
import com.skyleaf.beans.Card;
import com.skyleaf.repository.CardRepository;


@RestController
@RequestMapping("/card")
public class CardController {
	
	@Autowired
	private CardRepository repository;
	
	@GetMapping("/readAll")
	public Iterable<Card> readAll() {
		Iterable<Card> all = repository.findAll();
		return all;
	}

	@PostMapping("/create")
	public Card create(@RequestBody Card card) {
		return repository.save(card);
	}

	@PutMapping("/update")
	public Card update(@RequestBody Card card) {
		return repository.save(card);
	}

	@DeleteMapping("/delete/{holderName}")
	public void delete(@PathVariable String holderName) {
		repository.deleteById(holderName);
	}


}
