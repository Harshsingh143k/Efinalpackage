class stu                                                        // execution class
{
    static int Rollno;                                                   // static variable
    static int[] arr;                                                    // static var.

    public static void m1(int Rollno1,int[] arr1){                          // static
        Rollno=Rollno1;
        arr= arr1;
    }
    public static void display()                                         // method static
    {                                                              // instance area
        System.out.println(Rollno);
        for (int res:arr)                                           // use for each-loop
        {
            System.out.println(res);
        }
    }
}                                                                      // end of execution class

public class Demo1 {                                                    //parent class
    public static void main(String[] args) {
       // stu obj1 = new stu(23,);          // anonymous array
        stu.m1(23,new int[]{12,23,44});                                              //  calling method by the help of object
        stu.display();
    }
}
