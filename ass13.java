import java.time.LocalDate;
import AkPackage.Ran;   
class Person
{
  String name,address;
  int weight, height,age;
  LocalDate dob;
  Ran rand=new Ran();
  // date of birth can be an object of date class.
  // age is the substraction value of date of birth with today's date.
  Person()
  {
    name= rand.getString(20);
    address=rand.getString(50);
    weight=rand.nextInt(100);
    dob=rand.getRandomDate(1950); // see AkPackage.
    age=getAge(dob);
  }
  Person(String n, String add, int w, int d, int m, int yy)
  {
    name=n;
    address=add;
    weight=w;
    dob=rand.getRandomDate(1950); // see AkPackage.
    age=getAge(dob);
  }
  int getAge(LocalDate dt)
  {
    return LocalDate.now().getYear()-dt.getYear();
  }
  void display()
  {
      System.out.println("\n\nPersonal Details:");
      System.out.println("====================");
      System.out.println("Name: "+name);
      System.out.println("Address: "+address);
      System.out.println("Weight: "+weight);
      System.out.println("Date Of Birth: "+dob.toString()); // learn to print Date object properly.
      System.out.println("Age: "+age);
  }
}
class Employee extends Person
{
    int salary, exprience;
    LocalDate dateOfJoining;
    Employee()
    {
        super();
        salary=10000+rand.nextInt(1000000);
        dateOfJoining=rand.getRandomDate(2000); // see AkPackage.
        exprience=getAge(dateOfJoining);
    }
    Employee(int s, LocalDate doj)
    {
        super();
        salary=s;
        dateOfJoining=doj;
        exprience=getAge(doj);
    }
    Employee(String n, String add, int w, int d, int m, int yy,int s, LocalDate doj)
    {
        super(n, add, w, d, m, yy);
        salary=s;
        dateOfJoining=doj;
        exprience=getAge(doj);
    }
    Employee(String n, String add, int w, int d, int m, int yy)
    {
        super(n, add, w, d, m, yy);
        salary=10000+rand.nextInt(1000000);
        dateOfJoining=rand.getRandomDate(2000); // see AkPackage.
        exprience=getAge(dateOfJoining);
    }
    void display()
    {
        super.display();
        System.out.println("Employee Details:");
        System.out.println("====================");
        System.out.println("Salary: "+salary);
        System.out.println("Date Of Joining: " + dateOfJoining.toString()); //problem in printing proper Date Object.
        System.out.println("Exprience: "+exprience);
    }
}
class Student extends Person
{
    int roll,noOfsubjects,marks[],total=0;
    String listOfSubjects[],grade;
    static int count=1;
    double percentage;
    Student()
    {
        super();
        noOfsubjects=rand.nextInt(5)+1;
        listOfSubjects=new String[noOfsubjects];
        marks=new int[noOfsubjects];
        marks=getMarks(marks);
        roll=count++;
        grade=calcGrade(percentage);
    }
    Student(String n, String add, int w, int d, int m, int yy)
    {
        super(n, add, w, d, m, yy);
        noOfsubjects=rand.nextInt(5)+1;
        listOfSubjects=new String[noOfsubjects];
        roll=count++;
        listOfSubjects=takeString(listOfSubjects);
        marks=new int[noOfsubjects];
        marks=getMarks(marks);
        grade=calcGrade(percentage);
    }
    Student(String n, String add, int w, int d, int m, int yy,int no)
    {
        super(n, add, w, d, m, yy);
        noOfsubjects=no;
        listOfSubjects=new String[no];
        roll=count++;
        listOfSubjects=takeString(listOfSubjects);
        marks=new int[noOfsubjects];
        marks=getMarks(marks);
        grade=calcGrade(percentage);
    }
    Student(int no)
    {
        super();
        noOfsubjects=no;
        listOfSubjects=new String[no];
        roll=count++;
        listOfSubjects=takeString(listOfSubjects);
        marks=new int[noOfsubjects];
        marks=getMarks(marks);
        grade=calcGrade(percentage);
    }
    String calcGrade(double p)
    {
        if(p>=90)
            return "S";
        else if(p<90&&p>=80)
            return "A+";
        
        else if(p<80&&p>=70)
            return "A";
        
        else if(p<70&&p>=60)
            return "B+";
        
        else if(p<60&&p>=50)
            return "B";
        
        else if(p<50&&p>=40)
            return "C";
        else
            return "D";
    }
    String[] takeString(String[] a)
    {
        for (int i = 0; i < a.length; i++) 
            a[i]=rand.getString(10);
        return a;
    }
    int[] getMarks(int[] a)
    {
        for (int i = 0; i < a.length; i++) 
            total+=a[i]=rand.nextInt(100);
        percentage=total/noOfsubjects;
        return a;
    }
    void display()
    {
        super.display();
        System.out.println("Student Details: ");
        System.out.println("====================");
        System.out.println("Number of Subjects: "+noOfsubjects);
        System.out.println("Subjects are: ");
        System.out.println("=================");
        System.out.println("Subject\tMarks");
        System.out.println("=======\t=====");
        for (int i = 0; i < listOfSubjects.length; i++) {
            System.out.println(listOfSubjects[i]+"\t"+marks[i]);
        }
        System.out.println("Grade: "+grade);
    }
} 
class Technician extends Employee
{
    Technician()
    {
        super();
    }
    void display()
    {
        super.display();
    }
}
class Professor extends Employee
{
    String courses[], listOfAdvisee[];
    int noOfCourses=0,noOfAdvise=0,maxnoOfAdvise,maxnoOfCourses;
    Ran rand=new Ran();
    public Professor(int noc, int loa)
    {
        super();
        courses=new String[noc];
        listOfAdvisee=new String[loa];
        maxnoOfAdvise=loa;
        maxnoOfCourses=noc;
        for (int i=0;i<courses.length;i++) {
            addCourse();
        }
        for (int i=0; i<listOfAdvisee.length;i++) {
            addAdvisee();
        }
    }
    public Professor()
    {
        this(5,5); // don't know why it's not working.
    }
    void addCourse()
    {
        if(noOfCourses>=maxnoOfCourses)
        {
            System.out.println("Not possible to add futher more course under Professor "+name);
            return;
        }
        courses[noOfCourses++]=rand.getString(20);
    }
    void addAdvisee()
    {
        if(noOfAdvise>=maxnoOfAdvise)
        {
            System.out.println("Not possible to add futher more advisee under Professor "+name);
            return;
        }
        listOfAdvisee[noOfAdvise++]=rand.getString(20);
    }
    void removeAdvisee()
    {
        noOfAdvise--; // don't wanna write same code again and again.
    }
    void removeCourse()
    {
        noOfCourses--;
    }
    void display()
    {
        System.out.print(name);
        super.display();
        System.out.println("Professor Details: ");
        System.out.println("=====================");
        System.out.println("No of Courses under Professor "+name+" are: "+noOfCourses);
        System.out.println("Courses are: ");
        for (int i = 0; i < noOfCourses; i++)
        {
            System.out.print(courses[i]+", ");
        }
        System.out.println("\nNo of Advisees under Professor "+name+" are: "+noOfAdvise);
        System.out.println("Courses are: ");
        for (int i = 0; i < noOfAdvise; i++) {
            System.out.print(listOfAdvisee[i]+", ");
        }
    }
}
class ass13
{
  public static void main(String args[])
  {
    new Professor().display();
    new Technician().display();;
    new Student().display();
  }
}