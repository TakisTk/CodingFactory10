package gr.aueb.cf.ch14.BankApp;

public class NegativeAmountException extends Exception{

    public NegativeAmountException(String message) {
        super(message);
    }
}
