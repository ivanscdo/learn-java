import java.util.Arrays;

class ReverseString {
    public static void main(String[] args) {
        // test cases:
        
        // String string = "Frank";        
        // String string = "";
        String string = "Alice likes Bob";
        // String string = "Alice, do you like Bob?";
        // String string = ",";
        // String string = ", ?";

        String[] arrayStr = string.split(" ");
        int len = arrayStr.length;
        String[] mrMime = new String[len];
        int lenConst = len;
        int lenVar = len;
        String arrayStrJnd = "";
        String mrMimeJnd = "";
        
        for (int i = len-1; i >= 0; i--) {
            mrMime[lenConst - lenVar] = arrayStr[i];
            lenVar--;
        }

        arrayStrJnd = String.join(" ", arrayStr);
        mrMimeJnd = String.join(" ", mrMime);

        System.out.println(arrayStrJnd);
        System.out.println(mrMimeJnd);
    }
}
// 737-333-1637