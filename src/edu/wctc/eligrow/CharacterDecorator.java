package edu.wctc.eligrow;

/**
 * Abstract class for character decorators. Accepts Character.
 */
abstract class CharacterDecorator implements Character {
    protected Character tempCharacter;

    /**
     * Constructor for CharacterDecorator object. Accepts character.
     * @param tempCharacter Character: Character to decorate.
     */
    public CharacterDecorator(Character tempCharacter) {
        this.tempCharacter = tempCharacter;
    }

    /**
     * Gets the character's name.
     * @return String: Name
     */
    public String getName() {
        return tempCharacter.getName();
    }

    /**
     * Gets the character's health
     * @return Double: Character's Health
     */
    public double getHealth() {
        return tempCharacter.getHealth();
    }
}
