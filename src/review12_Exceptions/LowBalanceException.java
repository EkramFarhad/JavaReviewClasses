package review12_Exceptions;

public class LowBalanceException extends RuntimeException {
    LowBalanceException(String msg) {
        super(msg);
    }

}