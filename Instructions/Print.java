package Instructions;

public class Print implements Instruction {
	private Operand operand;
	
	public Print(Operand operand) {
		this.operand = operand;
	}

	public void execute(Memory mem, ProgramCounter pc) {
		System.out.println(operand.getWord(mem));
		
	}

}

