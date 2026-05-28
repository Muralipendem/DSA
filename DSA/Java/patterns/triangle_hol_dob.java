
public class triangle_hol_dob
{
	public static void main(String[] args) {
	    int n=5;
		for(int i=n;i>=1;i--){
		    String st="";
		    for(int j=1;j<=(n-i);j++){
		        st+=" ";
		    }
		    for(int j=1;j<=i;j++){
		        if(j==1 || j==i) st+="* ";
		        else st+="  ";
		    }
		    System.out.println(st);
		}
		for(int i=2;i<=n;i++){
		    String st="";
		    for(int j=1;j<=(n-i);j++){
		        st+=" ";
		    }
		    for(int j=1;j<=i;j++){
		        if(j==1 || j==i) st+="* ";
		        else st+="  ";
		    }
		    System.out.println(st);
		}
	}
}