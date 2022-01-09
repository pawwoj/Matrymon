package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Woman {
    String firstName;
    String lastName;
    int iQ;
    BoobsSize boobsSize;
    Place favoritePlace;

    public Woman(String firstName, String lastName, int iQ, BoobsSize boobsSize, Place favoritePlace) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iQ = iQ;
        this.boobsSize = boobsSize;
        this.favoritePlace = favoritePlace;
    }

    public double getScoreChanceByIq() {
        return this.iQ / 100.0;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.iQ + " " + this.boobsSize + " " + this.favoritePlace;
    }

    @Getter
    @AllArgsConstructor
    public enum BoobsSize {
        A(10.0),
        B(20.0),
        C(30.0),
        D(40.0),
        E(50.0),
        F(60.0);

        double chanceToScoreByBoobs;
    }
}
