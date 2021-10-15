package bank;

import java.math.BigDecimal;

public class Account {

    private int id;
    private Currency currency;
    private BigDecimal amount;
    private Type type;
    private static int counter = 0;

    public Account(Currency currency, BigDecimal amount, Type type) {
        setCurrency(currency);
        setAmount(amount);
        setType(type);
        generateId();
    }

    public void setCurrency(Currency currency){
        this.currency = currency;
    }
    public Currency getCurrency(){
        return this.currency;
    }

    public void setAmount(BigDecimal amount){
        this.amount = amount;
    }
    public BigDecimal getAmount(){
        return this.amount;
    }

    public void setType(Type type){
        this.type = type;
    }
    public Type getType(){
        return this.type;
    }

    private void generateId(){ this.id = ++counter; }
    public int getId(){ return this.id; }

    public void changeAccountType(Type type) {
        this.setType(type);
    }

    public void withdraw(BigDecimal withdrawAmount){
        int flag = withdrawAmount.compareTo(this.amount);

        if (flag <= 0){
            this.amount = withdrawAmount.subtract(amount);
        } else {
            System.out.println("Not enough money.");
        }
    }

    public String toString(){
        String details = "ID: " + this.getId() + "\n";

        details += "Card Type: " + this.getType() + "\n";
        details += "Currency: " + this.getCurrency() + "\n";
        details += "Amount: " + this.getAmount() + "\n";

        return details;
    }
}
