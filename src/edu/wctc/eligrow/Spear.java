package edu.wctc.eligrow;

/**
 * CharacterDecorator that gives a spear to a character.
 * Increases the character's health slightly and bestows the title of "The Spear Thrower".
 * @author eplig
 * @version 1.0
 */
public class Spear extends CharacterDecorator {
    public Spear(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
     * Gets the character's name
     * @return String: Character's Name
     */
    public String getName() {
        return tempCharacter.getName() + " The Spear Thrower";
    }

    /**
     * Gets the character's health
     * @return Double: Character's Health
     */
    public double getHealth() {
        return tempCharacter.getHealth() + 5;
    }
}
