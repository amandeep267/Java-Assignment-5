package aman.assignment.main;

import aman.assignment.data.Main1;
import aman.assignment.singleton.Main2;

public class Main {
    public static void main(String agr[])
    {
        Main1 main1=new Main1();
        main1.print();
      //  main1.printLocalVariables();

       // Main2 main2=Main2.initializeMemberVarAndReturnObject();
        Main2 main2=new Main2();
        main2.print();
    }
}
