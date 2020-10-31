package com.lixuan.Test_gong_chang;

public class AnimalFactory {
//	public static dog createDog() {
//		return new dog();
//	}
//	
//	public static cat createCat() {
//		return new cat();
//	}
	public static animals creatAnimals(String name) {
		if("dog".equals(name)) {
			return new dog();
		}
		else if("cat".equals(name)) {
			return new cat();
			
		}
		
		else
			return null;
	}

}
