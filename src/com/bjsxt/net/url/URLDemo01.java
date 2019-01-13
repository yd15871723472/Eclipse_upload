package com.bjsxt.net.url;

import java.net.MalformedURLException;

import java.net.URL;

/**
@author Jenson
@version 2019年1月8日下午7:53:53
*/
public class URLDemo01 {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://www.baidu.com:80/index.html#aa?uname=bjsxt");
		System.out.println(url.getProtocol());	//查看该url的协议
		System.out.println(url.getPort());		//查看端口
		System.out.println(url.getHost());		//看域名
		System.out.println(url.getFile());		//看具体的文件资源
		System.out.println(url.getPath());		//看相对路径 
		System.out.println(url.getRef());       //看锚点 
		System.out.println(url.getQuery()); 	//？后面的部分；但是如果该URL中存在锚点，则返回null
	}
}
