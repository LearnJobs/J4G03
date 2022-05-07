package begin5;


public abstract class IncompleteClass {
	public void flush() {
		
	}

	public String split() {
		return null;
	}
	
	public abstract int read();
}

class ReadFromMemory extends IncompleteClass {
	public int read() {
		return 0;
	}
}

class ReadFromHarddisk extends IncompleteClass {
	public int read() {
		return 0;
	}
}

class ReadFromKeyboard extends IncompleteClass {
	public int read() {
		return 0;
	}
}