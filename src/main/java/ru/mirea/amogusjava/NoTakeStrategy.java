package ru.mirea.amogusjava;

public class NoTakeStrategy implements TakeStrategy
{
    public boolean take()
    {
        return(false);
    }
}