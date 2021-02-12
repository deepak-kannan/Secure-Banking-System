package com.group9.bankofaz.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.model.Users;
import org.junit.runner.RunWith;

public class Users_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Users users0 = new Users();
      users0.setUsername(" authority : ");
      String string0 = users0.getUsername();
      assertEquals(" authority : ", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Users users0 = new Users();
      users0.setUsername("");
      String string0 = users0.getUsername();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Users users0 = new Users();
      users0.setPassword(" enabled : ");
      String string0 = users0.getPassword();
      assertEquals(" enabled : ", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Users users0 = new Users();
      users0.setPassword("");
      String string0 = users0.getPassword();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Users users0 = new Users();
      users0.setUsername("5");
      Long long0 = users0.getId();
      assertEquals(5L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Users users0 = new Users();
      users0.setFailure(981);
      int int0 = users0.getFailure();
      assertEquals(981, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Users users0 = new Users();
      users0.setEnabled(1);
      int int0 = users0.getEnabled();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Users users0 = new Users();
      users0.setAuthority(" users  username :null passwd : null authority :  enabled : 0 failures :0");
      String string0 = users0.getAuthority();
      assertEquals(" users  username :null passwd : null authority :  enabled : 0 failures :0", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Users users0 = new Users();
      users0.setAuthority("");
      String string0 = users0.getAuthority();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Users users0 = new Users();
      String string0 = users0.getAuthority();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Users users0 = new Users();
      String string0 = users0.getPassword();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Users users0 = new Users();
      String string0 = users0.getLogDetail();
      assertEquals(" users  username :null passwd : null authority : null enabled : 0 failures :0", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Users users0 = new Users();
      int int0 = users0.getEnabled();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Users users0 = new Users();
      int int0 = users0.getFailure();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Users users0 = new Users();
      users0.setFailure((-1));
      int int0 = users0.getFailure();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Users users0 = new Users();
      users0.setEnabled((-1));
      int int0 = users0.getEnabled();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Users users0 = new Users();
      String string0 = users0.getUsername();
      assertNull(string0);
  }
}
