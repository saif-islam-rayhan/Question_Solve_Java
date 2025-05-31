// Construct a Java program that takes a sentence from the user and finds the highest and smallest
// length words in it.


import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence=sc.nextLine();
        String[] words=sentence.split("\\W+");
        int largestLength=-1;
        int smallestLength=10000;
        String lidx="";
        String sidx=" ";
        for(String s:words){
            if (s.length()>largestLength){
                largestLength=s.length();
                lidx=s;
            }
            if(s.length()<smallestLength){
                smallestLength=s.length();
                sidx=s;
            }
        }
        System.out.println("largest word: "+lidx+"  Smallest word:"+sidx);

    }
}
