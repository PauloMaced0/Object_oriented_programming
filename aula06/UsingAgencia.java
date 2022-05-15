package aula06;

import java.util.Scanner;

public class UsingAgencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Cod, nome, local;
        int numQuartos, codigocar;
        double preço;
        int operation;

        Agenciaviag agviag = new Agenciaviag("Pereira", "Rua dos Pessegueiros,Nº:190,Lua");

        do {
            System.out.println("1 - Adicionar apartamento");
            System.out.println("2 - Adicionar quarto");
            System.out.println("3 - Adicionar carro");
            System.out.println("4 - Remover alojamento");
            System.out.println("5 - Remover carro");
            System.out.println("6 - Check-in");
            System.out.println("7 - Check-out");
            System.out.println("8 - Alugar carro");
            System.out.println("9 - Devolver carro");
            System.out.println("10 - Detalhes da agência");
            System.out.println("0 - exit");
            System.out.println();
            System.out.print("Operação? ");
            operation = sc.nextInt();
            sc.nextLine();
            System.out.println();


            switch (operation) {
                case 0:
                    break;
                case 1:
                    System.out.println("Cod");
                    Cod = sc.nextLine();
                    System.out.println("Nome");
                    nome = sc.nextLine();
                    System.out.println("Local");
                    local = sc.nextLine();
                    System.out.println("Preço");
                    preço = sc.nextDouble();
                    System.out.println("Nº Quartos");
                    numQuartos = sc.nextInt();
                    Apartamento ap = new Apartamento(Cod, nome, local, preço, numQuartos);
                    agviag.addAlojamento(ap);
                    break;
                case 2:
                    System.out.println("Cod");
                    Cod = sc.nextLine();
                    System.out.println("Nome");
                    nome = sc.nextLine();
                    System.out.println("Local");
                    local = sc.nextLine();
                    System.out.println("Preço");
                    preço = sc.nextDouble();
                    Quarto q = new Quarto(Cod, nome, local, preço);
                    agviag.addAlojamento(q);
                    break;
                case 3:
                    Carro c = new Carro();
                    agviag.addCarro(c);
                    System.out.println("Carro adicionado!");
                    break;
                case 4:
                    System.out.print("Código do alojamento");
                    Cod = sc.nextLine();
                    agviag.removealoj(Cod);
                    break;
                case 5:
                    System.out.println("Código do carro");
                    codigocar = sc.nextInt();
                    agviag.removecarro(codigocar);
                    break;
                case 6:
                    System.out.println("(Check-in) Código do alojamento");
                    Cod = sc.nextLine();
                    agviag.Checkin(Cod);
                    break;
                case 7:
                    System.out.println("(Check-out) Código do alojamento");
                    Cod = sc.nextLine();
                    agviag.Checkout(Cod);
                    break;
                case 8:
                    System.out.println("Código do carro");
                    codigocar = sc.nextInt();
                    agviag.alugarCarro(codigocar);
                    break;
                case 9:
                    System.out.println("Código do carro");
                    codigocar = sc.nextInt();
                    agviag.devolverCarro(codigocar);
                    break;
                case 10:
                    System.out.println(agviag);
                    System.out.println();
                    System.out.println("--Alojamento--");
                    for (Alojamento a : agviag.getAloj()) {
                        System.out.println(a);
                    }
                    System.out.println();
                    System.out.println("--Carros disponíveis--");
                    for (Carro car : agviag.getCar()) {
                        System.out.println(car);
                    }
                    break;
                default:
                    System.out.println("Bye!");
                    break;
            }
        } while (operation != 0);
        sc.close();
    }
}
