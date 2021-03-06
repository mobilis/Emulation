//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.18 at 11:13:40 AM MEZ 
//


package de.tudresden.inf.rn.mobilis.gwtemulationserver.server.script;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.tudresden.inf.rn.mobilis.gwtemulationserver.server.script package. 
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
@XmlRegistry
public class ObjectFactory {

    private final static QName _SetupCommand_QNAME = new QName("http://mobilis.inf.tu-dresden.de/XMLEmulationScript", "setupCommand");
    private final static QName _Block_QNAME = new QName("http://mobilis.inf.tu-dresden.de/XMLEmulationScript", "block");
    private final static QName _AbstractInstance_QNAME = new QName("http://mobilis.inf.tu-dresden.de/XMLEmulationScript", "abstractInstance");
    private final static QName _Wait_QNAME = new QName("http://mobilis.inf.tu-dresden.de/XMLEmulationScript", "wait");
    private final static QName _For_QNAME = new QName("http://mobilis.inf.tu-dresden.de/XMLEmulationScript", "for");
    private final static QName _AppCommand_QNAME = new QName("http://mobilis.inf.tu-dresden.de/XMLEmulationScript", "appCommand");
    private final static QName _Stop_QNAME = new QName("http://mobilis.inf.tu-dresden.de/XMLEmulationScript", "stop");
    private final static QName _AtomicCommand_QNAME = new QName("http://mobilis.inf.tu-dresden.de/XMLEmulationScript", "atomicCommand");
    private final static QName _Structure_QNAME = new QName("http://mobilis.inf.tu-dresden.de/XMLEmulationScript", "structure");
    private final static QName _Instance_QNAME = new QName("http://mobilis.inf.tu-dresden.de/XMLEmulationScript", "instance");
    private final static QName _ControlCommand_QNAME = new QName("http://mobilis.inf.tu-dresden.de/XMLEmulationScript", "controlCommand");
    private final static QName _SetupMethods_QNAME = new QName("http://mobilis.inf.tu-dresden.de/XMLEmulationScript", "setupMethods");
    private final static QName _Command_QNAME = new QName("http://mobilis.inf.tu-dresden.de/XMLEmulationScript", "command");
    private final static QName _InstanceGroup_QNAME = new QName("http://mobilis.inf.tu-dresden.de/XMLEmulationScript", "instanceGroup");
    private final static QName _Start_QNAME = new QName("http://mobilis.inf.tu-dresden.de/XMLEmulationScript", "start");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.tudresden.inf.rn.mobilis.gwtemulationserver.server.script
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StructureType }
     * 
     */
    public StructureType createStructureType() {
        return new StructureType();
    }

    /**
     * Create an instance of {@link SetupMethodsType }
     * 
     */
    public SetupMethodsType createSetupMethodsType() {
        return new SetupMethodsType();
    }

    /**
     * Create an instance of {@link InstanceGroupType }
     * 
     */
    public InstanceGroupType createInstanceGroupType() {
        return new InstanceGroupType();
    }

    /**
     * Create an instance of {@link StartType }
     * 
     */
    public StartType createStartType() {
        return new StartType();
    }

    /**
     * Create an instance of {@link ParameterType }
     * 
     */
    public ParameterType createParameterType() {
        return new ParameterType();
    }

    /**
     * Create an instance of {@link AppCommandType }
     * 
     */
    public AppCommandType createAppCommandType() {
        return new AppCommandType();
    }

    /**
     * Create an instance of {@link ControlCommandType }
     * 
     */
    public ControlCommandType createControlCommandType() {
        return new ControlCommandType();
    }

    /**
     * Create an instance of {@link Script }
     * 
     */
    public Script createScript() {
        return new Script();
    }

    /**
     * Create an instance of {@link SetupCommandType }
     * 
     */
    public SetupCommandType createSetupCommandType() {
        return new SetupCommandType();
    }

    /**
     * Create an instance of {@link AbstractInstanceType }
     * 
     */
    public AbstractInstanceType createAbstractInstanceType() {
        return new AbstractInstanceType();
    }

    /**
     * Create an instance of {@link AtomicCommandType }
     * 
     */
    public AtomicCommandType createAtomicCommandType() {
        return new AtomicCommandType();
    }

    /**
     * Create an instance of {@link BlockType }
     * 
     */
    public BlockType createBlockType() {
        return new BlockType();
    }

    /**
     * Create an instance of {@link ForType }
     * 
     */
    public ForType createForType() {
        return new ForType();
    }

    /**
     * Create an instance of {@link StopType }
     * 
     */
    public StopType createStopType() {
        return new StopType();
    }

    /**
     * Create an instance of {@link WaitType }
     * 
     */
    public WaitType createWaitType() {
        return new WaitType();
    }

    /**
     * Create an instance of {@link InstanceType }
     * 
     */
    public InstanceType createInstanceType() {
        return new InstanceType();
    }

    /**
     * Create an instance of {@link CommandType }
     * 
     */
    public CommandType createCommandType() {
        return new CommandType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetupCommandType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", name = "setupCommand", substitutionHeadNamespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", substitutionHeadName = "atomicCommand")
    public JAXBElement<SetupCommandType> createSetupCommand(SetupCommandType value) {
        return new JAXBElement<SetupCommandType>(_SetupCommand_QNAME, SetupCommandType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", name = "block", substitutionHeadNamespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", substitutionHeadName = "structure")
    public JAXBElement<BlockType> createBlock(BlockType value) {
        return new JAXBElement<BlockType>(_Block_QNAME, BlockType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractInstanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", name = "abstractInstance", substitutionHeadNamespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", substitutionHeadName = "setupCommand")
    public JAXBElement<AbstractInstanceType> createAbstractInstance(AbstractInstanceType value) {
        return new JAXBElement<AbstractInstanceType>(_AbstractInstance_QNAME, AbstractInstanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", name = "wait", substitutionHeadNamespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", substitutionHeadName = "controlCommand")
    public JAXBElement<WaitType> createWait(WaitType value) {
        return new JAXBElement<WaitType>(_Wait_QNAME, WaitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", name = "for", substitutionHeadNamespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", substitutionHeadName = "structure")
    public JAXBElement<ForType> createFor(ForType value) {
        return new JAXBElement<ForType>(_For_QNAME, ForType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppCommandType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", name = "appCommand", substitutionHeadNamespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", substitutionHeadName = "atomicCommand")
    public JAXBElement<AppCommandType> createAppCommand(AppCommandType value) {
        return new JAXBElement<AppCommandType>(_AppCommand_QNAME, AppCommandType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", name = "stop", substitutionHeadNamespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", substitutionHeadName = "setupMethods")
    public JAXBElement<StopType> createStop(StopType value) {
        return new JAXBElement<StopType>(_Stop_QNAME, StopType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtomicCommandType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", name = "atomicCommand", substitutionHeadNamespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", substitutionHeadName = "command")
    public JAXBElement<AtomicCommandType> createAtomicCommand(AtomicCommandType value) {
        return new JAXBElement<AtomicCommandType>(_AtomicCommand_QNAME, AtomicCommandType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", name = "structure", substitutionHeadNamespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", substitutionHeadName = "command")
    public JAXBElement<StructureType> createStructure(StructureType value) {
        return new JAXBElement<StructureType>(_Structure_QNAME, StructureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", name = "instance", substitutionHeadNamespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", substitutionHeadName = "abstractInstance")
    public JAXBElement<InstanceType> createInstance(InstanceType value) {
        return new JAXBElement<InstanceType>(_Instance_QNAME, InstanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlCommandType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", name = "controlCommand", substitutionHeadNamespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", substitutionHeadName = "atomicCommand")
    public JAXBElement<ControlCommandType> createControlCommand(ControlCommandType value) {
        return new JAXBElement<ControlCommandType>(_ControlCommand_QNAME, ControlCommandType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetupMethodsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", name = "setupMethods", substitutionHeadNamespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", substitutionHeadName = "setupCommand")
    public JAXBElement<SetupMethodsType> createSetupMethods(SetupMethodsType value) {
        return new JAXBElement<SetupMethodsType>(_SetupMethods_QNAME, SetupMethodsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommandType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", name = "command")
    public JAXBElement<CommandType> createCommand(CommandType value) {
        return new JAXBElement<CommandType>(_Command_QNAME, CommandType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstanceGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", name = "instanceGroup", substitutionHeadNamespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", substitutionHeadName = "abstractInstance")
    public JAXBElement<InstanceGroupType> createInstanceGroup(InstanceGroupType value) {
        return new JAXBElement<InstanceGroupType>(_InstanceGroup_QNAME, InstanceGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", name = "start", substitutionHeadNamespace = "http://mobilis.inf.tu-dresden.de/XMLEmulationScript", substitutionHeadName = "setupMethods")
    public JAXBElement<StartType> createStart(StartType value) {
        return new JAXBElement<StartType>(_Start_QNAME, StartType.class, null, value);
    }

}
