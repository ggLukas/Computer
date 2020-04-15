package computer;

public class LongWord extends Word {
	private long value;
	
	public LongWord(long value) {
		this.value = value;
	}
	
	public Word getWord(Memory memory) {
		return this;
	}
	
	public String toString() {
    	return String.valueOf(this.value);
    }
}
