package bank;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private final String firstName;
    private final String secondName;
    private int age;
    private List<Account> accounts;

    public Client(String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.accounts = new ArrayList<Account>();
    }

    public String getFirstName(){ return this.firstName; }

    public String getSecondName(){ return this.secondName; }

    public void setAge(int age){ this.age = age; }
    public int getAge(){ return this.age; }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }


    public String getPersonalDetails(){
        String details = "";

        details += "First Name: " + this.getFirstName() + "\n";
        details += "Second Name: " + this.getSecondName() + "\n";
        details += "Age: " + this.getAge() + "\n";


        for (Account account : this.accounts) {
            details += account.toString();
        }

        return details;
    }

}
