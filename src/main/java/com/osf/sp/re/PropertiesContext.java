//package com.osf.sp.re;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Iterator;
//import java.util.Properties;
//
//public class PropertiesContext {
//
//	public static void main(String[] args) {
//		InputStream is = PropertiesContext.class.getResourceAsStream("/re/ioc.properties");
//		//실제 경로에는 resources가 없다. 내비게이터로 보면 java만 있음 ! 합쳐짐 ! 
//		Properties prop = new Properties();
//		
//		try {
//			prop.load(is);
//			Iterator<Object> it = p.keySet().iterator();
//			while(it.hasNext()) {
//				String key = it.next().toString();
//				String className = prop.getProperty(key);
//				System.out.println("key : " + className);
//				Class clazz = Class.forName(className);
//				ac.put(key, clazz.newInstance());
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//	}
//}
