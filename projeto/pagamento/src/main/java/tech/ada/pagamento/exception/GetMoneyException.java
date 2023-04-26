package tech.ada.pagamento.exception;

public class GetMoneyException extends RuntimeException {
    public GetMoneyException(String message) {
        super(message);
    }
}