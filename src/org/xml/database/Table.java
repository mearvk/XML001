package org.xml.database;

import java.util.ArrayList;

public class Table
{
    public Columns columns = new Columns();

    public Rows rows = new Rows();

    public int size;

    public String name;

    public ArrayList<String> values = new ArrayList<>();

    public Table(String name)
    {
        this.name = name;
    }
}
