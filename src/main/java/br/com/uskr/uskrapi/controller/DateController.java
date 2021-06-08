package br.com.uskr.uskrapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.uskr.uskrapi.service.DateService;
import br.com.uskr.uskrapi.util.EmptyDataException;

@RestController
@RequestMapping("/date")
public class DateController {
	
	@Autowired
	DateService service;

	@GetMapping("isOfLegalAge/{date}")
	public ResponseEntity<Boolean> isOfLegalAge(@PathVariable(value = "date") String date) {
		
		Boolean isOfLegalAge = null;
		HttpStatus status;
		
		try {
			isOfLegalAge = service.isOfLegalAge(date);
			status = HttpStatus.OK;
		} catch (EmptyDataException e) {
			System.out.println(e.getMessage());
			status = HttpStatus.BAD_REQUEST;
		}
		
		return new ResponseEntity<>(isOfLegalAge, status);
	}
	
	@GetMapping("calculateAge/{date}")
	public ResponseEntity<Integer> calculateAge(@PathVariable(value = "date") String date){
		Integer age = null;
		HttpStatus status;
		
		try {
			age = service.calculateAge(date);
			status = HttpStatus.OK;
		} catch (EmptyDataException e) {
			System.out.println(e.getMessage());
			status = HttpStatus.BAD_REQUEST;
		}
		
		return new ResponseEntity<>(age, status);	
	}
}
