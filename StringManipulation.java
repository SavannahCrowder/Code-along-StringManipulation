import com.sun.security.jgss.GSSUtil;

public class StringManipulation {
    public static void practice(String str){
        System.out.println("practice: " + str.substring(1));
        System.out.println("practice: " + str.substring(2));
        System.out.println("practice: " + str.substring(1,4));
        System.out.println();
        System.out.println("practice indexOf: " + str.indexOf("o"));
        System.out.println("practice indexOf: " + str.indexOf("o", 2));
        System.out.println("practice indexOf: " + str.indexOf('s'));
        System.out.println();
    }

    public static void subIndex(String str){
        int index = str.indexOf(" ");
        String firstName = str.substring(0, index);
        System.out.println("First name: " + firstName);
        String lastName = str.substring(index + 1);
        System.out.println("Last name: " + lastName);
    }
    public static void main(String[] args){
        //practice("hello");
        //practice("notebooks");

        subIndex("Bob Smith");
    }
}