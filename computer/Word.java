package computer;

public abstract class Word implements Operand {
	private long value;
	
	public abstract Word getWord(Memory memory);
	
	public long getValue() {
		return value;
	}
	
	public void set(Operand op, Memory mem) {
		value = op.getWord(mem).getValue();
	}
	
	public void add(Word w1, Word w2) {
		value = w1.getValue() + w2.getValue();
	}
	
	public boolean equals(Word w) {
		return this.equals(w);
	}
	
	public void mul(Word w1, Word w2) {
		value = w1.getValue() * w2.getValue();
	}
}
