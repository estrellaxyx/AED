
/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * make changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the 'entrega system'.
 *
 */

//////////////////////////////////////////////////////////////////////
//
// File generated at: 2019/9/11 -- 16:34:41
// Seed: {1568,212480,424904}
//
//////////////////////////////////////////////////////////////////////



package aed.loops;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import java.util.concurrent.CountDownLatch;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.positionlist.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;



@SuppressWarnings("unused")
public class TesterInd1 {

  public static void main(String[] args) {
    try {
	String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
	BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
	bw.write(ids[0]);
	bw.close();
    } catch (Exception e) {
	System.out.println("Avisa al profesor de fallo sacando el PID");
    }

    ResultsHandler.init();

    // Permit executing individual tests: 
    // the first argument should be the test number
    if ((args.length == 1) && !args[0].equals("--nota-as-exit-code")) {
	try {
	    int testNumber = Integer.parseInt(args[0]);
	    String testName = "test_"+testNumber;
	    java.lang.reflect.Method testMethod = null;
	    try {
		testMethod = Tests.class.getDeclaredMethod(testName);
		testMethod.setAccessible(true);
	    } catch (SecurityException exc) {
		System.out.println("\n*** Error: test "+testName+" is not accessible");
		System.exit(24);
	    } catch (NoSuchMethodException exc) {
		System.out.println("\n*** Error: test "+testName+" does not exist");
		System.exit(24);
	    }

	    Object result = null;

	    try {
		result = testMethod.invoke(null);
	    } catch (IllegalAccessException exc) {
		System.out.println("\n*** Error: not permitted to access "+testName);
		System.exit(24);
	    } catch (InvocationTargetException exc) {
		System.out.println("\n*** Error: cannot invoke "+testName);
		System.exit(24);
	    } catch (Throwable exc) {
              System.out.println("\n*** ERROR in Tester: unexpected exception "+exc+" raised\n\nStacktrace:\n");
              exc.printStackTrace();
              System.exit(24);
            }
	    
	    if (result instanceof Boolean) {
		Boolean booleanResult = (Boolean) result;
		if (booleanResult)
		    System.out.println("\n*** Test "+testName+" succeeded.");
		else
		    System.out.println("\n*** Error: test "+testName+" failed.");

                waitForThreads();
		System.exit(booleanResult ? 0 : 24);
	    }
	} catch (NumberFormatException exc) {
	    System.out.println("\n*** Error: argument should be an integer but is "+args[0]);
	    System.exit(24);
	}
    } else {
      try {
        Tests.runTests();
      } catch (Throwable exc) {
        System.out.println("\n*** ERROR in Tester: unexpected exception "+exc+" raised\n\nStacktrace:\n");
        exc.printStackTrace();
        System.exit(24);
      }

      waitForThreads();

      // Check if the option --nota-as-exit-code is set --
      // if so exit with the nota as the exit code
      if (args.length == 1) {
	System.exit(ResultsHandler.get_nota());
      } else {
	// Standard exit codes
	if (ResultsHandler.results_ok()) {
          System.out.println();
          System.exit(0);
        } else System.exit(24);
      }
    }
  }

  private static void waitForThreads() {
    try {
      if (ResultsHandler.waitForThreads != null)
        ResultsHandler.waitForThreads.await();
    } catch (InterruptedException exc) { }
  }


  
    

@SuppressWarnings("deprecation")
static class Tests {

  static String tester = "TesterInd1";

