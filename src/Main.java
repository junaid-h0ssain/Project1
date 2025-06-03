public class Main {
    public static void main(String[] args) {
        int x = 121;
        String num = String.valueOf(x);
        String output = "";
        for(int i=num.length()-1;i>=0;i--){
            output+=num.charAt(i);
        }
        if(output.equals(num))
            System.out.println(output);
    }
}