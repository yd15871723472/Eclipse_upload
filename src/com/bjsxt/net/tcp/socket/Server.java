package com.bjsxt.net.tcp.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
@author Jenson
@version 2019年1月9日上午9:12:59
*/
public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8888);	//创建服务器+指定端口
		Socket socket = server.accept();				//接收客户端的连接；阻塞式的
		System.out.println("一个客户端建立连接");	
		
	}
}
