Sistema de E-Commerce :
Este é o SauceDemo, um sistema de e-commerce fictício desenvolvido para simular o processo de compra online de produtos. O sistema inclui funcionalidades como login de usuário, navegação de produtos, adição ao carrinho de compras e finalização de compras.

Sobre:
O SauceDemo é uma plataforma simples para testar funcionalidades de e-commerce, com foco em processos como login, navegação de produtos e realização de compras. A plataforma foi desenvolvida com o objetivo de ser usada em testes manuais e automatizados para simulação de um site de compras online.

Tecnologias Utilizadas:
Java
Selenium WebDriver (para testes automatizados)
Spring Boot (caso deseje implementar um backend para o sistema)
Maven (para gerenciamento de dependências)
TestNG (para execução de testes)
ChromeDriver (para Selenium)

Como Executar: Para executar o projeto localmente, siga as instruções abaixo:

Clone este repositório:
git clone https://github.com/seu-usuario/saucedemo-automated-tests.git
cd saucedemo-automated-tests

mvn clean install

Instalar o ChromeDriver: Baixe o ChromeDriver conforme descrito acima e defina a variável de ambiente webdriver.chrome.driver no seu sistema para apontar para o caminho do arquivo chromedriver.

Rodando os Testes:
Você pode rodar os testes diretamente pela sua IDE ou via Maven.

Via IDE (IntelliJ IDEA, Eclipse, etc.):
Abra o projeto na sua IDE.

Selecione a classe de teste desejada, por exemplo, LoginTest.java.

Clique com o botão direito e selecione Run para executar os testes.

Via Maven (Terminal):
mvn test -Dtest=LoginTest

Considerações Finais :
Agora você está pronto para rodar tanto o sistema quanto os testes automatizados do SauceDemo! Para quaisquer problemas ou dúvidas, consulte a documentação do Selenium WebDriver ou entre em contato com a equipe de desenvolvimento.

Este projeto tem como objetivo fornecer uma base de testes de e-commerce que pode ser expandida conforme necessário.


