package computer;

public class Address implements Operand {
	private int index;
	
	public Address(int value) {
		index = value;
	}
	
	@Override
	public Word getWord(Memory memory) {
		return memory.getWord(this);
	}
	
	public int getLocation() {
		return index;
	}
	
}
