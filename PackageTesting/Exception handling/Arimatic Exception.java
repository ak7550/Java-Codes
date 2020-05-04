class Exception1
{
  public static void main(String args[])
  {
      int res,d=0;
    try {
        res=5/d;
    } catch (Exception e) {
        //TODO: handle exception
        System.out.println("Exception occcured.\n"+e); // e obj gives you the exact type of error information in the output.
        res=5;
    }
    System.out.println("after the exception the value of res is: "+res);
  }
}