  static boolean runTests() {
    ResultsHandler.init();

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_1());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_2());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_3());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_4());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_5());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_6());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_7());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_8());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_9());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_10());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_11());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_12());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_13());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_14());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_15());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_16());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_17());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_18());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_19());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_20());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_21());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_22());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_23());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_24());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_25());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_26());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_27());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_28());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_29());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_30());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_31());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_32());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_33());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_34());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_35());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_36());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_37());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_38());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_39());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_40());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_41());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_42());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_43());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_44());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_45());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_46());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_47());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_48());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_49());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_50());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_51());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_52());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_53());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_54());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_55());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_56());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_57());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_58());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_59());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_60());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_61());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_62());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_63());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_64());

    if (ResultsHandler.local_results_ok_sofar("maxNumRepeated"))
      ResultsHandler.add_result("maxNumRepeated",test_65());


    ResultsHandler.report_results();


    if (ResultsHandler.results_ok())
      return true;
    else
      return false;
  }



  static boolean test_1 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_1") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] {  },new Integer(0)).doCall().checkResult(new Integer(0)) ;
    return ok_sofar ;
  }
  



  static boolean test_2 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_2") ;
    boolean ok_sofar = true ;
    
    return ok_sofar ;
  }
  



  static boolean test_3 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_3") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(0) },new Integer(0)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_4 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_4") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(0) },new Integer(1)).doCall().checkResult(new Integer(0)) ;
    return ok_sofar ;
  }
  



  static boolean test_5 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_5") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1) },new Integer(0)).doCall().checkResult(new Integer(0)) ;
    return ok_sofar ;
  }
  



  static boolean test_6 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_6") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(10000) },new Integer(10000)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_7 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_7") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1) },new Integer(3)).doCall().checkResult(new Integer(0)) ;
    return ok_sofar ;
  }
  



  static boolean test_8 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_8") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(2) },new Integer(1)).doCall().checkResult(new Integer(0)) ;
    return ok_sofar ;
  }
  



  static boolean test_9 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_9") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(3) },new Integer(2)).doCall().checkResult(new Integer(0)) ;
    return ok_sofar ;
  }
  



  static boolean test_10 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_10") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(0),new Integer(0) },new Integer(0)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_11 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_11") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(1) },new Integer(3)).doCall().checkResult(new Integer(0)) ;
    return ok_sofar ;
  }
  



  static boolean test_12 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_12") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(3) },new Integer(1)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_13 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_13") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(3) },new Integer(2)).doCall().checkResult(new Integer(0)) ;
    return ok_sofar ;
  }
  



  static boolean test_14 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_14") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(2),new Integer(1) },new Integer(2)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_15 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_15") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(2),new Integer(1) },new Integer(3)).doCall().checkResult(new Integer(0)) ;
    return ok_sofar ;
  }
  



  static boolean test_16 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_16") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(0),new Integer(0),new Integer(0) },new Integer(0)).doCall().checkResult(new Integer(3)) ;
    return ok_sofar ;
  }
  



  static boolean test_17 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_17") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(0),new Integer(0),new Integer(1) },new Integer(0)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_18 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_18") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(0),new Integer(1),new Integer(0) },new Integer(0)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_19 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_19") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(0),new Integer(0) },new Integer(0)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_20 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_20") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(2),new Integer(1),new Integer(2) },new Integer(2)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_21 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_21") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(3),new Integer(3),new Integer(1) },new Integer(2)).doCall().checkResult(new Integer(0)) ;
    return ok_sofar ;
  }
  



  static boolean test_22 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_22") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(2),new Integer(1),new Integer(1),new Integer(1) },new Integer(3)).doCall().checkResult(new Integer(0)) ;
    return ok_sofar ;
  }
  



  static boolean test_23 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_23") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(2),new Integer(3),new Integer(4),new Integer(5) },new Integer(10)).doCall().checkResult(new Integer(0)) ;
    return ok_sofar ;
  }
  



  static boolean test_24 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_24") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(3) },new Integer(1)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_25 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_25") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(2),new Integer(2),new Integer(1),new Integer(3),new Integer(2) },new Integer(2)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_26 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_26") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(2),new Integer(3),new Integer(2),new Integer(3),new Integer(1) },new Integer(3)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_27 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_27") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(3),new Integer(3),new Integer(3),new Integer(1),new Integer(1) },new Integer(1)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_28 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_28") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(0),new Integer(0),new Integer(1),new Integer(0),new Integer(2) },new Integer(0)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_29 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_29") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(0),new Integer(1),new Integer(0),new Integer(0),new Integer(2) },new Integer(0)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_30 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_30") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(1),new Integer(3),new Integer(3),new Integer(2),new Integer(2) },new Integer(3)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_31 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_31") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(2),new Integer(2),new Integer(1),new Integer(1),new Integer(3) },new Integer(2)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_32 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_32") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer(2)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_33 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_33") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(2),new Integer(3),new Integer(1),new Integer(3),new Integer(3),new Integer(1) },new Integer(3)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_34 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_34") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(3),new Integer(2),new Integer(3),new Integer(3),new Integer(2),new Integer(3) },new Integer(3)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_35 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_35") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(3),new Integer(3),new Integer(1),new Integer(1),new Integer(2),new Integer(2) },new Integer(1)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_36 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_36") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(2),new Integer(2),new Integer(3),new Integer(1),new Integer(2),new Integer(3),new Integer(2) },new Integer(3)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_37 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_37") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(2),new Integer(3),new Integer(2),new Integer(2),new Integer(1),new Integer(2),new Integer(3) },new Integer(1)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_38 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_38") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(2),new Integer(3),new Integer(2),new Integer(1),new Integer(3),new Integer(3),new Integer(2),new Integer(1) },new Integer(3)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_39 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_39") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(3),new Integer(2),new Integer(1),new Integer(3),new Integer(2),new Integer(1) },new Integer(1)).doCall().checkResult(new Integer(3)) ;
    return ok_sofar ;
  }
  



  static boolean test_40 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_40") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(2),new Integer(2),new Integer(1),new Integer(3),new Integer(2),new Integer(3),new Integer(3),new Integer(3),new Integer(1) },new Integer(1)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_41 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_41") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(2),new Integer(3),new Integer(3),new Integer(3),new Integer(1),new Integer(3),new Integer(1),new Integer(1),new Integer(2) },new Integer(2)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_42 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_42") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(3),new Integer(1),new Integer(2),new Integer(1),new Integer(2),new Integer(2),new Integer(2),new Integer(1),new Integer(1) },new Integer(2)).doCall().checkResult(new Integer(3)) ;
    return ok_sofar ;
  }
  



  static boolean test_43 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_43") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(3),new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(3),new Integer(1),new Integer(3) },new Integer(1)).doCall().checkResult(new Integer(4)) ;
    return ok_sofar ;
  }
  



  static boolean test_44 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_44") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(3),new Integer(3),new Integer(2),new Integer(1),new Integer(1),new Integer(2),new Integer(2),new Integer(1),new Integer(1) },new Integer(3)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_45 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_45") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(0),new Integer(0),new Integer(1),new Integer(0),new Integer(2),new Integer(0),new Integer(0),new Integer(0),new Integer(5) },new Integer(0)).doCall().checkResult(new Integer(3)) ;
    return ok_sofar ;
  }
  



  static boolean test_46 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_46") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(3),new Integer(1),new Integer(1),new Integer(3),new Integer(2),new Integer(2),new Integer(1),new Integer(2),new Integer(2),new Integer(2) },new Integer(1)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_47 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_47") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(3),new Integer(2),new Integer(2),new Integer(1),new Integer(1),new Integer(3),new Integer(1),new Integer(1),new Integer(2),new Integer(2) },new Integer(1)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_48 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_48") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(1),new Integer(2),new Integer(2),new Integer(3),new Integer(2),new Integer(2),new Integer(3),new Integer(3),new Integer(2),new Integer(1) },new Integer(3)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_49 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_49") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(3),new Integer(1),new Integer(2),new Integer(3),new Integer(2),new Integer(1),new Integer(2),new Integer(3),new Integer(1),new Integer(2),new Integer(2) },new Integer(1)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_50 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_50") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(3),new Integer(2),new Integer(1),new Integer(2),new Integer(1),new Integer(3),new Integer(1),new Integer(3),new Integer(3),new Integer(3),new Integer(1) },new Integer(2)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_51 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_51") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(3),new Integer(2),new Integer(2),new Integer(1),new Integer(1),new Integer(3),new Integer(2),new Integer(1),new Integer(3),new Integer(2),new Integer(1) },new Integer(2)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_52 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_52") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(3),new Integer(1),new Integer(2),new Integer(1),new Integer(3),new Integer(1),new Integer(3),new Integer(3),new Integer(1),new Integer(1),new Integer(2),new Integer(1) },new Integer(2)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_53 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_53") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(3),new Integer(3),new Integer(1),new Integer(1),new Integer(3),new Integer(2),new Integer(1),new Integer(2),new Integer(2),new Integer(1),new Integer(2),new Integer(1) },new Integer(1)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_54 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_54") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(2),new Integer(3),new Integer(2),new Integer(1),new Integer(2),new Integer(1),new Integer(3),new Integer(2),new Integer(2) },new Integer(1)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_55 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_55") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(2),new Integer(1),new Integer(2),new Integer(1),new Integer(3),new Integer(2),new Integer(3),new Integer(3),new Integer(2),new Integer(3),new Integer(2),new Integer(2) },new Integer(1)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_56 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_56") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(2),new Integer(3),new Integer(1),new Integer(1),new Integer(1),new Integer(2),new Integer(3),new Integer(3),new Integer(1),new Integer(1),new Integer(1),new Integer(3) },new Integer(3)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_57 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_57") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(2),new Integer(3),new Integer(2),new Integer(2),new Integer(2),new Integer(1),new Integer(3),new Integer(3),new Integer(1),new Integer(2),new Integer(3),new Integer(2),new Integer(2) },new Integer(1)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_58 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_58") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(1),new Integer(3),new Integer(1),new Integer(1),new Integer(2),new Integer(3),new Integer(3),new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(2),new Integer(1) },new Integer(2)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_59 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_59") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(2),new Integer(2),new Integer(3),new Integer(1),new Integer(2),new Integer(3),new Integer(2),new Integer(2),new Integer(3) },new Integer(3)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_60 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_60") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(2),new Integer(1),new Integer(2),new Integer(1),new Integer(3),new Integer(2),new Integer(3),new Integer(2),new Integer(3),new Integer(2),new Integer(2),new Integer(3),new Integer(1),new Integer(3) },new Integer(2)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_61 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_61") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(3),new Integer(1),new Integer(2),new Integer(3),new Integer(3),new Integer(1),new Integer(2),new Integer(1),new Integer(3) },new Integer(2)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_62 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_62") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(3),new Integer(1),new Integer(3),new Integer(3),new Integer(2),new Integer(2),new Integer(3),new Integer(2),new Integer(3),new Integer(1),new Integer(1) },new Integer(1)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  



  static boolean test_63 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_63") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(2),new Integer(3),new Integer(3),new Integer(1),new Integer(3),new Integer(3),new Integer(3) },new Integer(1)).doCall().checkResult(new Integer(4)) ;
    return ok_sofar ;
  }
  



  static boolean test_64 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_64") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(2),new Integer(3),new Integer(3),new Integer(2),new Integer(2),new Integer(2),new Integer(3),new Integer(1),new Integer(2),new Integer(2),new Integer(2),new Integer(2),new Integer(1),new Integer(3),new Integer(3) },new Integer(1)).doCall().checkResult(new Integer(1)) ;
    return ok_sofar ;
  }
  



  static boolean test_65 () 
  {
    
    TestData.initTrace() ;
    TestData.testName = new String("test_65") ;
    boolean ok_sofar = true ;
    
    if (ok_sofar)
      ok_sofar = new MaxNumRepeated(new Integer[] { new Integer(3),new Integer(2),new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(2),new Integer(2),new Integer(1),new Integer(3),new Integer(1),new Integer(3),new Integer(1),new Integer(3) },new Integer(2)).doCall().checkResult(new Integer(2)) ;
    return ok_sofar ;
  }
  

}



