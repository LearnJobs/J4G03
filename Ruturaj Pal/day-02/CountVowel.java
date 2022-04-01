package com.razz1.Day2;

public class CountVowel {

	public static void main(String[] args) {
		String text = "We are learning Java from LearnJobs by The Coders Nation";
		char[] vowel = {'A','E','I','O','U','a','e','i','o','u'};

		char c;
		int count = 0;
		for(int i=0; i<text.length(); i++) {
			c = text.charAt(i);
			for(int j=0; j<vowel.length; j++) {
				if(c==vowel[j]) {
					count++;
				}
			}
		}
		System.out.println("Totals Vowels = "+count);
	}

	}


