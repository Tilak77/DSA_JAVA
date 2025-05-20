import java.util.*;

public class StringUppercase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        char ch= sc.next().charAt(0);

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)== ch){
                if(Character.isUpperCase(str.charAt(i))){
                    Character.toLowerCase(str.charAt(i));
                }
                if(Character.isLowerCase(str.charAt(i))){
                    Character.toUpperCase(str.charAt(i));
                }
            }
            System.out.print(str.charAt(i));
        }
        

        sc.close();


        
    }    
}
