package com.lixuan.工厂方法;

public class dogFactory implements Factory {

	@Override
	public animals creatAnimals() {
		
		return new dog();
	}

}
