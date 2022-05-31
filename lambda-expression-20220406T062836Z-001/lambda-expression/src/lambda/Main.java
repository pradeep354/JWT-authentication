package lambda;

public class Main {

    public static void main(String [] args){
        System.out.println("my system is started");


        SumInter sumInter=(int a,int b)->{
          return (a+b);
        };
        System.out.println("sum of two numbers is "+sumInter.sum(3,5));
        System.out.println("sum of two numbers is "+sumInter.sum(8,9));

        LengthInter lengthInter=(str -> str.length());

        System.out.println(lengthInter.getLength("Pradeep"));
    }




}
