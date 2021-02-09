package pl.dhat.cms4nw.authservice.jwt;

import org.springframework.http.HttpStatus;

public class JwtAuthException extends Exception {

    private HttpStatus httpStatus;

    public JwtAuthException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public JwtAuthException(String message, HttpStatus httpStatus, Throwable cause) {
        super(message, cause);
        this.httpStatus = httpStatus;
    }



    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
