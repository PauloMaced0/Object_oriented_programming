package aula06;

public class UsingAnimal {
    public static void main(String[] args) {
        // Animal n = new Animal(); ERRO!!!!!!
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru can = new Canguru();
        Cao ca = new Cao();

        // Cobra co = new Cobra();
        // Tartaruga tar = new Tartaruga();         OUTROS OBJETOS INSTANCIADOS
        // PeixeDourado dou = new PeixeDourado();
        // Arara ara = new Arara();

        r.mover(); // @OVERRIDE
        p.mover(); // @OVERRIDE RESULTADOS DIFERENTES USANDO O MESMO METODO!
        a.mover(); // @OVERRIDE

        can.mover();    //@OVERRIDE
        ca.mover();     //@OVERRIDE
        ca.emitirSom(); //@OVERRIDE

        ca.reagir("olá");
        ca.reagir(false);
        ca.reagir(14, 29);
        ca.reagir(12, 52.1);
    }
}
