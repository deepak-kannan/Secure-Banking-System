package com.group9.bankofaz.service;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.model.BankAccount;
import com.group9.bankofaz.model.Transaction;
import com.group9.bankofaz.service.IndividualCustomer;
import java.util.List;
import org.junit.runner.RunWith;

public class IndividualCustomer_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IndividualCustomer individualCustomer0 = new IndividualCustomer();
      BankAccount bankAccount0 = new BankAccount();
      boolean boolean0 = individualCustomer0.submitTransReview("iC3G~4z<k`ZM^t", bankAccount0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IndividualCustomer individualCustomer0 = new IndividualCustomer();
      BankAccount bankAccount0 = new BankAccount();
      boolean boolean0 = individualCustomer0.externalTransfer(0, bankAccount0, bankAccount0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IndividualCustomer individualCustomer0 = new IndividualCustomer();
      BankAccount bankAccount0 = new BankAccount();
      boolean boolean0 = individualCustomer0.creditIntoAcct(0, bankAccount0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IndividualCustomer individualCustomer0 = new IndividualCustomer();
      BankAccount bankAccount0 = new BankAccount();
      int int0 = individualCustomer0.getBalanceOfAcct(bankAccount0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IndividualCustomer individualCustomer0 = new IndividualCustomer();
      BankAccount bankAccount0 = new BankAccount();
      boolean boolean0 = individualCustomer0.internalTransfer(0, bankAccount0, bankAccount0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IndividualCustomer individualCustomer0 = new IndividualCustomer();
      BankAccount bankAccount0 = new BankAccount();
      boolean boolean0 = individualCustomer0.debitFromAcct(0, bankAccount0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      IndividualCustomer individualCustomer0 = new IndividualCustomer();
      List<BankAccount> list0 = individualCustomer0.getAccounts();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      IndividualCustomer individualCustomer0 = new IndividualCustomer();
      Transaction transaction0 = new Transaction();
      boolean boolean0 = individualCustomer0.submitTransaction(transaction0);
      assertFalse(boolean0);
  }
}
