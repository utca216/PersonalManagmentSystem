package PAM;

public enum transactionType {
    DEPOSIT(1), WITHDRAWAL(2);
    private int number;
    transactionType(int number){
        this.number=number;
    }
}
