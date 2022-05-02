package aula05;

public class Contabanc {
    public int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public Contabanc(){
        saldo = 0;
        status = false;
    }
    public String getDono() {
        return dono;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }
    public boolean getStatus(){
        return status;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void abrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);
        if(getTipo() == "CC"){
            setSaldo(50);
        } else if (getTipo() == "CP"){
            setSaldo(150);
        }
    }

    public void fecharConta() {
        if(getSaldo()>0){
            System.out.println("Tem dinheiro");
        } 
        if(getSaldo() < 0){
            System.out.println("Débito");
        } else {
            setStatus(false);
        }

    }

    public void depositar(double v) {
        if(getStatus()){
            setSaldo(getSaldo() + v);
        } else {
            System.out.println("Impossível depositar");
        }
    }

    public void retirar(double v) {
        if(getStatus()){
            if(getSaldo() > v){
                setSaldo(getSaldo()-v);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível retirar");
        }
    }

    public void pagarmensalidade() {
        double mensalidade = 0;
        if(getTipo() == "CC"){
            mensalidade = 12;
        } else if(getTipo() == "CP"){
            mensalidade = 20;
        }
        if(getStatus()){
            if(getSaldo()>mensalidade){
                setSaldo(getSaldo()-mensalidade);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível pagar");
        }
    }
}
