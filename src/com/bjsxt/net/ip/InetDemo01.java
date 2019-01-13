package com.bjsxt.net.ip;

import java.net.InetAddress;

import java.net.UnknownHostException;

/**
@author Jenson
@version 2019年1月8日下午4:41:06
*/
public class InetDemo01 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr = InetAddress.getLocalHost();	//使用getLocalHost()方法创建一个InetAddress对象
		System.out.println(addr.getHostAddress());		//输出IP地址
		System.out.println(addr.getHostName());			//输出主机名，
		
		InetAddress addr2 = InetAddress.getByName("www.baidu.com");	//根据域名得到InetAddress对象
		System.out.println(addr2.getHostAddress());		//返回"www.baidu.com"服务器的ip
		System.out.println(addr2.getHostName());		//返回"www.baidu.com"这个域名
		
		InetAddress addr3 = InetAddress.getByName("192.168.1.66");	//根据ip地址创建一个InetAddress对象
		System.out.println(addr3.getHostAddress()); 	
		System.out.println(addr3.getHostName());		//如果"192.168.1.66这个IP地址，可以进行域名解析，则返回该IP对应的域名
														//如果该IP不能解析，则返回未解析的ip地址本身
	}
}
