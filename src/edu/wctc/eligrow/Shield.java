package edu.wctc.eligrow;

/**
 * CharacterDecorator that gives a shield to a character.
 * Increases the character's health greatly and bestows the title of "The Shield Bearer".
 * @author eplig
 * @version 1.0
 */
public class Shield extends CharacterDecorator {
    public Shield(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
     * Gets the character's name
     * @return String: Character's Name
     */
    public String getName() {
        return tempCharacter.getName() + " The Shield Bearer";
    }

    /**
     * Gets the character's health
     * @return Double: Character's Health
     */
    public double getHealth() {
        return tempCharacter.getHealth() + 15;
    }
}
