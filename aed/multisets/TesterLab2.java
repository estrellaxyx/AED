
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
// File generated at: 2019/10/10 -- 13:35:27
// Seed: {1570,707325,516774}
//
//////////////////////////////////////////////////////////////////////



package aed.multisets;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CountDownLatch;
import java.lang.reflect.*;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.positionlist.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.*;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.function.Function;



/**
 * The main tester class which contains JUnit5 tests.
 */
@SuppressWarnings({"unused","deprecation"})
public class TesterLab2 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(64,60) ;
    TestData.setTesterType(true) ;
    TestUtils.ensureAedlibVersion(2,4,2) ;
  }
  
  @AfterAll
  public static void reportResults () 
  {
    ResultsHandler.report_results() ;
  }
  
  @Test
  public void test_01 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_01") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_01")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_01")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_02 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_02") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_02")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_02")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_03 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_03") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_03")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_03")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_04 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_04") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_04")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_04")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_05 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_05") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_05")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hej"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(5))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_05")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_06 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_06") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_06")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hej"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(6))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_06")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_07 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_07") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_07")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hej"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(7))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_07")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_08 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_08") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_08")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_08")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_09 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_09") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_09")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_09")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_10 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_10") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_10")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("si")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_10")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_11 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSet<String>,Void> v_2 = null ;
MultiSet<String> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_11") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_11")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
{
  v_2 = new Intersection(v_1,v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_11")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_12 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSet<String>,Void> v_2 = null ;
MultiSet<String> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_12") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_12")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
{
  v_2 = new Sum(v_1,v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(2))))) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_12")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_13 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_13") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_13")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_13")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_14 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSet<String>,Void> v_2 = null ;
MultiSet<String> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_14") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_14")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
{
  v_2 = new Sum(v_1,v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_14")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_15 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_15") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_15")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_15")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_16 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_16") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_16")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_16")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_17 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_17") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_17")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(2)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_17")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_18 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_18") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_18")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(2)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(2))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_18")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_19 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_19") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_19")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hola"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(5))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Iterator(v_1).doCall().checkResult(new String[] { new String("no"),new String("no"),new String("hola"),new String("hola"),new String("hola"),new String("hola"),new String("hola") }) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_19")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_20 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_20") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_20")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_1,null,new Integer(2)).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_20")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_21 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_21") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_21")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hola"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_21")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_22 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_22") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_22")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(5))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_22")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_23 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_23") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_23")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hola"),new Integer(20)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(20))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hola"),new Integer(23)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(43))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("hola")).doCall().checkResult(new Integer(43)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(43))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("no")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(43))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_23")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_24 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_24") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_24")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(10))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_24")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_25 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_25") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_25")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new String("hola")).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("hola")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("hola")).doCall().checkResult(new Integer(1)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_25")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_26 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_26") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_26")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hola"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(5))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("hola")).doCall().checkResult(new Integer(5)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("si")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("no")).doCall().checkResult(new Integer(2)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_26")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_27 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_27") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_27")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hola"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(5))))) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_1,new String("hola"),new Integer(3)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_1,new String("no"),new Integer(2)).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(2)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(2))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_27")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_28 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_28") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_28")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hej"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,null,new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_28")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_29 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_29") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_29")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_1,null,new Integer(0)).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hej"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_29")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_30 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TestResult<MultiSet<String>,Void> v_4 = null ;
MultiSet<String> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_30") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_30")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("hola"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(10))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("yes"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("yes"),new Integer(10))))) ;
if (ok_sofar)
{
  v_4 = new Intersection(v_1,v_3).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("yes"),new Integer(10))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_30")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_31 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TestResult<MultiSet<String>,Void> v_4 = null ;
MultiSet<String> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_31") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_31")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("hola"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(10))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("yes"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("yes"),new Integer(10))))) ;
if (ok_sofar)
{
  v_4 = new Sum(v_1,v_3).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("yes"),new Integer(10))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(11)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("yes"),new Integer(10))))) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_31")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_32 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TestResult<MultiSet<String>,Void> v_4 = null ;
MultiSet<String> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_32") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_32")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("si")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(3))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Intersection(v_3,v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(3))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
}
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(8))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_32")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_33 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_33") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_33")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Count(v_1,null).doCall().checkResult(new Integer(1)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Remove(v_3,new String("si")).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_33")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_34 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_34") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_34")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("si")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("no"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_34")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_35 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_35") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_35")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("hola")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(13))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(13)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_35")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_36 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TestResult<MultiSet<String>,Void> v_4 = null ;
MultiSet<String> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_36") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_36")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Intersection(v_1,v_3).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
}
if (ok_sofar)
  ok_sofar = new Add(v_5,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_36")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_37 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSet<String>,Void> v_2 = null ;
MultiSet<String> v_3 = null ;
TestResult<MultiSetList<String>,Void> v_4 = null ;
MultiSetList<String> v_5 = null ;
TestResult<MultiSet<String>,Void> v_6 = null ;
MultiSet<String> v_7 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_37") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_37")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
{
  v_2 = new Sum(v_1,v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
}
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1))))) ;
if (ok_sofar)
{
  v_4 = new Constructor().doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_5,new String("no"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4))))) ;
