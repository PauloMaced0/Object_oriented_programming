package aula04;
import java.util.Scanner;
public class Bibliot {
    public static void main(String[] args) {
        int operation;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1 - inscrever utilizador");
            System.out.println("2 - remover utilizador");
            System.out.println("3 - imprimir lista de utilizadores");
            System.out.println("4 - registar um novo livro");
            System.out.println("5 - imprimir lista de livros");
            System.out.println("6 - emprestar");
            System.out.println("7 - devolver");
            System.out.println("8 - sair");
            operation = sc.nextInt();
            switch (operation) {
                case 1:
                    
                    break;
                case 2:
                   
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }
        } while (operation != 8);
        sc.close();
    }
}
