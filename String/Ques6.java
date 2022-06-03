public class Immutable {
	
	
	public static boolean find(String s1 , String s2) {
		
	if (s1.length()!= s2.length()) {
		return false ;
	}
	int n = s1.length();
    int a[] = new int[256];
    int b[] = new int[256];
    
    for (int i =0 ; i<n ; i++) {
    	a[s1.charAt(i)]++ ;
    	b[s2.charAt(i)]++ ;
    	
    }
    
    
    for (int i =0 ; i<256 ; i++) {
    	if (a[i] != b[i]) {
    		return false ;
    	}
    }
	
		return true ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println( find ("rimi" ,"iimr"));
	}

}
