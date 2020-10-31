package com.lixuan.工厂方法;

public class catFactory implements Factory {

	@Override
	public animals creatAnimals() {
		
		return new cat();
	}

}
