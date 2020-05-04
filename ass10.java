import java.util.Random;
class Student
{
    int roll;
    static int count=1;
    String name,subjectName[]={"DSA","Mathematics","Computer Networks","OOS","DBMS"}; // try to keep the subject names same to make a better tabulation sheet.
    Student()
    {
      roll=count++;
    }
    Student(String n)
    {
      name=n;
      roll=count++;
    }
} // objs are gonna represent a student information, he/she may take different subjects and the marksheet class are gonna provide their marks.
class TabulationSheet
{
  Student roll[];
  String subjectName; // each obj of this class is gonna hold the marks of all the students of a particular subject.
  // marks need to add
  int marks[];
  TabulationSheet(int no) // no represents the number of students.
  {
    roll = new Student[no];
    marks = new int[no];
  }
  void createTabulation() {
    System.out.println("\n\n\nTabulation Sheet for " + subjectName + ": ");
    System.out.println("============================================");
    System.out.println("Roll \t Name \t Marks");
    System.out.println("==== \t ==== \t =====");
    for (int i = 0; i < marks.length; i++)
      System.out.println(roll[i].roll + " \t " + roll[i].name + " \t " + marks[i]);
  }
}

class MarkSheet // each obj is telling you the marksheet of a particular student.
{
  int marks[] = new int[5], total = 0;
  String s = "1234567890qwertyuiopasdfghjklzxcvbnmQERTYUIOPASDFGHJKLZXCVBNM";
  Random rand = new Random();
  Student stu;
  String name[];

  MarkSheet() {
    stu = new Student(); // providing the information regarding the student
    stu.name = addName(20);
    marks = getMarks(marks);
  }

  MarkSheet(String n) {
    Student stu = new Student(); // providing the information regarding the student
    stu.name = n;
    marks = getMarks(marks);
  }

  int[] getMarks(int marks[]) {
    for (int i = 0; i < marks.length; i++)
      total += marks[i] = rand.nextInt(100);
    return marks;
  }
  String addName(int max) {
    StringBuilder str = new StringBuilder(max);
    for (int i = 0; i < rand.nextInt(max); i++)
      str.append(s.charAt(rand.nextInt(s.length())));
    return str.toString();
  }

  void createResult() {
    // Roll Name subject[0] subject[1] subject[2] subject[3] subject[4] Total
    // Percentage
    System.out.println("Roll \t Name \t " + stu.subjectName[0] + " \t " + stu.subjectName[1] + " \t "
        + stu.subjectName[2] + " \t " + stu.subjectName[3] + " \t " + stu.subjectName[4] + " \t Total \t Percentage");
    System.out.println(
        "=====================================================================================================");
    System.out.println(stu.roll + " \t " + stu.name + " \t " + marks[0] + " \t " + marks[1] + " \t " + marks[2] + " \t "
        + marks[3] + " \t " + marks[4] + " \t " + total + " \t " + total/5.0);  }

  Student takeStudentInfo() {
    return stu;
  }
}

class ass10 {
  public static void main(String args[]) {
    int noOfStudents = 3;
    int noOfSubjects = 5;
    Student stud[] = new Student[noOfStudents];
    MarkSheet mark[] = new MarkSheet[noOfStudents];
    TabulationSheet subject[] = new TabulationSheet[noOfSubjects];
    for (int i = 0; i < noOfStudents; i++) {
      mark[i] = new MarkSheet(); // initializing the marksheet object and the student object at the same tym.
      stud[i] = mark[i].stu;
    }
    // Student object and marksheet objects have been initialised.
    // to create marksheet of each student,
    for (int i = 0; i < mark.length; i++) {
      System.out.println("\n\n\nMarkSheet of Roll no. " + (i + 1));
      System.out.println("===============================");
      mark[i].createResult();
    }
    // creating tabulation sheet. Marksheet has already been created.
    for (int i = 0; i < noOfSubjects; i++) // constructing the objs of tabulation sheet.
    {
      subject[i] = new TabulationSheet(noOfStudents);
      // total no of students will have marks// to get the marks of each students we
      // need to
      int j;
      for (j = 0; j < noOfStudents; j++) // passing the marks of studenta for the particular subject.
      {
        subject[i].marks[j] = mark[j].marks[i];
        subject[i].roll[j]=mark[j].stu;
      } // marks for a particular subject has been included
      subject[i].subjectName=mark[j-1].stu.subjectName[i];
      subject[i].createTabulation();
    }
  }
}