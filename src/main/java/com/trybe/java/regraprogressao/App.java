package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    String quantityValue = scanner.nextLine();
    int totalValue = Integer.parseInt(quantityValue);

    for (int index = 1; index <= totalValue; index += 1) {
      System.out.println("Digite o nome da atividade " + index + ":");
      String activity = scanner.nextLine();

      System.out.println("Digite peso da atividade " + index + ":");
      int peso = Integer.parseInt(scanner.nextLine());
    }
  }
}