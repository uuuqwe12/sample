package co.edu.collect.generic;
/*
 * 제네릭 : 타입을 클래스 정의하는 시점이 아니라 사용하는 시점에 정하겠다는 것.
 */

public class Box<T> {
	private T obj; 
	
	public void set(T obj) {
		this.obj = obj;
	}
	
	public T get() {
		return obj;
	}
	
}
