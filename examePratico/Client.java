package examePratico;

public class Client {
    String nome;
    String local;

    public Client(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Client other = (Client) obj;
        return this.getNome().equals(other.getNome()) && this.getLocal().equals(other.getLocal());

    }

    @Override
    public String toString() {
        return String.format("%s [%s]",getNome(),getLocal());
    }

}
