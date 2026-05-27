package gr.aueb.cf.ch14.BankApp;

public class SsnNotValidException extends Exception {

    public SsnNotValidException(String message) {
        super(message);
    }
}
