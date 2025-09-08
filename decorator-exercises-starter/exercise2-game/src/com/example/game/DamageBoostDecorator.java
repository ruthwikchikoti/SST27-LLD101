package com.example.game;

public class DamageBoostDecorator extends CharacterDecorator {
    private final int damageBoost;

    public DamageBoostDecorator(Character character, int damageBoost) {
        super(character);
        this.damageBoost = damageBoost;
    }

    @Override
    public void attack() {
        System.out.println("Attacking with damage " + getDamage() + " using sprite " + getSprite());
    }

    @Override
    public int getDamage() {
        return super.getDamage() + damageBoost;
    }

    @Override
    public String getSprite() {
        return super.getSprite();
    }
}

