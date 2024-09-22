
import java.util.ArrayList;
import PAM.transactionType;
import PAM.PersonalAccount;
import PAM.Amount;
public class Main {
    public static void main(String[] args) {
        PersonalAccount Urmat =new PersonalAccount(10123, "Urmat");
        Urmat.deposit(150);
        Urmat.withdraw(3);
        Urmat.printTransactionHistory();
        System.out.println(Urmat.getBalance());
        System.out.println(Urmat.getAccountHolder());
        System.out.println(Urmat.getAccountNumber());

    }
}