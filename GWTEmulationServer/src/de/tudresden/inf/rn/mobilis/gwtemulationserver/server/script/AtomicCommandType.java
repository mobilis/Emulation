//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.18 at 11:13:40 AM MEZ 
//


package de.tudresden.inf.rn.mobilis.gwtemulationserver.server.script;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for atomicCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="atomicCommandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mobilis.inf.tu-dresden.de/XMLEmulationScript}commandType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atomicCommandType")
@XmlSeeAlso({
    AppCommandType.class,
    ControlCommandType.class,
    SetupCommandType.class
})
public class AtomicCommandType
    extends CommandType
{


}
