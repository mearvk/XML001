package org.xml.database;

import org.xml.harness.XMLHarness;

public class Row
{
    public Items items = new Items();

    public String column;

    public String value;

    public String id;

    //

    public Row(String id, String column, String value)
    {
        this.id = id;

        this.column = column;

        this.value = value;
    }


    public void add(Item item)
    {
        this.items.add(item);
    }

    public int size()
    {
        return this.items.size();
    }

    public Item get(int index)
    {
        return this.items.get(index);
    }
}