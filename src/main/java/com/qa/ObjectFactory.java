
package com.qa;

import javax.xml.bind.annotation.XmlRegistry;
import java.util.List;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.qa package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
//@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.qa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Dt }
     * 
     */
    public Dt createDt() {
        return new Dt();
    }

    /**
     * Create an instance of {@link Dt.Mapper }
     * 
     */
    public Dt.Mapper createDtMapper() {
        return new Dt.Mapper();
    }

    /**
     * Create an instance of {@link Dt.Mapper.Target }
     * 
     */
    public Dt.Mapper.Target createDtMapperTarget() {
        return new Dt.Mapper.Target();
    }

    /**
     * Create an instance of {@link Dt.Sources }
     * 
     */
    public Dt.Sources createDtSources() {
        return new Dt.Sources();
    }

    /**
     * Create an instance of {@link Dt.Sources.Source }
     * 
     */
    public Dt.Sources.Source createDtSourcesSource() {
        return new Dt.Sources.Source();
    }

    /**
     * Create an instance of {@link Dt.Mapper.Target.Attr }
     * 
     */
    public Dt.Mapper.Target.Attr createDtMapperTargetAttr() {
        return new Dt.Mapper.Target.Attr();
    }

    /**
     * Create an instance of {@link Dt.Sources.Source.Attr }
     * 
     */
    public Dt.Sources.Source.Attr createDtSourcesSourceAttr() {
        return new Dt.Sources.Source.Attr();
    }

    public static void main(String[] args) {
        ObjectFactory objectFactory = new ObjectFactory();
        Dt dt = objectFactory.createDt();
        dt.setMapper(new Dt.Mapper());
        dt.setSources(new Dt.Sources());
        Dt.Sources.Source source = new Dt.Sources.Source();
        dt.getSources().setSource(source);
//        Dt.Mapper.Target.Attr
        List<Dt.Sources.Source.Attr> List = dt.getSources().getSource().getAttr();
        Dt.Sources.Source.Attr attr = new Dt.Sources.Source.Attr();
        attr.setFormat("");
        List.add(attr);

        String s = XmlUtil.toXml(dt, Dt.class);
        System.out.println(s);
    }
    public static Dt create(){
        Dt dt =new Dt();
        Dt.Sources sources = new Dt.Sources();
        Dt.Mapper mapper = new Dt.Mapper();
        return dt;
    }
}
