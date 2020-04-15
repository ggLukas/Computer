
public abstract class Memory {
	
	private Word[]words;
	
	public Memory(int size) {
		words = new Word[size];
	}
	public void setWord(Word word, Address address) {
		words[address.getLocation()] = word;
	}
	public Word getWord(Address address) {
		return words[address.getLocation()];
	}

}
