package com.serenitydojo;


import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.assertj.core.api.Assertions.assertThat;


public class WhenCreatingObjects {
    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido","Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }
    @Test
    public void creating_a_hamster(){
        Hamster Fluffy = new Hamster("Fluffy", "Wheel", 1);

        Assert.assertEquals(Fluffy.getName(), "Fluffy" );
        Assert.assertEquals(Fluffy.getFavoriteGame(), "Wheel" );
        Assert.assertEquals(Fluffy.getAge(),1);
    }

    @Test
    public void whenADogBarks() {
        Dog fido = new Dog("Fido","Bone", 5);

        String dogSound = "";
        // TODO: implement a method in the Dog sound called makeNoise() that returns the sound a dog makes: "Woof", e.g.
        dogSound = fido.makeNoise();

        Assert.assertEquals(dogSound, "Woof");
    }

    @Test
    public void whenADogGetsFed() {
        Dog fido = new Dog("Fido","Bone", 5);

        // TODO: implement a method in the Dog sound called feed() that sets the isFed variable to true:
         fido.feed();

        Assert.assertTrue(fido.isFed());

    }


    @Test
    public void whenAnimalsPlay() {

        Pet fido = new Dog("Fido","Bone", 5);
        Pet spot = new Cat("Spot","String", 5);
        Pet fluffy = new Hamster("Fluffy", "Wheel", 1);

        assertThat(fido.play(), equalTo("plays with bone"));
        assertThat(spot.play(), equalTo("plays with string"));
        assertThat(fluffy.play(), equalTo("runs in wheel"));
    }



}

