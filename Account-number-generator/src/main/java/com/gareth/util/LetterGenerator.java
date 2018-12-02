package com.gareth.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LetterGenerator {

	@Value("${letters}")
	String letters;

	public char generateLetter() {
		char[] letterArray = letters.toCharArray();
		return letterArray[(int) Math.floor(Math.random() * letterArray.length)];
	}
}
