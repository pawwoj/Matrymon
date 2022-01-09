package service;

import exception.BadPlaceForDateException;
import model.Place;
import model.Woman;

public class WomanService {

    public double chanceByFavoritePlace(Woman woman,Place place) {
        try {
            if (woman.getFavoritePlace() != place) {
                throw new BadPlaceForDateException("Its not favorite place for woman");
            }
        } catch (BadPlaceForDateException e) {
            System.out.println(e);
            return -10.00;
        }
        return 10.00;
    }
}