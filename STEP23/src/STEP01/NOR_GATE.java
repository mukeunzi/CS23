package STEP01;

public class NOR_GATE {

	boolean nor(boolean paramA, boolean paramB) {
		boolean answer = true;
		
		if(paramA || paramB) {
			answer = false;
		}else {
			answer = true;
		}
		
	    return answer;
	}
	
	public static void main(String[] args) {
		NOR_GATE nGate = new NOR_GATE();
		System.out.println(nGate.nor(false, false)); 
	}

}
