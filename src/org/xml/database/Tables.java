package org.xml.database;

import java.util.ArrayList;

public class Tables
{
    public ArrayList<Table> tables = new ArrayList<>();

    public void add(Table table)
    {
        this.tables.add(table);
    }

    public int size()
    {
        return this.tables.size();
    }

    public Table get(int index)
    {
        return this.tables.get(index);
    }
}