static class UtilsUtils {
  public static String toString(Integer[] arr, Integer elem, String className, String opName) {
    return className+"."+opName+"("+TestUtils.printArray(arr)+","+elem.toString()+")";
  }
}













static class TestUtils {
  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static void printWarning(String TestName) {
      System.out.println("\n*** Warning in "+TestName+":");
  }

  static void printError(String TestName) {
      System.out.println("\n\n***********************************************");
      System.out.println("*** Error in "+TestName+":");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

  static void printCallException(ExecutionTime time, String msg, Throwable exc) {
      System.out.println("\n\n***********************************************");
      System.out.println("*** Error in "+TestData.testName+": ");

      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        System.out.print(callSeqString(traceLength,time)+"\n");
	  System.out.println(TestData.getTrace());
      }

      switch (time) {
      case AFTER:
	  System.out.println("the call to "+msg+" raised the exception "+exc+
			     " although it should not have\n");
	  break;
      default:
	  System.out.println("the exception "+exc+" was raised although it "+
			     "should not have been\n");
	  break;
      }
      exc.printStackTrace();
    }

  static void printCallException(String msg, Throwable exc) {
    printCallException(ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(Throwable exc) {
    printCallException(ExecutionTime.LAST,"",exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
    System.out.println("\n\n***********************************************");
    if (TestData.testName != "") {
      System.out.println("\n*** Warning for "+TestData.testName+": ");
    } else
      System.out.println("\n*** Warning:");

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
    
      if (traceLength > 0) {
        System.out.print(callSeqString(traceLength,time)+"\n");
        System.out.println(TestData.getTrace());
      }
    }
    
    System.out.println(msg+"\n");
  }

  static void printError(ExecutionTime time, String msg) {
      System.out.println("\n\n***********************************************");
      System.out.println("*** Error in "+TestData.testName+":\n");

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
      
      if (traceLength > 0) {
        System.out.print(callSeqString(traceLength,time)+"\n");
        System.out.println(TestData.getTrace());
      }
    }
      
    System.out.println(msg+"\n");
  }

  static String callSeqString(int traceLength, ExecutionTime time) {
    if (traceLength < 2)
      return "while executing the call ";
    else {
      switch(time) {
      case AFTER:
	  return "after executing the call sequence ";
      case LAST:
	  return "while executing the last statement of call sequence ";
      case DURING:
	  return "while executing the call sequence ";
      case UNRELATED:
	  return "";
      }
      return "";
    }
  }

  // Checks that results, which may not be an exception nor null
  // (needs prior checks), which are iterables, return the same
  // set of elements.
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<E,F> call,
                    TestResult<E,F> result,
                    F expected) {
    HashSet<Object> s1 = new HashSet<Object>();
    HashSet<Object> s2 = new HashSet<Object>();
    E value = result.getValue();
    for (Object e : value)
      s1.add(e);
    for (Object f : expected)
      s2.add(f);
    if (!s1.equals(s2)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which which contained the elements "+s1+
         " which differs from the expected elements "+s2);
      return false;
    }
    return true;
  }

  static <E> PositionList<E> extractElementsFromIterable(String callString, Iterable<E> i) {
    if (i == null) {
      printError
        (ExecutionTime.UNRELATED,
         "the call "+callString+
         " returned an null iterable");
      return null;
    }

    PositionList<E> l = new NodePositionList<E>();

    try {
      Iterator<E> it = i.iterator();
      while (it.hasNext()) {
        l.addLast(it.next());
      }
    } catch (Throwable exc) {
      printError
        (ExecutionTime.UNRELATED,
         "the call "+callString+
         " returned an iterable which when used raised the exception "+
         exc);
      exc.printStackTrace();
      return null;
    }
    return l;
  }

  static <E> boolean iterableCorrect(String callString, E[] original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    if (l == null) return false;

    boolean correct = (original.length == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      for (int j=0; j<original.length; j++) {
        if (original[j] == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && original[j].equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.UNRELATED,
         "the call "+callString+
         " returned an iterable with the elements "+l+
         " but should have returned the elements "+printArray(original));
      return false;
    } else return true;
  }

  static <E> boolean unchanged(String callString, E[] original, PositionList<E> l) {
      boolean ok_sofar = true;
      
      if (l.size() != original.length) {
	  ok_sofar = false;
      }

      Position<E> lPos = l.first();
      int i=0;
      while (ok_sofar && lPos != null) {
	  E elem = lPos.element();

	  if (elem == null) ok_sofar = (original[i] == null);
	  else ok_sofar = elem.equals(original[i]);

	  lPos = l.next(lPos);
	  ++i;
      }

      if (!ok_sofar) {
	  printError
            (ExecutionTime.DURING,
	       "the call "+callString+
	       " has modified the input list "+printArray(original)+
	       "; it has now the elements "+l);
	  return ok_sofar;
      }
      return ok_sofar;
  }

  static <E> boolean unchanged(String callString, E[] original, E[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  if (newer[i] == null) ok_sofar = (original[i] == null);
	  else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
	  printError
	      (ExecutionTime.DURING,
	       "the call "+callString+
	       " has modified the input array "+printArray(original)+
	       "; it has now the elements "+printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  static String printArray(Object[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  static String printArray(int[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  public static <T> PositionList<T> toPositionList(T[] arr) {
    NodePositionList<T> l = new NodePositionList<T>();
    for (int i=0; i<arr.length; i++)
      l.addLast(arr[i]);
    return l;
  }

  public static <T> IndexedList<T> toIndexedList(T[] arr) {
    ArrayIndexedList<T> l = new ArrayIndexedList<T>();
    for (int i=0; i<arr.length; i++)
      l.add(0,arr[i]);
    return l;
  }
  
}

interface TestResult<E,F> {
  boolean isException();
  Throwable getException();
  E getValue();
  boolean checkResult(F expected);
}

static class Result<E,F> implements TestResult<E,F> {
  private boolean isException;
  private Throwable exception;
  private E value;
  Call<E,F> call;

  public static <E,F> Result<E,F> result(E e, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = false;
    result.value = e;
    result.call = call;
    return result;
  }
  
  public static <E,F> Result<E,F> exception(Throwable exception, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = true;
    result.exception = exception;
    result.call = call;
    return result;
  }
  
  public boolean isException() {
    return isException;
  }

  public Throwable getException() {
    if (!isException()) {
      System.out.println("*** Internal model error: calling getException() without exception");
      throw new RuntimeException();
    }
    return exception;
  }

  public E getValue() {
    if (isException())
      throw new RuntimeException();
    return value;
  }
  
  Call<E,F> getCall() {
    return call;
  }

  public boolean checkResult(F expected) {
    try {
      return getCall().checkResult(expected);
    } catch (Throwable exc) {
      System.out.println("\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      exc.printStackTrace();
      System.out.println("\n");
      throw new RuntimeException();
    }
  }

  public String toString() {
    if (isException())
      return getCall() + " -> " + getException();
    else
      return getCall() + " -> " + getValue();      
  }
}

interface Call<E,F> {
  TestResult<E,F> doCall();
  String toString();
  boolean checkResult(F expected);
}

static abstract class TestCall<E,F> implements Call<E,F> {
  TestResult<E,F> result;
  boolean hasCalled;

  public TestResult<E,F> doCall() {
    if (hasCalled())
      throw new RuntimeException();

    hasCalled = true;
    TestData.addCallToTrace(this.toString());
    
    try {
      E e = call();
      result = Result.result(e,this);
    } catch (Throwable exception) {
      result = Result.exception(exception,this);
    }
    return result;
  }

  abstract E call() throws Exception;

  boolean hasCalled() {
    return hasCalled;
  }

  boolean noException() {
    if (result.isException()) {
      TestUtils.printCallException(result.getException());
      return false;
    }

    return true;
  }

  boolean throwsException(String expectedName) {
    if (!result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown an exception, "+
         "but returned the value "+result.getValue());
      return false;
    }

    Throwable exception = result.getException();
    if (!expectedName.equals(exception.getClass().getCanonicalName())) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown the exception "+
         expectedName+
         ", but throwed the exception "+exception);
      exception.printStackTrace();
      return false;
    }

    return true;
  }

  boolean nonNull() {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n");
      return false;
    } else return true;
  }

  boolean fresh(Object obj) {
    return fresh(result.getValue(),obj);
  }

  boolean fresh(Object obj1, Object obj2) {
    if (obj1 != null && obj1 == obj2) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned an object\n  "+obj1+
         "\nwhich is the same REFERENCE as an argument object; "+
         "a NEW object should have been returned\n");
      return false;
    } else return true;
  }

  boolean unchanged(Object obj1, Object obj2) {
    if (!(obj1.equals(obj2))) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " changed an object parameter \n"+obj2+
         "\nwhich should not have been changed\n");
      return false;
    } else return true;
  }

  boolean unchanged_array(F[] original, F[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  if (newer[i] == null) ok_sofar = (original[i] == null);
	  else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
	  TestUtils.printError
	      (TestUtils.ExecutionTime.LAST,
	       "the call to "+this+
	       " has modified the input array "+TestUtils.printArray(original)+
	       "; it has now the elements "+TestUtils.printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  boolean setsMatch(Object expected) {
    if (!noException())
      return false;

    if (!(expected instanceof Iterable<?>)) {
      System.out.println("Cannot iterate over expected value "+expected);
      throw new RuntimeException();
    }
    Iterable<?> ev = (Iterable<?>) expected;

    E value = result.getValue();
    if (!(value instanceof Iterable<?>)) {
      System.out.println("Cannot iterate over result value "+value);
      throw new RuntimeException();
    }
    Iterable<?> iv = (Iterable<?>) value;

    HashSet<Object> ts1 = new HashSet<Object>();
    HashSet<Object> ts2 = new HashSet<Object>();


    for (Object s1 : iv)
      ts1.add(s1);
    for (Object s2 : ev)
      ts2.add(s2);
    
    if (!ts1.equals(ts2)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned a value\n"+value+
         "\nwhich does not contain the same elements as the expected answer"+
         "\n"+expected);
      return false;
    }

    return true;
  }

  boolean valuesMatch(Object expected) {
    if (result.isException()) {
      noException();
      return false;
    } else {
      E value = result.getValue();
      
      if (value == null) {
        if (expected != null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "\nthe call to "+this+" returned null, "+
             "but should have returned "+expected);
          return false;
        }
        else return true;
      }
      
      if (!value.equals(expected)) {
        TestUtils.printError
          (TestUtils.ExecutionTime.LAST,
           "\nthe call to "+this+" returned\n  "+value+
           "\n\nbut should have returned\n  "+expected);
        return false;
      }
      return true;
    }
  }

  public boolean checkResult(F expected) {
    if (!hasCalled())
      throw new RuntimeException();

    return valuesMatch(expected);
  }
}

 

static class MaxNumRepeated extends TestCall<Integer,Integer>
{
  Integer[] n1;
  Integer[] n1_orig;
  Integer n2;
  
  public MaxNumRepeated (Integer[] n1,Integer n2)
  {
    this.n1 = n1 ;
    n1_orig = n1.clone() ;
    this.n2 = n2 ;
  }
  
  public String toString () 
  {
    return UtilsUtils.toString(n1,n2,new String("Utils"),new String("maxNumRepeated")) ;
  }
  
  public Integer call () 
  {
    return Utils.maxNumRepeated(n1,n2) ;
  }
  
  public boolean checkResult (Integer expected) 
  {
    if (!noException())
      return false ;
    if (!fresh(result.getValue(),n1))
      return false ;
    if (!unchanged_array(n1,n1_orig))
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}







public static class TestData {
  static String testName = "";
  static ArrayList<String> trace;

  public static void initTrace() {
    trace = new ArrayList<String>();
  }

  public static void addCallToTrace(String callString) {
    trace.add(callString);
  }

  public static int numCommands() {
    return trace.size();
  }

  public static String getTrace() {
    StringBuffer sb = new StringBuffer();

    for (int i=0; i<trace.size(); i++) {
      if (i > 0) sb.append("\n");
      sb.append("  "+trace.get(i));
    }
    return sb.toString();
  }

  public static String getTestName() {
    return testName;
  }

  public static ArrayList<String> getRawTrace() {
    return trace;
  }

  public static void setTrace(ArrayList<String> setTrace) {
    trace = setTrace;
  }

  public static void setTestName(String setTestName) {
    testName = setTestName;
  }

  public static void setContext(String setTestName, ArrayList<String> setTrace) {
    setTestName(setTestName);
    setTrace(setTrace);
  }
}



static class ResultsHandler {
  public static volatile CountDownLatch waitForThreads = null;
  static LinkedHashMap<String,Boolean> results_sofar;

  static void init() {
    results_sofar = new LinkedHashMap<String,Boolean>();
  }

  static boolean results_ok_sofar() {
    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;
    return true;
  }

  static boolean local_results_ok_sofar(String test_type) {
    Boolean result = results_sofar.get(test_type);
    return (result==null) || result;
  }

  static void add_result(String test_type, boolean result) {
    Boolean old_result = results_sofar.get(test_type);
    if ((old_result == null) || old_result)
      results_sofar.put(test_type,result);
  }

  static boolean results_ok() {
    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;
    return true;
  }

  static int get_nota() {
    if (results_ok()) return 10;
    else return 0;
  }

  static void report_results() {
    System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++\n");

    for (String testName : results_sofar.keySet()) {
      System.out.print("Testing results for "+testName+": ");
      if (results_sofar.get(testName))
        System.out.println("succeeded");
      else
        System.out.println("failed");
    }

    System.out.println("\n------------------------------------------");
    if (results_ok())
      System.out.println("\n"+Tests.tester+": Test finalizado correctamente.\n");
    else
      System.out.println("\n"+Tests.tester+": errores detectados.\n\n");
  }
}



}
