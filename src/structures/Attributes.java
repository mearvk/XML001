package structures;

import org.xml.Attribute;

import java.util.ArrayList;

public class Attributes
{
    public ArrayList<String> name = new ArrayList();

    public ArrayList<String> value = new ArrayList();

    //

    public Attributes(Attribute...attributes)
    {

    }

    public boolean addAll(Attributes attributes)
    {
        return true;
    }

    public boolean add(Attribute attribute)
    {
        boolean result01 = this.name.add(attribute.name);

        boolean result02 = this.value.add(attribute.value);

        return result01 & result02;
    }
}
