package templates.refactoring;

import templates.Person;

import java.util.ArrayList;
import java.util.Collection;

public class ClassWithALotOfErrors {
    private final Collection<String> links;
    private String name;
    private String type;
    private int id;
    private int xstart;
    private int ystart;
    private int xend;
    private int yend;


    public ClassWithALotOfErrors(String name, String type, int id) {
        this.name = name;
        this.type = type;
        this.id = id;

        links = new ArrayList<>();
    }

    public ClassWithALotOfErrors(SnmpObj snmpObj) {
        this(snmpObj.getName(), snmpObj.getFullType(), snmpObj.getId());
        //name = snmpObj.getName();
        //type = snmpObj.getFullType();
        //id   = snmpObj.getId ();
    }

    public String toString() {
        StringBuilder result;

        result = new StringBuilder();

        result.append("[ MapDevice : id = ");
        result.append(getId());
        result.append("; name = ");
        result.append(getName());
        result.append("; type = ");
        result.append(getType());
        result.append("; links = ");
        result.append(getLinks());

        result.append(" ]");

        return result.toString();
    }

    public void addLinkObject(LinkObject linkObject) {
        // todo если уже есть такой - не заносить.
        links.add(linkObject);
        linkObject.setOurDeviceId(getId());
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public void setXY(int xstart, int ystart, int xend, int yend) {
        this.xstart = xstart;
        this.ystart = ystart;
        this.xend = xend;
        this.yend = yend;
    }

    public int getXstart() {
        return xstart;
    }

    public int getYstart() {
        return ystart;
    }

    public int getXend() {
        return xend;
    }

    public int getYend() {
        return yend;
    }

    public Collection<LinkObject> getLinks() {
        return links;
    }
}
