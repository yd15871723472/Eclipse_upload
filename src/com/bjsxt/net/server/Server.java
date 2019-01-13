package com.bjsxt.net.server;

import java.io.ByteArrayInputStream;

import java.io.DataInputStream;

import java.io.IOException;

import java.net.DatagramPacket;

import java.net.DatagramSocket;

/**
@author Jenson
@version 2019年1月8日下午8:45:29
*/
public class Server {
	public static void main(String[] args) throws IOException {
		DatagramSocket server = new DatagramSocket(8888);	//创建服务端+端口号
		byte[] container = new byte[1024];					//新建容器
		DatagramPacket packet = new DatagramPacket(container, container.length);	//新建包，用于封装数据
		server.receive(packet);								//接收数据
		double data = convert(packet.getData());			//分析数据,将byte数据转换为double数据
		System.out.println(data);		
		server.close();										//释放资源
	}
	
	public static double convert(byte[] data) throws IOException {				//字节数组加Data输入流 
		DataInputStream dis = new DataInputStream(new ByteArrayInputStream(data));	
		double num = dis.readDouble();
		dis.close();
		
		return 0;
	}
}
