package Instructions;

public class Jump implements Instruction {
	
	private int index;
	
	public Jump(int index) {
		this.index = index;
	}

	public void execute(Memory mem, ProgramCounter pc) {
		pc.setIndex(index);
		
	}

}
