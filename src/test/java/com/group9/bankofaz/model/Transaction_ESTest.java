package com.group9.bankofaz.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.model.BankAccount;
import com.group9.bankofaz.model.Transaction;
import java.util.Date;
import org.junit.runner.RunWith;

public class Transaction_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setTransType("");
      String string0 = transaction0.getTranstype();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setTransstatus("6zn$/+W97,Q@/NOq~&");
      String string0 = transaction0.getTransstatus();
      assertEquals("6zn$/+W97,Q@/NOq~&", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setTransstatus("");
      String string0 = transaction0.getTransstatus();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setTransDesc("_`9jdA^Qr%VnIz0\u0002");
      String string0 = transaction0.getTransdesc();
      assertEquals("_`9jdA^Qr%VnIz0\u0002", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setTransDesc("");
      String string0 = transaction0.getTransdesc();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setTransType(" acctype : ");
      String string0 = transaction0.getTransType();
      assertEquals(" acctype : ", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setTransType("");
      String string0 = transaction0.getTransType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setTransstatus("6zn$/+W97,Q@/NOq~&");
      String string0 = transaction0.getTransStatus();
      assertEquals("6zn$/+W97,Q@/NOq~&", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setTransstatus("");
      String string0 = transaction0.getTransStatus();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setTransDesc("zhMZlUf9QD`;'I");
      String string0 = transaction0.getTransDesc();
      assertEquals("zhMZlUf9QD`;'I", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setTransDesc("");
      String string0 = transaction0.getTransDesc();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      BankAccount bankAccount0 = new BankAccount();
      transaction0.setToacc(bankAccount0);
      BankAccount bankAccount1 = transaction0.getToacc();
      assertNull(bankAccount1.getAccStatus());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      BankAccount bankAccount0 = new BankAccount();
      bankAccount0.setBalance(222.98F);
      transaction0.setToacc(bankAccount0);
      BankAccount bankAccount1 = transaction0.getToacc();
      assertNull(bankAccount1.getAcctype());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      BankAccount bankAccount0 = new BankAccount();
      transaction0.setToacc(bankAccount0);
      bankAccount0.setBalance((-1366.56F));
      BankAccount bankAccount1 = transaction0.getToacc();
      assertEquals((-1366.56F), bankAccount1.getBalance(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setTid(1252);
      int int0 = transaction0.getTid();
      assertEquals(1252, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setTid((-1));
      int int0 = transaction0.getTid();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      BankAccount bankAccount0 = new BankAccount();
      transaction0.setToacc(bankAccount0);
      transaction0.setFromacc(bankAccount0);
      String string0 = transaction0.getLogDetail();
      assertEquals(" transaction  tid :0 transdate : null transtype : null amt : 0.0 transstatus : null fromacc :null toacc : null transdesc : null", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setTid((-1));
      Long long0 = transaction0.getId();
      assertEquals((-1L), (long)long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      BankAccount bankAccount0 = new BankAccount();
      bankAccount0.setBalance(484.163F);
      transaction0.setFromacc(bankAccount0);
      BankAccount bankAccount1 = transaction0.getFromacc();
      assertNull(bankAccount1.getAcctype());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      BankAccount bankAccount0 = new BankAccount();
      bankAccount0.setBalance((-1366.56F));
      transaction0.setFromacc(bankAccount0);
      BankAccount bankAccount1 = transaction0.getFromacc();
      assertNull(bankAccount1.getAccStatus());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setAmt(51.42545F);
      float float0 = transaction0.getAmt();
      assertEquals(51.42545F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setAmt((-1705.84F));
      float float0 = transaction0.getAmt();
      assertEquals((-1705.84F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      String string0 = transaction0.getTransDesc();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      String string0 = transaction0.getTransType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setTransdesc(",HxaQ3CD^");
      assertEquals(0L, (long)transaction0.getId());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      BankAccount bankAccount0 = transaction0.getFromacc();
      transaction0.setToacc(bankAccount0);
      assertNull(transaction0.getTransDesc());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      float float0 = transaction0.getAmt();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      String string0 = transaction0.getTransdesc();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setTransDate((Date) null);
      assertEquals(0L, (long)transaction0.getId());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      String string0 = transaction0.getTransStatus();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      Date date0 = transaction0.getTransDate();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setTid(3);
      Long long0 = transaction0.getId();
      assertEquals(3L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      Date date0 = transaction0.getTransdate();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      String string0 = transaction0.getTransstatus();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      BankAccount bankAccount0 = transaction0.getToacc();
      assertNull(bankAccount0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      BankAccount bankAccount0 = new BankAccount();
      transaction0.setFromacc(bankAccount0);
      BankAccount bankAccount1 = transaction0.getFromacc();
      assertNull(bankAccount1.getAcctype());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setTransType("F(M`,GVVu");
      String string0 = transaction0.getTranstype();
      assertEquals("F(M`,GVVu", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setTransStatus("");
      assertEquals(0.0F, transaction0.getAmt(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      String string0 = transaction0.getTranstype();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      Long long0 = transaction0.getId();
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      int int0 = transaction0.getTid();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Transaction transaction0 = new Transaction();
      transaction0.setTranstype("F(M`,GVVu");
      assertEquals(0.0F, transaction0.getAmt(), 0.01F);
  }
}
