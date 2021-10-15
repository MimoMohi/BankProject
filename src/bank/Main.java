package bank;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Client client1 = new Client("Mohamad", "Mohedin", 23);
        Account firstAccount = new Account(Currency.BGN, new BigDecimal(300), Type.debit);
        Account secondAccount = new Account(Currency.EUR, new BigDecimal(500), Type.credit);

        client1.addAccount(firstAccount);
        client1.addAccount(secondAccount);

        firstAccount.changeAccountType(Type.credit);


        Bank fiBank = new Bank("FiBank");

        fiBank.addClient(client1);

        firstAccount.withdraw(new BigDecimal(340));

        for (Client client: fiBank.getClients()){
            System.out.println(client);
        }


    }
}
