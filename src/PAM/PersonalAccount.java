package PAM;

import java.util.ArrayList;

public class PersonalAccount {
    int accountNumber;
    String AccountHolder;
    private double balance;
    ArrayList<PAM.Amount> transactions=new ArrayList<PAM.Amount>();
    public PersonalAccount(int accountNumber,String accountHolder){
        this.AccountHolder=accountHolder;
        this.accountNumber=accountNumber;
        balance=0;
    }

    public void deposit(double amount){
        PAM.Amount amount1=new PAM.Amount();
        amount1.amount=amount;
        amount1.TransactionType=PAM.transactionType.DEPOSIT;
        transactions.add(amount1);
    }

    public void withdraw(double amount){
        PAM.Amount amount1=new PAM.Amount();
        amount1.amount=amount;
        amount1.TransactionType= PAM.transactionType.WITHDRAWAL;
        transactions.add(amount1);
    }

    public void printTransactionHistory(){
        for (int i=0;i<transactions.length; i++) {
            System.out.println(transactions[i].transactionType);
            System.out.print(transactions[i].amount);
        }
    }

    public double getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolder(){
        return AccountHolder;
    }
}
