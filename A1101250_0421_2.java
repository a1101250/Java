import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class A1101250_0421_2 {
    public static void main(String[] argv)  throws Exception {
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

       String str;
       boolean isID;
       do {
            isID =true;
            System.out.println("請輸入你的e-mail");
            str = br.readLine();
        
            if(!str.matches("[a-z]*[@]{1}[a-z]*.com")) {
                System.out.println("輸入錯誤");
                isID = false;
            }    
        } while (!isID);
        System.out.println("輸入正確");
    }
}