if (ok_sofar)
{
  v_6 = new Intersection(v_1,v_3).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_7,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
}
if (ok_sofar)
  ok_sofar = new Add(v_5,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_37")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_38 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_38") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_38")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,null).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_1,null,new Integer(6)).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_38")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_39 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_39") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_39")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new String("hola")).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("hola")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new String("hola")).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("hola")).doCall().checkResult(new Integer(1)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("hola")).doCall().checkResult(new Integer(2)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(2))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_39")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_40 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_40") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_40")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("hej")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("si")).doCall().checkResult(new Integer(1)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(5))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new Remove(v_3,new String("hej")).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_40")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_41 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TestResult<MultiSet<String>,Void> v_4 = null ;
MultiSet<String> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_41") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_41")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
{
  v_4 = new Sum(v_3,v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1))))) ;
}
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_5,new String("no"),new Integer(10)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_41")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_42 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_42") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_42")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(3)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hej"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(5))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_1,new String("no"),new Integer(9)).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_42")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_43 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_43") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_43")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("si")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hej"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(5))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(11))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_43")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_44 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_44") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_44")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hola"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(8))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hej"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("no"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("hej"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(6))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_44")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_45 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSet<String>,Void> v_2 = null ;
MultiSet<String> v_3 = null ;
TestResult<MultiSet<String>,Void> v_4 = null ;
MultiSet<String> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_45") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_45")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_1,new String("si"),new Integer(2)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
if (ok_sofar)
{
  v_2 = new Sum(v_1,v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4))))) ;
}
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
if (ok_sofar)
{
  v_4 = new Intersection(v_3,v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
}
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(4)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("hej")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_45")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_46 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TestResult<MultiSet<String>,Void> v_4 = null ;
MultiSet<String> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_46") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_46")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_3,new String("si"),new Integer(2)).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_3,new String("si")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2))))) ;
if (ok_sofar)
{
  v_4 = new Sum(v_3,v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
}
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("hola"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(3))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_46")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_47 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_47") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_47")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hola"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("hej"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,null,new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("no"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Remove(v_3,null).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("no"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_47")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_48 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSet<String>,Void> v_2 = null ;
MultiSet<String> v_3 = null ;
TestResult<MultiSetList<String>,Void> v_4 = null ;
MultiSetList<String> v_5 = null ;
TestResult<MultiSet<String>,Void> v_6 = null ;
MultiSet<String> v_7 = null ;
TestResult<MultiSet<String>,Void> v_8 = null ;
MultiSet<String> v_9 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_48") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_48")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Intersection(v_1,v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
}
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_3,null,new Integer(10)).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
{
  v_4 = new Constructor().doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  v_6 = new Sum(v_1,v_3).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_7,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
}
if (ok_sofar)
  ok_sofar = new AddN(v_7,null,new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_7,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_5,null,new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Size(v_5).doCall().checkResult(new Integer(1)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_7,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_7,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
if (ok_sofar)
{
  v_8 = new Sum(v_3,v_7).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_7,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_9,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(3))))) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_48")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_49 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_49") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_49")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(5))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("si")).doCall().checkResult(new Integer(5)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(5))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new String("no")).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_1,null,new Integer(1)).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_1,new String("hej"),new Integer(1)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hej"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_49")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_50 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSet<String>,Void> v_2 = null ;
MultiSet<String> v_3 = null ;
TestResult<MultiSetList<String>,Void> v_4 = null ;
MultiSetList<String> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_50") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_50")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hola"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(20)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6))))) ;
if (ok_sofar)
{
  v_2 = new Sum(v_1,v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(18)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(12))))) ;
}
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(18)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(12)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1))))) ;
if (ok_sofar)
{
  v_4 = new Constructor().doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Size(v_3).doCall().checkResult(new Integer(45)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Count(v_3,null).doCall().checkResult(new Integer(18)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(18)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(12)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("si")).doCall().checkResult(new Integer(2)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("hola"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(18)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(12)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(16))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_50")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_51 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TestResult<MultiSet<String>,Void> v_4 = null ;
MultiSet<String> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_51") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_51")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,null,new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(13))))) ;
if (ok_sofar)
  ok_sofar = new Size(v_3).doCall().checkResult(new Integer(9)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(13))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(14))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(10))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new Remove(v_3,new String("si")).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(8))))) ;
