package service;

import exception.TooConfidentException;
import model.DateToScore;

public class DateToScoreService {

    public double chanceToScoreOnDate(DateToScore dateToScore) {
        double chance = dateToScore.getWoman().getBoobsSize().getChanceToScoreByBoobs()
                + dateToScore.getWoman().getScoreChanceByIq()
                + dateToScore.getPlace().getChanceToScoreByPlace()
                + new WomanService().chanceByFavoritePlace(dateToScore.getWoman(), dateToScore.getPlace());
        try {
            if (chance>=100)
                throw new TooConfidentException("Too confident");
        } catch (TooConfidentException e) {
            System.out.println(e);
            return 30.0;
        }
        return chance;
    }
}