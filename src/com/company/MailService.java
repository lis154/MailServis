package com.company;

import java.util.function.Consumer;

public  class MailService<T> implements Consumer<MailMessage> {
    public Sendable processMail(Sendable mail) {
        return mail;
    }

    @Override
    public void accept(MailMessage mailMessage) {
        
    }
}
