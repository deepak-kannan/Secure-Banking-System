package com.group9.bankofaz.component;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.component.VerifyRecaptcha;
import org.junit.runner.RunWith;

public class VerifyRecaptcha_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean boolean0 = VerifyRecaptcha.verify("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean boolean0 = VerifyRecaptcha.verify("^");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      boolean boolean0 = VerifyRecaptcha.verify((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      VerifyRecaptcha verifyRecaptcha0 = new VerifyRecaptcha();
  }
}
