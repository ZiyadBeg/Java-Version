package com.java.nine.version.jigsawModule;

import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilderFactory;

public class JigsawMainClass {
	private static final Logger LOG = Logger.getLogger(JigsawMainClass.class.getName());
	
    public static void main(String[] args) {
    	 LOG.info("App started");
         DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         System.out.println(factory);
    }
}