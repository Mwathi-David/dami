package org.dami.common;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.dami.common.io.DataReader;
import org.dami.common.io.FileVectorReader;

public class TestOutput{
	public static void main(String... args) throws IOException{
//		OutputStream os = new FileOutputStream("");
//		OutputStreamWriter osw = new OutputStreamWriter(os);
//		String a = "aaaa bbbb cccc";
//		StringTokenizer st = new StringTokenizer(a, " ");
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		System.out.println(Constants.ENDL.getBytes().length);
	}


}
