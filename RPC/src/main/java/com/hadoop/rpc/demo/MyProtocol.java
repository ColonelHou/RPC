package com.hadoop.rpc.demo;

import org.apache.hadoop.ipc.VersionedProtocol;

/**
 * 1.定义RPC接口
 * Client和Server之间通信接口
 * @author John
 *
 */
public interface MyProtocol extends VersionedProtocol{

	public static final long VERSION  = 123456L;
	
	public abstract String hello(String name);
}
