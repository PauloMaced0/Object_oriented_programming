package aula04;

import java.util.ArrayList;

public class BiblioManegement {
    public static void main(String[] args) {

        Book catalogo[] = new Book[10];
        catalogo[0] = new Book("Java 8", "CONDICIONAL");
        catalogo[1] = new Book("POO em Java 8");
        catalogo[2] = new Book("Java para totós", "NORMAL");
        System.out.println("ID = " + catalogo[1].getId() + ", " + catalogo[1].getTitulo());
        catalogo[2].setTipoEmprestimo("CONDICIONAL");

        for (int i = 0; i < catalogo.length; i++) {
            if (catalogo[i] != null) {
                System.out.println(catalogo[i]);
            }
        }
        ArrayList<User> alunos = new ArrayList<>();
        alunos.add(new User("Paulo Macedo", 100000, "CT"));
        alunos.add(new User("Zé Truta", 900000, "ET"));
        alunos.get(1).setnMec(999999);

        for (User u : alunos) {
            System.out.println(u);
        }

    }
}
