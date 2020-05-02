package org.xml.database;

import org.xml.harness.XMLHarness;

public class Row
{
    public Items items = new Items();

    public String column;

    public String value;

    public String id;

    public String index;

    //

    public Row(String index)
    {
        this.index = index;
    }

    public Row(String index, String value)
    {
        this.index = index;

        this.value = value;
    }

    public Row(String id, String index, String value)
    {
        this.id = id;

        this.index = index;

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