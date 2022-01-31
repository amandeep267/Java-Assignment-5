package aman.assignment.singleton;

public class Main2 {

        String name;

    /**
     *
     * Static fields and methods are connected to the class itself and not to its instances
     *  A static method or variable is created at the time a class is loaded. A method or
     *  variable that is not declared as static is created only when the class is instantiated.
     *  "this" can't be referenced from static context because object is not created at loading time and we are trying
     *  to access it before its instantiation.
     */
//    public static Main2 initializeMemberVarAndReturnObject(String name)
//        {
//            this.name=name;
//            return new Main2();
//
//        }
     public  void print()
        {System.out.println(name);}
    }
