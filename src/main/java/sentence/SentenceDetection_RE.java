package sentence;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import opennlp.tools.sentdetect.SentenceModel;

public class SentenceDetection_RE {
	public static void main(String args[]) {

		String sentence = " Hi. How are you? Welcome to Tutorialspoint. "
				+ "We provide free tutorials on various technologies";

		String simple = "[.?!]";
		String[] splitString = (sentence.split(simple));
		for (String string : splitString)
			System.out.println(string);

		// Loading sentence detector model
		InputStream inputStream;
		try {
			inputStream = new FileInputStream("C:/OpenNLP_models/ensent.bin");
			SentenceModel model = new SentenceModel(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
