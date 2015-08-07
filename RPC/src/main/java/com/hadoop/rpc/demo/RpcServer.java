package com.hadoop.rpc.demo;

import java.io.IOException;

import org.apache.hadoop.HadoopIllegalArgumentException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.RPC.Server;



/**
 * 3.定义RPC Server
 * @author John
 *
 */
public class RpcServer {

	public static final String SERVER_IP = "localhost";// 指定服务器IP 
    public static final int SERVER_PORT = 9999;// 指定服务器端口 
    
	public static void main(String[] args) throws HadoopIllegalArgumentException, IOException {
		/*final Server server = new RPC.Builder(new Configuration()).setProtocol(MyProtocol.class).build();
		server.start();*/
		
	}
}
