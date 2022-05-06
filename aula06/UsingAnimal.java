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

        r.mover(); // polimorfismo
        p.mover(); // polimorfismo RESULTADOS DIFERENTES USANDO O MESMO METODO!
        a.mover(); // polimorfismo

        can.mover();
        ca.mover();
        ca.emitirSom();
    }
}
