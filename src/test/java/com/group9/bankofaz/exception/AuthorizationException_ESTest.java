package com.group9.bankofaz.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.exception.AuthorizationException;
import org.junit.runner.RunWith;

public class AuthorizationException_ESTest {

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AuthorizationException authorizationException0 = new AuthorizationException();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AuthorizationException authorizationException0 = new AuthorizationException("");
      AuthorizationException authorizationException1 = new AuthorizationException("", authorizationException0);
      assertFalse(authorizationException1.equals((Object)authorizationException0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AuthorizationException authorizationException0 = new AuthorizationException("");
      AuthorizationException authorizationException1 = new AuthorizationException(authorizationException0);
      assertFalse(authorizationException1.equals((Object)authorizationException0));
  }
}
