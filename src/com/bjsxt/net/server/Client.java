package com.bjsxt.net.server;

import java.io.ByteArrayOutputStream;

import java.io.DataOutputStream;

import java.io.IOException;

import java.net.DatagramPacket;

import java.net.DatagramSocket;

import java.net.InetSocketAddress;

/**
@author Jenson
@version 2019年1月8日下午8:45:00
*/
public class Client {
	public static void main(String[] args) throws IOException{
		DatagramSocket client = new DatagramSocket(6666);	//新建服务端+端口；由于新建的客户端和服务端在同一主机上，注意端口不能一样
		double num = 89.12;									//数据准备
		byte[] data = convert(num);							//数据准备,将double数据转换为byte数据;必须转为字节数组，因为packet只能使用字节数组
		DatagramPacket packet = new DatagramPacket(data,data.length,new InetSocketAddress("localhost", 8888)); //打包（发送的地点+端口）
		client.send(packet);								//发送数据
		client.close();										//释放资源
	}


	public static byte[] convert(double num) throws IOException {
	byte[] data = null;										//字节数组作数据源
															//Data作数据流
	ByteArrayOutputStream bos = new ByteArrayOutputStream();//有新增方法，不能发生多态
	DataOutputStream dos = new DataOutputStream(bos);				
	dos.writeDouble(num); 
	dos.flush();											//刷新一下
	data = bos.toByteArray();								//
	dos.close();
	return data;
	}
}

			
