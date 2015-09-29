package com.a3m.configuration;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Read {
	public static void main(String[] args) throws IOException {
		File file = new File("c:/part-m-00000");
		File out = new File("c:/test");
		
		List<String> sourceList = FileUtils.readLines(file, Charset.forName("UTF-8"));
		List<String> destList = new ArrayList<>(30000);
		
		for (int i = 0; i < 30000; i++) {
			destList.add(sourceList.get(i));
		}
		
		FileUtils.writeLines(out, destList, "\n");
		
		String s = FileUtils.readFileToString(out);
		s = s.replaceAll("\u001d", "~");
		FileUtils.writeStringToFile(out, s, Charset.forName("UTF-8"));
//		//s = StringUtils.substringBefore(s, "\n");
//		StringTokenizer tokenizer = new StringTokenizer(s, "\u001d");
//		int i = 0;
//
//		while (tokenizer.hasMoreTokens()) {
//			System.out.printf("%d: %s\n", ++i, tokenizer.nextToken());
//		}
	}
}
