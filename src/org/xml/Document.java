package org.xml;

import org.apache.commons.lang3.StringUtils;
import structures.Attributes;
import structures.DocumentAttributes;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Stack;

public class Document
{
    public Root root;

    public Attributes attributes;

    public DocumentAttributes docattributes;

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

    protected String traverseXML(Element element, String string, Integer depth)
    {
        depth++;

        string = "<"+element.name ;

        if(element.hasAttributes())
        {
            for(int i=0; i<element.attributes.size(); i++)
            {
                Attribute attribute;

                attribute = element.attributes.get(i);

                string += " "+attribute.name +"=\""+attribute.value+"\"";
            }
        }

        string = string + ">\n";

        if(element.hasChildren())
        {
            for(int i=0; i<element.children.size(); i++)
            {
                string += indent(depth) + traverseXML(element.children.get(i), element.name, depth);
            }
        }

        return string + indent(depth-1) + "</"+element.name +">\n";
    }
}