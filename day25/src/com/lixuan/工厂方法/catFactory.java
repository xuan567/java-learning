package com.lixuan.��������;

public class catFactory implements Factory {

	@Override
	public animals creatAnimals() {
		
		return new cat();
	}

}
