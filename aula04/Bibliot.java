package aula04;

import java.util.ArrayList;
import java.util.Scanner;

public class Bibliot {
    public static void main(String[] args) {
        int operation, nMec, id;
        String nome, curso;
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> catalogo = new ArrayList<Book>();
        ArrayList<User> listaUser = new ArrayList<User>();

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
                    System.out.println("Nº Mec??");
                    nMec = sc.nextInt();
                    System.out.println("Nome??");
                    sc.nextLine();
                    nome = sc.nextLine();
                    System.out.println("Curso??");
                    curso = sc.nextLine();
                    listaUser.add(new User(nome, nMec, curso));

                    break;
                case 2:
                    System.out.println("Utilizador a remover(Nº Mec)?");
                    int nmec = sc.nextInt();

                    for (int i = 0; i < listaUser.size(); i++) {
                        if (listaUser.get(i).getnMec() == nmec) {
                            listaUser.remove(i);
                            System.out.println("Removido");
                        }
                    }

                    break;
                case 3:
                    for (User u : listaUser) {
                        if (u != null) {
                            System.out.println(u);
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Nome??");
                    sc.nextLine();
                    String titulo = sc.nextLine();
                    catalogo.add(new Book(titulo, "Normal"));

                    break;
                case 5:
                    for (Book l : catalogo) {
                        if (l != null) {
                            System.out.println(l);
                        }
                    }
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Nº Mec?");
                    nMec = sc.nextInt();
                    for (int i = 0; i < listaUser.size(); i++) {
                        if (listaUser.get(i).getnMec() == nMec) {
                            User verify = new User(nMec);
                            if (verify.verifyemprest(nMec)) {
                                System.out.println("livro a emprestar?");
                                id = sc.nextInt();

                                for (int j = 0; j < catalogo.size(); j++) {
                                    if (catalogo.get(j).getId() == id) {

                                        User emprestimo = new User(nMec);
                                        emprestimo.list_of_given_books(id);

                                        for (int k = 0; k < catalogo.size(); k++) {
                                            if (catalogo.get(k).getId() == id) {
                                                catalogo.get(k).setTipoEmprestimo("Condicional");
                                                System.out.println("É teu, mas tem V de volta!");
                                                System.out.println();
                                            }
                                        }
                                    } else {
                                        System.out.println("Livro não registado!");
                                        break;
                                    }
                                }

                            } else {
                                System.out.println("Utilizador não registado!");
                                break;
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("ID do Livro a devolver");
                    id = sc.nextInt();
                    User remove_emprestimo = new User();
                    remove_emprestimo.remover_emprestimo(id);

                    for (int i = 0; i < catalogo.size();) {
                        if (catalogo.get(i).getId() == id) {
                            catalogo.get(i).setTipoEmprestimo("Normal");
                            System.out.println("Devolvido");
                            System.out.println();
                        }
                    }
                    break;
                case 8:
                    break;
            }
        } while (operation != 8);
        sc.close();
    }
}
