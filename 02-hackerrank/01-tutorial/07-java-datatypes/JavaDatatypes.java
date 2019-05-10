import java.util.*;
import java.io.*;

class JavaDatatypes {
    public static void main(String []args) {
        long[] arr = {
            -150,
            150000,
            1500000000,
            // 213333333333333333333333333333333333,
            // -100000000000000
        };

        for(int i = 0; i < arr.length; i++) {
            try {
                long x = arr[i];
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                    if (x >= -32768 && x <= 32767) {
                        System.out.println("* short");
                        if (x >= Math.pow(-2,31) && x <= Math.pow(2,31)-1) {
                            System.out.println("* int");
                            if (x >= Math.pow(-2,63) && x <= Math.pow(2,63)-1) {
                                System.out.println("* long");
                            }
                        }
                    }  
                } else if (x >= -32768 && x <= 32767) {
                    System.out.println("* short");
                    if (x >= Math.pow(-2,31) && x <= Math.pow(2,31)-1) {
                        System.out.println("* int");
                        if (x >= Math.pow(-2,63) && x <= Math.pow(2,63)-1) {
                            System.out.println("* long");
                        }
                    }
                } else if (x >= Math.pow(-2,31) && x <= Math.pow(2,31)-1) {
                    System.out.println("* int");
                    if (x >= Math.pow(-2,63) && x <= Math.pow(2,63)-1) {
                        System.out.println("* long");
                    }
                } else if (x >= Math.pow(-2,63) && x <= Math.pow(2,63)-1) {
                    System.out.println("* long");
                }
            } catch(Exception e) {
                System.out.println(e+" can't be fitted anywhere.");
            }
        }
    }
}