package aula04;

public class Example {
    // public String modelo;
    // public String cor;
    // public int carga;
    // private double ponta;
    // private boolean tampa;

    // public void status(){
    //     System.out.println("Modelo:"+ this.modelo);
    //     System.out.println("Ponta:" + this.ponta);
    //     System.out.println("Uma caneta "+ this.cor);
    //     System.out.println("Está com tampa? " + this.tampa);
    //     System.out.println("Carga :"+ this.carga);
    // }
    // public Boolean escrever(){
    //     if(this.tampa){
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }
    // public void colocar_tampa(){
    //     this.tampa = true;
    // }
    // public void tirar_tampa(){
    //     this.tampa = false;
    // }
    // se for criada uma main neste ficheiro independentemente
    // das permissoes serem public/private/protected os métodos ou atributos, vão ser sempre executados
 
    private String modelo;
    private int carga;
    private boolean tampa;
    private String cor;

    public Example(String m,int crg,String c){ // Este é o metodo construtor // Tem de ter o mesmo nome que a classe
        this.modelo= m;
        this.carga = crg;
        this.cor = c;
        this.colocar_tampa();
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public double getCarga(){
        return this.carga;
    } 
    public void setCarga(int c){
        this.carga = c;
    }
    public void colocar_tampa(){
        this.tampa = true; 
    }
    public void tirar_tampa(){
        this.tampa = false;
    }
    public void status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo:"+this.modelo);
        System.out.println("Cor:"+this.cor);
        System.out.println("Carga:"+this.carga);
        System.out.println(""+this.tampa);
    }

}
