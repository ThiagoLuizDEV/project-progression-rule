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
    double sumOfNotes = 0.0f;
    int divider = 100;

    for (int index = 1; index <= totalValue; index += 1) {

      System.out.println("Digite o nome da atividade " + index + ":");
      String activity = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + index + ":");
      int peso = Integer.parseInt(scanner.nextLine());

      System.out.println("Digite a nota obtida para " + activity + ":");
      String noteActivity = scanner.nextLine();
      double finalGrade = Double.parseDouble(noteActivity) * peso / divider;
      sumOfNotes += finalGrade;
    }

    if (sumOfNotes >= 85.0) {
      System.out.println("Parabéns! Você alcançou "
          + sumOfNotes +
          "%! E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, "
          + sumOfNotes +
          "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
  }
}