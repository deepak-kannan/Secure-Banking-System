package com.group9.bankofaz.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.model.Logs;
import java.util.Date;
import org.junit.runner.RunWith;

public class Logs_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Logs logs0 = new Logs();
      logs0.setDetail("}7I78}R$");
      String string0 = logs0.getDetail();
      assertEquals("}7I78}R$", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Logs logs0 = new Logs();
      logs0.setDetail("");
      String string0 = logs0.getDetail();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Logs logs0 = new Logs();
      Long long0 = new Long((-21L));
      logs0.setAuditLogId(long0);
      Long long1 = logs0.getAuditLogId();
      assertEquals((-21L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Logs logs0 = new Logs();
      Long long0 = new Long(0L);
      logs0.setAuditLogId(long0);
      Long long1 = logs0.getAuditLogId();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Logs logs0 = new Logs();
      Long long0 = new Long(242);
      logs0.setAuditLogId(long0);
      Long long1 = logs0.getAuditLogId();
      assertEquals(242L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Logs logs0 = new Logs();
      Date date0 = logs0.getCreatedDate();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Logs logs0 = new Logs();
      Long long0 = Long.getLong("", 263L);
      logs0.setAuditLogId(long0);
      Long long1 = logs0.getAuditLogId();
      assertEquals(263L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Logs logs0 = new Logs();
      Long long0 = logs0.getAuditLogId();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Logs logs0 = new Logs();
      String string0 = logs0.getDetail();
      assertNull(string0);
  }
}
