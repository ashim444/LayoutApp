package com.example.layoutapp;

public class SecondCharacter {
    private int secondCharacterImage;
    private int secondCharacterText;
    private int secondCharacterText2;

    public SecondCharacter(int secondCharacterImage, int secondCharacterText, int secondCharacterText2) {
        this.secondCharacterImage = secondCharacterImage;
        this.secondCharacterText = secondCharacterText;
        this.secondCharacterText2 = secondCharacterText2;
    }

    public int getSecondCharacterImage() {
        return secondCharacterImage;
    }

    public int getSecondCharacterText2() {
        return secondCharacterText2;
    }

    public void setSecondCharacterText2(int secondCharacterText2) {
        this.secondCharacterText2 = secondCharacterText2;
    }

    public void setSecondCharacterImage(int secondCharacterImage) {
        this.secondCharacterImage = secondCharacterImage;
    }

    public int getSecondCharacterText() {
        return secondCharacterText;
    }

    public void setSecondCharacterText(int secondCharacterText) {
        this.secondCharacterText = secondCharacterText;
    }
}
