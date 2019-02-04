package com.adonayg.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LetterGenerator {

	@Value("${letters}")
	private String letters;

	public char generateLetter() {
		char[] letterArray = letters.toCharArray();
		return letterArray[(int) Math.floor(Math.random() * letterArray.length)];
	}
}
