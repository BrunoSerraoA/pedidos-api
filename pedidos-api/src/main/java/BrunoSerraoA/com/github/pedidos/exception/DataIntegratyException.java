package BrunoSerraoA.com.github.pedidos.exception;

public class DataIntegratyException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DataIntegratyException(String message) {
        super(message);
    }

    public DataIntegratyException(String message, Throwable cause) {
        super(message, cause);
    }
}