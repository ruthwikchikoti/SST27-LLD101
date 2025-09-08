package com.example.notifications;

public class SmsDecorator extends NotifierDecorator {
    private final String phoneNumber;

    public SmsDecorator(Notifier next, String phoneNumber) {
        super(next);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(String text) {
        System.out.println("Sending to SMS: " + phoneNumber);
        super.notify(text);
    }
}

