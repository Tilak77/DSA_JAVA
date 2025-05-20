public class Strings {
    public static void main(String[] args) {
        String name1= "Tilak";
        String name2= "Tilak";


        if(name1==name2){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        //Optimized or Preferred Way

        //.compareTo returns 
        //0  - when two strings are equal
        //+ve  - when s1> s2
        //-ve - when s1<s2
        if(name1.compareTo(name2)==0){
            System.out.println("These Strings are Equal");
        }else{
            System.out.println("These Strings are Not Equal");
        }

        String sent1="This is The Best Game";
        //Indexing in String starts from 0,1,2...
        System.out.println(sent1.substring(12, sent1.length()));
        String name3="JackSparrow";
        System.out.println(name3.substring(4));


        //Integer to String
        int n=123;
        String str=Integer.toString(n);
        System.out.println(str.length());

        //String to Integer
        String str1="123";
        int number= Integer.parseInt(str1);
        System.out.println(number);
    }
}
