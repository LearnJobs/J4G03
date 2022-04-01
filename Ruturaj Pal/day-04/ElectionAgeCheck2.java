package com.razz1.Day4;

public class ElectionAgeCheck2 {
int age;
String ages[]= {"25","35","11","19","55","94","xy","75","-3","22","12","10","45","75","51","31","13"};

public ElectionAgeCheck2() {
	for(int i=0;i<ages.length;i++) {
		try {
			age=Integer.parseInt(ages[i]);
			doAgeCheck(age);
			System.out.println("age["+age+"]is correct");
		}catch(NegativeAgeException e) {
			System.out.println(age +"is negative:"+e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println(age +"is wrong:"+e.getMessage());
		}catch(TooYoungAgeException e) {
			System.out.println(age+"is too young:"+e.getMessage());
		}catch(TooOldAgeException e) {
			System.out.println(age+"is too old:"+e.getMessage());
		}
	}
}

private void doAgeCheck(int age2) throws NegativeAgeException,NumberFormatException,TooYoungAgeException,TooOldAgeException{
	if(age<0) throw new NegativeAgeException("the age is less than 0["+age+"]");
	else if(age<18) throw new TooYoungAgeException("the age is less than 18["+age+"]");
	else if(age>70) throw new TooOldAgeException("the age is greater than 70["+age+"]");
	
}
public static void main(String[] args) {
	new ElectionAgeCheck2();
}
}

