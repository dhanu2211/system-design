package org.example;

import java.util.List;

public class EmailBuilder {
    public String to;
    public String cc;
    public String bcc;
    public String body;
    public String subject;
    public List<String> attachments;

    public EmailBuilder setTo(String to){
        this.to = to;
        return this;
    }

    public EmailBuilder setCc(String cc){
        this.cc = cc;
        return this;
    }

    public EmailBuilder setBcc(String bcc){
        this.bcc = bcc;
        return this;
    }

    public EmailBuilder setBody(String body){
        this.body = body;
        return this;
    }

    public EmailBuilder setSubject(String subject){
        this.subject = subject;
        return this;
    }

    public EmailBuilder setAttachments(List<String> attachments){
        this.attachments = attachments;
        return this;
    }

    public Email build(){
        return new Email(this);
    }
}
