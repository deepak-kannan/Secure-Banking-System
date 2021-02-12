package com.group9.bankofaz.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.model.UserOtp;
import org.junit.runner.RunWith;

public class UserOtp_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UserOtp userOtp0 = new UserOtp();
      userOtp0.setValidity(3143L);
      long long0 = userOtp0.getValidity();
      assertEquals(3143L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UserOtp userOtp0 = new UserOtp();
      userOtp0.setValidationcode(329);
      int int0 = userOtp0.getValidationcode();
      assertEquals(329, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UserOtp userOtp0 = new UserOtp();
      userOtp0.setValidationcode((-53));
      int int0 = userOtp0.getValidationcode();
      assertEquals((-53), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UserOtp userOtp0 = new UserOtp();
      userOtp0.setSecretKey("");
      String string0 = userOtp0.getSecretKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UserOtp userOtp0 = new UserOtp();
      userOtp0.setEmail("W[}[.p9rOlj8o3>?@F");
      String string0 = userOtp0.getEmail();
      assertEquals("W[}[.p9rOlj8o3>?@F", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UserOtp userOtp0 = new UserOtp();
      userOtp0.setEmail("");
      String string0 = userOtp0.getEmail();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UserOtp userOtp0 = new UserOtp();
      userOtp0.setValidity((-1051L));
      long long0 = userOtp0.getValidity();
      assertEquals((-1051L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UserOtp userOtp0 = new UserOtp();
      long long0 = userOtp0.getValidity();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UserOtp userOtp0 = new UserOtp();
      String string0 = userOtp0.getEmail();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UserOtp userOtp0 = new UserOtp();
      String string0 = userOtp0.getSecretKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UserOtp userOtp0 = new UserOtp();
      userOtp0.setSecretKey("&u HoN^VLWoI");
      String string0 = userOtp0.getSecretKey();
      assertEquals("&u HoN^VLWoI", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UserOtp userOtp0 = new UserOtp();
      int int0 = userOtp0.getValidationcode();
      assertEquals(0, int0);
  }
}
