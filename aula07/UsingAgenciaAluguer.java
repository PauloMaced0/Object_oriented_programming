package aula07;

import java.util.*;

public class UsingAgenciaAluguer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation, potencia, numdoQuadro, escolha, numPassageiros, numLicença,quilometros;
        String matricula, modelo, marca, tipo, taxi;
        double capcidadeBagageira, peso, cargamax;
        EmpresaAluguer empresaAluguer = new EmpresaAluguer("Auto Mático", "3999-123", "automaticocar@gmail.com");

        do {
            System.out.println("1 - Adicionar automóvel ligeiro");
            System.out.println("2 - Remover automóvel ligeiro");
            System.out.println("3 - Adicionar motociclo");
            System.out.println("4 - Remover  motociclo");
            System.out.println("5 - Adicionar pesado passageiros");
            System.out.println("6 - Remover pesado passageiros");
            System.out.println("7 - Adicionar pesado mercadorias");
            System.out.println("8 - Remover pesado mercadorias");
            System.out.println("9 - Detalhes da empresa");
            System.out.println("0 - exit");
            operation = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (operation) {
                case 0:
                    System.out.println("BYE!");
                    break;
                case 1:

                    System.out.println("Matricula(DD-CC-DD)");
                    matricula = sc.nextLine();
                    System.out.println("Modelo");
                    modelo = sc.nextLine();
                    System.out.println("Potência");
                    potencia = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Marca");
                    marca = sc.nextLine();
                    System.out.println("Nº do Quadro");
                    numdoQuadro = sc.nextInt();
                    System.out.println("Capacidade da bagageira");
                    capcidadeBagageira = sc.nextDouble();
                    System.out.println("Quilómetros");
                    quilometros =sc.nextInt();
                    System.out.println("Táxi?(sim/nao)");
                    taxi = sc.nextLine();
                    if (taxi.equals("sim")) {
                        System.out.println("Nº de lincença");
                        numLicença = sc.nextInt();
                        Taxi ta = new Taxi(matricula, modelo, potencia, marca, numdoQuadro, capcidadeBagageira,
                                numLicença,quilometros);
                        empresaAluguer.addAutomovelLig(ta);        
                    } else {
                        AutomovelLigeiro al = new AutomovelLigeiro(matricula, modelo, potencia, marca, numdoQuadro,
                                capcidadeBagageira,quilometros);
                        empresaAluguer.addAutomovelLig(al);
                    }
                    break;
                case 2:
                    System.out.println("Nº do Quadro");
                    numdoQuadro = sc.nextInt();
                    empresaAluguer.removeAutomovelLig(numdoQuadro);
                    break;
                case 3:
                    System.out.println("Matricula(DD-CC-DD)");
                    matricula = sc.nextLine();
                    System.out.println("Modelo");
                    modelo = sc.nextLine();
                    System.out.println("Potência");
                    potencia = sc.nextInt();
                    System.out.println("Marca");
                    marca = sc.nextLine();
                    System.out.println("1-Desportivo");
                    System.out.println("2-Estrada");
                    escolha = sc.nextInt();
                    if (escolha == 1) {
                        tipo = "Desportivo";
                    } else {
                        tipo = "Estrada";
                    }
                    Motociclo mc = new Motociclo(matricula, modelo, potencia, marca, tipo);
                    empresaAluguer.addMotociclos(mc);
                    break;
                case 4:
                    System.out.println("Matrícula");
                    matricula = sc.nextLine();
                    empresaAluguer.removeMotociclos(matricula);
                    break;
                case 5:
                    System.out.println("Matricula(DD-CC-DD)");
                    matricula = sc.nextLine();
                    System.out.println("Modelo");
                    modelo = sc.nextLine();
                    System.out.println("Potência");
                    potencia = sc.nextInt();
                    System.out.println("Marca");
                    marca = sc.nextLine();
                    System.out.println("Nº do Quadro");
                    numdoQuadro = sc.nextInt();
                    System.out.println("Peso");
                    peso = sc.nextDouble();
                    System.out.println("Nº Total de passageiros");
                    numPassageiros = sc.nextInt();
                    PesadoPassageiros pespass = new PesadoPassageiros(matricula, modelo, potencia, marca, numdoQuadro,
                            peso, numPassageiros);
                    empresaAluguer.addPesadoPass(pespass);
                    break;
                case 6:
                    System.out.println("Nº do Quadro");
                    numdoQuadro = sc.nextInt();
                    empresaAluguer.removePesadoPass(numdoQuadro);
                    break;
                case 7:
                    System.out.println("Matricula(DD-CC-DD)");
                    matricula = sc.nextLine();
                    System.out.println("Modelo");
                    modelo = sc.nextLine();
                    System.out.println("Potência");
                    potencia = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Marca");
                    marca = sc.nextLine();
                    System.out.println("Nº do Quadro");
                    numdoQuadro = sc.nextInt();
                    System.out.println("Peso");
                    peso = sc.nextDouble();
                    System.out.println("Carga Max");
                    cargamax = sc.nextDouble();
                    PesadoMercadorias pesmerc = new PesadoMercadorias(matricula, modelo, potencia, marca, numdoQuadro,
                            peso, cargamax);
                    empresaAluguer.addPesadoMercad(pesmerc);
                    break;
                case 8:
                    System.out.println("Nº do Quadro");
                    numdoQuadro = sc.nextInt();
                    empresaAluguer.removePesadoMercad(numdoQuadro);
                    break;
                case 9:
                    System.out.println(empresaAluguer);
                    empresaAluguer.printlist();
                    break;
                default:
                    System.out.println("UPS!");
                    break;
            }
        } while (operation != 0);
        sc.close();
    }
}
