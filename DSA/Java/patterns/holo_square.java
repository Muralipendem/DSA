
public class holo_square
{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){
		    String s="";
		    for(int j=1;j<=n;j++){
		        if(i==1 || i==n || j==1 || j==n)    s+="* ";
		        else    s+="  ";
		    }
		    System.out.println(s);
		}
	}
}