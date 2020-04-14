package org.xml;

import structures.Attributes;
import structures.DocumentAttributes;

public class Document
{
    public Root root;

    public Attributes attributes;

    public DocumentAttributes document_attributes;

    //

    public Document()
    {
        this.root = new Root();
    }

    public Document(Root root, Attributes attributes)
    {
        this.root = root;
    }

    public Document(Root root, Attributes attributes, DocumentAttributes docattributes)
    {
        this.root = root;
    }

    public String rendAsXML()
    {
        String xml;

        System.out.println(xml = traverseXML(this.root,"",0));

        return xml;
    }

    protected String indent(Integer depth)
    {
        String string = "";

        for(int i=0; i<depth; i++)
        {
            string += "\t";
        }

        return string;
    }

    protected String traverseXML(Element element, String string, Integer breadth)
    {
        breadth++;

        string = "<"+element.name;

        if(element.hasAttributes())
        {
            for(int i=0; i<element.attributes.size(); i++)
            {
                Attribute attribute;

                attribute = element.attributes.get(i);

                string = string + " "+attribute.name +"=\""+attribute.value+"\"";
            }
        }

        string = string + ">\n";

        if(element.hasTextnode())
        {
            string = string + indent(breadth) + element.textnode.value+"\n";
        }

        if(element.hasChildren())
        {
            for(int i=0; i<element.children.size(); i++)
            {
                string = string + indent(breadth) + traverseXML(element.children.get(i), element.name, breadth);
            }
        }

        return string + indent(breadth-1) + "</"+element.name +">\n";
    }
}