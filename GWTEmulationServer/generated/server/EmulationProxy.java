package de.tudresden.inf.rn.mobilis.gwtemulationserver.server.beans;

import java.util.List;import java.util.ArrayList;public class EmulationProxy {

	private IEmulationOutgoing _bindingStub;


	public EmulationProxy( IEmulationOutgoing bindingStub) {
		_bindingStub = bindingStub;
	}


	public IEmulationOutgoing getBindingStub(){
		return _bindingStub;
	}


	public void Start( String toJid, String appNamespace, int instanceId, String parameters, IXMPPCallback< StartAck > callback ) {
		if ( null == _bindingStub || null == callback )
			return;

		StartRequest out = new StartRequest( appNamespace, instanceId, parameters );
		out.setTo( toJid );

		_bindingStub.sendXMPPBean( out, callback );
	}

	public void Stop( String toJid, String appNamespace, int instanceId, IXMPPCallback< StopAck > callback ) {
		if ( null == _bindingStub || null == callback )
			return;

		StopRequest out = new StopRequest( appNamespace, instanceId );
		out.setTo( toJid );

		_bindingStub.sendXMPPBean( out, callback );
	}

	public XMPPBean Connect( String toJid, String packetId ) {
		if ( null == _bindingStub )
			return null;

		ConnectAck out = new ConnectAck(  );
		out.setTo( toJid );
		out.setId( packetId );

		_bindingStub.sendXMPPBean( out );

		return out;
	}

	public void Command( String toJid, String methodName, List< String > parameters, List< String > parameterTypes, int commandId, int instanceId, String appNamespace, boolean async, IXMPPCallback< CommandAck > callback ) {
		if ( null == _bindingStub || null == callback )
			return;

		CommandRequest out = new CommandRequest( methodName, parameters, parameterTypes, commandId, instanceId, appNamespace, async );
		out.setTo( toJid );

		_bindingStub.sendXMPPBean( out, callback );
	}

	public XMPPBean ExecutionResult( String toJid, String packetId ) {
		if ( null == _bindingStub )
			return null;

		ExecutionResultAck out = new ExecutionResultAck(  );
		out.setTo( toJid );
		out.setId( packetId );

		_bindingStub.sendXMPPBean( out );

		return out;
	}

	public void Log( String toJid, String appNamespace, int instanceId ) {
		if ( null == _bindingStub )
			return;

		LogRequest out = new LogRequest( appNamespace, instanceId );
		out.setTo( toJid );

		_bindingStub.sendXMPPBean( out );
	}

}