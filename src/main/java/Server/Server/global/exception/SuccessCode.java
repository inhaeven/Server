package Server.Server.global.exception;

import org.springframework.http.HttpStatus;

public interface SuccessCode {
    boolean getSuccess();
    HttpStatus getStatus();
    String getMessage();
}
