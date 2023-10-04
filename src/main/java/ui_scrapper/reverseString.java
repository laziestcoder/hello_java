package ui_scrapper;

/**
 * @author Towfiqul Islam
 * @since 10/4/23 8:22 AM
 */

// reverse string "sdnfnsnfsnf$%"

public class reverseString {
    private static String VALUE= "sdnfnsnfsnf$%";

    public static void main(String[] args) {
        System.out.println(getReverseString(VALUE));
    }

    private static String getReverseString(String value) {
        String reverseString = "";
        char[] ch = value.toCharArray();
        for(int i=value.length()-1; i>=0 ; i--){
            reverseString += ch[i];
        }
        return reverseString;
    }

}
