import java.time.LocalDate;
import java.util.HashMap;

public class EventManager {
    String nome;
    HashMap<String,String> clientes = new HashMap<>();
    
    HashMap<Client,LocalDate> eventos = new HashMap<>();

    EventManager (String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Client addClient(String string, String string2) {
        clientes.put(string, string2);
        return null;
    }
    public Event addEvent(Client c, LocalDate date) {
        eventos.put(c, date);
        return null;
    }
    public void listClients() {
        clientes.forEach((key,value)-> {System.out.printf(key,value);});
    }
    public void listEvents() {
        eventos.forEach((key,value) -> {System.out.printf(key.toString(),value.toString());});
    }

    @Override
    public String toString() {
        return "EventManager [clientes=" + clientes + ", eventos=" + eventos + ", nome=" + nome + "]";
    }
}
