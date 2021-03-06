package com.company;

public class MailMessage extends AbstractSendable{

    private final String message;

    public MailMessage(String from, String to, String message) {
        super(from, to);
        this.message = message;
    }

    public String getContent() {
        return message;
    }


}
