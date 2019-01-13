package com.bjsxt.net.ip;

import java.net.InetAddress;

import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * 端口封装：InetAddress类+端口	实现封装；有了端口才能进行软件的切换
@author Jenson
@version 2019年1月8日下午5:08:12
*/
public class InetSocketDemo01 {				//封装端口
	public static void main(String[] args) throws UnknownHostException {
		//在本机开一个端口
		InetSocketAddress address = new InetSocketAddress("192.168.1.17", 1099);		//JDK帮忙设置我给定的IP和端口号
		address = new InetSocketAddress(InetAddress.getByName("192.168.1.17"), 1099);	//手动设置ip和端口号
		System.out.println(address.getHostName());	//获取"192.168.1.17"对应的主机名
				
		 
	}
}
