package com.hadoop.rpc.demo;

import java.io.IOException;

import org.apache.hadoop.ipc.ProtocolSignature;

/**
 * 2.实现RPC接口
 * @author John
 *
 */
public class MyProtocolImple implements MyProtocol {

	public long getProtocolVersion(String protocol, long clientVersion)
			throws IOException {
		return MyProtocol.VERSION;
	}

	public ProtocolSignature getProtocolSignature(String protocol,
			long clientVersion, int clientMethodsHash) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public String hello(String name) {
		System.out.println("我被调用 了");
		return "hello " + name;
	}

}
