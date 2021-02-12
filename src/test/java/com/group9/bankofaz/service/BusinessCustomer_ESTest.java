package com.group9.bankofaz.service;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.model.BankAccount;
import com.group9.bankofaz.model.Transaction;
import com.group9.bankofaz.service.BusinessCustomer;
import java.util.List;
import org.junit.runner.RunWith;

public class BusinessCustomer_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BusinessCustomer businessCustomer0 = new BusinessCustomer();
      boolean boolean0 = businessCustomer0.internalTransfer(0, (BankAccount) null, (BankAccount) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BusinessCustomer businessCustomer0 = new BusinessCustomer();
      List<BankAccount> list0 = businessCustomer0.getAccounts();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BusinessCustomer businessCustomer0 = new BusinessCustomer();
      String string0 = businessCustomer0.getBusinessName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BusinessCustomer businessCustomer0 = new BusinessCustomer();
      BankAccount bankAccount0 = new BankAccount();
      boolean boolean0 = businessCustomer0.creditIntoAcct(0, bankAccount0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BusinessCustomer businessCustomer0 = new BusinessCustomer();
      boolean boolean0 = businessCustomer0.submitTransaction((Transaction) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BusinessCustomer businessCustomer0 = new BusinessCustomer();
      businessCustomer0.updateTasks();
      assertNull(businessCustomer0.getBusinessName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BusinessCustomer businessCustomer0 = new BusinessCustomer();
      int int0 = businessCustomer0.getBalanceOfAcct((BankAccount) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BusinessCustomer businessCustomer0 = new BusinessCustomer();
      businessCustomer0.getBusinessName((String) null);
      assertNull(businessCustomer0.getBusinessName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BusinessCustomer businessCustomer0 = new BusinessCustomer();
      boolean boolean0 = businessCustomer0.externalTransfer(0, (BankAccount) null, (BankAccount) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BusinessCustomer businessCustomer0 = new BusinessCustomer();
      BankAccount bankAccount0 = new BankAccount();
      boolean boolean0 = businessCustomer0.debitFromAcct(0, bankAccount0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BusinessCustomer businessCustomer0 = new BusinessCustomer();
      boolean boolean0 = businessCustomer0.submitTransReview((String) null, (BankAccount) null);
      assertFalse(boolean0);
  }
}
