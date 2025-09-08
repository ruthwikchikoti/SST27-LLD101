package com.example.game;

public class SpeedBoostDecorator extends CharacterDecorator {
    private final int speedBoost;

    public SpeedBoostDecorator(Character character, int speedBoost) {
        super(character);
        this.speedBoost = speedBoost;
    }

    @Override
    public void move() {
        System.out.println("Moving at speed " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + speedBoost;
    }
}


