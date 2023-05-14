import java.util.*;

public class A1101250_0505 {
    public static void main(String[] args) {
        int winArray[] = {6, 27, 45, 1, 9, 8};
        int ARRAYLENGTH = 6;
        int myArray[] = new int[ARRAYLENGTH];
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入您的對獎號碼!");
        for (int i = 0; i < myArray.length; i++) {
            boolean isValidInput = false;
            while (!isValidInput) {
                try {
                    int input = sc.nextInt();
                    if (input >= 1 && input <= 49) {
                        myArray[i] = input;
                        isValidInput = true;
                    } else {
                        System.out.println("數字需低於49 請重新輸入！");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("輸入格式錯誤，請重新輸入！");
                    sc.next();
                }
            }
        }

        System.out.println("您的號碼為:" + Arrays.toString(myArray));
        System.out.println("中獎號碼為:" + Arrays.toString(winArray));
        try {
            int count = 0;
            for (int number : myArray) {
                for (int winNumber : winArray) {
                    if (number == winNumber) {
                        count++;
                    }
                }
            }
            System.out.println("您中了 " + count + " 個號碼！"); 
        } finally{
            System.out.println("程式結束"); 
        }
    }

}

