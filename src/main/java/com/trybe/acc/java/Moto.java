package com.trybe.acc.java;

/**
 * Método principal.
 */

public class Moto extends VeiculoBase {

  /**
   * Atributos e Métodos.
   */

  private final String tipoDeMoto;

  /**
   * Construtor.
   */
  public Moto(
      String marca,
      String modelo,
      int ano,
      String tipoCombustivel,
      int capacidadeTanque,
      String tipoDeMoto
  ) {
    super(marca, modelo, ano, tipoCombustivel, capacidadeTanque);
    this.tipoDeMoto = tipoDeMoto;
  }

  @Override
  public double calcularConsumoCombustivel(double distancia) {
    double consumo = 18.0;
    return distancia / consumo;
  }

  @Override
  public void exibirInformacoes() {
    System.out.println("        Veículo: Moto");
    System.out.println("██████████████████████████████");
    System.out.println("Marca: " + getMarca());
    System.out.println("Modelo: " + getModelo());
    System.out.println("Ano: " + getAno());
    System.out.println("Tipo de Combustível: " + getTipoCombustivel());
    System.out.println("Capacidade do Tanque: " + getCapacidadeTanque());
    System.out.println("Tipo de moto: " + getTipoDeMoto());
    System.out.println("██████████████████████████████");
  }

  /**
   * Getters.
   */
  public String getTipoDeMoto() {
    return tipoDeMoto;
  }
}
