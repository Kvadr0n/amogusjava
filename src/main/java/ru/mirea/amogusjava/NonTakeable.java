package ru.mirea.amogusjava;

import java.util.HashMap;

/**
 * Класс неподбираемого предмета.
 */
public class NonTakeable extends ItemDecorator implements Item
{
    public NonTakeable(String name, HashMap<String, Integer> iactResp)
    {
        super(new Prop(name, iactResp), type.NT);
    }
}