if (ok_sofar)
{
  v_4 = new Sum(v_3,v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(8))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(24)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14))))) ;
}
if (ok_sofar)
  ok_sofar = new Count(v_3,new String("si")).doCall().checkResult(new Integer(6)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(11))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_51")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_52 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_52") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_52")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("si")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_3,new String("si")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,null,new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("hola"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(10))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,null,new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(12))))) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new String("hola")).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("no"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(12)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(13))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("no"),new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(13))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_52")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_53 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_53") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_53")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hej"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("no")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(10)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("hola")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,null,new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_3,new String("si")).doCall().checkResult(new Integer(1)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_3).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new Iterator(v_3).doCall().checkResult(new String[] { null,null,null,new String("si") }) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(3))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_53")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_54 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TestResult<MultiSet<String>,Void> v_4 = null ;
MultiSet<String> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_54") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_54")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_1,null,new Integer(6)).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_3,new String("hola"),new Integer(1)).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Count(v_3,new String("si")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("hola")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_3,new String("no")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Remove(v_3,new String("no")).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_3,null).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_1,new String("si"),new Integer(0)).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(18))))) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_1,new String("no"),new Integer(4)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(18))))) ;
if (ok_sofar)
{
  v_4 = new Intersection(v_1,v_3).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(18))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
}
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_54")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_55 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TestResult<MultiSet<String>,Void> v_4 = null ;
MultiSet<String> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_55") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_55")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(3))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Intersection(v_3,v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(3))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
}
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("no"),new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_5,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_5,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_5,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_5,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(8))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_5,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_5,new String("hola")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_5,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("hola"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_3,new String("si"),new Integer(4)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new String("no")).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(8))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_5,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_5,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(5))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(16))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_55")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_56 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_56") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_56")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,null,new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,null,new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(11))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(8))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Remove(v_3,new String("no")).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(11))))) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_3).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(11))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(11)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(11)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(10))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(17))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(11)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Size(v_3).doCall().checkResult(new Integer(23)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(11)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,null,new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(15))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(21))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(22))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(23))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("no"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(12))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("no"),new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(12))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(13))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_56")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_57 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TestResult<MultiSet<String>,Void> v_4 = null ;
MultiSet<String> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_57") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_57")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_1,null,new Integer(3)).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(15)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_3,null,new Integer(4)).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
{
  v_4 = new Intersection(v_1,v_3).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
}
if (ok_sofar)
  ok_sofar = new Count(v_3,null).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_1,new String("si"),new Integer(5)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("no"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hej"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new Size(v_3).doCall().checkResult(new Integer(5)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(5))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(13))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(10))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_5,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,null,new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(13)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_5,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_5,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_57")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_58 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_58") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_58")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Count(v_3,new String("hej")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("no")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("no"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_3,new String("no"),new Integer(5)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_1,null,new Integer(10)).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,null,new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("si")).doCall().checkResult(new Integer(1)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(8))))) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,null).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("hola"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_3,new String("si"),new Integer(3)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(17))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(18))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,null,new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(10))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(11))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_58")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_59 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_59") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_59")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hej"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("no")).doCall().checkResult(new Integer(9)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("no")).doCall().checkResult(new Integer(9)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(10))))) ;
if (ok_sofar)
  ok_sofar = new Iterator(v_1).doCall().checkResult(new String[] { null,null,null,null,null,null,null,null,null,null,new String("si"),new String("si"),new String("si"),new String("si"),new String("si"),new String("no"),new String("si"),new String("no"),new String("no"),new String("no"),new String("no"),new String("no"),new String("no"),new String("no"),new String("no"),new String("no"),new String("hej"),new String("hej"),new String("hej"),new String("hej"),new String("hej"),new String("hej"),new String("hej"),new String("hej"),new String("hej") }) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(10))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hola"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hej"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(15))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(17))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(17)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(17))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("no"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(5))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("hola"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,null,new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(8))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(5))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(17)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(18))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(7))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_59")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_60 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_60") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_60")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Iterator(v_1).doCall().checkResult(new String[] { null }) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("hola"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(8))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(11))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("si")).doCall().checkResult(new Integer(2)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(18))))) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(18))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(11))))) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_3).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(11))))) ;
if (ok_sofar)
  ok_sofar = new Iterator(v_1).doCall().checkResult(new String[] { new String("si"),new String("si"),new String("si"),new String("si"),new String("si"),new String("si"),new String("si"),new String("si"),new String("si"),new String("no"),new String("no"),new String("no"),new String("no"),new String("no"),new String("no"),new String("no"),new String("no"),new String("no"),new String("no"),null,new String("si"),new String("si"),null,null,null,null,null,null,null }) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(11))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(18)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(26))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(11)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(12))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(11)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(13))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(11)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(21))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(33))))) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_3).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(33))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(21)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(12))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(12)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(22))))) ;
