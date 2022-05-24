package aula07;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpresaAluguer {
    protected String nome;
    protected String codigoPostal;
    protected String email;

    ArrayList<Motociclo> motocicl = new ArrayList<Motociclo>();
    ArrayList<AutomovelLigeiro> autoligeiro = new ArrayList<AutomovelLigeiro>();
    ArrayList<PesadoMercadorias> pesadmerc = new ArrayList<PesadoMercadorias>();
    ArrayList<PesadoPassageiros> pesadpass = new ArrayList<PesadoPassageiros>();

    EmpresaAluguer(String nome, String codigoPostal, String email) {
        this.nome = nome;
        this.codigoPostal = codigoPostal;
        this.email = email;
    }

    public ArrayList<AutomovelLigeiro> getAutoligeiro() {
        return autoligeiro;
    }

    public ArrayList<Motociclo> getMotocicl() {
        return motocicl;
    }

    public ArrayList<PesadoMercadorias> getPesadmerc() {
        return pesadmerc;
    }

    public ArrayList<PesadoPassageiros> getPesadpass() {
        return pesadpass;
    }

    public void addMotociclos(Motociclo m) {
        motocicl.add(m);
    }

    public void addAutomovelLig(AutomovelLigeiro al) {
        autoligeiro.add(al);
    }

    public void addPesadoMercad(PesadoMercadorias pm) {
        pesadmerc.add(pm);
    }

    public void addPesadoPass(PesadoPassageiros pp) {
        pesadpass.add(pp);
    }

    public void removeMotociclos(String matric) {
        for (Iterator<Motociclo> i = motocicl.iterator(); i.hasNext();) {
            if (i.next().getMatricula() == matric) {
                i.remove();
            }
        }
    }

    public void removeAutomovelLig(int numquadro) {
        for (Iterator<AutomovelLigeiro> i = autoligeiro.iterator(); i.hasNext();) {
            if (i.next().getNumdoQuadro() == numquadro) {
                i.remove();
            }
        }
    }

    public void removePesadoMercad(int numquadro) {
        for (Iterator<PesadoMercadorias> i = pesadmerc.iterator(); i.hasNext();) {
            if (i.next().getNumdoQuadro() == numquadro) {
                i.remove();
            }
        }
    }

    public void removePesadoPass(int numquadro) {
        for (Iterator<PesadoPassageiros> i = pesadpass.iterator(); i.hasNext();) {
            if (i.next().getNumdoQuadro() == numquadro) {
                i.remove();
            }
        }
    }

    public void setAutoligeiro(ArrayList<AutomovelLigeiro> autoligeiro) {
        this.autoligeiro = autoligeiro;
    }

    public void setMotocicl(ArrayList<Motociclo> motocicl) {
        this.motocicl = motocicl;
    }

    public void setPesadmerc(ArrayList<PesadoMercadorias> pesadmerc) {
        this.pesadmerc = pesadmerc;
    }

    public void setPesadpass(ArrayList<PesadoPassageiros> pesadpass) {
        this.pesadpass = pesadpass;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void printlist() {
        System.out.println("Automóveis Ligeiros");
        for (AutomovelLigeiro z : autoligeiro) {
            System.out.println(z);
        }
        System.out.println("Motociclos");
        for (Motociclo x : motocicl) {
            System.out.println(x);
        }
        System.out.println("Pesados de Passageiros");
        for (PesadoPassageiros c : pesadpass) {
            System.out.println(c);
        }
        System.out.println("Pesados de Mercadorias");
        for (PesadoMercadorias v : pesadmerc) {
            System.out.println(v);
        }
    }

    public String toString() {
        return "Nome: " + getNome() + ", Código de postal: " + getCodigoPostal() + ", Email: " + getEmail();
    }
}
