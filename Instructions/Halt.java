package Instructions;

public class Halt implements Instruction {

	public void execute(Memory mem, ProgramCounter pc) {
		pc.endProgram();
		
	}
	
	
	
}
