package com.lixuan.��������;

public class dogFactory implements Factory {

	@Override
	public animals creatAnimals() {
		
		return new dog();
	}

}
