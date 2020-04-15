import Programs.*;

public class Computer {
	
	
	private Memory mem;
	private Program prog;
	private ProgramCounter pCount;
	
	public Computer(Memory mem) {
		this.mem=mem;
		pCount = new ProgramCounter();
		
	}

	public void load(Program prog) {
		this.prog=prog;
		
	}
	public void run() {
		
		while(pCount.isRunning()) {
			
			
			prog.getInstruction(pCount.getCount());
			pCount.next();
			
			
			
		}
		System.out.println("The program is finished");
		
		
	}
}
