package Instructions;

public class Copy implements Instruction {
	private Operand operand;
	private Adress address;
	
	public Copy(Operand operand, Address address) {
		this.operand = operand;
		this.adress = address;
	}

	public void execute(Memory mem, ProgramCounter pc) {
		Word word = mem.getWord(address);
		
		word.set(operand,mem);
		
		
	}

}
