package com.youcode.taskflow.handler.response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
public class ResponseMessage {
    private final int statusCode;
    private final String message;
    private Object data;
    public ResponseMessage(int statusCode, Object data, String message) {
        this.statusCode = statusCode;
        this.data = data;
        this.message = message;
    }
    public ResponseMessage(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }
    public int getStatusCode() {return statusCode;}
    public String getMessage() {
        return message;
    }
    public Object getData() {
        return data;
    }
    public static ResponseEntity<ResponseMessage> ok(Object data, String message){
        return new ResponseEntity<>(new ResponseMessage(HttpStatus.OK.value(),data,message),HttpStatus.OK);
    }
    public static ResponseEntity<ResponseMessage> notFound(String message){
        return new ResponseEntity<>(new ResponseMessage(HttpStatus.NOT_FOUND.value(),message),HttpStatus.NOT_FOUND);
    }
    public static ResponseEntity<ResponseMessage> created(Object data, String message){
        return new ResponseEntity<>(new ResponseMessage(HttpStatus.CREATED.value(),data,message),HttpStatus.CREATED);
    }
    public static ResponseEntity<ResponseMessage> badRequest(String message){
        return new ResponseEntity<>(new ResponseMessage(HttpStatus.BAD_REQUEST.value(),message),HttpStatus.BAD_REQUEST);
    }
}