if (ok_sofar)
  ok_sofar = new Iterator(v_1).doCall().checkResult(new String[] { null,new String("si"),null,null,null,null,null,null,null,null,null,null,null,null,null,new String("si"),new String("si"),new String("si"),new String("si"),new String("si"),new String("si"),new String("si"),new String("si"),new String("si"),new String("no"),new String("no"),new String("no"),new String("no"),new String("no"),new String("no"),new String("no"),new String("no"),new String("no"),new String("no"),null,new String("si"),new String("si"),null,null,null,null,null,null,null }) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(12)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(22))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(43))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_60")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_61 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TestResult<MultiSet<String>,Void> v_4 = null ;
MultiSet<String> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_61") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_61")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(14))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(15))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("no"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(22))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(22)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(5))))) ;
if (ok_sofar)
  ok_sofar = new Remove(v_3,new String("no")).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new Remove(v_3,new String("si")).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(23))))) ;
if (ok_sofar)
{
  v_4 = new Intersection(v_1,v_3).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(23))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
}
if (ok_sofar)
  ok_sofar = new Remove(v_1,new String("hej")).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(23))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_5,new String("si"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,null,new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,null).doCall().checkResult(new Integer(23)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(23))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(23)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new Size(v_5).doCall().checkResult(new Integer(3)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(23)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_5,new String("no"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_5,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_5,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(25))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_5,new String("no"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(3)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(10))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,null).doCall().checkResult(new Integer(25)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(25))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_61")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_62 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_62") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_62")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(10))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Iterator(v_1).doCall().checkResult(new String[] { null,null,null,null,null,null,null,null,null,null }) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("hej"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(8))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("hola"),new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(8))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new Remove(v_3,new String("si")).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(8))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Remove(v_3,new String("si")).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(8))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,null,new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(11))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_3,null).doCall().checkResult(new Integer(1)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_3,new String("si")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("no"),new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(12))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(5))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(13))))) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_3).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(13))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(22))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_3,new String("hej")).doCall().checkResult(new Integer(9)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("hej")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(10))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(22)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(5))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(27))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(17))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(5)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(4))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_62")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_63 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TestResult<MultiSet<String>,Void> v_4 = null ;
MultiSet<String> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_63") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_63")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new String("hej")).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new RemoveN(v_3,new String("si"),new Integer(2)).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(5))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("hej")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(5))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("hej"),new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new Iterator(v_1).doCall().checkResult(new String[] { null,null,null,new String("si"),new String("si"),new String("si"),new String("si"),new String("si"),new String("si"),null,null }) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new Remove(v_3,new String("hej")).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,null,new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(8))))) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(12)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(4)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(8))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(5))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_3,null).doCall().checkResult(new Integer(8)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(5))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_3).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("no"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("hej"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(10))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hola"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(10))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7))))) ;
if (ok_sofar)
{
  v_4 = new Sum(v_3,v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(9))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(16)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(13)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(7))))) ;
}
if (ok_sofar)
  ok_sofar = new RemoveN(v_3,new String("no"),new Integer(1)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_63")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_64 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<MultiSetList<String>,Void> v_0 = null ;
MultiSetList<String> v_1 = null ;
TestResult<MultiSetList<String>,Void> v_2 = null ;
MultiSetList<String> v_3 = null ;
TestResult<MultiSet<String>,Void> v_4 = null ;
MultiSet<String> v_5 = null ;
TestResult<MultiSet<String>,Void> v_6 = null ;
MultiSet<String> v_7 = null ;
TestResult<MultiSet<String>,Void> v_8 = null ;
MultiSet<String> v_9 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_64") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_64")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
{
  v_2 = new Constructor().doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("si"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(3))))) ;
if (ok_sofar)
{
  v_4 = new Sum(v_3,v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(3))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(12)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
}
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(10))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,null,new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(14))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_5,new String("si")).doCall().checkResult(new Integer(14)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(12)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,null,new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_1,new String("si")).doCall().checkResult(new Integer(14)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(14))))) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_3).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(14))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_3,new String("si")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(4))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(5))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(8))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_3,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6))))) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new String("hola")).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(8))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("hola"),new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_5,new String("si")).doCall().checkResult(new Integer(14)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(12)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1))))) ;
if (ok_sofar)
{
  v_6 = new Intersection(v_1,v_3).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_7,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6))))) ;
}
if (ok_sofar)
{
  v_8 = new Sum(v_1,v_3).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
if (ok_sofar)
{
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6))))) ;
  ok_sofar = MultiSetUtils.multiSetOk(v_9,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(20)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9))))) ;
}
if (ok_sofar)
  ok_sofar = new Add(v_3,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_3,new String("si")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_5,null,new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(13))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_7,new String("hej"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_7,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(8))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_9,new String("no")).doCall().checkResult(new Integer(9)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_9,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(20)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_5,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(13)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(15))))) ;
if (ok_sofar)
  ok_sofar = new Remove(v_3,new String("no")).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(6)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(15))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_5,null,new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(18))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(9)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_7,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_7,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_1,new String("no"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(null,new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(18))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(2)),new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(18)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(15))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,null,new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(16))))) ;
