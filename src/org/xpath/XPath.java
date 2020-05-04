package org.xpath;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.Document;
import org.xml.harness.XMLHarness;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import java.io.ByteArrayInputStream;
import java.util.HashMap;

public class XPath
{
    public static System system = new System();

    public static class System
    {
        public HashMap<String, Object> map = new HashMap<>();

        public javax.xml.xpath.XPath xpath;

        public System()
        {
            this.xpath = XPathFactory.newInstance().newXPath();
        }

        public Object push(String name, Object object)
        {
            this.map.put(name,object);

            return name;
        }

        public Object peek(String name)
        {
            Object object = map.get(name);

            if(object==null)
            {
                java.lang.System.out.println("No such element.");
            }
            else java.lang.System.out.println(object.toString());

            return map.get(name);
        }

        public Object pull(String name) throws Exception
        {
            Boolean nullresult = (this.map.get(name)==null);

            if(nullresult) throw new Exception("No such element.");

            return map.get(name);
        }

        public Object print(Class<? extends Object> context)
        {
            if(context.isAssignableFrom(XMLHarness.Test012.StaticResult.Result01.class))
            {
                try
                {
                    NodeList list = (NodeList)XPath.system.pull(XMLHarness.Test012.DatabaseConstants.xpath_result_01);

                    for(int i=0; i<list.getLength(); i++)
                    {
                        java.lang.System.out.println(list.item(i).getTextContent().trim());
                    }

                    java.lang.System.out.println();
                }
                catch (Exception e)
                {
                    java.lang.System.err.println(e);
                }
            }

            else if(context.isAssignableFrom(XMLHarness.Test012.StaticResult.Result02.class))
            {
                try
                {
                    NodeList list = (NodeList)XPath.system.pull(XMLHarness.Test012.DatabaseConstants.xpath_result_02);

                    for(int i=0; i<list.getLength(); i++)
                    {
                        java.lang.System.out.println(list.item(i).getTextContent().trim());
                    }

                    java.lang.System.out.println();
                }
                catch (Exception e)
                {
                    java.lang.System.err.println(e);
                }
            }

            else if(context.isAssignableFrom(XMLHarness.Test012.StaticResult.Result03.class))
            {
                try
                {
                    Double item = (Double)XPath.system.pull(XMLHarness.Test012.DatabaseConstants.xpath_result_03);

                    java.lang.System.out.println(item);

                    java.lang.System.out.println();
                }
                catch (Exception e)
                {
                    java.lang.System.err.println(e);
                }
            }

            if(context.isAssignableFrom(XMLHarness.Test013.StaticResult.Result01.class))
            {
                try
                {
                    NodeList list = (NodeList)XPath.system.pull(XMLHarness.Test013.DatabaseConstants.xpath_result_01);

                    for(int i=0; i<list.getLength(); i++)
                    {
                        java.lang.System.out.println(list.item(i).getTextContent().trim());
                    }

                    java.lang.System.out.println();
                }
                catch (Exception e)
                {
                    java.lang.System.err.println(e);
                }
            }

            else if(context.isAssignableFrom(XMLHarness.Test013.StaticResult.Result02.class))
            {
                try
                {
                    NodeList list = (NodeList)XPath.system.pull(XMLHarness.Test013.DatabaseConstants.xpath_result_01);

                    for(int i=0; i<list.getLength(); i++)
                    {
                        java.lang.System.out.println(list.item(i).getTextContent().trim());
                    }

                    java.lang.System.out.println();
                }
                catch (Exception e)
                {
                    java.lang.System.err.println(e);
                }
            }

            else if(context.isAssignableFrom(XMLHarness.Test013.StaticResult.Result03.class))
            {
                try
                {
                    Double item = (Double)XPath.system.pull(XMLHarness.Test013.DatabaseConstants.xpath_result_03);

                    java.lang.System.out.println(item);

                    java.lang.System.out.println();
                }
                catch (Exception e)
                {
                    java.lang.System.err.println(e);
                }
            }

            return this;
        }

