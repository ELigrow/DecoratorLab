package edu.wctc.eligrow;

/**
 * CharacterDecorator that inflicts poison upon the character.
 * Decreases the character's health and bestows the title of "The Sickly One".
 * @author eplig
 * @version 1.0
 */
public class Poisoned extends CharacterDecorator {
    public Poisoned(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
     * Gets the character's name
     * @return String: Character's Name
     */
    public String getName() {
        return tempCharacter.getName() + " The Sickly One";
    }

    /**
     * Gets the character's health
     * @return Double: Character's Health
     */
    public double getHealth() {
        return tempCharacter.getHealth() -10;
    }
}
