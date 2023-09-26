package com.trybe.acc.java;

/**
 * Método principal.
 */
public class GestaoDeVeiculosApplication {

  /**
   * Atributos e Métodos.
   */
  public static void main(String[] args) {
    Carro carro = new Carro(
        "Fiat",
        "Uno",
        2010,
        "Gasolina",
        50,
        5
    );

    carro.exibirInformacoes();
    System.out.println(carro.calcularConsumoCombustivel(500));
    System.out.println("");

    Caminhao caminhao = new Caminhao(
        "Mercedes",
        "Actros",
        2021,
        "Diesel",
        300,
        20000
    );

    caminhao.exibirInformacoes();
    System.out.println(caminhao.calcularConsumoCombustivel(1000));
    System.out.println("");

    Moto moto = new Moto(
        "Honda",
        "CBR500R",
        2021,
        "Gasolina",
        17,
        "Esportiva"
    );

    moto.exibirInformacoes();
    System.out.println(moto.calcularConsumoCombustivel(250));
  }
}
