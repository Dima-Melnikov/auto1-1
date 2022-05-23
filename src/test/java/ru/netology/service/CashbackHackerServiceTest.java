package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackerServiceTest {

    @Test
    public void shouldReturn100IfAmountLowerThan1000() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnIfAmountGreaterThan1000() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1200;

        int actual = service.remain(amount);
        int expected = 800;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmount1000() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
