package aula06;

import java.util.ArrayList;

public class Agenciaviag {
    private String nome;
    private String endereço;

    ArrayList<Carro> car = new ArrayList<>();
    ArrayList<Alojamento> aloj = new ArrayList<>();

    Agenciaviag(String nome, String endereço) {
        this.nome = nome;
        this.endereço = endereço;
    }

    public void setAloj(ArrayList<Alojamento> aloj) {
        this.aloj = aloj;
    }

    public void setCar(ArrayList<Carro> car) {
        this.car = car;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Alojamento> getAloj() {
        return aloj;
    }

    public ArrayList<Carro> getCar() {
        return car;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getNome() {
        return nome;
    }

    public void addCarro(Carro carro) {
        car.add(carro);
    }

    public void addAlojamento(Alojamento alojam) {
        aloj.add(alojam);
    }

    public void removealoj(String cod) {
        for (Alojamento a : aloj) {
            if (a.getCod().equals(cod)) {
                aloj.remove(a);
            } else {
                System.out.println("Não removido!");
            }
        }
    }

    public void removecarro(int cod) {
        for (Carro c : car) {
            if (cod == c.getCodigo()) {
                car.remove(c);
            } else {
                System.out.println("Não removido!");
            }
        }
    }

    public void Checkin(String cod) {
        for (Alojamento a : aloj) {
            if (a.isDisponibilidade() && a.getCod().equals(cod)) {
                a.setDisponibilidade(false);
            }
        }
    }

    public void Checkout(String cod) {
        for (Alojamento a : aloj) {
            if (!a.isDisponibilidade() && cod.equals(a.getCod())) {
                a.setDisponibilidade(true);
            }
        }
    }

    public void alugarCarro(int cod) {
        for (Carro a : car) {
            if (a.isDisponibilidade() && a.getCodigo() == cod) {
                a.setDisponibilidade(false);
            }
        }
    }

    public void devolverCarro(int cod) {
        for (Carro a : car) {
            if (!a.isDisponibilidade() && a.getCodigo() == cod) {
                a.setDisponibilidade(true);
            }
        }
    }

    @Override
    public String toString() {
        return "Agência: " + getNome() + ", Endereço: " + getEndereço();
    }

}
