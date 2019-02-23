package com.wayforlife.helpinghand.ReportIssue;

public class Message {

    private String imageurl;
    private String datetime;
    private String address;
    private String message;

    public Message() {
    }

    public Message(String imageurl, String datetime, String address, String message) {
        this.imageurl = imageurl;
        this.datetime = datetime;
        this.address = address;
        this.message = message;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageUrl) {
        this.imageurl = imageUrl;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
