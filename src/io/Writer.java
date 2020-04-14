package io;

import org.xml.Document;

import java.io.FileWriter;
import java.io.IOException;

public class Writer
{
    public Writer(Document document, String Url)
    {
        FileWriter writer;

        try
        {
            writer = new FileWriter(Url);

            writer.write(document.rend());

            writer.flush();

            writer.close();

            writer = null;
        }
        catch (IOException e)
        {
            System.err.println(e);
        }
    }
}
