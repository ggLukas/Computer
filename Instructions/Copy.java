package Instructions;
import computer.*;

public class Copy implements Instruction {
	private Operand operand;
	private Address address;
	
	public Copy(Operand operand, Address address) {
		this.operand = operand;
		this.address = address;
	}

	@Override
	public void execute(Memory mem, ProgramCounter pc) {
		Word word = mem.getWord(address);
		
		if(word == null) {
			word = new LongWord(0);
			mem.setWord(word, address);
		}
		
		word.set(operand,mem);
		
		//word.set(operand.getWord(mem).getValue());
		
		
	}

}
