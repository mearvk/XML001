package org.xml;

public class Namespace
{
    public String prefix = "";

    public String uri = "";

    public Namespace()
    {

    }

    public Namespace(String prefix, String uri)
    {
        this.prefix = prefix;

        this.uri = uri;
    }

    public int size()
    {
        return this.prefix.equals("") ? 0 : 1;
    }
}
