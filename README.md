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

----

### CONTRIBUTING:

+ Issue Request:

    * Melhorar a conversão de data como String para Local date.
    * Melhorar recebimento de String date.

###Como sugerir uma nova feature:

O dev deverá entrar em contato com algum dos integrantes do projeto (através dos e-mails disponibilizados), informar qual a parte do projeto que deseja contribuir, fazer um fork do projeto, criar uma branch com o nome “feature/{mvc}-{model}” passando nas chaves a camada do MVC e o Model respectivo.

####Como configurar o seu ambiente e rodar testes:

                
1. Como configurar o seu ambiente e rodar testes: 
https://www.eclipse.org/downloads

2. Clonar o projeto:
https://github.com/Messias-Dev/uskr-api

3.  Importar o projeto (maven).

4. Executar o projeto como Application Java.

5. Entrar na url:
http://localhost:8080/swagger-ui.html e testar os endpoints descritos na documentação. 

