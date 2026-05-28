
public class zero_one
{
	public static void main(String[] args) {
		int n=5;
		int num;
		for(int i=1;i<=n;i++){
		    String st="";
		    if(i%2==0)  num=0;
		    else    num=1;
		    for(int j=1;j<=i;j++){
		        st+=num+" ";
		        if(num==0)  num=1;
		        else    num=0;
		    }
		    System.out.println(st);
		}
	}
}