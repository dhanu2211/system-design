package org.example;


import java.util.List;

public class Email {
    private String to;
    private String cc;
    private String bcc;
    private String body;
    private String subject;
    private List<String> attachments;

    Email(EmailBuilder builder){
        this.to = builder.to;
        this.bcc = builder.bcc;
        this.cc = builder.cc;
        this.body = builder.body;
        this.subject = builder.subject;
        this.attachments = builder.attachments;
    }

    public String getTo() {
        return to;
    }

    public String getCc() {
        return cc;
    }

    public String getBcc() {
        return bcc;
    }

    public String getBody() {
        return body;
    }

    public String getSubject() {
        return subject;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    @Override
    public String toString() {
        return "Email{" +
                "to='" + to + '\'' +
                ", cc='" + cc + '\'' +
                ", bcc='" + bcc + '\'' +
                ", body='" + body + '\'' +
                ", subject='" + subject + '\'' +
                ", attachments=" + attachments +
                '}';
    }
}
