package br.com.uskr.uskrapi.service;

import br.com.uskr.uskrapi.model.Address;
import br.com.uskr.uskrapi.util.EmptyDataException;
import br.com.uskr.uskrapi.util.InvalidDataException;
import br.com.uskr.uskrapi.util.SystemException;
import org.springframework.stereotype.Service;

@Service
public class AddressService {


    public void validate(String cep) throws EmptyDataException, InvalidDataException {

        if (cep == null || cep.trim().isEmpty()) {
            throw new EmptyDataException("CEP ta vazio");
        }
        if (cep.trim().length() != 8) {
            throw new InvalidDataException("CEP invalido");
        }
        if (!cep.matches("[0-9]+")) {
            throw new InvalidDataException("CEP deve conter apenas numeros.");
        }
    }

    public void validate(Address address) throws SystemException, InvalidDataException {
        if (address.getCep() == null || address.getCep().trim().isEmpty()) {
            throw new InvalidDataException("CEP invalido");
        }

    }

}