        public Object evaluate(Document document, Class<? extends Object> returntype, Class<?> context)
        {
            if(context.isAssignableFrom(XMLHarness.Test012.Subtests.Test012a.class))
            {
                try
                {
                    XPathExpression expression = this.xpath.compile(XMLHarness.Test012.DatabaseConstants.xpath_input_01);

                    if(returntype.isAssignableFrom(NodeList.class))
                    {
                        XPath.system.push(XMLHarness.Test012.DatabaseConstants.xpath_result_01, expression.evaluate(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(document.toXML().getBytes())), XPathConstants.NODESET));
                    }
                    else if(returntype.isAssignableFrom(Node.class))
                    {
                        XPath.system.push(XMLHarness.Test012.DatabaseConstants.xpath_result_01, expression.evaluate(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(document.toXML().getBytes())), XPathConstants.NODE));
                    }
                    else if(returntype.isAssignableFrom(String.class))
                    {
                        XPath.system.push(XMLHarness.Test012.DatabaseConstants.xpath_result_01, expression.evaluate(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(document.toXML().getBytes())), XPathConstants.STRING));
                    }
                }
                catch(Exception e)
                {
                    java.lang.System.err.println(e);
                }
            }

            else if(context.isAssignableFrom(XMLHarness.Test012.Subtests.Test012b.class))
            {
                try
                {
                    XPathExpression expression = this.xpath.compile(XMLHarness.Test012.DatabaseConstants.xpath_input_02);

                    if(returntype.isAssignableFrom(NodeList.class))
                    {
                        XPath.system.push(XMLHarness.Test012.DatabaseConstants.xpath_result_02, expression.evaluate(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(document.toXML().getBytes())), XPathConstants.NODESET));
                    }
                    else if(returntype.isAssignableFrom(Node.class))
                    {
                        XPath.system.push(XMLHarness.Test012.DatabaseConstants.xpath_result_02, expression.evaluate(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(document.toXML().getBytes())), XPathConstants.NODE));
                    }
                    else if(returntype.isAssignableFrom(String.class))
                    {
                        XPath.system.push(XMLHarness.Test012.DatabaseConstants.xpath_result_02, expression.evaluate(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(document.toXML().getBytes())), XPathConstants.STRING));
                    }
                }
                catch(Exception e)
                {
                    java.lang.System.err.println(e);
                }
            }

            else if(context.isAssignableFrom(XMLHarness.Test012.Subtests.Test012c.class))
            {
                try
                {
                    XPathExpression expression = this.xpath.compile(XMLHarness.Test012.DatabaseConstants.xpath_input_03);

                    if(returntype.isAssignableFrom(NodeList.class))
                    {
                        XPath.system.push(XMLHarness.Test012.DatabaseConstants.xpath_result_03, expression.evaluate(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(document.toXML().getBytes())), XPathConstants.NODESET));
                    }
                    else if(returntype.isAssignableFrom(Node.class))
                    {
                        XPath.system.push(XMLHarness.Test012.DatabaseConstants.xpath_result_03, expression.evaluate(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(document.toXML().getBytes())), XPathConstants.NODE));
                    }
                    else if(returntype.isAssignableFrom(String.class))
                    {
                        XPath.system.push(XMLHarness.Test012.DatabaseConstants.xpath_result_03, expression.evaluate(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(document.toXML().getBytes())), XPathConstants.STRING));
                    }
                    else if(returntype.isAssignableFrom(Number.class))
                    {
                        XPath.system.push(XMLHarness.Test012.DatabaseConstants.xpath_result_03, expression.evaluate(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(document.toXML().getBytes())), XPathConstants.NUMBER));
                    }
                }
                catch(Exception e)
                {
                    java.lang.System.err.println(e);
                }
            }

            if(context.isAssignableFrom(XMLHarness.Test013.Subtests.Test013a.class))
            {
                try
                {
                    XPathExpression expression = this.xpath.compile(XMLHarness.Test013.DatabaseConstants.xpath_input_01);

                    if(returntype.isAssignableFrom(NodeList.class))
                    {
                        XPath.system.push(XMLHarness.Test013.DatabaseConstants.xpath_result_01, expression.evaluate(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(document.toXML().getBytes())), XPathConstants.NODESET));
                    }
                    else if(returntype.isAssignableFrom(Node.class))
                    {
                        XPath.system.push(XMLHarness.Test013.DatabaseConstants.xpath_result_01, expression.evaluate(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(document.toXML().getBytes())), XPathConstants.NODE));
                    }
                    else if(returntype.isAssignableFrom(String.class))
                    {
                        XPath.system.push(XMLHarness.Test013.DatabaseConstants.xpath_result_01, expression.evaluate(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(document.toXML().getBytes())), XPathConstants.STRING));
                    }
                }
                catch(Exception e)
                {
                    java.lang.System.err.println(e);
                }
            }

            else if(context.isAssignableFrom(XMLHarness.Test013.Subtests.Test013b.class))
            {
                try
                {
                    XPathExpression expression = this.xpath.compile(XMLHarness.Test013.DatabaseConstants.xpath_input_02);

                    if(returntype.isAssignableFrom(NodeList.class))
                    {
                        XPath.system.push(XMLHarness.Test013.DatabaseConstants.xpath_result_02, expression.evaluate(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(document.toXML().getBytes())), XPathConstants.NODESET));
                    }
                    else if(returntype.isAssignableFrom(Node.class))
                    {
                        XPath.system.push(XMLHarness.Test013.DatabaseConstants.xpath_result_02, expression.evaluate(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(document.toXML().getBytes())), XPathConstants.NODE));
                    }
                    else if(returntype.isAssignableFrom(String.class))
                    {
                        XPath.system.push(XMLHarness.Test013.DatabaseConstants.xpath_result_02, expression.evaluate(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(document.toXML().getBytes())), XPathConstants.STRING));
                    }
                }
                catch(Exception e)
                {
                    java.lang.System.err.println(e);
                }
            }

            else if(context.isAssignableFrom(XMLHarness.Test013.Subtests.Test013c.class))
            {
                try
                {
                    XPathExpression expression = this.xpath.compile(XMLHarness.Test013.DatabaseConstants.xpath_input_03);

                    if(returntype.isAssignableFrom(NodeList.class))
                    {
                        XPath.system.push(XMLHarness.Test013.DatabaseConstants.xpath_result_03, expression.evaluate(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(document.toXML().getBytes())), XPathConstants.NODESET));
                    }
                    else if(returntype.isAssignableFrom(Node.class))
                    {
                        XPath.system.push(XMLHarness.Test013.DatabaseConstants.xpath_result_03, expression.evaluate(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(document.toXML().getBytes())), XPathConstants.NODE));
                    }
                    else if(returntype.isAssignableFrom(String.class))
                    {
                        XPath.system.push(XMLHarness.Test013.DatabaseConstants.xpath_result_03, expression.evaluate(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(document.toXML().getBytes())), XPathConstants.STRING));
                    }
                    else if(returntype.isAssignableFrom(Number.class))
                    {
                        XPath.system.push(XMLHarness.Test013.DatabaseConstants.xpath_result_03, expression.evaluate(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(document.toXML().getBytes())), XPathConstants.NUMBER));
                    }
                }
                catch(Exception e)
                {
                    java.lang.System.err.println(e);
                }
            }

            return this;
        }
    }
}
