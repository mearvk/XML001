package org.xml.database;

import org.xml.harness.XMLHarness;

import java.util.ArrayList;

public class Rows
{
    public ArrayList<Row> rows = new ArrayList<>();

    public void add(Row row)
    {
        this.rows.add(row);
    }

    public int size()
    {
        return this.rows.size();
    }

    public Row get(int index)
    {
        return this.rows.get(index);
    }
}
