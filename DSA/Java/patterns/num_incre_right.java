
public class num_incre_right
{
	public static void main(String[] args) {
	    int n=5;
	    int count=1;
		for(int i=1;i<=n;i++){
		    String st="";
		    for(int j=1;j<=i;j++){
		        st+=count++ +" ";
		    }
		    System.out.println(st);
		}
	}
}