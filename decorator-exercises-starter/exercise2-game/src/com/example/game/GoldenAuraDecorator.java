package com.example.game;

public class GoldenAuraDecorator extends CharacterDecorator {
    private final int bonus;

    public GoldenAuraDecorator(Character character) {
        super(character);
        this.bonus = 2;
    }

    @Override
    public void move() {
        System.out.println("Moving at speed " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public void attack() {
        System.out.println("Attacking with damage " + getDamage() + " using sprite " + getSprite());
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + bonus;
    }

    @Override
    public int getDamage() {
        return super.getDamage() + bonus;
    }

    @Override
    public String getSprite() {
        return "golden-" + super.getSprite();
    }
}
