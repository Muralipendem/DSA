
public class star_hash
{
	public static void main(String[] args) {
	    int n=5;
	    for(int i=1;i<=n;i++){
	        String st="";
	        char c='*';
	        for(int j=1;j<=(n-i);j++){
	            st+=" ";
	        }
	        for(int j=1;j<=i;j++){
	            st+=c +" ";
	            if (c=='*') c='#';
	            else c='*';
	        }
	        System.out.println(st);
	    }
	}
}