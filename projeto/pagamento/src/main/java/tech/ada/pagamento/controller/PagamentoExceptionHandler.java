package tech.ada.pagamento.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import tech.ada.pagamento.exception.GetMoneyException;
import tech.ada.pagamento.exception.UserNotFoundException;

@RestControllerAdvice
public class PagamentoExceptionHandler {
    public PagamentoExceptionHandler() {
    }

    @ExceptionHandler({RuntimeException.class})
    public ProblemDetail exceptionHandler(RuntimeException exception) {
        ProblemDetail problemDetails = ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(503), exception.getMessage());
        problemDetails.setTitle("RunTime Exception - Object Not Found");
        return problemDetails;
    }

    @ExceptionHandler({GetMoneyException.class})
    public ProblemDetail handleInsuficientFoundsException(GetMoneyException e) {
        ProblemDetail problemDetails = ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(400), e.getMessage());
        problemDetails.setTitle("RunTime Exception - Insuficient founds");
        return problemDetails;
    }

    @ExceptionHandler({UserNotFoundException.class})
    public ProblemDetail handleUserNotFoundException(UserNotFoundException e) {
        ProblemDetail problemDetails = ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(404), e.getMessage());
        problemDetails.setTitle("RunTime Exception - User Not Found");
        return problemDetails;
    }
}