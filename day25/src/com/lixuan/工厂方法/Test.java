package com.lixuan.��������;

public class Test {

	public static void main(String[] args) {
		dogFactory df = new dogFactory();
		dog d = (dog) df.creatAnimals();
		d.eat();
	}

}
