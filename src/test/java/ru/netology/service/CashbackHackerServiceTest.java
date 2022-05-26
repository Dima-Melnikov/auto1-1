package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackerServiceTest {

    @Test
    public void shouldReturn100IfAmountLowerThan1000() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assertions Assert;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnIfAmountGreaterThan1000() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        Assertions Assert;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmount1000() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions Assert;
        assertEquals(actual, expected);
    }

}
