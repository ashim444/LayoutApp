package com.example.layoutapp.model;

public class SecondCharacter {
    private int secondCharacterImage;
    private int secondCharacterDummyDate;
    private int secondCharacterDummyText;

    public SecondCharacter(int secondCharacterImage, int secondCharacterDummyDate, int secondCharacterDummyText) {
        this.secondCharacterImage = secondCharacterImage;
        this.secondCharacterDummyDate = secondCharacterDummyDate;
        this.secondCharacterDummyText = secondCharacterDummyText;
    }

    public int getSecondCharacterImage() {
        return secondCharacterImage;
    }

    public int getSecondCharacterDummyText() {
        return secondCharacterDummyText;
    }

    public void setSecondCharacterDummyText(int secondCharacterDummyText) {
        this.secondCharacterDummyText = secondCharacterDummyText;
    }

    public void setSecondCharacterImage(int secondCharacterImage) {
        this.secondCharacterImage = secondCharacterImage;
    }

    public int getSecondCharacterDummyDate() {
        return secondCharacterDummyDate;
    }

    public void setSecondCharacterDummyDate(int secondCharacterDummyDate) {
        this.secondCharacterDummyDate = secondCharacterDummyDate;
    }
}
