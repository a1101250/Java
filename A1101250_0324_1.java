import java.util.*;
class Animal{
    String name;
    double height;
    int weight;
    int speed;
    public String distance;
  
void showInfo () {
    System.out.println("姓名:" + name);
    System.out.println("身高:" + height);
    System.out.println("體重:" + weight);
    System.out.println("速度:" + speed);
    
}
double distance( int x,  double y) {
     double i = x*y*speed;
     return i;

    }

double distance_2(int x) {
        double j = x*speed;
        return j;
    }
    
}

public class A1101250_0324_1 {
    public static void main(String[] args) {

        Animal monkey, horse , dog, cat;
        monkey= new Animal();
        horse= new Animal();
        dog = new Animal();
        cat = new Animal();

        monkey.name="雪寶";
        monkey.height=1.1;
        monkey.weight=52;
        monkey.speed=100;
        monkey.showInfo ();
        System.out.println("\t" );

       
        horse.name="驢子";
        horse.height=1.5;
        horse.weight=99;
        horse.speed=200;
        horse.showInfo ();
        System.out.println("\t" );
        
        dog.name="安那";
        dog.height=1.7;
        dog.weight=48;
        dog.speed=120;
        dog.showInfo ();
        System.out.println("\t" );

        cat.name="愛紗";
        cat.height=1.7;
        cat.weight=48;
        cat.speed=50;
        cat.showInfo ();
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
            System.out.println("雪寶距離: "+ monkey.distance (x ,y));
            System.out.println("驢子距離: "+ horse.distance (x ,y));
            System.out.println("安那距離: "+ dog.distance (x ,y));
            System.out.println("愛紗距離: "+ cat.distance (x ,y));


        }else{
            System.out.println("雪寶距離: "+ monkey.distance_2 (x));
            System.out.println("驢子距離: "+ horse.distance_2 (x));
            System.out.println("安那距離: "+ dog.distance_2 (x));
            System.out.println("愛紗距離: "+ cat.distance_2 (x));

        }




     }
}