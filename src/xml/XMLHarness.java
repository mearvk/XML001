package xml;

import org.xml.Attribute;
import org.xml.Document;
import org.xml.Element;

import java.io.FileWriter;

public class XMLHarness
{
    public static class Test001
    {
        public Test001()
        {
            try
            {
                Document document;

                Element tables;

                Element column01, column02, column03, column04, column05, column06, column07, column08, column09;

                Element table01, table02, table03;



                document = new Document();

                //

                tables = document.root.addElement(new Element("tables"));

                //

                table01 = tables.addElement(new Element("table"));

                table02 = tables.addElement(new Element("table"));

                table03 = tables.addElement(new Element("table"));


                column01 = table01.addElement(column01 = new Element("column"));

                column02 = table01.addElement(column02 = new Element("column"));

                column03 = table01.addElement(column03 = new Element("column"));


                //

                column04 = table02.addElement(column04 = new Element("column"));

                column05 = table02.addElement(column05 = new Element("column"));

                column06 = table02.addElement(column06 = new Element("column"));

                //

                column07 = table03.addElement(column07 = new Element("column"));

                column08 = table03.addElement(column08 = new Element("column"));

                column09 = table03.addElement(column09 = new Element("column"));

                //


                FileWriter writer;

                writer = new FileWriter("C:\\Users\\Mr. Max Rupplin\\Desktop\\xml\\output.xml");

                writer.write(document.rendAsXML());

                writer.flush();

                writer.close();

                writer = null;
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public static class Test002
    {
        public Test002()
        {
            try
            {
                Document document;

                Element tables;

                Element column01, column02, column03, column04, column05, column06, column07, column08, column09;

                Element table01, table02, table03;


                document = new Document();

                //

                tables = document.root.addElement(new Element("tables"));

                //

                table01 = tables.addElement(new Element("table"));

                table02 = tables.addElement(new Element("table"));

                table03 = tables.addElement(new Element("table"));


                column01 = table01.addElement(column01 = new Element("column"));

                column02 = table01.addElement(column02 = new Element("column"));

                column03 = table01.addElement(column03 = new Element("column"));

                //

                column01.addAttribute(new Attribute("name","descriptor"));

                column02.addAttribute(new Attribute("name","descriptor"));

                column03.addAttribute(new Attribute("name","descriptor"));


                //

                column04 = table02.addElement(column04 = new Element("column"));

                column05 = table02.addElement(column05 = new Element("column"));

                column06 = table02.addElement(column06 = new Element("column"));

                //

                column07 = table03.addElement(column07 = new Element("column"));

                column08 = table03.addElement(column08 = new Element("column"));

                column09 = table03.addElement(column09 = new Element("column"));

                //


                FileWriter writer;

                writer = new FileWriter("C:\\Users\\Mr. Max Rupplin\\Desktop\\xml\\output.xml");

                writer.write(document.rendAsXML());

                writer.flush();

                writer.close();

                writer = null;
            }
            catch (Exception e)
            {

            }
        }
    }

    public static class Test003
    {
        public Test003()
        {
            Document document = new Document();
        }
    }

    public static class Test004
    {
        public Test004()
        {
            Document document = new Document();
        }
    }

    public static class Test005
    {
        public Test005()
        {
            Document document = new Document();
        }
    }

    public static class Test006
    {
        public Test006()
        {
            Document document = new Document();
        }
    }
}
