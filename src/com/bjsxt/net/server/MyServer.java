package com.bjsxt.net.server;

import java.io.IOException;

import java.net.DatagramPacket;

import java.net.DatagramSocket;

/**
@author Jenson
@version 2019年1月8日下午8:45:29
*/
public class MyServer {
	public static void main(String[] args) throws IOException {
		DatagramSocket server = new DatagramSocket(8888);	//创建服务端+端口号
		byte[] container = new byte[1024];					//新建容器
		DatagramPacket packet = new DatagramPacket(container, container.length);	//新建包，用于封装数据
		server.receive(packet);								//接收数据
		byte[] data = packet.getData();						//分析数据
		int len = packet.getLength();						//分析数据
		System.out.println(new String(data, 0, len));		//转成字符串
		server.close();										//释放资源
	}
}
