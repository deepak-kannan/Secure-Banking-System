package com.group9.bankofaz.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.model.BankAccount;
import com.group9.bankofaz.model.ExternalUser;
import java.util.Date;
import org.junit.runner.RunWith;

public class BankAccount_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount();
      ExternalUser externalUser0 = new ExternalUser();
      bankAccount0.setUserid(externalUser0);
      ExternalUser externalUser1 = bankAccount0.getUserid();
      assertNull(externalUser1.getAddressline2());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount();
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setUserid(1175);
      bankAccount0.setUserid(externalUser0);
      ExternalUser externalUser1 = bankAccount0.getUserid();
      assertNull(externalUser1.getBName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount();
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setUserid((-232));
      bankAccount0.setUserid(externalUser0);
      ExternalUser externalUser1 = bankAccount0.getUserid();
      assertNull(externalUser1.getMiddlename());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount();
      bankAccount0.setAccno("+7");
      Long long0 = bankAccount0.getId();
      assertEquals(7L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount();
      bankAccount0.setBalance(608.0F);
      float float0 = bankAccount0.getBalance();
      assertEquals(608.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount();
      bankAccount0.setBalance((-1974.0314F));
      float float0 = bankAccount0.getBalance();
      assertEquals((-1974.0314F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount();
      bankAccount0.setAcctype("+7");
      String string0 = bankAccount0.getAcctype();
      assertEquals("+7", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount();
      bankAccount0.setAcctype("");
      String string0 = bankAccount0.getAcctype();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount();
      bankAccount0.setAccno(" bankaccount ");
      String string0 = bankAccount0.getAccno();
      assertEquals(" bankaccount ", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount();
      bankAccount0.setAccStatus("IApU<V<s,qX0fl!x");
      String string0 = bankAccount0.getAccStatus();
      assertEquals("IApU<V<s,qX0fl!x", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount();
      bankAccount0.setAccStatus("");
      String string0 = bankAccount0.getAccStatus();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount();
      String string0 = bankAccount0.getAccStatus();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount();
      String string0 = bankAccount0.getAccno();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount();
      Date date0 = bankAccount0.getOpendate();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount();
      ExternalUser externalUser0 = new ExternalUser();
      bankAccount0.setUserid(externalUser0);
      String string0 = bankAccount0.getLogDetail();
      assertEquals(" bankaccount  accno : null balance : 0.0 acctype : null opendate : null userid : 0 accstatus :null", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount();
      ExternalUser externalUser0 = bankAccount0.getUserid();
      assertNull(externalUser0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount();
      float float0 = bankAccount0.getBalance();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount();
      bankAccount0.setAccno("");
      String string0 = bankAccount0.getAccno();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BankAccount bankAccount0 = new BankAccount();
      String string0 = bankAccount0.getAcctype();
      assertNull(string0);
  }
}
