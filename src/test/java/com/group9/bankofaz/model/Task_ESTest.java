package com.group9.bankofaz.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.model.Task;
import com.group9.bankofaz.model.Transaction;
import org.junit.runner.RunWith;

public class Task_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Task task0 = new Task();
      Transaction transaction0 = new Transaction();
      transaction0.setTid(772);
      task0.setTid(transaction0);
      Transaction transaction1 = task0.getTid();
      assertNull(transaction1.getTransType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Task task0 = new Task();
      Transaction transaction0 = new Transaction();
      transaction0.setTid((-645));
      task0.setTid(transaction0);
      Transaction transaction1 = task0.getTid();
      assertNull(transaction1.getTransstatus());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Task task0 = new Task();
      Transaction transaction0 = new Transaction();
      task0.setTid(transaction0);
      Transaction transaction1 = task0.getTid();
      assertEquals(0.0F, transaction1.getAmt(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Task task0 = new Task();
      Transaction transaction0 = new Transaction();
      transaction0.setAmt(1);
      task0.setTid(transaction0);
      Transaction transaction1 = task0.getTid();
      assertNull(transaction1.getTransDesc());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Task task0 = new Task();
      Transaction transaction0 = new Transaction();
      transaction0.setAmt((-4656.564F));
      task0.setTid(transaction0);
      Transaction transaction1 = task0.getTid();
      assertNull(transaction1.getTransDesc());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Task task0 = new Task();
      task0.setTaskid(772);
      int int0 = task0.getTaskid();
      assertEquals(772, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Task task0 = new Task();
      task0.setTaskid((-4586));
      int int0 = task0.getTaskid();
      assertEquals((-4586), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Task task0 = new Task();
      task0.setStatus("0Dk57SFKG%5]p&E2$N");
      String string0 = task0.getStatus();
      assertEquals("0Dk57SFKG%5]p&E2$N", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Task task0 = new Task();
      task0.setStatus("");
      String string0 = task0.getStatus();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Task task0 = new Task();
      task0.setMessage("PcOoSK>e~ ");
      String string0 = task0.getMessage();
      assertEquals("PcOoSK>e~ ", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Task task0 = new Task();
      task0.setMessage("");
      String string0 = task0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Task task0 = new Task();
      task0.setTaskid(1);
      Long long0 = task0.getId();
      assertEquals(1L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Task task0 = new Task();
      task0.setTaskid((-4586));
      Long long0 = task0.getId();
      assertEquals((-4586L), (long)long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Task task0 = new Task();
      task0.setTaskid((-115));
      Long long0 = task0.getId();
      assertEquals((-115L), (long)long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Task task0 = new Task();
      task0.setAssigneeid(2365);
      int int0 = task0.getAssigneeid();
      assertEquals(2365, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Task task0 = new Task();
      task0.setAssigneeid((-1567));
      int int0 = task0.getAssigneeid();
      assertEquals((-1567), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Task task0 = new Task();
      Long long0 = task0.getId();
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Task task0 = new Task();
      Transaction transaction0 = new Transaction();
      task0.setTid(transaction0);
      String string0 = task0.getLogDetail();
      assertEquals(" task  taskid :0 message : null status : null tid : 0 assigneeid : 0", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Task task0 = new Task();
      String string0 = task0.getMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Task task0 = new Task();
      int int0 = task0.getTaskid();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Task task0 = new Task();
      int int0 = task0.getAssigneeid();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Task task0 = new Task();
      Transaction transaction0 = task0.getTid();
      assertNull(transaction0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Task task0 = new Task();
      String string0 = task0.getStatus();
      assertNull(string0);
  }
}
