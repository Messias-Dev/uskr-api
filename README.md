### O que esse projeto faz ?
Ele irá excluir a necessidade de algumas certas regras de negócio, através de endpoints, utilizando estruturas disponíveis e já prontas para retornar valores que irão validar certas informações. 

### Por que esse projeto é útil?
Ele é útil pois torna o front-end mais leve, de maneira que as regras de negócios locais não necessitem mais de utilização. 

---

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

#### Como sugerir uma nova feature:

O dev deverá entrar em contato com algum dos integrantes do projeto (através dos e-mails disponibilizados), informar qual a parte do projeto que deseja contribuir, fazer um fork do projeto, criar uma branch com o nome “feature/{mvc}-{model}” passando nas chaves a camada do MVC e o Model respectivo.

#### Como configurar o seu ambiente e rodar testes:

                
1. Como configurar o seu ambiente e rodar testes: 
https://www.eclipse.org/downloads

2. Clonar o projeto:
https://github.com/Messias-Dev/uskr-api

3.  Importar o projeto (maven).

4. Executar o projeto como Application Java.

5. Entrar na url:
http://localhost:8080/swagger-ui.html e testar os endpoints descritos na documentação. 

#### Os tipos de contribuições que você está procurando:
Novas regras de negócio.
Seu roadmap ou visão para o projeto:
Prover regras de negócio através de endpoints para facilitar o desenvolvimento de sistemas diversos.
Como contribuidores devem (ou não devem) entrar em contato com você:
Caso precise de um suporte entre em contato com os seguintes emails: Gabriel.veloso@ucsal.edu.br, messias.lsn@gmail.com, murillo.sant23@gmail.com ou arthur.xavier@gmail.com

---

### CODE OF CONDUCT

#### Nossos compromissos:
Nosso compromisso é promover um ambiente aberto e acolhedor, nós, como contribuintes e mantenedores, nos comprometemos a tornar a participação em nosso projeto e em nossa comunidade uma experiência livre de assédio para todos, independentemente da idade, tamanho do corpo, deficiência, etnia, características sexuais, identidade de gênero e expressão, nível de experiência, educação, status socioeconômico, nacionalidade, aparência pessoal, raça, religião ou identidade e orientação sexual.
#### Nossos padrões: 
#### Nossos Padrões Exemplos de comportamento que contribuem para a criação de um ambiente positivo incluem:
 Usando uma linguagem acolhedora e inclusiva Respeitando os diferentes pontos de vista e experiências
 Aceitando críticas construtivas com elegância Foco no que é melhor para a comunidade
 Mostrando empatia para com outros membros da comunidade
 Exemplos de comportamento inaceitável por parte dos participantes incluem:
 O uso de linguagem ou imagens sexualizadas e atenção ou avanços sexuais indesejados
 Comentários de trollagem, insultos / depreciativos e ataques pessoais ou políticos 
Assédio público ou privado Publicar informações privadas de terceiros, como um endereço físico ou eletrônico, sem permissão explícita
 Outra conduta que poderia ser razoavelmente considerada inadequada em um ambiente profissional
#### Nossas responsabilidades:
Os mantenedores do projeto são responsáveis ​​por esclarecer os padrões de comportamento aceitável e devem tomar as ações corretivas adequadas e justas em resposta a quaisquer instâncias de comportamento inaceitável. 
Os mantenedores do projeto têm o direito e a responsabilidade de remover, editar ou rejeitar comentários, commits, códigos, edições de wiki, questões e outras contribuições que não estejam alinhadas a este Código de Conduta, ou banir temporária ou permanentemente qualquer contribuidor por outros comportamentos que eles consideram inadequados, ameaçadores, ofensivos ou prejudiciais.
#### Alcance:
Este Código de Conduta se aplica tanto aos espaços do projeto quanto aos espaços públicos quando um indivíduo está representando o projeto ou sua comunidade. Exemplos de representação de um projeto ou comunidade incluem o uso de um endereço de e-mail oficial do projeto, publicação por meio de uma conta oficial de mídia social ou atuação como representante indicado em um evento online ou offline. A representação de um projeto pode ser posteriormente definida e esclarecida pelos mantenedores do projeto.
#### Execução:
Casos de comportamento abusivo, de assédio ou de outra forma inaceitável podem ser relatados entrando em contato com a equipe do projeto em messias.lsn@gmail.com .Todas as reclamações serão analisadas e investigadas e resultarão em uma resposta considerada necessária e apropriada às circunstâncias. A equipe do projeto é obrigada a manter a confidencialidade em relação ao relator de um incidente. Mais detalhes de políticas de aplicação específicas podem ser publicados separadamente.
Os mantenedores do projeto que não seguem ou não aplicam o Código de Conduta de boa fé podem enfrentar repercussões temporárias ou permanentes, conforme determinado por outros membros da liderança do projeto.
#### Atribuição:
Este Código de Conduta foi adaptado do Pacto do Colaborador , versão 1.4, disponível em https://www.contributor-covenant.org/version/1/4/code-of-conduct.html
Para obter respostas a perguntas comuns sobre este código de conduta, consulte https://www.contributor-covenant.org/faq

