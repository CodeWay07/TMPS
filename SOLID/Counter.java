package Lab1;

public class Counter {
    public static int count(Object[] haystack){

        int count = 0;

        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] instanceof String)
                count += 1;
        }
        return count;
    }

    public static void showResult (int result){
        System.out.println("Total number of Strings is: " + result);
    }
}