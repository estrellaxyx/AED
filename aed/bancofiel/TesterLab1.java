
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
// File generated at: 2019/9/27 -- 0:14:44
// Seed: {1569,536081,440309}
//
//////////////////////////////////////////////////////////////////////



package aed.bancofiel;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.function.Function;



/**
 * The main tester class which contains JUnit5 tests.
 */
@SuppressWarnings({"unused","deprecation"})
public class TesterLab1 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    ResultsHandler.init() ;
    TestData.setTesterType(true) ;
  }
  
  @AfterAll
  public static void reportResults () 
  {
    ResultsHandler.report_results() ;
  }
  
  @Test
  public void test_01 () 
  {
    TestData.initTrace() ;
    TestData.testName = new String("test_01") ;
    boolean ok_sofar = true ;
    ResultsHandler.startTest(new String("test_01")) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_01")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_02 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
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
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_02")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_03 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("111"),0).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new BorrarCuenta(v_1,v_3).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] {  },new String[] {  },new Integer[] {  }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_03")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_04 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new BorrarCuenta(v_1,v_3).doCall().checkResult(new CuentaNoVaciaExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_04")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_05 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,new String("222")).doCall().checkResult(new CuentaNoExisteExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_05")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_06 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(0) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_06")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_07 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(150)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_07")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_08 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_08")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_09 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
      v_2 = new CrearCuenta(v_1,new String("1111111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("2222222"),1000).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(100),new Integer(1000) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_09")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_10 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new BorrarCuenta(v_1,v_3).doCall().checkResult(new CuentaNoVaciaExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new BorrarCuenta(v_1,v_3).doCall().checkResult(new CuentaNoVaciaExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_10")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_11 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new BorrarCuenta(v_1,v_3).doCall().checkResult(new CuentaNoVaciaExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_11")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_12 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("111"),20).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("111"),new String("111") },new Integer[] { new Integer(100),new Integer(20) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_5,new Integer(50)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("111"),new String("111") },new Integer[] { new Integer(50),new Integer(70) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_12")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_13 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("111"),20).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("111"),new String("111") },new Integer[] { new Integer(100),new Integer(20) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_5,new Integer(100)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("111"),new String("111") },new Integer[] { new Integer(0),new Integer(120) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_13")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_14 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("111"),20).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("111"),new String("111") },new Integer[] { new Integer(100),new Integer(20) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_5,new Integer(150)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("111"),new String("111") },new Integer[] { new Integer(100),new Integer(20) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_14")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_15 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_3,new Integer(50)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_15")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_16 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(0) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_16")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_17 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("1111111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("2222222"),100).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(100),new Integer(100) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_17")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_18 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("2222222"),0).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(0) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("2222222"),1000).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(1000) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_18")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_19 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(50)).doCall().checkResult(new Integer(150)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(150) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(150)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(150) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_19")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_20 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(50)).doCall().checkResult(new Integer(50)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(50) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(50)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(50) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_20")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_21 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("222"),100).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("111"),new String("222") },new Integer[] { new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("111")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_3 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("111"),new String("222") },new Integer[] { new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("222")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_5 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("111"),new String("222") },new Integer[] { new Integer(100),new Integer(100) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_21")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_22 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("1111111"),1000).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("1111111"),1000).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(1000),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_3,new Integer(760)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(1000),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(900)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(900),new Integer(1000) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_22")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_23 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("2222222"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_3 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(0)).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(100) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_23")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_24 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("222"),100).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("111"),new String("222") },new Integer[] { new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_5,new Integer(50)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("111"),new String("222") },new Integer[] { new Integer(50),new Integer(150) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(50)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("111"),new String("222") },new Integer[] { new Integer(50),new Integer(150) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(150)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("111"),new String("222") },new Integer[] { new Integer(50),new Integer(150) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_24")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_25 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
    TestResult<String,Void> v_6 = null ;
    String v_7 = null ;
    TestResult<String,Void> v_8 = null ;
    String v_9 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("111"),10).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(10) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("222"),1000).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("111"),new String("222") },new Integer[] { new Integer(10),new Integer(1000) }) ;
    if (ok_sofar)
    {
      v_6 = new CrearCuenta(v_1,new String("111"),100).doCall() ;
      ok_sofar = v_6.checkResult(null) ;
    }
    if (ok_sofar)
      v_7 = v_6.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("111"),new String("222"),new String("111") },new Integer[] { new Integer(10),new Integer(1000),new Integer(100) }) ;
    if (ok_sofar)
    {
      v_8 = new CrearCuenta(v_1,new String("222"),200).doCall() ;
      ok_sofar = v_8.checkResult(null) ;
    }
    if (ok_sofar)
      v_9 = v_8.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7,v_9 },new String[] { new String("111"),new String("222"),new String("111"),new String("222") },new Integer[] { new Integer(10),new Integer(1000),new Integer(100),new Integer(200) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_3 },new String[] { v_7 },new String[] { v_9 },new String[] { v_5 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7,v_9 },new String[] { new String("111"),new String("222"),new String("111"),new String("222") },new Integer[] { new Integer(10),new Integer(1000),new Integer(100),new Integer(200) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_25")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_26 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
    TestResult<String,Void> v_6 = null ;
    String v_7 = null ;
    TestResult<String,Void> v_8 = null ;
    String v_9 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("222"),100).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("111"),new String("222") },new Integer[] { new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
    {
      v_6 = new CrearCuenta(v_1,new String("111"),100).doCall() ;
      ok_sofar = v_6.checkResult(null) ;
    }
    if (ok_sofar)
      v_7 = v_6.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("111"),new String("222"),new String("111") },new Integer[] { new Integer(100),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
    {
      v_8 = new CrearCuenta(v_1,new String("222"),100).doCall() ;
      ok_sofar = v_8.checkResult(null) ;
    }
    if (ok_sofar)
      v_9 = v_8.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7,v_9 },new String[] { new String("111"),new String("222"),new String("111"),new String("222") },new Integer[] { new Integer(100),new Integer(100),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("111")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_3,v_7 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7,v_9 },new String[] { new String("111"),new String("222"),new String("111"),new String("222") },new Integer[] { new Integer(100),new Integer(100),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("222")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_5,v_9 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7,v_9 },new String[] { new String("111"),new String("222"),new String("111"),new String("222") },new Integer[] { new Integer(100),new Integer(100),new Integer(100),new Integer(100) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_26")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_27 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("1111111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(200)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(200) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(0)).doCall().checkResult(new Integer(200)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(200) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("2222222"),1000).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(200),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new GetSaldoCuentas(v_1,new String("1111111")).doCall().checkResult(new Integer(200)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(200),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,new String("xxxx_dineroB"),v_5,new Integer(756)).doCall().checkResult(new CuentaNoExisteExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(200),new Integer(1000) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_27")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_28 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
    TestResult<String,Void> v_6 = null ;
    String v_7 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("1111111"),1000).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("2222222"),0).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
    {
      v_6 = new CrearCuenta(v_1,new String("1111111"),100).doCall() ;
      ok_sofar = v_6.checkResult(null) ;
    }
    if (ok_sofar)
      v_7 = v_6.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(1000),new Integer(0),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(900)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(900),new Integer(0),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(900),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_7,v_5 },new String[] { v_3 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(900),new Integer(100),new Integer(100) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_28")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_29 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("1111111"),1000).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("2222222"),1000).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(1100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1100),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new GetSaldoCuentas(v_1,new String("1111111")).doCall().checkResult(new Integer(1100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1100),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1100),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_5,v_5,new Integer(530)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1100),new Integer(1000) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_29")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_30 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
    TestResult<String,Void> v_6 = null ;
    String v_7 = null ;
    TestResult<String,Void> v_8 = null ;
    String v_9 = null ;
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
      v_2 = new CrearCuenta(v_1,new String("111"),10).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(10) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("222"),1000).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("111"),new String("222") },new Integer[] { new Integer(10),new Integer(1000) }) ;
    if (ok_sofar)
    {
      v_6 = new CrearCuenta(v_1,new String("222"),100).doCall() ;
      ok_sofar = v_6.checkResult(null) ;
    }
    if (ok_sofar)
      v_7 = v_6.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("111"),new String("222"),new String("222") },new Integer[] { new Integer(10),new Integer(1000),new Integer(100) }) ;
    if (ok_sofar)
    {
      v_8 = new CrearCuenta(v_1,new String("222"),200).doCall() ;
      ok_sofar = v_8.checkResult(null) ;
    }
    if (ok_sofar)
      v_9 = v_8.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7,v_9 },new String[] { new String("111"),new String("222"),new String("222"),new String("222") },new Integer[] { new Integer(10),new Integer(1000),new Integer(100),new Integer(200) }) ;
    if (ok_sofar)
      ok_sofar = new GetSaldoCuentas(v_1,new String("222")).doCall().checkResult(new Integer(1300)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7,v_9 },new String[] { new String("111"),new String("222"),new String("222"),new String("222") },new Integer[] { new Integer(10),new Integer(1000),new Integer(100),new Integer(200) }) ;
    if (ok_sofar)
      ok_sofar = new GetSaldoCuentas(v_1,new String("111")).doCall().checkResult(new Integer(10)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7,v_9 },new String[] { new String("111"),new String("222"),new String("222"),new String("222") },new Integer[] { new Integer(10),new Integer(1000),new Integer(100),new Integer(200) }) ;
    if (ok_sofar)
      ok_sofar = new GetSaldoCuentas(v_1,new String("333")).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7,v_9 },new String[] { new String("111"),new String("222"),new String("222"),new String("222") },new Integer[] { new Integer(10),new Integer(1000),new Integer(100),new Integer(200) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_30")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_31 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
      v_2 = new CrearCuenta(v_1,new String("2222222"),1000).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("2222222"),1000).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(1000)).doCall().checkResult(new Integer(2000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(2000),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("2222222")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_3,v_5 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(2000),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(1000)).doCall().checkResult(new Integer(3000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(3000),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(1000)).doCall().checkResult(new Integer(4000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(4000),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new Integer(1100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(4000),new Integer(1100) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_31")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_32 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
      ok_sofar = new GetSaldoCuentas(v_1,new String("2222222")).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] {  },new String[] {  },new Integer[] {  }) ;
    if (ok_sofar)
    {
      v_2 = new CrearCuenta(v_1,new String("1111111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("1111111"),0).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(100),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(100),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("2222222")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] {  })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(0) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_32")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_33 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
    TestResult<String,Void> v_6 = null ;
    String v_7 = null ;
    TestResult<String,Void> v_8 = null ;
    String v_9 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("111"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("111"),150).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("111"),new String("111") },new Integer[] { new Integer(100),new Integer(150) }) ;
    if (ok_sofar)
    {
      v_6 = new CrearCuenta(v_1,new String("111"),50).doCall() ;
      ok_sofar = v_6.checkResult(null) ;
    }
    if (ok_sofar)
      v_7 = v_6.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("111"),new String("111"),new String("111") },new Integer[] { new Integer(100),new Integer(150),new Integer(50) }) ;
    if (ok_sofar)
    {
      v_8 = new CrearCuenta(v_1,new String("111"),200).doCall() ;
      ok_sofar = v_8.checkResult(null) ;
    }
    if (ok_sofar)
      v_9 = v_8.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7,v_9 },new String[] { new String("111"),new String("111"),new String("111"),new String("111") },new Integer[] { new Integer(100),new Integer(150),new Integer(50),new Integer(200) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(150)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7,v_9 },new String[] { new String("111"),new String("111"),new String("111"),new String("111") },new Integer[] { new Integer(100),new Integer(150),new Integer(50),new Integer(200) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_7).doCall().checkResult(new Integer(50)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7,v_9 },new String[] { new String("111"),new String("111"),new String("111"),new String("111") },new Integer[] { new Integer(100),new Integer(150),new Integer(50),new Integer(200) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7,v_9 },new String[] { new String("111"),new String("111"),new String("111"),new String("111") },new Integer[] { new Integer(100),new Integer(150),new Integer(50),new Integer(200) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_9).doCall().checkResult(new Integer(200)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7,v_9 },new String[] { new String("111"),new String("111"),new String("111"),new String("111") },new Integer[] { new Integer(100),new Integer(150),new Integer(50),new Integer(200) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_33")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_34 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
      v_2 = new CrearCuenta(v_1,new String("2222222"),1000).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(900)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(900) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(800)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(800) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("2222222"),0).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(800),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(800),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_5,new Integer(371)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(429),new Integer(471) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(471)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(429),new Integer(471) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(1000)).doCall().checkResult(new Integer(1429)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(1429),new Integer(471) }) ;
    if (ok_sofar)
      ok_sofar = new BorrarCuenta(v_1,v_5).doCall().checkResult(new CuentaNoVaciaExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(1429),new Integer(471) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_34")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_35 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
    TestResult<String,Void> v_6 = null ;
    String v_7 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("2222222"),0).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(0) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("2222222"),100).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(100) }) ;
    if (ok_sofar)
    {
      v_6 = new CrearCuenta(v_1,new String("1111111"),100).doCall() ;
      ok_sofar = v_6.checkResult(null) ;
    }
    if (ok_sofar)
      v_7 = v_6.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(0),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_5,v_3,new Integer(545)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(0),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,new String("xxxx_dineroB"),v_7,new Integer(701)).doCall().checkResult(new CuentaNoExisteExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(0),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(1000)).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(1000),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(0)).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(1000),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new GetSaldoCuentas(v_1,new String("2222222")).doCall().checkResult(new Integer(1100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(1000),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_7,v_5,new Integer(783)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(1000),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_7,new Integer(764)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(236),new Integer(100),new Integer(864) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("2222222")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_3,v_5 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(236),new Integer(100),new Integer(864) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_35")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_36 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("2222222"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("1111111"),0).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(100),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(100),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_5,new Integer(358)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(100),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_5 },new String[] { v_3 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(100),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(0)).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(100),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(0),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(0),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_3,new Integer(320)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(0),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("1111111")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_5 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(0),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(0),new Integer(0) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_36")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_37 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
    TestResult<String,Void> v_6 = null ;
    String v_7 = null ;
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
      ok_sofar = new GetSaldoCuentas(v_1,new String("1111111")).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] {  },new String[] {  },new Integer[] {  }) ;
    if (ok_sofar)
    {
      v_2 = new CrearCuenta(v_1,new String("2222222"),0).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,new String("xxxx_dineroB")).doCall().checkResult(new CuentaNoExisteExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("1111111")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] {  })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(0) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("2222222"),1000).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(1000) }) ;
    if (ok_sofar)
    {
      v_6 = new CrearCuenta(v_1,new String("2222222"),0).doCall() ;
      ok_sofar = v_6.checkResult(null) ;
    }
    if (ok_sofar)
      v_7 = v_6.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_7,v_3 },new String[] { v_5 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new BorrarCuenta(v_1,v_5).doCall().checkResult(new CuentaNoVaciaExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_7,v_3,new Integer(612)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_7,v_7,new Integer(58)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(1000),new Integer(0) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_37")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_38 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("1111111"),1000).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("2222222"),0).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_5,v_5,new Integer(534)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(0)).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_5,v_5,new Integer(350)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_5,v_3,new Integer(317)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_5 },new String[] { v_3 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(1000)).doCall().checkResult(new Integer(2000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(2000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(1000)).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(2000),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(2000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(2000),new Integer(1000) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_38")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_39 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("1111111"),1000).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("1111111")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_3 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("2222222"),1000).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_5,v_3,new Integer(905)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1905),new Integer(95) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_5,new Integer(519)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1386),new Integer(614) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(0)).doCall().checkResult(new Integer(614)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1386),new Integer(614) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new Integer(514)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1386),new Integer(514) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new Integer(414)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1386),new Integer(414) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(414)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1386),new Integer(414) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(414)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1386),new Integer(414) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("1111111")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_3 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1386),new Integer(414) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new Integer(314)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1386),new Integer(314) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_39")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_40 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("1111111"),1000).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(1100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(1100) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("1111111"),100).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(1100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(1100),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_5 },new String[] { v_3 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(1100),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_3,new Integer(380)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(1100),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(1200)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(1200),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(0)).doCall().checkResult(new Integer(1200)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(1200),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(1200),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_5,v_3,new Integer(988)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(1200),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(1000)).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(1200),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_5,v_5,new Integer(999)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(1200),new Integer(1000) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_40")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_41 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("2222222"),0).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(1000)).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(1100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(1100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("1111111")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] {  })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("2222222")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_3 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("1111111"),100).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(1000),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(900)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(900),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(900)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(900),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(900),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("1111111")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_5 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(900),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_5,v_5,new Integer(511)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(900),new Integer(0) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_41")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_42 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("2222222"),1000).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("1111111"),1000).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(1000),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_5,new Integer(819)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(181),new Integer(1819) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_3 },new String[] { v_5 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(181),new Integer(1819) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_3 },new String[] { v_5 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(181),new Integer(1819) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(181)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(181),new Integer(1819) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("2222222")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_3 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(181),new Integer(1819) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(181)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(181),new Integer(1819) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_5,new Integer(445)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(181),new Integer(1819) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new Integer(1919)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(181),new Integer(1919) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(1919)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(181),new Integer(1919) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(81)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(81),new Integer(1919) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_42")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_43 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
    TestResult<String,Void> v_6 = null ;
    String v_7 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("2222222"),1000).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(0)).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new BorrarCuenta(v_1,v_3).doCall().checkResult(new CuentaNoVaciaExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("2222222"),0).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_5,v_5,new Integer(788)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(1000)).doCall().checkResult(new Integer(2000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(2000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(0)).doCall().checkResult(new Integer(2000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(2000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_5,v_5,new Integer(415)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(2000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(2000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(2000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(2000),new Integer(0) }) ;
    if (ok_sofar)
    {
      v_6 = new CrearCuenta(v_1,new String("1111111"),0).doCall() ;
      ok_sofar = v_6.checkResult(null) ;
    }
    if (ok_sofar)
      v_7 = v_6.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(2000),new Integer(0),new Integer(0) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_43")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_44 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
    TestResult<String,Void> v_6 = null ;
    String v_7 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("2222222"),1000).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(900)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(900) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(900)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(900) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("2222222"),100).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(900),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("1111111")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] {  })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(900),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_3,new Integer(498)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(900),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_3,new Integer(232)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(900),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_5 },new String[] { v_3 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(900),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(800)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(800),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(800),new Integer(0) }) ;
    if (ok_sofar)
    {
      v_6 = new CrearCuenta(v_1,new String("2222222"),100).doCall() ;
      ok_sofar = v_6.checkResult(null) ;
    }
    if (ok_sofar)
      v_7 = v_6.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(800),new Integer(0),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_7,new Integer(722)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(78),new Integer(0),new Integer(822) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_44")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_45 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("1111111"),1000).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("1111111"),100).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(1000),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(0)).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(1000),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(1000),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("2222222")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] {  })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_5,new Integer(377)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(623),new Integer(377) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_3,new Integer(486)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(623),new Integer(377) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("2222222")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] {  })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(623),new Integer(377) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_5 },new String[] { v_3 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(623),new Integer(377) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(523)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(523),new Integer(377) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("2222222")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] {  })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(523),new Integer(377) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(523)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(523),new Integer(377) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new Integer(477)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(523),new Integer(477) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_45")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_46 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
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
      v_2 = new CrearCuenta(v_1,new String("1111111"),1000).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("2222222"),1000).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_5,v_3,new Integer(403)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1403),new Integer(597) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new Integer(497)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1403),new Integer(497) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("1111111")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_3 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1403),new Integer(497) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(1000)).doCall().checkResult(new Integer(1497)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1403),new Integer(1497) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_5,new Integer(900)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(503),new Integer(2397) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(2397)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(503),new Integer(2397) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(503)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(503),new Integer(2397) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_3,new Integer(751)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(503),new Integer(2397) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(603)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(603),new Integer(2397) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_3,new Integer(503)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(603),new Integer(2397) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(503)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(503),new Integer(2397) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(2397)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(503),new Integer(2397) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new Integer(2497)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(503),new Integer(2497) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new Integer(2397)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(503),new Integer(2397) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(403)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(403),new Integer(2397) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_46")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_47 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
    TestResult<String,Void> v_6 = null ;
    String v_7 = null ;
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
      v_2 = new CrearCuenta(v_1,new String("1111111"),0).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,new String("xxxx_dineroB"),new Integer(100)).doCall().checkResult(new CuentaNoExisteExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(0) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("1111111"),1000).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000) }) ;
    if (ok_sofar)
    {
      v_6 = new CrearCuenta(v_1,new String("1111111"),100).doCall() ;
      ok_sofar = v_6.checkResult(null) ;
    }
    if (ok_sofar)
      v_7 = v_6.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_3 },new String[] { v_7 },new String[] { v_5 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_7,new Integer(100)).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_7,new Integer(100)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_3,new Integer(698)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_7,new Integer(100)).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_7).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_5,new Integer(442)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_5,new Integer(331)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new Integer(900)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(900),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(900)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(900),new Integer(100) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_47")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_48 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
    TestResult<String,Void> v_6 = null ;
    String v_7 = null ;
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
      v_2 = new CrearCuenta(v_1,new String("2222222"),0).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(0) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("1111111"),100).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(0),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_5,new Integer(499)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(0),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_5,new Integer(816)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(0),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(0),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,new String("xxxx_dineroB"),new Integer(0)).doCall().checkResult(new CuentaNoExisteExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(0),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_5,v_3,new Integer(890)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("1111111") },new Integer[] { new Integer(0),new Integer(100) }) ;
    if (ok_sofar)
    {
      v_6 = new CrearCuenta(v_1,new String("2222222"),0).doCall() ;
      ok_sofar = v_6.checkResult(null) ;
    }
    if (ok_sofar)
      v_7 = v_6.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("1111111"),new String("2222222") },new Integer[] { new Integer(0),new Integer(100),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_7,new Integer(100)).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("1111111"),new String("2222222") },new Integer[] { new Integer(0),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(0)).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("1111111"),new String("2222222") },new Integer[] { new Integer(0),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_7,v_7,new Integer(78)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("1111111"),new String("2222222") },new Integer[] { new Integer(0),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new GetSaldoCuentas(v_1,new String("2222222")).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("1111111"),new String("2222222") },new Integer[] { new Integer(0),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("1111111"),new String("2222222") },new Integer[] { new Integer(0),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("1111111"),new String("2222222") },new Integer[] { new Integer(0),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("1111111"),new String("2222222") },new Integer[] { new Integer(0),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("2222222")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_3,v_7 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("1111111"),new String("2222222") },new Integer[] { new Integer(0),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_7,new Integer(0)).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("1111111"),new String("2222222") },new Integer[] { new Integer(0),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_7).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("1111111"),new String("2222222") },new Integer[] { new Integer(0),new Integer(100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(1000)).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("1111111"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(100),new Integer(100) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_48")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_49 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
    TestResult<String,Void> v_6 = null ;
    String v_7 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("1111111"),0).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(1000)).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(1000) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("2222222"),1000).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(1000) }) ;
    if (ok_sofar)
    {
      v_6 = new CrearCuenta(v_1,new String("2222222"),0).doCall() ;
      ok_sofar = v_6.checkResult(null) ;
    }
    if (ok_sofar)
      v_7 = v_6.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(1000),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_5,v_7,new Integer(378)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(622),new Integer(378) }) ;
    if (ok_sofar)
      ok_sofar = new GetSaldoCuentas(v_1,new String("1111111")).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(622),new Integer(378) }) ;
    if (ok_sofar)
      ok_sofar = new GetSaldoCuentas(v_1,new String("2222222")).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(622),new Integer(378) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(622)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(622),new Integer(378) }) ;
    if (ok_sofar)
      ok_sofar = new GetSaldoCuentas(v_1,new String("2222222")).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(1000),new Integer(622),new Integer(378) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(900)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(900),new Integer(622),new Integer(378) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_7 },new String[] { v_5 },new String[] { v_3 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(900),new Integer(622),new Integer(378) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,new String("xxxx_dineroB"),new Integer(100)).doCall().checkResult(new CuentaNoExisteExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(900),new Integer(622),new Integer(378) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("1111111")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_3 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(900),new Integer(622),new Integer(378) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(800)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(800),new Integer(622),new Integer(378) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("2222222")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_5,v_7 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(800),new Integer(622),new Integer(378) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_7 },new String[] { v_5 },new String[] { v_3 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(800),new Integer(622),new Integer(378) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(1000)).doCall().checkResult(new Integer(1800)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(1800),new Integer(622),new Integer(378) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_7,new Integer(980)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(820),new Integer(622),new Integer(1358) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_5,new Integer(665)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(155),new Integer(1287),new Integer(1358) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("2222222")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_5,v_7 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(155),new Integer(1287),new Integer(1358) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("2222222")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_5,v_7 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(155),new Integer(1287),new Integer(1358) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_3 },new String[] { v_5 },new String[] { v_7 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(155),new Integer(1287),new Integer(1358) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("1111111")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_3 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(155),new Integer(1287),new Integer(1358) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(1000)).doCall().checkResult(new Integer(1155)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("2222222"),new String("2222222") },new Integer[] { new Integer(1155),new Integer(1287),new Integer(1358) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_49")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_50 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
    TestResult<String,Void> v_6 = null ;
    String v_7 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("1111111"),0).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("1111111") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("1111111"),1000).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(100),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_5,new Integer(550)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(100),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_3,new Integer(222)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_3 },new String[] { v_5 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_3 },new String[] { v_5 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_3 },new String[] { v_5 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_5).doCall().checkResult(new Integer(1000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_3,new Integer(301)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_3 },new String[] { v_5 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1000) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new Integer(900)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(900) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(1000)).doCall().checkResult(new Integer(1900)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(1900) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(1000)).doCall().checkResult(new Integer(2900)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(2900) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(0)).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(2900) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(2900) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(100),new Integer(2900) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(100)).doCall().checkResult(new Integer(3000)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(100),new Integer(3000) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(3000) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_3 },new String[] { v_5 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(3000) }) ;
    if (ok_sofar)
    {
      v_6 = new CrearCuenta(v_1,new String("1111111"),100).doCall() ;
      ok_sofar = v_6.checkResult(null) ;
    }
    if (ok_sofar)
      v_7 = v_6.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(3000),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_3 },new String[] { v_7 },new String[] { v_5 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(3000),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_3,new Integer(738)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("1111111"),new String("1111111"),new String("1111111") },new Integer[] { new Integer(0),new Integer(3000),new Integer(100) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_50")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  
  @Test
  public void test_51 () 
  {
    TestResult<BancoFiel,Void> v_0 = null ;
    BancoFiel v_1 = null ;
    TestResult<String,Void> v_2 = null ;
    String v_3 = null ;
    TestResult<String,Void> v_4 = null ;
    String v_5 = null ;
    TestResult<String,Void> v_6 = null ;
    String v_7 = null ;
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
    {
      v_2 = new CrearCuenta(v_1,new String("2222222"),100).doCall() ;
      ok_sofar = v_2.checkResult(null) ;
    }
    if (ok_sofar)
      v_3 = v_2.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3 },new String[] { new String("2222222") },new Integer[] { new Integer(0) }) ;
    if (ok_sofar)
    {
      v_4 = new CrearCuenta(v_1,new String("2222222"),100).doCall() ;
      ok_sofar = v_4.checkResult(null) ;
    }
    if (ok_sofar)
      v_5 = v_4.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_3,new Integer(0)).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(1000)).doCall().checkResult(new Integer(1100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(1100) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(0)).doCall().checkResult(new Integer(1100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(1100) }) ;
    if (ok_sofar)
      ok_sofar = new GetCuentasOrdenadas(v_1).doCall().checkResult(new String[][] { new String[] { v_3 },new String[] { v_5 } }) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(1100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(1100) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("2222222")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_3,v_5 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(1100) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(1000)).doCall().checkResult(new Integer(2100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(2100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(2100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(2100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(2100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_5,v_5,new Integer(402)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(2100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5 },new String[] { new String("2222222"),new String("2222222") },new Integer[] { new Integer(0),new Integer(2100) }) ;
    if (ok_sofar)
    {
      v_6 = new CrearCuenta(v_1,new String("1111111"),100).doCall() ;
      ok_sofar = v_6.checkResult(null) ;
    }
    if (ok_sofar)
      v_7 = v_6.getValue() ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(0),new Integer(2100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new GetSaldoCuentas(v_1,new String("1111111")).doCall().checkResult(new Integer(100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(0),new Integer(2100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(0),new Integer(2100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(0),new Integer(2100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("2222222")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_3,v_5 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(0),new Integer(2100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new IngresarDinero(v_1,v_5,new Integer(0)).doCall().checkResult(new Integer(2100)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(0),new Integer(2100),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_5,v_3,new Integer(248)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(248),new Integer(1852),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_5,new Integer(763)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(248),new Integer(1852),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_7,v_5,new Integer(612)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(248),new Integer(1852),new Integer(100) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_7,new Integer(100)).doCall().checkResult(new Integer(0)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(248),new Integer(1852),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_3,new Integer(100)).doCall().checkResult(new Integer(148)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(148),new Integer(1852),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new HacerTransferencia(v_1,v_3,v_5,new Integer(70)).doCall().checkResult(null) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(78),new Integer(1922),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new RetirarDinero(v_1,v_7,new Integer(100)).doCall().checkResult(new InsuficienteSaldoExc()) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(78),new Integer(1922),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new GetIdCuentas(v_1,new String("1111111")).doCall().checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<String>(new String[] { v_7 })) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(78),new Integer(1922),new Integer(0) }) ;
    if (ok_sofar)
      ok_sofar = new ConsultarSaldo(v_1,v_3).doCall().checkResult(new Integer(78)) ;
    if (ok_sofar)
      ok_sofar = BancoUtils.cuentasListOk(v_1,new String[] { v_3,v_5,v_7 },new String[] { new String("2222222"),new String("2222222"),new String("1111111") },new Integer[] { new Integer(78),new Integer(1922),new Integer(0) }) ;
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_51")) ;
    ResultsHandler.add_result(new String("asignatura"),ok_sofar) ;
    System.out.println(messages) ;
    if (!ok_sofar)
      Assertions.assertTrue(ok_sofar,messages) ;
  }
  


static class Tests {
  static String tester = "TesterLab1";
}
static class IntCuenta implements Comparable<IntCuenta> {
  String id;
  String dni;
  int saldo;
  
  IntCuenta(String id, String dni, int saldo) {
    this.id = id;
    this.dni = dni;
    this.saldo = saldo;
  }

  public int compareTo(IntCuenta otherCuenta) {
    return id.compareTo(otherCuenta.id);
  }

  public String toString() {
    return "Cuenta(\""+id+"\",\""+dni+"\","+saldo+")";
  }

  public boolean equals(Object obj) {
    if (obj instanceof IntCuenta) {
      IntCuenta otherCuenta = (IntCuenta) obj;
      return id.equals(otherCuenta.id)
        && dni.equals(otherCuenta.dni)
        && saldo == otherCuenta.saldo;
    } else return false;
  }

  public int hashCode() {
    if (id == null)
      return 0;
    else
      return id.hashCode();
  }
}


static class BancoUtils {
  public static String toStringUtil(String className, String opName) {
    return "banco = new Banco()";
  }

  public static IndexedList<Cuenta> execOrdenarCuentas(BancoFiel banco) {
    return banco.getCuentasOrdenadas(new ComparadorSaldo());
  }

  public static boolean cuentasListOk(BancoFiel banco,
                                      String[] ids,
                                      String[] dnis,
                                      Integer[] saldos) {
    if (banco.cuentas == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.AFTER,
         "the list of cuentas is incorrect.\n"+
         "\nThe new value is NULL!");
      return false;
    }

    ArrayList<IntCuenta> cuentas = new ArrayList<IntCuenta>();
    ArrayList<IntCuenta> expected = new ArrayList<IntCuenta>();

    for (int i=0; i<banco.cuentas.size(); i++) {
      Cuenta cuenta = banco.cuentas.get(i);
      if (cuenta == null) {
        TestUtils.printError
          (TestUtils.ExecutionTime.AFTER,
           "the list of cuentas is incorrect.\n"+
           "\nThe new value is "+banco.cuentas+
           "; it contains NULL elements which it should not.");
        return false;
      }
      cuentas.add(new IntCuenta(cuenta.getId(),cuenta.getDNI(),cuenta.getSaldo()));
    }

    for (int i=0; i<ids.length; i++)
      expected.add(new IntCuenta(ids[i],dnis[i],saldos[i]));

    if (!TestUtils.sameElements(expected,cuentas)) {
        TestUtils.printError
          (TestUtils.ExecutionTime.AFTER,
           "the list of cuentas is incorrect.\n"+
           "\nThe new value is "+cuentas+
           "\nbut it should contain the elements "+
           expected);
        return false;
    }
    return true;
  }

  public static boolean
    checkOrdenarCuentas(TestCall<IndexedList<Cuenta>,String[][]> call,
                        TestResult<IndexedList<Cuenta>,String[][]> result,
                        String[][] expected) {
    if (call.noException() && call.nonNull()) {
      IndexedList<Cuenta> resultValue = result.getValue();
      IndexedList<String> results = new ArrayIndexedList<String>();
      IndexedList<IndexedList<String>> expectedList = new ArrayIndexedList<IndexedList<String>>();
      for (int i=0; i<expected.length; i++) {
        String[] item = expected[i];
        IndexedList<String> itemList = new ArrayIndexedList<String>();
        for (int j=0; j<item.length; j++)
          itemList.add(0,expected[i][j]);
        expectedList.add(expectedList.size(),itemList);
      }
      for (int i=0; i<resultValue.size(); i++) {
        Cuenta cuenta = resultValue.get(i);
        String id = null;
        if (cuenta != null) id = cuenta.getId();
        results.add(results.size(),id);
      }
      return TestUtils.wellSorted(call, results, expectedList);
    } else return false;
  }
}





















static class TestUtils {
  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String printer(Object obj, Function<Object,String> custom) {
    if (obj instanceof String)
      return("\""+obj.toString()+"\"");
    else if (obj == null)
      return "null";
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
	  TestData.message("the exception "+exc+" was raised although it "+
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
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<E,F> call,
                    TestResult<E,F> result,
                    F expected) {
    return sameSet(call,result.getValue(),expected);
  }

  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<E,F> call, E value, F expected) {
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

  // Checks that results, which may not be an exception nor null
  // (needs prior checks), which are iterables, return the same
  // elements, regardless of the order.
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameElements(TestCall<E,F> call,
                         TestResult<E,F> result,
                         F expected) {
    return sameElements(call,result.getValue(),expected);
  }

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

  static <E> boolean wellSorted(TestCall<?,?> call,
                                IndexedList<E> value,
                                IndexedList<IndexedList<E>> expected) {
    int i = 0;
    IndexedList<E> eqClass = null;
    for (E e : value) {
      if (eqClass == null) {
        if (i < expected.size())
          eqClass = expected.get(i);
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
         exc+"\n"+getStackTrace(exc));
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
      TestData.message("\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      exc.printStackTrace();
      TestData.message("\n");
      throw new RuntimeException();
    }
  }

  public String toString() {
    if (isException())
      return getCall() + "  =>  " + getException();
    else
      return getCall() + "  =>  " + TestUtils.printer(getValue(),null);      
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
      TestData.modifyLastCallInTrace(TestUtils.printer(result,null));
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


static class CrearCuenta extends TestCall<String,Void>
{
  BancoFiel banco;
  String dNI;
  int saldoInicial;
  
  public CrearCuenta (BancoFiel banco,String dNI,int saldoInicial)
  {
    this.banco = banco ;
    this.dNI = dNI ;
    this.saldoInicial = saldoInicial ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(banco.toString()) ;
    output.append(new String(".crearCuenta")) ;
    output.append(new String("(")) ;
    output.append(TestUtils.printer(dNI,null)) ;
    output.append(new String(", ")) ;
    output.append(TestUtils.printer(saldoInicial,null)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public String call () 
  {
    return banco.crearCuenta(dNI,saldoInicial) ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class BorrarCuenta extends TestCall<Void,Throwable>
{
  BancoFiel banco;
  String idCuenta;
  
  public BorrarCuenta (BancoFiel banco,String idCuenta)
  {
    voidReturn = true ;
    this.banco = banco ;
    this.idCuenta = idCuenta ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(banco.toString()) ;
    output.append(new String(".borrarCuenta")) ;
    output.append(new String("(")) ;
    output.append(TestUtils.printer(idCuenta,null)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Void call () throws Exception
  {
    banco.borrarCuenta(idCuenta) ;
    return null ;
  }
  
  public boolean checkResult (Throwable expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class HacerTransferencia extends TestCall<Void,Throwable>
{
  BancoFiel banco;
  String idFrom;
  String idTo;
  Integer cantidad;
  
  public HacerTransferencia (BancoFiel banco,String idFrom,String idTo,Integer cantidad)
  {
    voidReturn = true ;
    this.banco = banco ;
    this.idFrom = idFrom ;
    this.idTo = idTo ;
    this.cantidad = cantidad ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(banco.toString()) ;
    output.append(new String(".hacerTransferencia")) ;
    output.append(new String("(")) ;
    output.append(TestUtils.printer(idFrom,null)) ;
    output.append(new String(", ")) ;
    output.append(TestUtils.printer(idTo,null)) ;
    output.append(new String(", ")) ;
    output.append(TestUtils.printer(cantidad,null)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Void call () throws Exception
  {
    banco.hacerTransferencia(idFrom,idTo,cantidad) ;
    return null ;
  }
  
  public boolean checkResult (Throwable expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class Constructor extends TestCall<BancoFiel,Void>
{
  
  public Constructor ()
  {
  }
  
  public String toString () 
  {
    return BancoUtils.toStringUtil(new String("BancoFiel"),new String("constructor")) ;
  }
  
  public BancoFiel call () 
  {
    return new BancoFiel() ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class GetIdCuentas extends TestCall<es.upm.aedlib.indexedlist.IndexedList<String>,es.upm.aedlib.indexedlist.ArrayIndexedList<String>>
{
  BancoFiel banco;
  String dNI;
  
  public GetIdCuentas (BancoFiel banco,String dNI)
  {
    this.banco = banco ;
    this.dNI = dNI ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(banco.toString()) ;
    output.append(new String(".getIdCuentas")) ;
    output.append(new String("(")) ;
    output.append(TestUtils.printer(dNI,null)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public es.upm.aedlib.indexedlist.IndexedList<String> call () 
  {
    return banco.getIdCuentas(dNI) ;
  }
  
  public boolean checkResult (es.upm.aedlib.indexedlist.ArrayIndexedList<String> expected) 
  {
    return TestUtils.sameElements(this,result,expected) ;
  }
  
}


static class GetCuentasOrdenadas extends TestCall<es.upm.aedlib.indexedlist.IndexedList<Cuenta>,String[][]>
{
  BancoFiel banco;
  
  public GetCuentasOrdenadas (BancoFiel banco)
  {
    this.banco = banco ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(banco.toString()) ;
    output.append(new String(".getCuentasOrdenadas")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public es.upm.aedlib.indexedlist.IndexedList<Cuenta> call () 
  {
    return BancoUtils.execOrdenarCuentas(banco) ;
  }
  
  public boolean checkResult (String[][] expected) 
  {
    return BancoUtils.checkOrdenarCuentas(this,result,expected) ;
  }
  
}


static class GetSaldoCuentas extends TestCall<Integer,Integer>
{
  BancoFiel banco;
  String dNI;
  
  public GetSaldoCuentas (BancoFiel banco,String dNI)
  {
    this.banco = banco ;
    this.dNI = dNI ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(banco.toString()) ;
    output.append(new String(".getSaldoCuentas")) ;
    output.append(new String("(")) ;
    output.append(TestUtils.printer(dNI,null)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Integer call () 
  {
    return banco.getSaldoCuentas(dNI) ;
  }
  
  public boolean checkResult (Integer expected) 
  {
    if (!noException())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class ConsultarSaldo extends TestCall<Integer,Object>
{
  BancoFiel banco;
  String idCuenta;
  
  public ConsultarSaldo (BancoFiel banco,String idCuenta)
  {
    this.banco = banco ;
    this.idCuenta = idCuenta ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(banco.toString()) ;
    output.append(new String(".consultarSaldo")) ;
    output.append(new String("(")) ;
    output.append(TestUtils.printer(idCuenta,null)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Integer call () throws CuentaNoExisteExc
  {
    return banco.consultarSaldo(idCuenta) ;
  }
  
  public boolean checkResult (Object expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class RetirarDinero extends TestCall<Integer,Object>
{
  BancoFiel banco;
  String idCuenta;
  Integer cantidad;
  
  public RetirarDinero (BancoFiel banco,String idCuenta,Integer cantidad)
  {
    this.banco = banco ;
    this.idCuenta = idCuenta ;
    this.cantidad = cantidad ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(banco.toString()) ;
    output.append(new String(".retirarDinero")) ;
    output.append(new String("(")) ;
    output.append(TestUtils.printer(idCuenta,null)) ;
    output.append(new String(", ")) ;
    output.append(TestUtils.printer(cantidad,null)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Integer call () throws Exception
  {
    return banco.retirarDinero(idCuenta,cantidad) ;
  }
  
  public boolean checkResult (Object expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class IngresarDinero extends TestCall<Integer,Object>
{
  BancoFiel banco;
  String idCuenta;
  Integer cantidad;
  
  public IngresarDinero (BancoFiel banco,String idCuenta,Integer cantidad)
  {
    this.banco = banco ;
    this.idCuenta = idCuenta ;
    this.cantidad = cantidad ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(banco.toString()) ;
    output.append(new String(".ingresarDinero")) ;
    output.append(new String("(")) ;
    output.append(TestUtils.printer(idCuenta,null)) ;
    output.append(new String(", ")) ;
    output.append(TestUtils.printer(cantidad,null)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Integer call () throws Exception
  {
    return banco.ingresarDinero(idCuenta,cantidad) ;
  }
  
  public boolean checkResult (Object expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    if (!valuesMatch(expected))
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

  static void init() {
    results_sofar = new LinkedHashMap<String,Boolean>();
    runningTests = new HashSet<String>();
  }

  static void startTest(String testName) {
    runningTests.add(testName);
  }

  static void stopTest(String testName) {
    runningTests.remove(testName);
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
    if (results_sofar.size() == 0)
      return false;

    if (runningTests.size() > 0)
      return false;

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
