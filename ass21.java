class Factorial extends java.lang.Thread {
    double fact = 1, count = 1;

    public void run() {
        fact *= count;
        count++;
    }
}

class AddThemUp extends java.lang.Thread {
    public void run() {
        double sum = 1;
        final Factorial fct = new Factorial();
        fct.setPriority(MAX_PRIORITY);
        for (int i = 1; i <= 10; i++) {
            fct.start();
            try {
                fct.join();
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Current state of fct is: " + fct.isAlive());
            System.out.println("Fact is: " + fct.fact);// false result, means fact has stopped because of the setting
                                                       // priority or the join method, so it's clear that adt is making
                                                       // the mess.
            sum += (1.0 / fct.fact);
        }
        System.out.println("Result is: " + sum);
    }
}

class ass21 {
    public static void main(final String args[]) {
        final AddThemUp adt = new AddThemUp();
        adt.start();
        try {
            adt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("adt state is: "+adt.isAlive());
  }
}

//working perfectly

// giving illegeThreadExceptin if we use fct.start() instead of fct.run()

// Oracel 7 documentation.

// java.lang.Object
// java.lang.Throwable
// java.lang.Exception
// java.lang.RuntimeException
// java.lang.IllegalArgumentException
// java.lang.IllegalThreadStateException

// Thrown to indicate that a thread is not in an appropriate state for the requested operation. See, for example, the suspend and resume methods in class Thread.