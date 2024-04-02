import java.util.*;
import java.lang.*;
public class Student
{
    int totalmarks;
    int average;
   int avg;
    public void averageGrade(int totalmarks,int average,int avg)
    {
        this.totalmarks=totalmarks;
        this.average=average;
        this.avg=avg;
        switch(avg)
        {
            case 10:
                System.out.println("Marks obtained:"+totalmarks);
                System.out.println("average percentage:"+average+"%");
                System.out.println("grade:A+");
                System.out.println("Congratulations!!! you passed with flying colours");
                break;
            case 9:
                System.out.println("Marks obtained:"+totalmarks);
                System.out.println("average percentage:"+average+"%");
                System.out.println("A grade");
                System.out.println("you aced this test !! keep it up");
                break;
            case 8:
                 System.out.println("Marks obtained:"+totalmarks);
                 System.out.println("average percentage:"+average+"%");
                System.out.println("B grade");
                System.out.println("B for Boundless , next time soar high ");
                break;
            case 7:
                System.out.println("Marks obtained:"+totalmarks);
                System.out.println("average percentage:"+average+"%");
                System.out.println("C grade");
                System.out.println("Should focus more");
                break;
            case 6:
                System.out.println("Marks obtained:"+totalmarks);
                System.out.println("average percentage:"+average+"%");
                System.out.println("D grade");
                System.out.println("Can do better,work hard next time");
                break;
            default:
                System.out.println("FAIL");                       
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the subjects");
        int number=sc.nextInt();
        int i,marks,totalmarks=0;
        System.out.println("Enter the marks for the subjects respectively\n");
        for( i=1;i<=number;i++)
        {
            System.out.println("enter your marks for the respective subject"+i);
             marks=sc.nextInt();
             totalmarks=totalmarks+marks;
        }
          double average=totalmarks/number;
          double avg=average/10;
          double round=Math.round(avg);//ROUND OFF TO THE NEAREST INTEGER FOR ACCURATE RESULTS
          int averagePercentage=(int)round;
          int agrade=(int)average;
          
          Student grade=new Student();
          grade.averageGrade(totalmarks,agrade,averagePercentage);
       
    }
}