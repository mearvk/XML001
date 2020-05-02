package org.xml.harness;

import org.xml.*;
import org.xml.database.*;
import org.xml.io.Writer;
import org.xml.structures.Elements;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;


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

                writer.write(document.toXML());

                writer.flush();

                writer.close();

                writer = null;
            }
            catch (Exception e)
            {
                System.err.println(e);
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

                //

                table01.addAttribute(new Attribute("id","01"));

                table02.addAttribute(new Attribute("id","02"));

                table03.addAttribute(new Attribute("id","03"));

                //

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

                column04.addAttribute(new Attribute("name","descriptor"));

                column05.addAttribute(new Attribute("name","descriptor"));

                column06.addAttribute(new Attribute("name","descriptor"));

                //

                column07 = table03.addElement(column07 = new Element("column"));

                column08 = table03.addElement(column08 = new Element("column"));

                column09 = table03.addElement(column09 = new Element("column"));

                //

                column07.addAttribute(new Attribute("name","descriptor"));

                column08.addAttribute(new Attribute("name","descriptor"));

                column09.addAttribute(new Attribute("name","descriptor"));


                FileWriter writer;

                writer = new FileWriter("C:\\Users\\Mr. Max Rupplin\\Desktop\\xml\\output.xml");

                writer.write(document.toXML());

                writer.flush();

                writer.close();

                writer = null;
            }
            catch (Exception e)
            {
                System.err.println(e);
            }
        }
    }

    public static class Test003
    {
        public Test003()
        {
            try
            {
                Document document;

                Element tables;

                Element column01, column02, column03, column04, column05, column06, column07, column08, column09;

                Element table01, table02, table03;


                document = new Document(new Root("database"));

                //

                tables = document.root.addElement(new Element("tables"));

                //

                table01 = tables.addElement(new Element("table"));

                table02 = tables.addElement(new Element("table"));

                table03 = tables.addElement(new Element("table"));

                //

                table01.addAttribute(new Attribute("id","01"));

                table02.addAttribute(new Attribute("id","02"));

                table03.addAttribute(new Attribute("id","03"));

                //

                column01 = table01.addElement(column01 = new Element("column"));

                column02 = table01.addElement(column02 = new Element("column"));

                column03 = table01.addElement(column03 = new Element("column"));

                //

                column01.addAttribute(new Attribute("name","descriptor"));

                column01.addAttribute(new Attribute("type","varchar(255)"));

                column01.addTextnode(new Textnode("{textnode01}"));

                //

                column02.addAttribute(new Attribute("name","descriptor"));

                column02.addAttribute(new Attribute("type","varchar(255)"));

                column02.addTextnode(new Textnode("{textnode02}"));

                //

                column03.addAttribute(new Attribute("name","descriptor"));

                column03.addAttribute(new Attribute("type","varchar(255)"));

                column03.addTextnode(new Textnode("{textnode03}"));

                //

                column04 = table02.addElement(column04 = new Element("column"));

                column05 = table02.addElement(column05 = new Element("column"));

                column06 = table02.addElement(column06 = new Element("column"));

                //

                column04.addAttribute(new Attribute("name","descriptor"));

                column05.addAttribute(new Attribute("name","descriptor"));

                column06.addAttribute(new Attribute("name","descriptor"));

                //

                column07 = table03.addElement(column07 = new Element("column"));

                column08 = table03.addElement(column08 = new Element("column"));

                column09 = table03.addElement(column09 = new Element("column"));

                //

                column07.addAttribute(new Attribute("name","descriptor"));

                column08.addAttribute(new Attribute("name","descriptor"));

                column09.addAttribute(new Attribute("name","descriptor"));


                FileWriter writer;

                writer = new FileWriter("C:\\Users\\Mr. Max Rupplin\\Desktop\\xml\\output.xml");

                writer.write(document.toXML());

                writer.flush();

                writer.close();

                writer = null;
            }
            catch (Exception e)
            {
                System.err.println(e);
            }
        }
    }

    public static class Test004
    {
        public Test004()
        {
            try
            {
                Document document;

                Element tables;

                Element column01, column02, column03, column04, column05, column06, column07, column08, column09;

                Element table01, table02, table03;


                document = new Document(new Root("database"));

                //

                tables = document.root.addElement(new Element("tables"));

                //

                table01 = tables.addElement(new Element("table"));

                table02 = tables.addElement(new Element("table"));

                table03 = tables.addElement(new Element("table"));

                //

                table01.addAttribute(new Attribute("id","01"));

                table02.addAttribute(new Attribute("id","02"));

                table03.addAttribute(new Attribute("id","03"));

                //

                column01 = table01.addElement(column01 = new Element("column"));

                column02 = table01.addElement(column02 = new Element("column"));

                column03 = table01.addElement(column03 = new Element("column"));

                //

                column01.addAttribute(new Attribute("name","descriptor"));

                column01.addAttribute(new Attribute("type","varchar(255)"));

                column01.addTextnode(new Textnode("{textnode01}"));

                //

                column02.addAttribute(new Attribute("name","descriptor"));

                column02.addAttribute(new Attribute("type","varchar(255)"));

                column02.addTextnode(new Textnode("{textnode02}"));

                //

                column03.addAttribute(new Attribute("name","descriptor"));

                column03.addAttribute(new Attribute("type","varchar(255)"));

                column03.addTextnode(new Textnode("{textnode03}"));

                //

                column04 = table02.addElement(column04 = new Element("column"));

                column05 = table02.addElement(column05 = new Element("column"));

                column06 = table02.addElement(column06 = new Element("column"));

                //

                column04.addAttribute(new Attribute("name","descriptor"));

                column05.addAttribute(new Attribute("name","descriptor"));

                column06.addAttribute(new Attribute("name","descriptor"));

                //

                column07 = table03.addElement(column07 = new Element("column"));

                column08 = table03.addElement(column08 = new Element("column"));

                column09 = table03.addElement(column09 = new Element("column"));

                //

                column07.addAttribute(new Attribute("name","descriptor"));

                column08.addAttribute(new Attribute("name","descriptor"));

                column09.addAttribute(new Attribute("name","descriptor"));


                FileWriter writer;

                writer = new FileWriter("C:\\Users\\Mr. Max Rupplin\\Desktop\\xml\\output.xml");

                writer.write(document.toXML());

                writer.flush();

                writer.close();

                writer = null;
            }
            catch (Exception e)
            {
                System.err.println(e);
            }
        }
    }

    public static class Test005
    {
        public Test005()
        {
            try
            {
                Document document;

                Element users;

                Element user01, user02, user03;

                Element firstname01, firstname02, firstname03;

                Element lastname01, lastname02, lastname03;

                Element occupation01, occupation02, occupation03;


                document = new Document(new Root("users"));

                //

                user01 = document.root.addElement(new Element("user"));

                user02 = document.root.addElement(new Element("user"));

                user03 = document.root.addElement(new Element("user"));

                //

                user01 = user01.setId(new Attribute("01"));

                user02 = user02.setId(new Attribute("02"));

                user03 = user03.setId(new Attribute("03"));

                //

                user01.addElement(firstname01 = new Element("firstname"));

                user01.addElement(lastname01 = new Element("lastname"));

                user01.addElement(occupation01 = new Element("occupation"));

                //

                user02.addElement(firstname02 = new Element("firstname"));

                user02.addElement(lastname02 = new Element("lastname"));

                user02.addElement(occupation02 = new Element("occupation"));

                //

                user03.addElement(firstname03 = new Element("firstname"));

                user03.addElement(lastname03 = new Element("lastname"));

                user03.addElement(occupation03 = new Element("occupation"));

                //

                firstname01.addTextnode(new Textnode("Peter"));

                firstname02.addTextnode(new Textnode("Martin"));

                firstname03.addTextnode(new Textnode("Lucy"));

                //

                lastname01.addTextnode(new Textnode("Brown"));

                lastname02.addTextnode(new Textnode("Smith"));

                lastname03.addTextnode(new Textnode("Gordon"));

                //

                occupation01.addTextnode(new Textnode("Programmer"));

                occupation02.addTextnode(new Textnode("Accountant"));

                occupation03.addTextnode(new Textnode("Teacher"));

                //

                Writer writer = new Writer(document, "C:\\Users\\Mr. Max Rupplin\\Desktop\\xml\\output.xml");
                
                //
                
                Elements elements = document.root.getChildren();
                
                for(int i=0; i<elements.size(); i++)
                {
                    Element element = elements.get(i);

                    Textnode fname = element.getChild("firstname").getTextnode();

                    Textnode lname = element.getChild("lastname").getTextnode();

                    Textnode occup = element.getChild("occupation").getTextnode();
                }
            }
            catch (Exception e)
            {
                System.err.println(e);
            }
        }
    }

    public static class Test006
    {
        public Test006()
        {
            try
            {
                Document document;

                Element users;

                Element table01, table02;

                Element tr01;

                Element td01, td02;

                Element name01;

                Element width01;

                Element length01;

                //

                document = new Document(new Root("tables"));

                //

                table01 = document.root.addElement(table01 = new Element("table", new Namespace("a", "http://www.w3.org/TR/html4/")));

                table02 = document.root.addElement(table02 = new Element("table", new Namespace("b", "https://www.w3schools.com/furniture")));

                //

                tr01 = table01.addElement(tr01 = new Element("tr"));

                //

                td01 = tr01.addElement(td01 = new Element("td", new Namespace("c", "jgp://mearvk.org/projects")));

                td02 = tr01.addElement(td02 = new Element("td"));

                //

                td01.addTextnode(new Textnode("Apples"));

                td02.addTextnode(new Textnode("Bananas"));

                //

                name01 = table02.addElement(name01 = new Element("name"));

                width01 = table02.addElement(width01 = new Element("width"));

                length01 = table02.addElement(length01 = new Element("length"));

                //

                name01.addTextnode(new Textnode("African Coffee Table"));

                width01.addTextnode(new Textnode("80"));

                length01.addTextnode(new Textnode("120"));

                //

                Writer writer = new Writer(document, "C:\\Users\\Mr. Max Rupplin\\Desktop\\xml\\output.xml");
            }
            catch (Exception e)
            {
                System.err.println(e);
            }
        }
    }

    public static class Test007
    {
        public Test007()
        {
            try
            {
                Document document;

                Element table01, table02, table03;

                Element tr01;

                Element td01, td02;

                Element name01;

                Element width01;

                Element length01;

                Element column01, column02, column03;

                Element value01, value02, value03;


                //

                document = new Document(new Root("tables"));

                //

                table01 = document.root.addElement(table01 = new Element("table", new Namespace("a", "http://www.w3.org/TR/html4/")));

                table02 = document.root.addElement(table02 = new Element("table", new Namespace("b", "https://www.w3schools.com/furniture")));

                table03 = document.root.addElement(table03 = new Element("table"));

                //

                tr01 = table01.addElement(tr01 = new Element("tr"));

                //

                td01 = tr01.addElement(td01 = new Element("td", new Namespace("c", "https://mearvk.org/projects")));

                td02 = tr01.addElement(td02 = new Element("td"));

                //

                td01.addTextnode(new Textnode("Apples"));

                td02.addTextnode(new Textnode("Bananas"));

                //

                name01 = table02.addElement(name01 = new Element("name", new Namespace("e", "https://org.namespace.venkat.java")));

                width01 = table02.addElement(width01 = new Element("width"));

                length01 = table02.addElement(length01 = new Element("length"));

                //

                name01.addTextnode(new Textnode("African Coffee Table"));

                width01.addTextnode(new Textnode("80"));

                length01.addTextnode(new Textnode("120"));

                //

                column01 = table03.addElement(column01 = new Element("column"));

                column02 = table03.addElement(column02 = new Element("column"));

                column03 = table03.addElement(column03 = new Element("column"));

                //

                value01 = table03.addElement(value01 = new Element("value"));

                value02 = table03.addElement(value02 = new Element("value"));

                value03 = table03.addElement(value03 = new Element("value"));

                //

                Writer writer = new Writer(document, "C:\\Users\\Mr. Max Rupplin\\Desktop\\xml\\output.xml");
            }
            catch (Exception e)
            {
                System.err.println(e);
            }
        }
    }

    public static class Test008
    {
        public Test008()
        {
            try
            {
                Database database = new Database();

                database.exists = "true";

                database.context = Test008.class;

                database.file = new File("C:\\location\\company.sql");

                database.name = "company.sql";

                database.selected = "true";

                database.uri = "C:\\location\\company.sql";

                database.tables.add("employees");

                database.tables.add("human resources");

                database.tables.add("expenses");

                //

                Document ldocument;

                Element ldatabase, tables;

                //

                ldocument = new Document(new Root("database"));

                //

                ldocument.root.addAttribute(new Attribute("exists", database.exists));

                ldocument.root.addAttribute(new Attribute("context", database.context.toString()));

                ldocument.root.addAttribute(new Attribute("file", database.file.getCanonicalPath()));

                ldocument.root.addAttribute(new Attribute("name", database.name));

                ldocument.root.addAttribute(new Attribute("selected", database.selected));

                ldocument.root.addAttribute(new Attribute("uri", database.uri));

                //

                ldocument.root.addElement(tables = new Element("tables"));

                //

                for(String string : database.tables)
                {
                    Element table;

                    tables.addElement(table = new Element("table"));

                    table.setId(new Attribute("n/a"));

                    table.addAttribute(new Attribute("name", string));
                }

                //

                Writer writer = new Writer(ldocument, "C:\\Users\\Mr. Max Rupplin\\Desktop\\xml\\output.xml");
            }
            catch (Exception e)
            {
                System.err.println(e);
            }
        }

        public class Database
        {
            //public static Database reference;

            //

            public ArrayList<String> tables = new ArrayList<>();

            public String selected;

            public String exists;

            public String name;

            public String uri;

            //public DatabaseWrit writ;

            //public Parameter parameter;

            public Class<?> context;

            public File file;
        }
    }

    public static class Test009
    {
        public Test009()
        {
            try
            {
                Database database = new Database();

                database.exists = "true";

                database.context = Test009.class;

                database.file = new File("C:\\location\\09\\company.sql");

                database.name = "company.sql";

                database.selected = "true";

                database.uri = "C:\\location\\09\\company.sql";

                database.tables.add("employees");

                database.tables.add("income");

                database.tables.add("expenses");

                //

                Document ldocument;

                Element ldatabase, tables;

                //

                ldocument = new Document(new Root("database"));

                //

                ldocument.root.addAttribute(new Attribute("exists", database.exists));

                ldocument.root.addAttribute(new Attribute("context", database.context.toString()));

                ldocument.root.addAttribute(new Attribute("file", database.file.getCanonicalPath()));

                ldocument.root.addAttribute(new Attribute("name", database.name));

                ldocument.root.addAttribute(new Attribute("selected", database.selected));

                ldocument.root.addAttribute(new Attribute("uri", database.uri));

                //

                ldocument.root.addElement(tables = new Element("tables"));

                //

                for(int i=0; i<database.tables.size(); i++)
                {
                    Element table;

                    tables.addElement(table = new Element("table"));

                    table.setId(new Attribute(String.valueOf(database.tables.get(i))));

                    table.addAttribute(new Attribute("name", database.tables.get(i)));
                }

                //

                Writer writer = new Writer(ldocument, "C:\\Users\\Mr. Max Rupplin\\Desktop\\xml\\output.xml");
            }
            catch (Exception e)
            {
                System.err.println(e);
            }
        }

        public class Database
        {
            public ArrayList<String> tables = new ArrayList<>();

            public String selected;

            public String exists;

            public String name;

            public String uri;

            public Class<?> context;

            public File file;
        }
    }

    public static class Test010
    {
        public Test010()
        {
            try
            {
                Database database = new Database();

                database.exists = "true";

                database.context = Test010.class;

                database.file = new File("C:\\location\\10\\company.sql");

                database.name = "company.sql";

                database.selected = "true";

                database.uri = "C:\\location\\10\\company.sql";

                //

                Document xml_document;

                Element xml_database, xml_tables, xml_columns, xml_rows;

                //

                xml_document = new Document(new Root("database"));

                //

                xml_document.root.addAttribute(new Attribute("exists", database.exists));

                xml_document.root.addAttribute(new Attribute("context", database.context.toString()));

                xml_document.root.addAttribute(new Attribute("file", database.file.getCanonicalPath()));

                xml_document.root.addAttribute(new Attribute("name", database.name));

                xml_document.root.addAttribute(new Attribute("selected", database.selected));

                xml_document.root.addAttribute(new Attribute("uri", database.uri));

                //

                xml_document.root.addElement(xml_tables = new Element("tables"));

                //

                for(int i=0; i<database.tables.size(); i++)
                {
                    Element xml_table;

                    xml_tables.addElement(xml_table = new Element("table"));

                    xml_table.addAttribute(new Attribute("id", String.valueOf(i+1)));

                    xml_table.addAttribute(new Attribute("name", database.tables.get(i).name));

                    xml_table.addElement(xml_columns = new Element("columns"));

                    xml_table.addElement(xml_rows = new Element("rows"));

                    //

                    Columns database_columns = database.tables.get(i).columns;

                    for(int j=0; j<database_columns.size(); j++)
                    {
                        Element column;

                        xml_columns.addElement(column = new Element("column"));

                        column.addAttribute(new Attribute("id", database_columns.get(j).id));

                        column.addAttribute(new Attribute("name", database_columns.get(j).name));
                    }

                    //

                    Rows database_rows = database.tables.get(i).rows;

                    //

                    for(int j=0; j<database_rows.size(); j++) /* Add the row to table's rows */
                    {
                        Element xml_row;

                        xml_rows.addElement(xml_row = new Element("row"));

                        xml_row.addAttribute(new Attribute("id", database_rows.get(j).id));

                        xml_row.addAttribute(new Attribute("column", database_rows.get(j).column));

                        xml_row.addAttribute(new Attribute("value", database_rows.get(j).value));

                        //

                        Element xml_item;

                        for(int k=0; k<database_rows.get(j).items.size(); k++) /* Add the items to each row */
                        {
                            xml_row.addElement(xml_item = new Element("item"));

                            xml_item.addAttribute(new Attribute("id", "$"));

                            xml_item.addAttribute(new Attribute("column", "$"));

                            xml_item.addAttribute(new Attribute("value", "$"));
                        }
                    }
                }

                //

                Writer writer = new Writer(xml_document, "C:\\Users\\Mr. Max Rupplin\\Desktop\\xml\\output.xml");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        public class Database
        {
            public Tables tables = new Tables();

            public String selected;

            public String exists;

            public String name;

            public String uri;

            public Class<?> context;

            public File file;

            //

            public Database()
            {
                this.tables.add(new Table("employees"));

                this.tables.add(new Table("income"));

                this.tables.add(new Table("expense"));


                //

                Table table01 = this.tables.get(0);

                Table table02 = this.tables.get(1);

                Table table03 = this.tables.get(2);

                //

                table01.columns.add(new Column("000", "id"));

                table01.columns.add(new Column("001", "fname"));

                table01.columns.add(new Column("002", "lname"));

                //

                table02.columns.add(new Column("000", "id"));

                table02.columns.add(new Column("001", "gross"));

                table02.columns.add(new Column("002", "net"));

                //

                table03.columns.add(new Column("000", "id"));

                table03.columns.add(new Column("001", "gross"));

                table03.columns.add(new Column("002", "net"));

                //


                Table table;

                Row row;

                Item item;

                //


                for(int i=0; i<this.tables.size(); i++) // add items to rows
                {
                    table = this.tables.get(i);

                    for(int j=0; j<3; j++) /* WE NEED TABLE_ROWS.SIZE = 3 AHEAD OF POPULATION */
                    {
                        table.rows.add(row = new Row("", "",""));

                        for(int k=0; k<3; k++) /* WE NEED ROWS_ITEMS.SIZE = 3 AHEAD OF POPULATION */
                        {
                            row.add(new Item(String.valueOf(k),"$","$"));
                        }
                    }
                }
            }
        }
    }

    public static class Test011
    {
        public Test011()
        {
            try
            {
                Database database = new Database();

                database.exists = "true";

                database.context = Test010.class;

                database.file = new File("C:\\location\\10\\company.sql");

                database.name = "company.sql";

                database.selected = "true";

                database.uri = "C:\\location\\10\\company.sql";

                //

                Document xml_document;

                Element xml_database, xml_tables, xml_columns, xml_rows;

                //

                xml_document = new Document(new Root("database"));

                //

                xml_document.root.addAttribute(new Attribute("exists", database.exists));

                xml_document.root.addAttribute(new Attribute("context", database.context.toString()));

                xml_document.root.addAttribute(new Attribute("file", database.file.getCanonicalPath()));

                xml_document.root.addAttribute(new Attribute("name", database.name));

                xml_document.root.addAttribute(new Attribute("selected", database.selected));

                xml_document.root.addAttribute(new Attribute("uri", database.uri));

                //

                xml_document.root.addElement(xml_tables = new Element("tables"));

                //

                for(int i=0; i<database.tables.size(); i++)
                {
                    Element xml_table;

                    xml_tables.addElement(xml_table = new Element("table"));

                    xml_table.addAttribute(new Attribute("id", String.valueOf(i+1)));

                    xml_table.addAttribute(new Attribute("name", database.tables.get(i).name));

                    xml_table.addElement(xml_columns = new Element("columns"));

                    xml_table.addElement(xml_rows = new Element("rows"));

                    //

                    Columns database_columns = database.tables.get(i).columns;

                    for(int j=0; j<database_columns.size(); j++)
                    {
                        Element column;

                        xml_columns.addElement(column = new Element("column"));

                        column.addAttribute(new Attribute("id", database_columns.get(j).id));

                        column.addAttribute(new Attribute("name", database_columns.get(j).name));
                    }

                    //

                    Rows database_rows = database.tables.get(i).rows;

                    //

                    for(int j=0; j<database_rows.size(); j++) /* Add the row to table's rows */
                    {
                        Element xml_row;

                        xml_rows.addElement(xml_row = new Element("row"));

                        //xml_row.addAttribute(new Attribute("id", database_rows.get(j).id));

                        xml_row.addAttribute(new Attribute("column", database_rows.get(j).column));

                        //xml_row.addAttribute(new Attribute("value", database_rows.get(j).value));

                        //

                        Element xml_item;

                        for(int k=0; k<database_rows.get(j).items.size(); k++) /* Add the items to each row */
                        {
                            xml_row.addElement(xml_item = new Element("item"));

                            //xml_item.addAttribute(new Attribute("id", database_rows.get(j).items.get(k).id));

                            xml_item.addAttribute(new Attribute("column", database_rows.get(j).items.get(k).column));

                            //xml_item.addAttribute(new Attribute("value", database_rows.get(j).items.get(k).value));
                        }
                    }
                }

                //

                Writer writer = new Writer(xml_document, "C:\\Users\\Mr. Max Rupplin\\Desktop\\xml\\output.xml");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        public class Database
        {
            public Tables tables = new Tables();

            public String selected;

            public String exists;

            public String name;

            public String uri;

            public Class<?> context;

            public File file;

            //

            public Database()
            {
                //

                this.tables.add(new Table("employees"));

                this.tables.add(new Table("income"));

                this.tables.add(new Table("expense"));

                this.tables.add(new Table("stock"));

                //

                Table table1 = this.tables.get(0);

                Table table2 = this.tables.get(1);

                Table table3 = this.tables.get(2);

                Table table4 = this.tables.get(3);

                //

                table1.columns.add(new Column("0", "id", ColumnType.INTEGER));

                table1.columns.add(new Column("1", "first_name", ColumnType.VARCHAR));

                table1.columns.add(new Column("2", "last_name", ColumnType.VARCHAR));

                //

                table2.columns.add(new Column("0", "id", ColumnType.INTEGER));

                table2.columns.add(new Column("1", "gross_income", ColumnType.FLOAT));

                table2.columns.add(new Column("2", "net_income", ColumnType.FLOAT));

                //

                table3.columns.add(new Column("0", "id", ColumnType.INTEGER));

                table3.columns.add(new Column("1", "gross_expense", ColumnType.FLOAT));

                table3.columns.add(new Column("2", "net_expense", ColumnType.FLOAT));

                //

                table4.columns.add(new Column("0","id", ColumnType.INTEGER));

                table4.columns.add(new Column("1","description", ColumnType.INTEGER));

                table4.columns.add(new Column("2","name", ColumnType.INTEGER));

                table4.columns.add(new Column("3","quantity", ColumnType.INTEGER));

                table4.columns.add(new Column("4","supplier", ColumnType.INTEGER));

                //

                Table table;

                Row row;

                Item item;

                //

                for(int i=0; i<this.tables.size(); i++)
                {
                    table = this.tables.get(i);

                    for(int j=0; j<2*table.columns.size(); j++)
                    {
                        table.rows.add(row = new Row(String.valueOf(j)));   //add rows first
                    }

                    for(int j=0; j<table.rows.size(); j++)                  //row size
                    {
                        row = table.rows.get(j);

                        for(int k=0; k<table.columns.size(); k++)           //column width
                        {
                            row.add(new Item(String.valueOf(k)));           //add items
                        }
                    }
                }
            }
        }
    }
}

