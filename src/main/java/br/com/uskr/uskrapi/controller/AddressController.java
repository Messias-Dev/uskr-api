package br.com.uskr.uskrapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.uskr.uskrapi.model.Address;
import br.com.uskr.uskrapi.service.AddressService;
import br.com.uskr.uskrapi.util.EmptyDataException;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	AddressService service;

	// Busca endereço por CEP via API externa
	@GetMapping("findByCep/{cep}")
	public ResponseEntity<Address> getByCep(@PathVariable(value = "cep") String cep)  {

		Address address = null;
		
		//TODO Alterar status quando try catch for acionado
		HttpStatus status;
		
		try {
			service.validate(cep);
			RestTemplate restTemplate = new RestTemplate();
			address = restTemplate.getForObject("http://viacep.com.br/ws/"+cep+"/json/", Address.class);
			status = HttpStatus.OK;
		} catch (EmptyDataException e) {
			System.out.println(e.getMessage());
			status = HttpStatus.BAD_REQUEST;
		}

		return new ResponseEntity<>(address, status);
	}
}
