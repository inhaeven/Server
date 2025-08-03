package Server.Server.global.exception;

import org.springframework.http.HttpStatus;

public interface ErrorCode {
    boolean getSuccess();
    HttpStatus getStatus();
    String getMessage();
}
