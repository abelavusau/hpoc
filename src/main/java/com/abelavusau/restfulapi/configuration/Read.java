package com.abelavusau.restfulapi.configuration;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

public class Read {
	public static void main(String[] args) throws IOException {
		String s = FileUtils.readFileToString(new File("c:/leadmain-r-00004"), Charset.forName("UTF-8"));
		s = StringUtils.substringBefore(s, "\n");
		StringTokenizer tokenizer = new StringTokenizer(s, "\u001d");
		int i = 0;
		
		while (tokenizer.hasMoreTokens()) {
			System.out.printf("%d: %s\n", ++i, tokenizer.nextToken());
		}
	}
}
