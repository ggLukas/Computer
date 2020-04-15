
import java.util.ArrayList;
import Instructions.*;

public abstract class Program {
	
	private ArrayList<Instruction> listOfInstructions= new ArrayList<>();
	
	
	
	public void add(Instruction ins ) {
		
		listOfInstructions.add(ins);
		
	}
	public Instruction getInstruction(int count) {
		
		return listOfInstructions.get(count);
		
	}
	
	
	
	
}
