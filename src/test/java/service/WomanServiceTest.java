package service;

import model.Place;
import model.Woman;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WomanServiceTest {
    @Test
    void chanceByFavoritePlace_Should() {
        Woman woman1x = new Woman("Majka", "Bajka", 100, Woman.BoobsSize.F, Place.drawPlace());
        WomanService womanService = new WomanService();

        assertThat(womanService.chanceByFavoritePlace(woman1x,Place.HOUSEPARTY)).isBetween(-10.0,10.0);
    }
}