if (ok_sofar)
  ok_sofar = new AddN(v_3,new String("si"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(16)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(3))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_7,new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_7,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hej"),new Integer(8)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(7)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(1))))) ;
if (ok_sofar)
  ok_sofar = new Add(v_5,new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_5,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("no"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(18)),new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(2))))) ;
if (ok_sofar)
  ok_sofar = new Count(v_3,new String("no")).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  ok_sofar = MultiSetUtils.multiSetOk(v_3,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("hola"),new Integer(1)),new es.upm.aedlib.Pair<String,Integer>(null,new Integer(16)),new es.upm.aedlib.Pair<String,Integer>(new String("si"),new Integer(3))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_64")) ;
    ResultsHandler.add_result(new String("multisets"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterLab2";
}


static class MultiSetUtils {
  static HashMap<Object,String> setNames = null;
  static Integer nameCounter = 0;

  public static void resetPrinter() {
    setNames = null;
    nameCounter = 0;
  }

  public static String printer(Object obj) {
    if (obj instanceof MultiSet<?>) {
      if (setNames == null)
        setNames = new HashMap<Object,String>();
      String name = setNames.get(obj);
      if (name == null) {
        name = "set_"+nameCounter.toString();
        setNames.put(obj,name);
        nameCounter++;
      }
      return name;
    } else return TestUtils.printer(obj, x -> printer(x));
  }

  public static boolean multiSetOk(MultiSet<String> s,
                                   PositionList<Pair<String,Integer>> expected) {
    MultiSetList<String> l = (MultiSetList<String>) s;
    PositionList<Pair<String,Integer>> elems = null;
    
    try {
      Field elementsField;
      elementsField = l.getClass().getDeclaredField("elements");
      elementsField.setAccessible(true);
      elems = (PositionList<Pair<String,Integer>>) elementsField.get(l);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
        (TestUtils.ExecutionTime.LAST,
         "cannot access the field elements: ",
         exc);
      return true;
    }

    if (elems == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.AFTER,
         "the attribute elements of set "+printer(s)+" has an incorrect value.\n"+
         "\nThe new value is NULL!");
      return false;
    }

    if (!TestUtils.sameElements(expected,elems)) {
        TestUtils.printError
          (TestUtils.ExecutionTime.AFTER,
           "the attribute elements of set "+printer(s)+" is incorrect.\n"+
           "\nThe new value is "+printer(elems)+
           "\nbut it should contain the items "+
           printer(expected));
        return false;
    }
    return true;
  }
}






















static class TestUtils {
  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String printer(Object obj) {
    return printer(obj, x -> printer(x));
  }

  static String printer(Object obj, Function<Object,String> print) {
    if (obj == null)
      return "null";
    else if (obj instanceof String) {
      return("\""+obj.toString()+"\"");
    } else if (obj instanceof Pair<?,?>) {
      Pair<?,?> p = (Pair<?,?>) obj;
      return "Pair("+print.apply(p.getLeft())+","+print.apply(p.getRight())+")";
    } else if (obj instanceof Iterable<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Object[]) {
      Object[] arr = (Object[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        Object aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    }
    else
      return obj.toString();
  }

  static void printWarning(String TestName) {
      TestData.message("\n*** Warning in "+TestName+":");
  }

  static void printError(String TestName) {
      TestData.message("\n\n***********************************************");
      TestData.message("*** Error in "+TestName+":");
  }

  static void terminateErrorPrint() {
      TestData.message("\n***********************************************\n\n");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

  static void printCallException(ExecutionTime time, String msg, Throwable exc) {
    printError(TestData.testName);

      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time)+"\n");
        TestData.message(TestData.getTrace());
      }

      switch (time) {
      case AFTER:
	  TestData.message("the call to "+msg+" raised the exception "+exc+
			     " although it should not have");
	  break;
      default:
	  TestData.message(msg+" -- the exception "+exc+" was raised although it "+
			     "should not have been\n");
	  break;
      }
      TestData.message(getStackTrace(exc));
      terminateErrorPrint();
    }

  static String getStackTrace(Throwable throwable) {
    filterStackTrace(throwable);
    StringWriter errors = new StringWriter();
    throwable.printStackTrace(new PrintWriter(errors));
    return errors.toString();
  }

  static void filterStackTrace(Throwable throwable) {
    StackTraceElement[] stackTrace = throwable.getStackTrace();
    ArrayList<StackTraceElement> l = new ArrayList<StackTraceElement>();
    for (int i=0; i<stackTrace.length; i++) {
      String className = stackTrace[i].getClassName();
      if (className.startsWith("jdk.internal")
          || className.startsWith("org.junit")) break;
      l.add(stackTrace[i]);
    }
    StackTraceElement[] cutStackTrace = new StackTraceElement[l.size()];
    throwable.setStackTrace(l.toArray(cutStackTrace));
  }

