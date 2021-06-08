### O que esse projeto faz ?
Ele irá excluir a necessidade de algumas certas regras de negócio, através de endpoints, utilizando estruturas disponíveis e já prontas para retornar valores que irão validar certas informações. 

### Por que esse projeto é útil?
Ele é útil pois torna o front-end mais leve, de maneira que as regras de negócios locais não necessitem mais de utilização. 

### Como usar (endpoints)

#### Validação de CPF

- https://uskr-api.herokuapp.com/cpf/isValid/
- Passa CPF (String) como parâmetro.
- Código 200:
  - Retorna true se for válido e false se não for válido.
- Código 400: 
  - Se não enviou de forma correta.
- (Forma correta: String, 11 caracteres, APENAS NÚMERO).

     
#### Endereço completo via CEP

- https://uskr-api.herokuapp.com/address/findByCep/
- Passa CEP (String) como parâmetro.
- Código 200:
  - retorna objeto endereco como JSON
- Código 400: 
  - Se não enviou de forma correta.
- Forma correta: String, 8 caracteres, APENAS NÚMEROS.


#### Retornar se a data de nascimento corresponde a atual maioridade

- https://uskr-api.herokuapp.com/date/isOfLegalAge
- passa JSON {“birthdate”: “date”} (String) como parâmetro,
- Código 200: 
  -  Retorna true se for maior de idade (18 anos) e false se não.
- Código 400: 
  - Se não enviou de forma correta.
- Forma correta: (String, dd/MM/yyyy).


#### Retornar se a data de nascimento corresponde a atual maioridade

- https://uskr-api.herokuapp.com/date/calculateAge
- passa JSON {“birthdate”: “date”} (String) como parâmetro,
- Código 200: 
  -  Retorna inteiro com valor da idade.
- Código 400: 
  - Se não enviou de forma correta.
- Forma correta: (String, dd/MM/yyyy).

