package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    void setter() {
        Radio serv = new Radio();
        serv.setCurrentStation(2);
        int actual = serv.getCurrentStation();
        int expected = 2;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void next() {
        Radio serv = new Radio();
        serv.setCurrentStation(5);
        serv.nextStation();
        int actual = serv.getCurrentStation();
        int expected = 6;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void prev(){
        Radio serv = new Radio();
        serv.setCurrentStation(0);
        serv.previousStation();
        int actual = serv.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void increasingVolume(){
        Radio serv = new Radio();
        serv.setVolume(9);
        serv.volumeUp();
        int actual = serv.getCurrentVolume();
        int expected = 2;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void decreasingVolume(){
        Radio serv = new Radio();
        serv.setVolume(0);
        serv.volumeDown();
        int actual = serv.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected,actual);
    }
}
