package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlaceTest {

    @Test
    void drawPlace_ShouldReturnEnum() {
        assertThat(Place.drawPlace()).isInstanceOf(Place.CLUB.getClass());
    }
}