package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Client> clients;

    public Bank(String name) {
        this.name = name;
        this.clients = new ArrayList<Client>();
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

    public List<Client> getClients() {
        return this.clients;
    }
}
