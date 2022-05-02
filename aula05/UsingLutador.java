package aula05;

public class UsingLutador {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[4];
        l[0] = new Lutador("Zeca", "França", 31, 1.75, 68.9, 11,2, 1);
        l[1] = new Lutador("Manel", "Espanha", 29,1.68,57.8, 14, 2,3);
        l[2] = new Lutador("Abel", "EUA", 35, 1.93, 81.6, 13, 0, 2);
        l[3] = new Lutador( "Quim" , "Portugal",30,1.81,105.7,12, 2, 4);
        
        Luta luta1 = new Luta();
        
        luta1.marcarLuta(l[0], l[1]);
        luta1.lutar();
        l[0].status();
        l[1].status();
        
        
        
        // l[0].apresentar();
        // l[2].status();
        // l[1].ganharLuta();
        // l[3].empatarLuta();


    }
}
