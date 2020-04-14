package org.xml;

import structures.Attributes;
import structures.Elements;

public class Element extends Node
{
    public String name;

    public Textnode textnode = new Textnode();

    public Elements children = new Elements();

    public Attributes attributes = new Attributes();

    //

    public Element(String name)
    {
        this.name = name;
    }

    //

    public Element setId(String value)
    {
        this.attributes.add(new Attribute("id", value));

        return this;
    }

    public Element addTextnode(Textnode textnode)
    {
        this.textnode = textnode;

        return this;
    }

    public Element addAttributes(Attributes attributes)
    {
        this.attributes.addAll(attributes);

        return this;
    }

    public Element addAttribute(Attribute attribute)
    {
        this.attributes.add(attribute);

        return this;
    }

    public Element addElement(Element element)
    {
        this.children.add(element);

        return element;
    }

    public Elements addElements(Elements elements)
    {
        this.children.addAll(elements);

        return elements;
    }


    public Element addElement(Element element, Attributes attributes)
    {
        this.children.add(element);

        this.attributes.addAll(attributes);

        return this;
    }

    public boolean hasTextnode()
    {
        return this.textnode.size()>0;
    }

    public boolean hasChildren()
    {
        return this.children.size()>0;
    }

    public boolean hasAttributes()
    {
        return this.attributes.size()>0;
    }
}
