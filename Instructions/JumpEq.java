package Instructions;

public class JumpEq implements Instruction {
	
	private Operand operand1;
	private Operand operand2;
	private int index;
	
	public JumpEq(int index, Operand operand1, Operand operand2) {
		this.index = index;
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	

	public void execute(Memory mem, ProgramCounter pc) {
		if(operand1.getWord(mem).getValue().equals(operand2.getWord(mem).getValue())) {
			pc.setIndex(index);
		}
		
	}
	
}
