package com.example.notifications;

public class SlackDecorator extends NotifierDecorator {
    private final String channel;

    public SlackDecorator(Notifier next, String channel) {
        super(next);
        this.channel = channel;
    }

    @Override
    public void notify(String text) {
        System.out.println("Sending to Slack channel: " + channel);
        super.notify(text);
    }
}

