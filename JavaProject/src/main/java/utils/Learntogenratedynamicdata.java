package utils;

import com.github.javafaker.Faker;

public class Learntogenratedynamicdata {
	public static void main(String[] args) {
	  Faker f=new Faker();
	  System.out.println(f.name().firstName());
	}
}
