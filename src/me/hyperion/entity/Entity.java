package me.hyperion.entity;

import me.hyperion.weapon.Weapon;

import java.util.ArrayList;

/**
 * Created by chris on 11/29/2014.
 */
public class Entity {
    private int _type;
    private double Health; // a double so we can half health
    private boolean isLiving; // a boolean to show if entity is living
    private Weapon weapon;
    private ArrayList<Entity> livingEntities = new ArrayList<Entity>();

    public Entity(int type) {
        _type = type;
        //Well it's a new entity is it alive or naw!!
        setLiving(true);
        adjustHealth();
        livingEntities.add(this);
    }

    /**
     * adjustHealth method adjusts the health based of the int type of entity
     */
    private void adjustHealth() {
        switch (_type) {
            case 1: //human
                setHealth(100.0);
                break;
            case 2: //goblin
                setHealth(150.50);
                break;
            case 3://wizard
                setHealth(100.0);
                break;
        }
    }

    /**
     * isLiving method
     *
     * @returns boolean isLiving
     */
    public boolean isLiving() {
        return isLiving;
    }

    /**
     * setLiving method
     *
     * @param isLiving is entity alive?
     */
    public void setLiving(boolean isLiving) {
        this.isLiving = isLiving;
    }

    /**
     * getHealth method
     *
     * @returns returns entity health
     */
    public double getHealth() {
        return Health;
    }

    /**
     * setHealth method
     *
     * @param health double of entitys health
     */
    private void setHealth(double health) {
        Health = health;
    }

    /**
     * entityTakeDamage method
     *
     * @param damage Damage
     */
    public void entityTakeDamage(double damage) {
        double health = getHealth() - damage;
        setHealth(health);
    }

    /**
     * getLivingEntities method returns the ArrayList of all the entities
     */
    public ArrayList<Entity> getLivingEntities() {
        return livingEntities;
    }
}
