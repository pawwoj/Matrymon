package service;

import model.DateToScore;
import model.Place;
import model.Woman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
class DateToScoreServiceTest {

    @Test
    void chanceToScoreOnDate_ChanceToScoreAreOver100ExceptionHandledAndChanceSetTo30() {
        Woman woman1x = new Woman("Majka", "Bajka", 100, Woman.BoobsSize.F, Place.drawPlace());
        DateToScoreService dateToScoreService = new DateToScoreService();
        DateToScore dateToScore = new DateToScore("test",Place.HOUSEPARTY, woman1x);

        assertThat(dateToScoreService.chanceToScoreOnDate(dateToScore)).isEqualTo(30.0);
    }

    @Test
    void chanceToScoreOnDate_ChanceToScoreIsBetween41and61() {
        Woman woman1x = new Woman("Majka", "Bajka", 100, Woman.BoobsSize.A, Place.drawPlace());
        DateToScoreService dateToScoreService = new DateToScoreService();
        DateToScore dateToScore = new DateToScore("test",Place.CLUB, woman1x);

        assertThat(dateToScoreService.chanceToScoreOnDate(dateToScore)).isBetween(41.0,61.0);
    }
}