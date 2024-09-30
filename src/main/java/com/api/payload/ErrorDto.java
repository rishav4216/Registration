package com.api.payload;

import java.util.Date;

public class ErrorDto {
    private String message;
    private Date date;
    private String url;

    public ErrorDto(String message,Date date, String url) {
        this.date = date;
        this.message = message;
        this.url = url;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public String getUrl() {
        return url;
    }
}
