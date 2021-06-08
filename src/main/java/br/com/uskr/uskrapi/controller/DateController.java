package br.com.uskr.uskrapi.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.uskr.uskrapi.model.DateAge;
import br.com.uskr.uskrapi.service.DateService;
import br.com.uskr.uskrapi.util.EmptyDataException;
import br.com.uskr.uskrapi.util.InvalidDataException;

@RestController
@RequestMapping("/date")
public class DateController {

	@Autowired
	DateService service;

	@GetMapping("isOfLegalAge")
	public ResponseEntity<Boolean> isOfLegalAge(@RequestBody DateAge date) {

		Boolean isOfLegalAge = null;
		HttpStatus status;

		try {
			isOfLegalAge = service.isOfLegalAge(date);
			status = HttpStatus.OK;
		} catch (EmptyDataException | InvalidDataException e) {
			System.out.println(e.getMessage());
			status = HttpStatus.BAD_REQUEST;
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return new ResponseEntity<>(isOfLegalAge, status);
	}

	@GetMapping("calculateAge")
	public ResponseEntity<Integer> calculateAge(@RequestBody DateAge date){
		System.out.println(date.getBirthDate());
		Integer age = null;
		HttpStatus status;

		try {
			age = service.calculateAge(date);
			status = HttpStatus.OK;
		} catch (EmptyDataException | InvalidDataException e) {
			System.out.println(e.getMessage());
			status = HttpStatus.BAD_REQUEST;
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<>(age, status);	
	}
}
