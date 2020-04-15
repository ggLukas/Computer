package Instructions;

public class Mul extends Calculation implements Instruction {

	public Mul(Adress adress, Operand operand1, Operand operand2) {
		super(adress,operand1,operand2);
	}
	

	public void performCalc(Word res, Word word1, Word word2) {
		res.multiply(word1,word2);
		
	}

	public String getOpName() {
		return "Mul";
		
	}
	
}
