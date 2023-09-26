package com.trybe.acc.java;

/**
 * Método principal.
 */

public class Carro extends VeiculoBase {

  /**
   * Atributos e Métodos.
   */
  private final int quantidadePassageiros;

  /**
   * Construtor.
   */
  public Carro(
      String marca,
      String modelo,
      int ano,
      String tipoCombustivel,
      int capacidadeTanque,
      int quantidadePassageiros
  ) {
    super(marca, modelo, ano, tipoCombustivel, capacidadeTanque);
    this.quantidadePassageiros = quantidadePassageiros;
  }

  @Override
  public double calcularConsumoCombustivel(double distancia) {
    double consumo = 10.0;
    return distancia / consumo;
  }

  @Override
  public void exibirInformacoes() {
    System.out.println("        Veículo: Carro");
    System.out.println("██████████████████████████████");
    System.out.println("Marca: " + getMarca());
    System.out.println("Modelo: " + getModelo());
    System.out.println("Ano: " + getAno());
    System.out.println("Tipo de Combustível: " + getTipoCombustivel());
    System.out.println("Capacidade do Tanque: " + getCapacidadeTanque());
    System.out.println("Quantidade de Passageiros: " + getQuantidadePassageiros());
    System.out.println("██████████████████████████████");
  }

  /**
   * Getters.
   */
  public int getQuantidadePassageiros() {
    return quantidadePassageiros;
  }
}