  static void printCallException(String msg, Throwable exc) {
    printCallException(ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(Throwable exc) {
    printCallException(ExecutionTime.LAST,"",exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
    TestData.message("\n\n***********************************************");
    if (TestData.testName != "") {
      TestData.message("\n*** Warning for "+TestData.testName+": ");
    } else
      TestData.message("\n*** Warning:");

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
    
      if (traceLength > 0) {
        TestData.message(callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }
    TestData.message(msg);
    terminateErrorPrint();
  }

  static void printError(ExecutionTime time, String msg) {
    printError(TestData.testName);

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
      
      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }
      
    TestData.message(msg);
    terminateErrorPrint();
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
  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<E,F> call,
                    TestResult<E,F> result,
                    F expected) {
    return sameSet(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<?,?> call, E value, F expected) {

    HashSet<Object> s1 = new HashSet<Object>();
    HashSet<Object> s2 = new HashSet<Object>();
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

  // Checks that results, which are iterables, return the same
  // elements, regardless of the order.
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameElements(TestCall<E,F> call,
                         TestResult<E,F> result,
                         F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElements(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameElements(TestCall<E,F> call,
                         E value,
                         F expected) {
    
    if (!sameElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which which contained the elements "+value+
         " which differs from the expected elements "+expected);
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>, F extends Iterable<?>>
    boolean sameElements(E value, F expected) {
    HashMap<Object,Integer> s1 = new HashMap<Object,Integer>();
    HashMap<Object,Integer> s2 = new HashMap<Object,Integer>();
    for (Object e : value) {
      Integer si = s1.get(e);
      if (si == null) si = 0;
      s1.put(e,si+1);
    }
    for (Object f : expected) {
      Integer si = s2.get(f);
      if (si == null) si = 0;
      s2.put(f,si+1);
    }
    if (!s1.equals(s2)) 
      return false;
    else
      return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // equals which does not fail upon finding
  // null values...
  static <E> boolean wellSorted(TestCall<?,?> call,
                                IndexedList<E> value,
                                ArrayIndexedList<ArrayIndexedList<E>> expected) {
    
    int i = 0;
    IndexedList<E> eqClass = null;
    for (E e : value) {
      if (eqClass == null) {
        if (i < expected.size())
          eqClass = new ArrayIndexedList<E>(expected.get(i));
        else {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
        }
      }
      if (!eqClass.remove(e)) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
      }
      if (eqClass.size() == 0) {
        eqClass = null;
        i++;
      }
    }
    if (eqClass != null || i < expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
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

    PositionList<E> l = null;

    try {
      java.util.Iterator<E> it = i.iterator();
      l = extractElementsFromIterator(it);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.UNRELATED,
         "the call "+callString+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return null;
    }
    return l;
  }

  static <E> PositionList<E> extractElementsFromIterator(java.util.Iterator<E> it) {
    PositionList<E> l = new NodePositionList<E>();
    while (it.hasNext()) {
      l.addLast(it.next());
    }
    return l;
  }

  static <E,F> boolean unorderedIteratorCorrect
    (TestCall<java.util.Iterator<E>,F[]> call,
     TestResult<java.util.Iterator<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = result.getValue();
    PositionList<E> l = null;

    try { l = extractElementsFromIterator(it); }
    catch ( Throwable exc ) {
      TestUtils.printCallException(exc);
      return false;
    }

    if (l == null) return false;

    boolean correct = (expected.length == l.size());

    if (correct) {
      PositionList<F> expectedList = new NodePositionList<F>();
      for (int j=0; j<expected.length; j++) {
        expectedList.addLast(expected[j]);
      }
      HashSet<Object> s1 = new HashSet<Object>();
      HashSet<Object> s2 = new HashSet<Object>();
      for (Object e : l)
        s1.add(e);
      for (Object f : expectedList)
        s2.add(f);
      if (!s1.equals(s2)) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterator which returned the elements "+s1+
           " which differs from the expected elements "+s2);
        return false;
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.UNRELATED,
         "the call "+call.toString()+
         " returned an iterable with the elements "+l+
         " but should have returned the elements "+printArray(expected));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect(String callString, E[] original, Iterable<E> i) {
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

  public static void reportPid() {
    try {
      String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
      BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
      bw.write(ids[0]);
      bw.close();
    } catch (Exception e) {
      System.out.println("Avisa al profesor de fallo sacando el PID");
    }
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public static <T> T[] toGenericArray(T ... elems) {
    return elems;
  }

  public static boolean ensureAedlibVersion(int major, int minor, int patchlevel) {
    boolean isOk = true;
    int aedlibMajor = 0, aedlibMinor = 0, aedlibPatchlevel = 0;
    
    try {
      Class<?> aedlibVersion = Class.forName("es.upm.aedlib.Version");
      Method majorMethod = aedlibVersion.getDeclaredMethod("major");
      Method minorMethod = aedlibVersion.getDeclaredMethod("minor");
      Method patchlevelMethod = aedlibVersion.getDeclaredMethod("patchlevel");

      aedlibMajor =
	(Integer) majorMethod.invoke(null);
      aedlibMinor = 
	(Integer) minorMethod.invoke(null);
      aedlibPatchlevel = 
	(Integer) patchlevelMethod.invoke(null);

      isOk =
	((aedlibMajor > major)
	 || ((aedlibMajor == major) &&
	     ((aedlibMinor > minor)
	      || ((aedlibMinor == minor) &&
		  (aedlibPatchlevel >= patchlevel)))));
    } catch (Throwable exc) {
      System.out.println
	("*** WARNING: cannot check aedlib version number due to "+exc);
      exc.printStackTrace();
    }

    if (!isOk) {
      throw new RuntimeException
	("*** ERROR: aedlib is too old. Minimum version needed is "+
	 major+"."+minor+"."+patchlevel+"; your version is "+
	 aedlibMajor+"."+aedlibMinor+"."+aedlibPatchlevel+
	 ". Please download a new version of aedlib from moodle\n");
    } else return true; 	      
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
      TestData.message("*** Internal model error: calling getException() without exception");
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
      TestData.message("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      TestUtils.printCallException(exc);
      TestData.message("\n");
      throw new RuntimeException();
    }
  }

  public String toString() {
    if (isException())
      return getCall() + "  =>  " + getException();
    else
      return getCall() + "  =>  " + TesterCode.printer(getValue());      
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
  boolean voidReturn = false;

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

    if (result.isException() || !voidReturn)
      TestData.modifyLastCallInTrace(TesterCode.printer(result));
    return result;
  }

  abstract E call() throws Exception;

  boolean hasCalled() {
    return hasCalled;
  }

  boolean noException() {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }

    return true;
  }

  boolean throwsException(String expectedName) {
    if (!result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown an exception "+expectedName+
         " but did not.");
      return false;
    }

    Throwable exception = result.getException();
    if (!expectedName.equals(exception.getClass().getCanonicalName())) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown the exception "+
         expectedName+
         ", but throwed the exception "+exception+"\n"+
         TestUtils.getStackTrace(exception));
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
         "\nchanged an object parameter into\n  "+obj1+
         "\nwhich used to be\n  "+obj2+".\nIt should not have been changed.\n");
      return false;
    } else return true;
  }

  boolean unchanged_array(Object[] original, Object[] newer) {
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
      TestData.message("Cannot iterate over expected value "+expected);
      throw new RuntimeException();
    }
    Iterable<?> ev = (Iterable<?>) expected;

    E value = result.getValue();
    if (!(value instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over result value "+value);
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


static class Constructor extends TestCall<MultiSetList<String>,Void>
{
  
  public Constructor ()
  {
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("new constructor")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public MultiSetList<String> call () 
  {
    return new MultiSetList<String>() ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class Iterator extends TestCall<java.util.Iterator<String>,String[]>
{
  MultiSet<String> setId;
  
  public Iterator (MultiSet<String> setId)
  {
    this.setId = setId ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(setId)) ;
    output.append(new String(".iterator")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public java.util.Iterator<String> call () 
  {
    return setId.iterator() ;
  }
  
  public boolean checkResult (String[] expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!TestUtils.unorderedIteratorCorrect(this,result,expected))
      return false ;
    return true ;
  }
  
}


static class Add extends TestCall<Void,Void>
{
  MultiSet<String> setId;
  String elem;
  
  public Add (MultiSet<String> setId,String elem)
  {
    voidReturn = true ;
    this.setId = setId ;
    this.elem = elem ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(setId)) ;
    output.append(new String(".add")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(elem)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Void call () 
  {
    setId.add(elem) ;
    return null ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class Count extends TestCall<Integer,Integer>
{
  MultiSet<String> setId;
  String elem;
  
  public Count (MultiSet<String> setId,String elem)
  {
    this.setId = setId ;
    this.elem = elem ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(setId)) ;
    output.append(new String(".count")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(elem)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Integer call () 
  {
    return setId.count(elem) ;
  }
  
  public boolean checkResult (Integer expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Remove extends TestCall<Boolean,Boolean>
{
  MultiSet<String> setId;
  String elem;
  
  public Remove (MultiSet<String> setId,String elem)
  {
    this.setId = setId ;
    this.elem = elem ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(setId)) ;
    output.append(new String(".remove")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(elem)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Boolean call () 
  {
    return setId.remove(elem) ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Size extends TestCall<Integer,Integer>
{
  MultiSet<String> setId;
  
  public Size (MultiSet<String> setId)
  {
    this.setId = setId ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(setId)) ;
    output.append(new String(".size")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Integer call () 
  {
    return setId.size() ;
  }
  
  public boolean checkResult (Integer expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class IsEmpty extends TestCall<Boolean,Boolean>
{
  MultiSet<String> setId;
  
  public IsEmpty (MultiSet<String> setId)
  {
    this.setId = setId ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(setId)) ;
    output.append(new String(".isEmpty")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Boolean call () 
  {
    return setId.isEmpty() ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Sum extends TestCall<MultiSet<String>,Void>
{
  MultiSet<String> setId1;
  MultiSet<String> setId2;
  
  public Sum (MultiSet<String> setId1,MultiSet<String> setId2)
  {
    this.setId1 = setId1 ;
    this.setId2 = setId2 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(setId1)) ;
    output.append(new String(".sum")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(setId2)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public MultiSet<String> call () 
  {
    return setId1.sum(setId2) ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    return true ;
  }
  
}


static class AddN extends TestCall<Void,Void>
{
  MultiSet<String> setId;
  String elem;
  Integer n;
  
  public AddN (MultiSet<String> setId,String elem,Integer n)
  {
    voidReturn = true ;
    this.setId = setId ;
    this.elem = elem ;
    this.n = n ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(setId)) ;
    output.append(new String(".add")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(elem)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(n)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Void call () 
  {
    setId.add(elem,n) ;
    return null ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class RemoveN extends TestCall<Boolean,Boolean>
{
  MultiSet<String> setId;
  String elem;
  Integer n;
  
  public RemoveN (MultiSet<String> setId,String elem,Integer n)
  {
    this.setId = setId ;
    this.elem = elem ;
    this.n = n ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(setId)) ;
    output.append(new String(".remove")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(elem)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(n)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Boolean call () 
  {
    return setId.remove(elem,n) ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Intersection extends TestCall<MultiSet<String>,Void>
{
  MultiSet<String> setId1;
  MultiSet<String> setId2;
  
  public Intersection (MultiSet<String> setId1,MultiSet<String> setId2)
  {
    this.setId1 = setId1 ;
    this.setId2 = setId2 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(setId1)) ;
    output.append(new String(".intersection")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(setId2)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public MultiSet<String> call () 
  {
    return setId1.intersection(setId2) ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    return true ;
  }
  
}







public static class TestData {
  static String testName = "";
  static ArrayList<String> trace;
  static ArrayList<String> messages;
  static boolean isJunitTester;

  public static void initTrace() {
    trace = new ArrayList<String>();
    messages = new ArrayList<String>();
  }

  public static void setTesterType(boolean junitTesting) {
    isJunitTester = junitTesting;
  }

  public static boolean isJunitTester() {
    return isJunitTester;
  }

  public static void addCallToTrace(String callString) {
    trace.add("  "+callString);
  }

  public static void modifyLastCallInTrace(String callString) {
    if (trace.size() > 0) {
      trace.remove(trace.size()-1);
      trace.add("  "+callString);
    }
  }

  public static void message(String message) {
    messages.add(message);
  }

  public static int numCommands() {
    return trace.size();
  }

  private static String arrayToString(ArrayList<String> arr) {
    StringBuffer sb = new StringBuffer();

    for (int i=0; i<arr.size(); i++) {
      sb.append(arr.get(i)+"\n");
    }
    return sb.toString();
  }

  public static String getTrace() {
    return arrayToString(trace);
  }

  public static String getMessages() {
    return arrayToString(messages);
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
  static HashSet<String> runningTests;
  static int numTestsRemaining = 1000;
  static long endTime = 0;

  static void init() {
    results_sofar = new LinkedHashMap<String,Boolean>();
    runningTests = new HashSet<String>();
  }

  static void setNumTestsRemaining(int numTestsToRun, int GlobalTimeoutInSeconds) {
    numTestsRemaining = numTestsToRun;
    endTime = System.currentTimeMillis() + GlobalTimeoutInSeconds*1000;
  }

  static boolean isTimedout() {
    return System.currentTimeMillis() > endTime;
  }

  static void startTest(String testName) {
    runningTests.add(testName);
  }

  static void stopTest(String testName) {
    runningTests.remove(testName);
    --numTestsRemaining;
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
    if (results_sofar.size() == 0) {
      System.out.println("\n*** Error: no tests were run");
      return false;
    }

    if (runningTests.size() > 0) {
      System.out.println("\n*** Error: some tests ("+runningTests.size()+") are still running\n");
      return false;
    }

    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;

    if (numTestsRemaining > 0) {
      System.out.println("\n*** Error: some tests ("+numTestsRemaining+") did not run\n");
      return false;
    }

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


static class TesterCode
{
  
  public static void resetPrinter () 
  {
    MultiSetUtils.resetPrinter() ;
  }
  
  public static String printer (Object obj) 
  {
    return MultiSetUtils.printer(obj) ;
  }
  
}


}
