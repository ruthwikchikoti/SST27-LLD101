package com.example.notifications;

public class WhatsAppDecorator extends NotifierDecorator {
    private final String handle;

    public WhatsAppDecorator(Notifier next, String handle) {
        super(next);
        this.handle = handle;
    }

    @Override
    public void notify(String text) {
        System.out.println("Sending to WhatsApp: " + handle);
        super.notify(text);
    }
}

