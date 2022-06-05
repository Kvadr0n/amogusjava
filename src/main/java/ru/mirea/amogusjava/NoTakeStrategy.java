package ru.mirea.amogusjava;

/**
 * Стратегия для неподбираемого предмета.
 */
public class NoTakeStrategy implements TakeStrategy
{
    public boolean take()
    {
        return(false);
    }
}