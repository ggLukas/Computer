package Instructions;

import computer.*;

public class Add extends Calculation implements Instruction {

	public Add(Address address, Operand operand1, Operand operand2) {
		super(address,operand1,operand2);
	}
	

	public void performCalc(Word res, Word word1, Word word2) {
		res.add(word1,word2);
		
	}

	public String getOpName() {
		return "Add";
		
	}


	


	


	


	
	
}


