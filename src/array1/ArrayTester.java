package array1;

/*
 * This class is an example of how to use arrays
 */
public class ArrayTester {

	private String[] stringArray;
	
	public ArrayTester(){
		stringArray = new String[10];
		stringArray[0] = "test1";
	}
	
	public String getStringAt(int pos){
		return stringArray[pos];
	}
	
	public void setStringAt(int pos, String s){
		stringArray[pos] = s;
	}
	
	public void printArray(){
		for (String s : stringArray){
			System.out.println(s);
		}
	}
	
	public String[] getArray(){
		return this.stringArray;
	}
	
	public String[] getFlippedArray(){
		String[] flip = new String[10];
		int p = stringArray.length;
		for (String s : stringArray){
			p--;
			flip[p] = s;
		}
		return flip;
	}
}
