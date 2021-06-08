package br.com.uskr.uskrapi.service;

import org.springframework.stereotype.Service;

import br.com.uskr.uskrapi.util.EmptyDataException;

@Service
public class AddressService {

	// TODO validar CEP e retornar exception se necessário
	public void validate(String cep) throws EmptyDataException {
		if (cep == null || cep.trim().isEmpty()) {
			throw new EmptyDataException("CEP ta vazio");
		}
		// TODO validar apenas numeros no CEP e 8 digitos
	}

}
