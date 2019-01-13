package com.bjsxt.net.url;

import java.net.MalformedURLException;
import java.net.URL;

/**
@author Jenson
@version 2019年1月8日下午8:05:48
*/
public class URLDemo02 {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://www.baidu.com");	//该URL后面的部分省略，则默认返回主页
	}
}
