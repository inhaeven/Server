package Server.Server.global.api;

import Server.Server.global.exception.ErrorCode;
import Server.Server.global.exception.SuccessCode;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.http.HttpStatus;

public record ApiResponse<T>(
        boolean success,
        int status,
        String message,
        @JsonInclude(value = JsonInclude.Include.NON_NULL)
        T data
) {
    // response body 없는 버전
    public static <T> ApiResponse<EmptyBody> success(SuccessCode successCode) {
        return new ApiResponse<EmptyBody>(successCode.getSuccess(), successCode.getStatus().value(), successCode.getMessage(), new EmptyBody());
    }

    // response body 있는 버전
    public static <T> ApiResponse<T> success(SuccessCode successCode, T data) {
        return new ApiResponse<>(successCode.getSuccess(), successCode.getStatus().value(), successCode.getMessage(), data);
    }

    public static <T> ApiResponse<T> failure(ErrorCode failureCode) {
        return new ApiResponse<>(failureCode.getSuccess(), failureCode.getStatus().value(), failureCode.getMessage(), null);
    }

    public static <T> ApiResponse<T> notValid(String message) {
        return new ApiResponse<>(false, HttpStatus.BAD_REQUEST.value(), message, null);
    }

    public record EmptyBody() {}
}
