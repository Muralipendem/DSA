
public class holo_diamond
{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){
		    String s="";
		    for(int j=1;j<=(n-i);j++){
		        s+=" ";
		    }
		    for(int j=1;j<=i;j++){
		        if(j==1 || j==i)    s+="* ";
		        else    s+="  ";
		    }
		    System.out.println(s);
		}
		for(int i=n-1;i>=1;i--){
		    String s="";
		    for(int j=1;j<=(n-i);j++){
		        s+=" ";
		    }
		    for(int j=1;j<=i;j++){
		        if(j==1 || j==i)    s+="* ";
		        else    s+="  ";
		    }
		    System.out.println(s);
		}
	}
}