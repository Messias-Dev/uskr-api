package br.com.uskr.uskrapi.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.uskr.uskrapi.model.DateAge;
import br.com.uskr.uskrapi.util.EmptyDataException;
import br.com.uskr.uskrapi.util.InvalidDataException;

@Service
public class DateService {

	
	public Boolean isOfLegalAge(DateAge date) throws EmptyDataException, InvalidDataException, ParseException{

		Integer age = calculateAge(date);
		
		if (age >= 18) {
			return true;
		}
		
		return false;
	}

	public Integer calculateAge(DateAge dateParam) throws EmptyDataException, ParseException, InvalidDataException {
		validate(dateParam);
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); 
		Date date = format.parse(dateParam.getBirthDate());
		
		Date newDate = new Date();
		
		Integer age = newDate.getYear() - date.getYear();
		
		return age;
	}
	
	private void validate(DateAge date) throws EmptyDataException, InvalidDataException {
		if (date == null) {
			throw new EmptyDataException("Data vazia");
		}
		if (!date.getBirthDate().contains("/")) {
			throw new InvalidDataException("Data inválida");
		}
		
	}

}
