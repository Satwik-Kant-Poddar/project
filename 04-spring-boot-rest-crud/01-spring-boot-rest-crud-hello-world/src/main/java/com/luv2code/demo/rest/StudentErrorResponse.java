package com.luv2code.demo.rest;

public class StudentErrorResponse {
    private int status;
    private String message ;
    public long timeStamp;

    public StudentErrorResponse(){

    }

    public StudentErrorResponse(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "StudentErrorResponse{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}
