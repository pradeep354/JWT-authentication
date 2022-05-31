package work;

public class Main {
    public static void main(String[] args) {
        System.out.println("My system is started");

//        MyInterImpl inter=  new MyInterImpl();
//        inter.sayHello();

//       MyInter i= new MyInter() {
//           @Override
//           public void sayHello() {
//               System.out.println("this is first anonymous class");
//           }
//       };
//
//i.sayHello();
//
//MyInter j=new MyInter(){
//
//
//    @Override
//    public void sayHello() {
//        System.out.println("this is second anonymous class");
//    }
//};
//j.sayHello();

        //using our interface with the help of lambda expression
        MyInter i=()->
            System.out.println("this is first time we use the lambda expression");


i.sayHello();

MyInter j=()->
        System.out.println("this is second time we use lambda");
j.sayHello();



SumInter sumInter = (int a, int b) -> a+b;

        System.out.println(sumInter.sum(8,9));
        System.out.println(sumInter.sum(9,4));

        LengthInter lengthInter=(str -> str.length());

        System.out.println(lengthInter.getLength("pradeep nishad"));

    }
}
