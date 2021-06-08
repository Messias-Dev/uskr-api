package br.com.uskr.uskrapi.controller;

import br.com.uskr.uskrapi.util.InvalidDataException;
import br.com.uskr.uskrapi.util.SystemException;
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
		HttpStatus status;
		try {
			service.validate(cep);
			RestTemplate restTemplate = new RestTemplate();
			address = restTemplate.getForObject("http://viacep.com.br/ws/"+cep+"/json/", Address.class);
			service.validate(address);
			status = HttpStatus.OK;
		} catch (EmptyDataException | InvalidDataException e) {
			System.out.println(e.getMessage());
			status = HttpStatus.BAD_REQUEST;
		} catch (SystemException e) {
			System.out.println(e.getMessage());
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<>(address, status);
	}
}
