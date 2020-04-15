

public abstract class Memory {
	
	private Word[]words;
	
	public Memory(int n) {
		words = new Word[n];
	}
	public void setWord(Word word, Address address) {
		words[address.getIndex()] = word;
	}
	public Word getWord(Adress adress) {
		return words[adress.getIndex()];
	}

}
