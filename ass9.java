import java.util.Random;
import java.util.Scanner;
class Employee
{
    String name,address;
    int id, salary;
    String s="1234567890qwertyuiopasdfghjklzxcvbnmQERTYUIOPASDFGHJKLZXCVBNM";
    Random rand=new Random();
    Employee(String n, String a, int i, int s)
    {
        name=n;
        address=a;
        id=i;
        salary=s;
    }
    Employee() //default constructor
    {
        System.out.println("Default");
        name=takeString(20);
        address=takeString(30);
        id=rand.nextInt(1000);
        salary=rand.nextInt(100000);
    }
    String takeString(int max)
    {
        StringBuilder str=new StringBuilder(max);
        for (int i = 0; i <rand.nextInt(max); i++)
            str.append(s.charAt(rand.nextInt(s.length())));
        System.out.println(str);
        return str.toString();
    }
    void print()
    {
        System.out.println("Name: "+name+"\nAddress: "+address+"\nId: "+id+"\nSalary: "+salary);
    }
}
class Dept
{
    Employee emp[];
    String name, location;
    int max, no_of_emp=0;
    Dept(String n, String l, int m)
    {   
        name=n;
        location=l;
        max=m;
        emp=new Employee[max];
        for (int i = 0; i < max; i++)
        {
            emp[i]=new Employee();
            emp[i].print();
        }
        no_of_emp=m;
    }
    void add()
    {
        if(no_of_emp>=max)
            System.out.println("Department "+name+"has maximum "+max+ " number of employees.\nAddition of new Employee is not possible.");
        else
            emp[no_of_emp++]=new Employee();
    }
    void showAll()
    {
        System.out.println("All the working empployyes details are: ");
        System.out.println("============================================");
        for (int i = 0; i < no_of_emp; i++) 
        {
            System.out.println("Employee number: "+(i+1));
            System.out.println("--------------------------");
            emp[i].print();
        }
    }
    void delete()
    {
        int in=getIndex();
        if(in==-1)
            return;
        emp=remove(in);
    }
    Employee[] remove(int in)
    {
        in--;
        int j=0;
        Employee emp2[]=new Employee[max];
        for (int i = 0; i < no_of_emp; i++) 
        {
            if(i==in)
                continue;
            else
                emp2[j]=emp[i];   
        }  
        no_of_emp--;
        return emp2;      
    }
    int getIndex()
    {
        showAll();
        System.out.println("Enter the no of the Employee: ");
        Scanner myobj=new Scanner(System.in);
        int in=myobj.nextInt();
        myobj.close();
        if(in<=0||in>no_of_emp)
        {
            System.out.println("The employee with "+in+" is not present in the department.");
            return -1;
        }
        return in;
    }
}
class ass9
{
  public static void main(String args[])
  {
    Dept d=new Dept("Information Technology", "Jadavpur University", 20);
    int exp=0;
    for (int i = 0; i < d.no_of_emp; i++)
        exp+=d.emp[i].salary;
    d.showAll();
    System.out.println("Total monthly expenditure of "+d.name+" "+d.location+" is: "+exp+"\nTotal annual expenditure is: "+exp*12);
  }
}