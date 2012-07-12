package org.dami.graph.ranking;

import java.io.IOException;
import java.util.Properties;


public class TestPagerank {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PageRank pr = new PageRank();
		
		Properties p = new Properties();
		p.setProperty(PageRank.TMPDIR, ".");
		pr.setParameters(p);
			
		pr.loadData("e:/data/pr.ser", "e:/data/pr2.ser");
		pr.rank();
		
		pr.writeOut("d:/prs.txt");
	}

}
