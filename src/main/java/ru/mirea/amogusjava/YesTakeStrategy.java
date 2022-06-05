package ru.mirea.amogusjava;

/**
 * Стратегия для подбираемого предмета.
 */
public class YesTakeStrategy implements TakeStrategy
{
    public boolean take()
    {
        return(true);
    }
}
