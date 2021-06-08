package br.com.uskr.uskrapi.service;

import org.springframework.stereotype.Service;

import br.com.uskr.uskrapi.util.EmptyDataException;

@Service
public class DateService {

	
	public Boolean isOfLegalAge(String date) throws EmptyDataException{
		validate(date);
		// TODO transformar String date dd/MM/yyy para fazer cálculo e verificar se a subtração é >=18
		return null;
	}

	public Integer calculateAge(String date) throws EmptyDataException {
		validate(date);
		
		// TODO
		return null;
	}
	
	private void validate(String date) throws EmptyDataException {
		if (date == null || date.trim().isEmpty()) {
			throw new EmptyDataException("Data vazia");
		}
		
	}

}
