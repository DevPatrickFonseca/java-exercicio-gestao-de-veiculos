<div align="center">
  <h1><strong>Exercício de um Sistema de <br> Gestão de Veículos em Java 🚚🛻🏍️</h1>
  </div>

## <strong>🧰Tecnologias, linguagens e ferramentas:</strong><br />
  <div align="center">
    <a href="https://github.com/PFonsecaFV/PFonsecaFV">
    <img src="https://github.com/PFonsecaFV/PFonsecaFV/blob/main/src/icons/ic_java.svg" width="60" fill="none" />
    <img src="https://github.com/PFonsecaFV/PFonsecaFV/blob/main/src/icons/ic_maven.svg" width="60" fill="none" />
    <img src="https://github.com/PFonsecaFV/PFonsecaFV/blob/main/src/icons/ic_junit.svg" width="60" fill="none" />
  </a>
  </div>
  

## <strong>🎯Habilidades Utilizadas</strong><br />

Neste exercício, pude aprimorar várias habilidades, incluindo:

- Aplicar o conceito de Orientação a Objetos para desenvolver classes eficazes em Java.
- Implementar getters e setters em suas classes de programação para acessar e alterar atributos de maneira controlada.
- Usar o princípio de Encapsulamento para ocultar o estado interno de um objeto, preservando a integridade dos dados.
- Empregar a Herança para criar novas classes derivadas de classes base, aumentando a reutilização de código e a organização do seu exercício.
- Demonstrar entendimento de Polimorfismo, permitindo que objetos de diferentes classes sejam tratados como objetos de uma classe comum.
- Utilizar Interfaces para definir comportamentos que devem ser implementados por classes específicas.
- Aplicar o conceito de Classes Abstratas, criando modelos para outras classes herdarem.

## 📝Orientações para instalar e testar o projeto

1. Crie um diretório usando o comando mkdir e entre no diretório:
	```bash
	mkdir patrick-fonseca-java-exercicios && cd patrick-fonseca-java-exercicios
	```
 2. Clone o repositório e use o comando no terminal:
	```bash
	git clone git@github.com:PFonsecaFV/java-exercicio-gestao-de-veiculos.git
	```
3. Acesse o diretório do projeto:
	```bash
	cd java-exercicio-gestao-de-veiculos
	```
4. Instale suas dependências:
	```bash
	mvn install
	```

## ✅ O que foi desenvolvido

### 1. **Calcular o consumo de combustível do Carro:**
  - Criei a interface `Veiculo` que define os métodos a serem implementados por todos os veículos
  - Implementei a classe abstrata `VeiculoBase`, que contém atributos comuns a todos os veículos
  - Na classe `Carro`, estendi `VeiculoBase`, adicionei um atributo para o número de passageiros
  - Implementei os métodos da interface, incluindo o cálculo do consumo de combustível

### 2. **Calcular o consumo de combustível do Caminhão:**
  - Implementei a classe `Caminhao` que estende `VeiculoBase`
  - Adicionei um atributo para o número de passageiros
  - Implementei os métodos da interface, incluindo o cálculo do consumo de combustível

### 3. **Calcular o consumo de combustível da Moto:**
  - Implementei a classe `Moto` que estende `VeiculoBase`
  - Adicionei um atributo para o número de passageiros
  - Implementei os métodos da interface, incluindo o cálculo do consumo de combustível

### 4. **Foi criado a Classe GestaoDeVeiculosApplication:**
  - A classe `GestaoDeVeiculosApplication` é a classe principal do meu projeto de Gestão de Veículos em Java
  - Nela, eu defino o método principal (`main`) que é o ponto de entrada da minha aplicação
  - No método `main`, eu realizei as seguintes ações:
      ```html
      1. Criei uma instância de um objeto `Carro` representando um carro da 
      marca Fiat, modelo Uno, ano 2010,
      abastecido com gasolina, com capacidade de
      tanque de 50 litros e com espaço para 5 passageiros.
      ```
      ```html
      2. Utilizei o método `exibirInformacoes()` do objeto `carro` para mostrar informações específicas do carro.
      ```
      ```html
      3. Calculei o consumo de combustível do carro percorrendo uma distância de 500 quilômetros
      usando o método `calcularConsumoCombustivel(500)` e exibi o resultado.
      ```
      ```html
      4. Repeti os passos acima para um objeto `Caminhao`, que representa um caminhão da
      marca Mercedes, modelo Actros, ano 2021, abastecido com diesel, com capacidade
      de tanque de 300 litros e capacidade de carga de 20.000 kg.
      ```
      ```html
      5. Repeti os passos novamente para um objeto `Moto`, que representa uma moto da
      marca Honda, modelo CBR500R, ano 2021, abastecida com gasolina, com capacidade
      de tanque de 17 litros e do tipo esportiva.
      ```

Cada vez que criei um veículo, utilizei seus métodos para exibir informações específicas e calcular o consumo de combustível com base na distância percorrida.

Este código principal da aplicação é responsável por demonstrar como os objetos das classes `Carro`, `Caminhao` e `Moto` podem ser criados e usados para gerenciar informações sobre veículos e calcular seu consumo de combustível.

## 🛠️ Testes

Para executar todos os testes basta rodar o comando:
  ```bash
  mvn test
  ```

Para executar os testes por funcionalidades desenvolvidas

Teste 01 - **Calcular consumo combustível do Carro**:
  ```bash
  mvn test -Dtest="testCalcularConsumoCombustivelCarro"
  ```

Teste 02 - **Calcular consumo combustível do Caminhão**:
  ```bash
  mvn test -Dtest="testCalcularConsumoCombustivelCaminhao"
  ```

Teste 03 - **Calcular consumo combustível da Moto**:
  ```bash
  mvn test -Dtest="testCalcularConsumoCombustivelMoto"
  ```

---

<div align="center">
  <h2>Patrick Fonseca</h2>
	  <a href="https://www.linkedin.com/in/PatrickFonseca/" target="_blank">
      <img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank">
    </a>
</div>
