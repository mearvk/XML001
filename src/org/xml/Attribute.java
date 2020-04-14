package org.xml;

public class Attribute extends Node
{
    public String name;

    public String value;

    //

    public Attribute(String name, Integer value)
    {

    }

    public Attribute(String name, String value)
    {
        this.name = name;

        this.value = value;
    }
}
