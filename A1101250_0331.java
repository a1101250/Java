import java.util.*;


class Animal{
    String name;
    double height;
    int weight;
    int speed;
    public String distance;
    

    public Animal(String name, double height, int weight, int speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }
    void showInfo () {
        System.out.println("姓名：" + name);
        System.out.println("身高：" + height);
        System.out.println("體重：" + weight);
        System.out.println("速度：" + speed);
    }
    double distance( int x,  double y) {
        double i = x*y*speed;
        return i;
   
    }
    double distance_2(int x) {
        double j = x*speed;
        return j;
    }
    public static void showinfo() {
        System.out.println("歡迎進入冰雪奇緣系統");
        
    }
}
class human extends Animal {
    String gender;


    public human (String name, double height, int weight, int speed, String gender) {
        super(name, height, weight, speed);
        this.gender = gender;
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("性別:" + gender);
    }

}

class snow extends human {
    String skill;
    public snow (String name, double height, int weight, int speed, String gender, String skill) {
        super(name, height, weight, speed, gender);
        this.skill = skill;
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("技能" + skill);
    }
    double distance( int x,  double y) {
        double i = x*y*speed*2;
        return i;
   
    }
    double distance_2(int x) {
        double j = x*speed*2;
        return j;
    }
    


}

public class A1101250_0331 {
    public static void main (String[] args) {
        Animal Olaf = new Animal("雪寶", 1.1, 52, 100);
        Animal Horse = new Animal("驢子", 1.5, 99, 200);    
        human Kristoff = new human("阿克", 1.9, 80, 150, "男");
        human Hans = new human("漢斯", 1.8,78 , 130, "男");
        human Anna = new human("安娜", 1.7, 50, 120, "女");
        snow Elsa = new snow("愛沙", 1.7, 50, 120, "女", "Yes");

        Animal.showinfo();
        System.out.println("\t" );
        Olaf.showInfo();
        System.out.println("\t" );
        Horse.showInfo();
        System.out.println("\t" );
        Kristoff.showInfo();
        System.out.println("\t" );
        Hans.showInfo();
        System.out.println("\t" );
        Anna.showInfo();
        System.out.println("\t" );
        Elsa.showInfo();
        System.out.println("\t" );

        int x, z; 
        double y;
        System.out.println("請輸入時間(分鐘)");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();

        System.out.println("是否知道加速度 yes(1) no(2)");
        z=sc.nextInt();
        if (z ==1){
            System.out.println("請輸入加速度");
            y=sc.nextDouble();
            System.out.println("雪寶距離: "+ Olaf.distance (x ,y));
            System.out.println("驢子距離: "+ Horse.distance (x ,y));
            System.out.println("阿克距離: "+ Kristoff.distance (x ,y));
            System.out.println("漢斯距離: "+ Hans.distance (x ,y));
            System.out.println("安那距離: "+ Anna.distance (x ,y));
            System.out.println("愛紗距離: "+ Elsa.distance (x ,y));


        }else{
            System.out.println("雪寶距離: "+ Olaf.distance_2 (x));
            System.out.println("驢子距離: "+ Horse.distance_2 (x));
            System.out.println("阿克距離: "+ Kristoff.distance_2 (x));
            System.out.println("漢斯距離: "+ Hans.distance_2 (x));
            System.out.println("安那距離: "+ Anna.distance_2 (x));
            System.out.println("愛紗距離: "+ Elsa.distance_2 (x));

        }




     }
        
}
