package com.group9.bankofaz.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.model.GovAgency;
import org.junit.runner.RunWith;

public class GovAgency_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GovAgency govAgency0 = new GovAgency();
      govAgency0.setUsername("");
      String string0 = govAgency0.getUsername();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GovAgency govAgency0 = new GovAgency();
      govAgency0.setPasswd("");
      String string0 = govAgency0.getPasswd();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GovAgency govAgency0 = new GovAgency();
      govAgency0.setUsername("3");
      Long long0 = govAgency0.getId();
      assertEquals(3L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GovAgency govAgency0 = new GovAgency();
      String string0 = govAgency0.getPasswd();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GovAgency govAgency0 = new GovAgency();
      govAgency0.setUsername(" govagency  username :null passwd :null");
      String string0 = govAgency0.getUsername();
      assertEquals(" govagency  username :null passwd :null", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GovAgency govAgency0 = new GovAgency();
      govAgency0.setPasswd(" govagency  username :null passwd :null");
      String string0 = govAgency0.getPasswd();
      assertEquals(" govagency  username :null passwd :null", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GovAgency govAgency0 = new GovAgency();
      String string0 = govAgency0.getLogDetail();
      assertEquals(" govagency  username :null passwd :null", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      GovAgency govAgency0 = new GovAgency();
      String string0 = govAgency0.getUsername();
      assertNull(string0);
  }
}
