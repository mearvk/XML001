package org.xml.database;

public class Column
{
    public String name;

    public String id;

    public ColumnType type = new ColumnType();

    public Column(final String id, final String name)
    {
        this.id = id;

        this.name = name;
    }

    public Column(final String id, final String name, final Integer type)
    {
        this.id = id;

        this.name = name;

        this.type.type = type;
    }

    public Column(final String id, final String name, final String description, final Integer type)
    {
        this.id = id;

        this.name = name;

        this.type.type = type;
    }
}
