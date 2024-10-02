package ribeiro.silveira.vinicius.javaChalangeSpring.service;

import java.util.Scanner;

public class ObterVeiculo {

    private final Scanner inputScanner = new Scanner(System.in);

    public String obterTipoVeiculo() {
        System.out.println("Digite o número de qual tipo de veículo deseja pesquisar:");
        System.out.println("""
                1- Carro
                2- Motos
                3- Caminhões""");
        while (true) {
            String input = inputScanner.nextLine();
            try {
                int opcao = Integer.parseInt(input);
                return switch (opcao) {
                    case 1 -> "carros";
                    case 2 -> "motos";
                    case 3 -> "caminhoes";
                    default -> throw new NumberFormatException();
                };
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número: 1, 2 ou 3.");
            }
        }
    }

    public int obterMarcaVeiculo() {
        System.out.println("\nDigite o código da marca do veículo:");
        try {
            return inputScanner.nextInt();
        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage());
        }
    }


    public int obterModeloVeiculo() {
        System.out.println("\n Digite o código do modelo do veículo:");
        try {
            return inputScanner.nextInt();
        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public String obterAnoModeloVeiculo() {
        System.out.println("\n Digite o código do ano do veículo:");
        try {
            return inputScanner.next();
        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}