package aula05;

public class Usingcontbanc {
    public static void main(String[] args) {
        Contabanc p1 = new Contabanc();
        p1.setNumConta(1111);
        p1.setDono("Célia");
        p1.abrirConta("CC");

        Contabanc p2 = new Contabanc();
        p2.setNumConta(2222);
        p2.setDono("Abel");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);
        p2.retirar(100);

        p1.fecharConta();
    }
}
