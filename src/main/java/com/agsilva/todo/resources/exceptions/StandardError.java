package com.agsilva.todo.resources.exceptions;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long timestamp;
    private Integer status;
    private String message;

    public StandardError(long timestamp, HttpStatus notFound, Object message) {
        super();
    }

    public StandardError(Long timestamp, Integer status, String message) {
        super();
        this.timestamp = timestamp;
        this.status = status;
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
