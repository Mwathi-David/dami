package org.dami.common.io;

import java.io.IOException;

import org.dami.common.io.FileVectorConverter;

public class TestConverter {
	public static void main(String[] args) throws IOException{
		String input = "e:/data/covtype";
		String out = "e:/data/covtypex";
		
//		FileVectorConverter fvc = FileVectorConverter.normalclassificationFormatConverter(input, out);
		FileVectorConverter fvc = FileVectorConverter.classificationFormatFastConverter(input, out);
		fvc.convert();
		System.out.println(fvc);
	}
}
