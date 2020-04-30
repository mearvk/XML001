package org.xml.database;

import org.xml.harness.XMLHarness;

import java.util.ArrayList;

public class Items
{
    public ArrayList<Item> items = new ArrayList<>();

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
