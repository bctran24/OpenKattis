package OpenKattisPractice;

import java.util.*; 

public class MetaProgramming {
	Map<String, Integer> hm = new HashMap<String, Integer>(); 
	Set< Map.Entry< String,Integer> > st = hm.entrySet(); 
	
	public MetaProgramming() {
		Split(); 
	}
	
	private void Define (String pNum, String pVar) {
		int num = Integer.parseInt(pNum); 
		hm.put(pVar, new Integer(num)); 
	    Split(); 
	}
	
	private void Eval(String pVar1, String pComp, String pVar2) { 
		int value1 = -1; 
		int value2 = -2; 
		boolean valid = false; 
		
		if ( (pComp.equals("=")) ||  (pComp.equals(">")) || (pComp.equals("<")) ) {
		      for (Map.Entry< String,Integer> me:st) {
		    	  if (me.getKey().equals(pVar1)) { 
		    		  value1 = me.getValue(); 
		    	  }
		    	  if (me.getKey().equals(pVar2)) { 
		    		  value2 = me.getValue(); 
		    	  }
		       } 
		      
		      if ( ( (pComp.equals("=")) && (value1 == value2) ) || ( (pComp.equals(">")) && (value1 > value2) ) || ((pComp.equals("<")) && (value1 < value2)) ) { 
		    	  valid = true; 
		    	  System.out.println(valid);
		      } else { 
		    	  System.out.println(valid); 
		      }
		} 
		Split(); 
	}
	
	private void Split() { 
		boolean valid = false; 
		do { 
			String line = UserInput(); 
			if (line.equals("q")) { 
				valid = false; 
				break; 
			}
			
			String[] split1 = line.split("\\s+");

			if (split1[0].equals("define") && split1.length == 3) { 
				String num = split1[1]; 
				String var = split1[2];
			
				Define(num, var); 
			} else if (split1[0].equals("eval") && split1.length == 4) { 
				String var1 = split1[1]; 
				String comp = split1[2]; 
				String var2 = split1[3]; 
			
				Eval(var1, comp, var2); 
			} 
		} while (!valid); 
	}
	
	private String UserInput() { 
		Scanner in = new Scanner(System.in); 
		String line = in.nextLine(); 
		return line; 
	}

	public static void main(String[] args) {
		MetaProgramming mp = new MetaProgramming(); 
	}

}
