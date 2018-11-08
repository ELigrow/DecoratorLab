package edu.wctc.eligrow;

/**
 * Basic character object. Has name and health
 * @author eplig
 * @version 1.0
 */
public class BasicCharacter implements Character {
    String name;
    double health;

    /**
     * Constructor for BasicCharacter object. Accepts name.
     * @param name String: Character's Name
     */
    public BasicCharacter(String name) {
        this.name = name;
        this.health = 0;
    }

    /**
     * Gets the character's name
     * @return String: Character's Name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the character's health
     * @return Double: Character's Health
     */
    public double getHealth() {
        return health;
    }
}