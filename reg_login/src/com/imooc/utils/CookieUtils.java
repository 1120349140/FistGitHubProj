package com.imooc.utils;

import javax.servlet.http.Cookie;;
/**
 * Cookie查找工具类
 * @author kykoo
 *
 */


public class CookieUtils {

	public static Cookie findCookie(Cookie[] cookies ,String name){
		if(cookies == null){
			// 说明客户端没有携带Cookie:
			return null;
		}else{
			// 说明客户端携带Cookie:
			for (Cookie cookie : cookies) {
				if(name.equals(cookie.getName())){
					return cookie;
				}
			}
			return null;
		}
	}
}
