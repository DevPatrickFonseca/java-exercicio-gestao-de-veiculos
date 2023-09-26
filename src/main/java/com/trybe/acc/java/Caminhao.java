package com.trybe.acc.java;

/**
 * Método principal.
 */

public class Caminhao extends VeiculoBase {

  /**
   * Atributos e Métodos.
   */
  private final double capacidadeDeCarga;

  /**
   * Construtor.
   */
  public Caminhao(
      String marca,
      String modelo,
      int ano,
      String tipoCombustivel,
      int capacidadeTanque,
      double capacidadeDeCarga
  ) {
    super(marca, modelo, ano, tipoCombustivel, capacidadeTanque);
    this.capacidadeDeCarga = capacidadeDeCarga;
  }


  @Override
  public double calcularConsumoCombustivel(double distancia) {
    double consumo = 6.0;
    return distancia / consumo;
  }

  @Override
  public void exibirInformacoes() {
    System.out.println("      Veículo: Caminhão");
    System.out.println("██████████████████████████████");
    System.out.println("Marca: " + getMarca());
    System.out.println("Modelo: " + getModelo());
    System.out.println("Ano: " + getAno());
    System.out.println("Tipo de Combustível: " + getTipoCombustivel());
    System.out.println("Capacidade do Tanque: " + getCapacidadeTanque());
    System.out.println("Capacidade de Carga: " + getCapacidadeDeCarga());
    System.out.println("██████████████████████████████");
  }

  /**
   * Getters.
   */
  public double getCapacidadeDeCarga() {
    return capacidadeDeCarga;
  }
}
