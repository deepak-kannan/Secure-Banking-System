package com.group9.bankofaz.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.exception.IllegalTransactionException;
import org.junit.runner.RunWith;

public class IllegalTransactionException_ESTest {

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IllegalTransactionException illegalTransactionException0 = new IllegalTransactionException();
      IllegalTransactionException illegalTransactionException1 = new IllegalTransactionException(illegalTransactionException0);
      assertFalse(illegalTransactionException1.equals((Object)illegalTransactionException0));
  }
}
