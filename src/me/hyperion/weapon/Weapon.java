package me.hyperion.weapon;

/**
 * Created by chris on 11/29/2014.
 */
public class Weapon {
    private String name;
    private double damage;
    private double distance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
