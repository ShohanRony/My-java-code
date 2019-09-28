


package stringproject;




public class StringDemo4 {
    public static void main(String[] args) {
        String choice = "i love canada";
        String hobby ="i love travelling";
        
        String S = choice.replace("o", "O");
        System.out.println(S);
        
        String[] S1 = choice.split(" ");
        for (String c : S1 ){
        //note that in split we've to use [] with string
        System.out.println(c);
        }
        
}
}