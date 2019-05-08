package STEP01;

public class NAND_GATE {

	public boolean nand(boolean paramA, boolean paramB) {
	    boolean answer = true;
	    
		if(paramA && paramB) {
			answer = false;
		}else {
			answer = true;
		}
		
	    return answer;
	}
	
	public static void main(String[] args) {
		NAND_GATE nGate = new NAND_GATE();
		System.out.println(nGate.nand(true, true)); 
	}

}
