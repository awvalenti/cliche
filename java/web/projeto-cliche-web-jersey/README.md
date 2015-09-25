Para construir e rodar o projeto:
	* mvn tomcat7:run

Para ver rodando:
	* No navegador, acesse: http://localhost:8081/meuprojeto/rest/pessoa
	* No navegador, acesse: http://localhost:8081/meuprojeto/rest/pessoa/1 (ou /2 ou /3)
	* No terminal, execute: curl -s -H 'Accept: application/json' http://localhost:8081/meuprojeto/rest/pessoa
