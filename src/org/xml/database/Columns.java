package org.xml.database;

import org.xml.harness.XMLHarness;

import java.util.ArrayList;

public class Columns
{
    public ArrayList<Column> columns = new ArrayList<>();

    public void add(Column table)
    {
        this.columns.add(table);
    }

    public int size()
    {
        return this.columns.size();
    }

    public Column get(int index)
    {
        return this.columns.get(index);
    }
}
