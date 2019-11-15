package com.ntt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Helloworld {

	static char[] cArr = "*Hello world!   ".toCharArray();
	static int index = -1;
	static StringBuffer messageLine = new StringBuffer();
	static List<StringBuffer> messageList = new ArrayList<>();
	static Path newFilePath = Paths.get("output.txt");

	public static void main(String[] args) {
		try {
			if (!Files.exists(newFilePath)) {
				Files.createFile(newFilePath);
			}
			printHelloworld();
			Files.write(newFilePath, messageList);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void printHelloworld() throws IOException {
		for (double x = 0; x <= Math.PI; x += 0.15) {
			int sinValue = (int) Math.round(Math.sin(x) * 60);
			for (int j = 0; j < sinValue; j++) {

				messageLine.append(nextChar());
			}

			messageList.add(messageLine);
			Files.write(newFilePath, (messageLine + System.lineSeparator()).getBytes());
			messageLine = new StringBuffer();
		}
	}

	public static char nextChar() {
		index++;

		if (index > cArr.length - 1) {
			index = 0;

		}
		return cArr[index];
	}
}
