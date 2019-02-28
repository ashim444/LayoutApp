package com.example.layoutapp.model;

public class CharacterClass {
    private int             characterClassImage;
    private int             characterImageTwo;
    private int             characterClassDummyTextOne;
    private int             characterClassDummyTextTwo;

    public CharacterClass(int characterClassImage, int characterClassDummyTextOne, int characterClassDummyTextTwo) {
        this.characterClassImage                = characterClassImage;
        this.characterClassDummyTextOne         = characterClassDummyTextOne;
        this.characterClassDummyTextTwo         = characterClassDummyTextTwo;
    }
    public CharacterClass(int characterClassImage, int characterImageTwo, int characterClassDummyTextOne, int characterClassDummyTextTwo) {
        this.characterClassImage                = characterClassImage;
        this.characterImageTwo                  = characterImageTwo;
        this.characterClassDummyTextOne         = characterClassDummyTextOne;
        this.characterClassDummyTextTwo         = characterClassDummyTextTwo;
    }

    public int getCharacterImageTwo() {
        return characterImageTwo;
    }

    public void setCharacterImageTwo(int characterImageTwo) {
        this.characterImageTwo = characterImageTwo;
    }

    public int getCharacterClassImage() {
        return characterClassImage;
    }

    public int getCharacterClassDummyTextTwo() {
        return characterClassDummyTextTwo;
    }

    public void setCharacterClassDummyTextTwo(int characterClassDummyTextTwo) {
        this.characterClassDummyTextTwo = characterClassDummyTextTwo;
    }

    public void setCharacterClassImage(int characterClassImage) {
        this.characterClassImage = characterClassImage;
    }

    public int getCharacterClassDummyTextOne() {
        return characterClassDummyTextOne;
    }

    public void setCharacterClassDummyTextOne(int characterClassDummyTextOne) {
        this.characterClassDummyTextOne = characterClassDummyTextOne;
    }
}
