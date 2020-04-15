package Instructions;

public class Copy implements Instruction {
	private Operand operand;
	private Address address;
	
	public Copy(Operand operand, Address address) {
		this.operand = operand;
		this.address = address;
	}

	public void execute(Memory mem, ProgramCounter pc) {
		Word word = mem.getWord(address);
		
		word.set(operand,mem);
		
		
	}

}
