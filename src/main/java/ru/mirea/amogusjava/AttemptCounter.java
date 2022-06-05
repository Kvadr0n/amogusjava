package ru.mirea.amogusjava;

import java.io.Serializable;

/**
 * Класс, осуществляющий подсчёт попыток прохождения игры.
 */
public class AttemptCounter implements Serializable
{
    private static final long serialVersionUID = 1L;
    public int number;

    public AttemptCounter()
    {
        number = 0;
    }
}
