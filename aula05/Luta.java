package aula05;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiador;
    private int rounds;
    private boolean Lutaaprovada;

    public void setAprovada(boolean aprovada) {
        this.Lutaaprovada = aprovada;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiador(Lutador desafiador) {
        this.desafiador = desafiador;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiador() {
        return desafiador;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean isAprovada() {
        return Lutaaprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {
        if ((l1.getCategoria() == l2.getCategoria()) && (l1 != l2)) {
            setAprovada(true);
            setDesafiado(l1);
            setDesafiador(l2);
        } else {
            setAprovada(false);
            setDesafiado(null);
            setDesafiador(null);
        }
    }

    public void lutar() {
        if (isAprovada()) {
            System.out.println("### DESAFIADO ###");
            getDesafiado().apresentar();
            System.out.println("### DESAFIADOR ###");
            getDesafiador().apresentar();

            Random aleatorio = new Random();
            int resultado = aleatorio.nextInt(3);

            switch (resultado) {
                case 0:
                    System.out.println("Empatou!");
                    getDesafiado().empatarLuta();
                    getDesafiador().empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória!");
                    getDesafiado().ganharLuta();
                    getDesafiador().perderLuta();
                    break;
                case 2:
                    System.out.println("Derrota!");
                    getDesafiado().perderLuta();
                    getDesafiador().ganharLuta();
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Luta não aprovada");
        }
    }
}
