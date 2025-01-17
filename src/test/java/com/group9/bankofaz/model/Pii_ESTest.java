package com.group9.bankofaz.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.model.Pii;
import org.junit.runner.RunWith;

public class Pii_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Pii pii0 = new Pii();
      pii0.setVisastatus("-4");
      String string0 = pii0.getVisastatus();
      assertEquals("-4", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Pii pii0 = new Pii();
      pii0.setVisastatus("");
      String string0 = pii0.getVisastatus();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Pii pii0 = new Pii();
      pii0.setSsn("-4");
      String string0 = pii0.getSsn();
      assertEquals("-4", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Pii pii0 = new Pii();
      pii0.setSsn("");
      String string0 = pii0.getSsn();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Pii pii0 = new Pii();
      pii0.setSsn("0");
      Long long0 = pii0.getId();
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Pii pii0 = new Pii();
      pii0.setSsn("9");
      Long long0 = pii0.getId();
      assertEquals(9L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Pii pii0 = new Pii();
      pii0.setSsn("-4");
      Long long0 = pii0.getId();
      assertEquals((-4L), (long)long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Pii pii0 = new Pii();
      String string0 = pii0.getSsn();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Pii pii0 = new Pii();
      String string0 = pii0.getVisastatus();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Pii pii0 = new Pii();
      String string0 = pii0.getLogDetail();
      assertEquals(" pii  ssn :null visastatus :null", string0);
  }
}
