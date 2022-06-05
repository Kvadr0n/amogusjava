package ru.mirea.amogusjava;

import java.util.HashMap;

/**
 * Класс подбираемого предмета.
 */
public class Takeable extends ItemDecorator implements Item
{
    public Takeable(String name, HashMap<String, Integer> iactResp)
    {
        super(new Prop(name, iactResp), type.T);
    }
}
