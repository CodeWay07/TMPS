package Lab1;

public class Needle {
    public static String findNeedle(Object[] haystack) {

        for (int i = 0; i < haystack.length; i++){
            if (haystack[i] == "needle")
                return ("Found the needle at position " + i);
        }
        return "";
    }

    public static void showMessage (String resultName){
        System.out.println(resultName);
    }
}


