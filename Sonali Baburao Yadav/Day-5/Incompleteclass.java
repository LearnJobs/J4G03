
public  abstract class Incompleteclass {
      
    	  public void flush() {
    		  
    	  }
    	  public String split() {
    		  return null;
    	  }
    	  public abstract int read();
      }
class ReadFromMemory extends Incompleteclass{
	public int read() {
		return 0;
	}
}
class ReadFromHarddisk extends Incompleteclass{
	public int read() {
		return 0;
	}
}
class ReadFromKeyboard extends Incompleteclass{
	public int read() {
		return 0;
	}
}
