package org.xml.database;

import java.util.ArrayList;

public class Table
{
    public Columns columns = new Columns();

    public Rows rows = new Rows();

    public String name;

    public Integer column_count;

    public Integer row_count;

    public ArrayList<String> values = new ArrayList<>();

    public Table(String name)
    {
        this.name = name;
    }
}
