package com.serenitydojo;

public class Hamster extends Pet {
    private String favoriteGame;


    public String getFavoriteGame() {
        return favoriteGame;
    }

    public Hamster(String name, String favoriteGame, int age) {
        super(name, age);
        this.favoriteGame = favoriteGame;
    }

    public String play() {
        return "runs in wheel";
    }
}
