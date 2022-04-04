package aula04;

public class UsingExample {
    public static void main(String[] args) {
    //     Example c = new Example();
    //     System.out.println("Métodos e atributos que estão publicos");
    //     c.modelo = "Bic";// atributo
    //     c.cor = "verde";    // atributo
    //     c.carga = 80;       // atributo
    //     c.status();         // metodo
        
    //     // Na class o atributo tampa é private(só a classe pode aceder no entanto podemos aceder ao atributo através de um metodo)
    //     c.colocar_tampa();  // metodo
    //     c.tirar_tampa();

    //     // não tem visibilidade portanto dá erro
    //     // c3.escrever();
    //     // c3.ponta = 0.6;
    //     // c3.tampa = true;
    // }
    String modelo= "Bic";
    Example c1 = new Example(modelo,71,"Azul");
    c1.status();

    //sem usar construtor
    // c1.setModelo("Bic")
    //etc
    
    



    }
}
