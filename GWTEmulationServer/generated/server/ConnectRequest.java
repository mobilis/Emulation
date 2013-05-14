package de.tudresden.inf.rn.mobilis.gwtemulationserver.server.beans;

import org.xmlpull.v1.XmlPullParser;import java.util.List;import java.util.ArrayList;

public class ConnectRequest extends XMPPBean {

	public ConnectRequest(){
		this.setType( XMPPBean.TYPE_SET );
	}


	@Override
	public void fromXML( XmlPullParser parser ) throws Exception {}

	public static final String CHILD_ELEMENT = "ConnectRequest";

	@Override
	public String getChildElement() {
		return CHILD_ELEMENT;
	}

	public static final String NAMESPACE = "emulation:iq:connect";

	@Override
	public String getNamespace() {
		return NAMESPACE;
	}

	@Override
	public XMPPBean clone() {
		ConnectRequest clone = new ConnectRequest(  );
		clone.cloneBasicAttributes( clone );

		return clone;
	}

	@Override
	public String payloadToXML() { return ""; }






}