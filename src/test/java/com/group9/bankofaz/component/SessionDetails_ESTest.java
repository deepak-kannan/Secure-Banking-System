package com.group9.bankofaz.component;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.component.SessionDetails;
import org.junit.runner.RunWith;

public class SessionDetails_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      sessionDetails0.setUsername("/->#)uf~e");
      String string0 = sessionDetails0.getUsername();
      assertEquals("/->#)uf~e", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      sessionDetails0.setUsername("");
      String string0 = sessionDetails0.getUsername();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      sessionDetails0.setLastname("bK(");
      String string0 = sessionDetails0.getLastname();
      assertEquals("bK(", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      sessionDetails0.setLastname("");
      String string0 = sessionDetails0.getLastname();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      sessionDetails0.setFirstname("be@BrKFLSHzBT}");
      String string0 = sessionDetails0.getFirstname();
      assertEquals("be@BrKFLSHzBT}", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      sessionDetails0.setFailureAttempts(1);
      int int0 = sessionDetails0.getFailureAttempts();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      sessionDetails0.setFailureAttempts((-4187));
      int int0 = sessionDetails0.getFailureAttempts();
      assertEquals((-4187), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      sessionDetails0.setEnabled(2052);
      int int0 = sessionDetails0.getEnabled();
      assertEquals(2052, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      sessionDetails0.setEnabled((-1639));
      int int0 = sessionDetails0.getEnabled();
      assertEquals((-1639), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      sessionDetails0.setAnothersession(1478);
      int int0 = sessionDetails0.getAnothersession();
      assertEquals(1478, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      sessionDetails0.setAnothersession((-2269));
      int int0 = sessionDetails0.getAnothersession();
      assertEquals((-2269), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      sessionDetails0.setAccountSelected("");
      String string0 = sessionDetails0.getAccountSelected();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      String string0 = sessionDetails0.getLastname();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      String string0 = sessionDetails0.getAccountSelected();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      sessionDetails0.setAccountSelected("OAHWqi+k,FpJjT");
      String string0 = sessionDetails0.getAccountSelected();
      assertEquals("OAHWqi+k,FpJjT", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      int int0 = sessionDetails0.getFailureAttempts();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      String string0 = sessionDetails0.getFirstname();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      String string0 = sessionDetails0.getUsername();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      sessionDetails0.setFirstname("");
      String string0 = sessionDetails0.getFirstname();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      int int0 = sessionDetails0.getEnabled();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SessionDetails sessionDetails0 = new SessionDetails();
      int int0 = sessionDetails0.getAnothersession();
      assertEquals(0, int0);
  }
}
