package aula09;

public class UsingConjTermV2 {
    public static void main(String[] args) {
        ConjTermV2 conj = new ConjTermV2();
        conj.add("branco", "Cor da neve");
        conj.add("branco", "Cor da farinha");
        conj.add("preto", "Cor do morcego");
        conj.add("branco", "Cor do algodão");
        conj.add("verde", "Cor das folhas");
        conj.add("verde", "Cor das salsa");
        conj.add("vermelho", "morango");
        conj.add("vermelho", "Cor do sangue");
        conj.add("azul", "Cor do céu");
        System.out.println(conj);

        System.out.println("\nRandom significado de branco");
        for (int repeat = 1; repeat <= 10;repeat++) {
            System.out.println(conj.randomSignificado("branco"));
        }
    }
}
