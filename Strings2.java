import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        String username= "";

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='@'){
                break;
            }else{
                username= username + str.charAt(i);
            }
        }
        System.out.println(username);
    sc.close();
    }
}
