package Instructions;

public class Add extends Calculation implements Instruction {

	public Add(Adress adress, Operand operand1, Operand operand2) {
		super(adress,operand1,operand2);
	}
	

	public void performCalc(Word res, Word word1, Word word2) {
		res.add(word1,word2);
		
	}

	public String getOpName() {
		return "Add";
		
	}
	
}

