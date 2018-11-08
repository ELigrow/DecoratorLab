package edu.wctc.eligrow;

public class Main {
    public static void main(String[] args) {
        Character basicCharacter = new Shield(new Spear(new Sword(new
                BasicCharacter("Bilbo"))));
        System.out.println("Name: " + basicCharacter.getName());
        System.out.println("Heath: " +
                basicCharacter.getHealth());

        Character basicCharacter2 = new Poisoned(new Sword(new Shield(new
                BasicCharacter("Frodo"))));
        System.out.println("Name: " + basicCharacter2.getName());
        System.out.println("Heath: " +
                basicCharacter2.getHealth());
    }
}
