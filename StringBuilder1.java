// import java.util.StringBuilder;
public class StringBuilder1{
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Hello");
        // sb.append("Hello").reverse();
        System.out.println(sb);
        // System.out.println(sb.length());
        // System.out.println(sb.charAt(3));
        System.out.println(sb.append(" World"));
      
        // StringBuilder sc= new StringBuilder("TILAK");
        // System.out.println(sc.replace(0, 4, "LUC"));


        //String:-    {"   Hello World   "}
        //.trim() removes Starting and Ending White/Blank Spaces.
        //:-          {"Hello World"}
        System.out.println(sb.toString().trim().split(" ")[sb.toString().trim().split(" ").length-1]);
        //String:-    {"Hello is World"}
        //.split() converts String into Individual Words.
        //:-          {["Hello", "is", "World"]}



        //The .toString() method is used to convert the String Builder into String.
        //The String Builder is Mutable but String is not.
        //By converting the String is now Unchangeable.
        // System.out.println(sc.toString());
    }
}