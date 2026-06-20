public class Snake{
    public static void main(String[] args) {
        int n = 3;
        String[] commands = {"DOWN","RIGHT","UP"};
        int[] point = {0,0};
        for(String s : commands){
            switch(s){
                case "RIGHT" -> point[1]++;
                case "LEFT" -> point[1]--;
                case "UP" -> point[0]--;
                case "DOWN" -> point[0]++;
                default -> System.out.println((point[0] * n) + point[1]);
            }
        }
        System.out.println((point[0] * n) + point[1]);
    }
}