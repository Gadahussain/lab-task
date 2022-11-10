//create a program in which user is asked for marks in a respected way//
//matriculation, intermediate and test score where output would be the cpn//
import java.util.*;
class cpn{
public static void main(String[]arg)
{
int matric;
int inter;
int testscore;
double cpn;
Scanner obj=new Scanner(System.in);
System.out.println("Enter matric marks:");
matric=obj.nextInt();

System.out.println("Enter inter marks:");
inter=obj.nextInt();
System.out.println("Enter test marks:");
testscore=obj.nextInt();
cpn=(matric/850)*10 +(inter/1100)*30 +(testscore/100)*60;
System.out.println("cpn is:"+(cpn));
}}