package samplecode;

import com.github.javafaker.Faker;

public class LearningMaven {

	public static void main(String[] args) {
		Faker f=new Faker();
		System.out.println(f.name().firstName());
	}

}


