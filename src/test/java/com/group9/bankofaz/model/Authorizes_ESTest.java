package com.group9.bankofaz.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.model.Authorizes;
import com.group9.bankofaz.model.ExternalUser;
import com.group9.bankofaz.model.InternalUser;
import com.group9.bankofaz.model.Transaction;
import java.util.Date;
import org.junit.runner.RunWith;

public class Authorizes_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Authorizes authorizes0 = new Authorizes();
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setUserid(2241);
      authorizes0.setUserid(externalUser0);
      ExternalUser externalUser1 = authorizes0.getUserid();
      assertNull(externalUser1.getLastname());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Authorizes authorizes0 = new Authorizes();
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setUserid((-2801));
      authorizes0.setUserid(externalUser0);
      ExternalUser externalUser1 = authorizes0.getUserid();
      assertNull(externalUser1.getMiddlename());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Authorizes authorizes0 = new Authorizes();
      Transaction transaction0 = new Transaction();
      transaction0.setTid(4316);
      authorizes0.setTid(transaction0);
      Transaction transaction1 = authorizes0.getTid();
      assertSame(transaction1, transaction0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Authorizes authorizes0 = new Authorizes();
      Transaction transaction0 = new Transaction();
      transaction0.setTid((-2156));
      authorizes0.setTid(transaction0);
      Transaction transaction1 = authorizes0.getTid();
      assertEquals((-2156L), (long)transaction1.getId());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Authorizes authorizes0 = new Authorizes();
      Transaction transaction0 = new Transaction();
      transaction0.setAmt(891.0F);
      authorizes0.setTid(transaction0);
      Transaction transaction1 = authorizes0.getTid();
      assertNull(transaction1.getTransstatus());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Authorizes authorizes0 = new Authorizes();
      Transaction transaction0 = new Transaction();
      transaction0.setAmt((-80.28568F));
      authorizes0.setTid(transaction0);
      Transaction transaction1 = authorizes0.getTid();
      assertNull(transaction1.getTransdesc());
  }


  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Authorizes authorizes0 = new Authorizes();
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setUserid(1503);
      authorizes0.setEmpid(internalUser0);
      InternalUser internalUser1 = authorizes0.getEmpid();
      assertEquals(1503L, (long)internalUser1.getId());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Authorizes authorizes0 = new Authorizes();
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setUserid((-1));
      authorizes0.setEmpid(internalUser0);
      InternalUser internalUser1 = authorizes0.getEmpid();
      assertNull(internalUser1.getFirstname());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Authorizes authorizes0 = new Authorizes();
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setPiiacces(1331);
      authorizes0.setEmpid(internalUser0);
      InternalUser internalUser1 = authorizes0.getEmpid();
      assertNull(internalUser1.getZipcode());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Authorizes authorizes0 = new Authorizes();
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setPiiacces((-1469));
      authorizes0.setEmpid(internalUser0);
      InternalUser internalUser1 = authorizes0.getEmpid();
      assertNull(internalUser1.getAddressline2());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Authorizes authorizes0 = new Authorizes();
      Date date0 = authorizes0.getStart_datetime();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Authorizes authorizes0 = new Authorizes();
      ExternalUser externalUser0 = authorizes0.getUserid();
      assertNull(externalUser0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Authorizes authorizes0 = new Authorizes();
      InternalUser internalUser0 = authorizes0.getEmpid();
      assertNull(internalUser0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Authorizes authorizes0 = new Authorizes();
      ExternalUser externalUser0 = new ExternalUser();
      authorizes0.setUserid(externalUser0);
      ExternalUser externalUser1 = authorizes0.getUserid();
      assertNull(externalUser1.getCity());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Authorizes authorizes0 = new Authorizes();
      Transaction transaction0 = authorizes0.getTid();
      assertNull(transaction0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Authorizes authorizes0 = new Authorizes();
      Date date0 = authorizes0.getEnd_datetime();
      assertNull(date0);
  }
}
