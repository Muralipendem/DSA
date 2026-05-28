
public class elevenTriangle
{
	public static void main(String[] args) {
	    int n=4;
	    int num=1;
	    for(int i=0;i<=n;i++){
	        String dup;
	        if(i!=0) num*=11;
	        dup = String.valueOf(num);
	        for(int j=1;j<=(n-i);j++){
	           System.out.print(" ");
	        }
	        for(int j=0;j<=i;j++){
	           System.out.print(dup.charAt(j) +" ");
	        }
	        System.out.println("");
	    }
	}
}