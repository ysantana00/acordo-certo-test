# Test

O objetivo é criar um fomulário de cadastro aleatório para armazenar as informações digitadas na tela num banco de dados. Para este projeto, utilize o Spring Framework para o MVC e persistência de dados juntamente com o Hibernate. Após a finalização faça commit e envie o link para italo.souza@acordocerto.com.br.

# Dicas

1 - Dê um fork neste projeto, clone e importe no eclipse;

2 - Crie 2 módulos "maven" com os seguintes nomes:

  - fiveware-test-service (jar)
  - fiveware-test-web (war)
  
Observe que já existe um "parent" e o fiveware-test-model (jar);

3 - Configure o Spring MVC no projeto web (fiveware-test-web) através de anotações, sem utilização de XMLs;

4 - Crie um formulário qualquer de cadastro que tenha no mínimo os seguintes elementos:

  - Input de texto;
  - Combobox;
  - Checkbox.
  
O envio dos dados do formulário deve ser via AJAX. Se preferir, utilize frameworks como Angular ou React;

5 - Crie o modelo de dados para este formulário no banco de dados e também a entidade mapeada (JPA) no módulo fiveware-test-model;

6 - Implemente todas as camadas: a view chamando o controller, o controller chamando o service e, por fim, o service invocando o repository para persistência dos dados.
