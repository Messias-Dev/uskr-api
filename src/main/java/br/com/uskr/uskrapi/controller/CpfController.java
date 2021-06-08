package br.com.uskr.uskrapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.uskr.uskrapi.service.CpfService;
import br.com.uskr.uskrapi.util.EmptyDataException;
import br.com.uskr.uskrapi.util.InvalidDataException;

@RestController
@RequestMapping("/cpf")
public class CpfController {

	@Autowired
	CpfService service;
	
	@PostMapping("isValid/{cpf}")
	public ResponseEntity<Boolean> isValid(@PathVariable(value = "cpf") String cpf){
		
		Boolean isValid = null;
		HttpStatus status;
		
		try {
			isValid = service.isValid(cpf);
			status = HttpStatus.OK;
		} catch (EmptyDataException | InvalidDataException e) {
			status = HttpStatus.BAD_REQUEST;	
		}
		
		return new ResponseEntity<>(isValid, status);
	}
}
