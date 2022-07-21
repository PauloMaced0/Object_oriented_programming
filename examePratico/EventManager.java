package examePratico;

import java.time.LocalDate;
import java.util.*;

public class EventManager {
    private String nome;
    private Map<Client, Set<Event>> EventosMap;

    EventManager(String nome) {
        this.nome = nome;
        this.EventosMap = new HashMap<>();
    }

    public Map<Client, Set<Event>> getEventosMap() {
        return EventosMap;
    }

    public void setEventosMap(HashMap<Client, Set<Event>> eventosMap) {
        EventosMap = eventosMap;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Client addClient(String bome, String local) {
        Client cliente = new Client(nome, local);
        for (Client c : getEventosMap().keySet()) {
            if (cliente.equals(c)) {
                return c;
            }
        }
        getEventosMap().put(cliente, new HashSet<>());
        return cliente;
    }

    public Event addEvent(Client cliente, LocalDate date) {
        Event evento = new Event(date);
        getEventosMap().get(cliente).add(evento);
        return evento;
    }

    public String listClients() {
        String str = "Clients: ";
        for (Client cliente : getEventosMap().keySet()) {
            str += "\n" + cliente;
        }
        return str;
    }

    public String listEvents() {
        String str = "Events:";
        for(Client cliente : getEventosMap().keySet()){
            str += "\n" + cliente;
            for(Event evento : getEventosMap().get(cliente)){
                str += "\n" + evento;
            } 
        }
        
        return str;
    }

    public List<String> clientsWithEvents() {
        ArrayList<String> list = new ArrayList<>();
        for (Client c : getEventosMap().keySet())
            if (getEventosMap().get(c).size() > 0)
                list.add(c.toString());

        return list;
    }

    public List<String> nextEventsByDate() {
        TreeSet<Event> orderedSet = new TreeSet<Event>(Comparator.comparing(Event::getDate));
        for (Set<Event> conjEventos : getEventosMap().values()) {
            for (Event e : conjEventos) {
                orderedSet.add(e);
            }
        }
        List<String> list = new ArrayList<>();
        orderedSet.forEach(e -> list.add(e.toString()));
        return list;
    }

    @Override
    public String toString() {
        return nome;
    }
}
