import java.util.ArrayList;
import java.util.List;

public class VowelsConsonents {

    int vowels=0;
    int consonents=0;


    public void getCount(String st){
        List<Character>ch = new ArrayList<>();
        ch.add('a');
        ch.add('e');
        ch.add('i');
        ch.add('o');
        ch.add('u');



        char[]newCHAR = st.toCharArray();

        for (int i=0;i<newCHAR.length;i++){
            if (ch.contains(newCHAR[i])){
                vowels++;
                System.out.println("no of vowels are " +vowels);
            }else {
                consonents++;
                System.out.println("No of consonents are " +consonents);
            }
        }

    }

    public static void main(String[] args) {

        VowelsConsonents vs = new VowelsConsonents();
        String s = "rep";
        vs.getCount(s);
    }

}
