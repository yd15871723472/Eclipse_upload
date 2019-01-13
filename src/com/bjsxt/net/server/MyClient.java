package com.bjsxt.net.server;

import java.io.IOException;

import java.net.DatagramPacket;

import java.net.DatagramSocket;

import java.net.InetSocketAddress;

import java.net.SocketException;

/**
@author Jenson
@version 2019年1月8日下午8:45:00
*/
public class MyClient {
	public static void main(String[] args) throws IOException{
		DatagramSocket client = new DatagramSocket(6666);	//新建服务端+端口；由于新建的客户端和服务端在同一主机上，注意端口不能一样
		String msg = "UDP编程";								//数据准备
		byte[] data = msg.getBytes();						//数据准备
		DatagramPacket packet = new DatagramPacket(data,data.length,new InetSocketAddress("localhost", 8888)); //打包（发送的地点+端口）
		client.send(packet);								//发送数据
		client.close();										//释放资源
	}
}
