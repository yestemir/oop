package lab5;

public class Repeat {
	public int[] newarr, arr;
	
	 public String toString(){
	        String res = "";
	        int arr[] = solve();
	        for (int i = 0; i < arr.length; i++)
	            res += Integer.toString(arr[i]) + " ";
	        return res;
	    }
	 
	 public int[] solve()
	    {
	        newarr = new int[arr.length * 2];
	        for (int i = 0; i < newarr.length; i++){
	            newarr[i] = arr[i / 2];
	        }
	        return newarr;
	    }
}
