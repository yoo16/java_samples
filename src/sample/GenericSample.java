package sample;

public class GenericSample<T> {
	private T value;
	
	public void setValue(T val) {
		this.value = val;
	}

	public T getValue() {
		return this.value;
	}

}
