package GirlFriendCodes;

// package person13;

import java.util.Date;

class Person
{
int age;
double weight,height;
Date dateOfBirth;
String address;

void setData(int age,double weight,double height,Date dateOfBirth,String address)   //set values
{
this.age=age;
this.weight=weight;
this.height=height;
this.dateOfBirth=dateOfBirth;
this.address=address;
}

void show()
{
System.out.println(" Age " +age+ " yr  Weight "+ weight + " Kg  Height " + height + " inch  Date of Birth "+dateOfBirth+" Address "+address);
}
}

class Employee extends Person
{
long salary;
Date dateOfJoining;
int experience;

void setData(long salary,Date dateOfJoining,int experience,int age,double weight,double height,Date dateOfBirth,String address)
{
super.setData(age,weight,height,dateOfBirth,address);
this.salary=salary;
this.dateOfJoining=dateOfJoining;
this.experience=experience;
}

void show()
{
super.show();
System.out.println(" Salary "+salary+" Date of Joining "+dateOfJoining+" Experience "+experience);

}
}

class Student extends Person
{
   int roll,noOfSub=5;
   String listOfSubjects[];
   int marks[];
   
   void setData(int roll,int age,double weight,double height,Date dateOfBirth,String address)
   {
  super.setData(age,weight,height,dateOfBirth,address);
  this.roll=roll;
  noOfSub=5;
  listOfSubjects=new String[noOfSub];
 // listOfSubjects=takeSubject(listOfSubjects);
  listOfSubjects[0]="Java";
  listOfSubjects[1] = "DSA";
  listOfSubjects[2] = "Computer";
  listOfSubjects[3] = "C";
  listOfSubjects[4]="Newtwork";
  marks=new int[noOfSub];
  marks[0]=95;
  marks[1]=90;
  marks[2]=85;
  marks[3]=80;
  marks[4]=75;

   }
   
   
   String calculateGrade(int n)
   {
//   String A,B;
  if(n>50)
  {
  return "A";
  }
  else
  {
  return "B";
  }
   }
   
   void show()
   {
  super.show();
  System.out.println(" Roll "+roll);
  System.out.println("List of Subjects "+listOfSubjects[0]+" Marks "+marks[0]);
  System.out.println("List of Subjects "+listOfSubjects[1]+" Marks "+marks[1]);
  System.out.println("List of Subjects "+listOfSubjects[2]+" Marks "+marks[2]);
  System.out.println("List of Subjects "+listOfSubjects[3]+" Marks "+marks[3]);
  System.out.println("List of Subjects "+listOfSubjects[4]+" Marks "+marks[4]);
 
   }
}
class Technician extends Employee
{

void setData(long salary,Date dateOfJoining,int experience,int age,double weight,double height,Date dateOfBirth,String address)
{

super.setData(salary,dateOfJoining,experience,age,weight,height,dateOfBirth,address);


}
void show()
{
super.show();

}

}

class Professor extends Employee
{
String course;
String listOfAdvisee[];

void setData(String course,String listOfAdvisee[],long salary,Date dateOfJoining,int experience,int age,double weight,double height,Date dateOfBirth,String address)

{
super.setData(salary,dateOfJoining,experience,age,weight,height,dateOfBirth,address);
this.course=course;
listOfAdvisee=new String[3];
listOfAdvisee[0]="QWE";
listOfAdvisee[1]="RTY";
listOfAdvisee[2]="UIO";

    }

    void show()
    {
    super.show();
    System.out.println(" Course "+course);
    System.out.println(" List of Advisee "+listOfAdvisee[0]
                                 +listOfAdvisee[1]
                                 +listOfAdvisee[2]);
   
    }


}

class Ass13
{
public static void main(String args[])
{

Person p=new Person();
Date d1=new Date(1996,07,10);
p.setData(23,60.0,6.0,d1,"Kolkata");
p.show();
Employee e=new Employee();
Date d2=new Date(2004,05,14);
e.setData(45000L,d2,2,23,60.0,6.0,d1,"Kolkata");
e.show();
Student st=new Student();
st.setData(1, 23, 60.0,6.0, d1, "kolkata");
}
}

