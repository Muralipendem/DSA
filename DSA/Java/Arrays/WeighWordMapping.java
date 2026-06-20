public class WeightWordMapping {
	public static void main(String args[]) {
		String[] words = {"a","b","c"};
		int[] weights = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		String res="";

		for(int i=0;i<words.length;i++){
		    int sum=0;
		    for(int j=0;j<words[i].length();j++){
		        int map=words[i].charAt(j) - 97;
		        sum+=weights[map];
		    }
		    sum=sum%26;
		    char c=(char)(122-sum);
		    res+=c;
		}
		System.out.println(res);
	}
}
//leetcode qn - 3838.