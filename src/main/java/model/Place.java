package model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Random;

@Getter
@AllArgsConstructor
public enum Place {
    RESTAURANT(10.0),
    CINEMA(20.0),
    BEACH(30.0),
    CLUB(40.0),
    HOUSEPARTY(50.0);

    double chanceToScoreByPlace;

    public static Place drawPlace() {
        Random random = new Random();
        return Arrays.asList(Place.values()).get(random.nextInt(Place.values().length));
    }
}