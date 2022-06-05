package ru.mirea.amogusjava;

/**
 * Интерфейс предмета для взаимодействия.
 */
public interface Item
{
    public String getName();
    public Integer getResponse(String action);
    public boolean containsKey(String key);
    public boolean take();
}
