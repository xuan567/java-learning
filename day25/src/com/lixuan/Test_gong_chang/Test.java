package com.lixuan.Test_gong_chang;

public class Test {

	public static void main(String[] args) {
		dog d = (dog) AnimalFactory.creatAnimals("dog");
		d.eat();
	}

}
