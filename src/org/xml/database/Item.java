package org.xml.database;

import java.util.ArrayList;

public class Item
{
    public String column;

    public String value;

    public String id;

    public ArrayList<String> values = new ArrayList<String>();

    //

    public Item(String id, String column, String value)
    {
        this.id = id;

        this.column = column;

        this.value = value;
    }
}
