
public class alpha_triangle
{
	public static void main(String[] args) {
	    int n=5;
		for(int i=1;i<=n;i++){
		    String st="";
		    char c=64;
		    for(int j=1;j<=(n-i);j++){
		        st+=" ";
		    }
		    for(int j=1;j<=i;j++){
		        c+=1;
		        st+=c +" ";
		    }
		    System.out.println(st);
		}
	}
}