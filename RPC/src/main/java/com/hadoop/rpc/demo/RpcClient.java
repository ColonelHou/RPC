package com.hadoop.rpc.demo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

public class RpcClient {

	
	public static void main(String[] args) throws IOException {
		final MyProtocol proxy = RPC.getProxy(MyProtocol.class, MyProtocol.VERSION, new InetSocketAddress(RpcServer.SERVER_IP, RpcServer.SERVER_PORT), new Configuration());
		String str = proxy.hello("tom");
		System.out.println("客户端返回结果: " + str);
		// 关闭网络连接
		RPC.stopProxy(proxy);
	}
}
