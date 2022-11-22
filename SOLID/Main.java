package Lab1;

public class Main {
    public static void main(String[] args) {


        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        Object[] haystack2 = {"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
        Object[] haystack3 = {1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,"needle",1,2,3,4,5,5,6,5,4,32,3,45,54};

        String result1 = Needle.findNeedle(haystack1);
        String result2 = Needle.findNeedle(haystack2);
        String result3 = Needle.findNeedle(haystack3);

        Needle.showMessage(result1);
        Needle.showMessage(result2);
        Needle.showMessage(result3);

        System.out.println();

        int result4 = Counter.count(haystack1);
        int result5 = Counter.count(haystack2);
        int result6 = Counter.count(haystack3);

        Counter.showResult(result4);
        Counter.showResult(result5);
        Counter.showResult(result6);
    }
}



