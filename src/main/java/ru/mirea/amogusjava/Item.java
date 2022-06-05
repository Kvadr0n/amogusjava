package ru.mirea.amogusjava;

public interface Item
{
    public String getName();
    public Integer getResponse(String action);
    public boolean containsKey(String key);
    public boolean take();
}
