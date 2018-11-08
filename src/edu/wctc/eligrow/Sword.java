package edu.wctc.eligrow;

/**
 * CharacterDecorator that gives a sword to a character.
 * Increases the character's health moderately and bestows the title of "The Sword Handler".
 * @author eplig
 * @version 1.0
 */
public class Sword extends CharacterDecorator {
    public Sword(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
     * Gets the character's name
     * @return String: Character's Name
     */
    public String getName() {
        return tempCharacter.getName() + " The Sword Handler";
    }

    /**
     * Gets the character's health
     * @return Double: Character's Health
     */
    public double getHealth() {
        return tempCharacter.getHealth() + 10;
    }
}
