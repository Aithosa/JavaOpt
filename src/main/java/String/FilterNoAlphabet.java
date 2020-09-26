package String;

public class FilterNoAlphabet {

    public static String filterNoAlphabet(String str) {
        String reg = "[^a-zA-Z]";
        String newStr = str.replaceAll(reg,"");

        return newStr;
    }

    public static void main(String[] argv) {
        String str = "sdf1'sf";
        System.out.println(filterNoAlphabet(str));

    }

}
