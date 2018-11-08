package edu.wctc.eligrow;

/**
 * Character interface. All character entities inherit from this.
 * @author eplig
 * @version 1.0
 */
public interface Character {
    /**
     * Gets the character's name
     * @return String: Character's Name
     */
    public String getName();

    /**
     * Gets the character's health
     * @return Double: Character's Health
     */
    public double getHealth();
}
