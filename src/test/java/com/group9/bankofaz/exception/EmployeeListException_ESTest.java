package com.group9.bankofaz.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.exception.EmployeeListException;
import org.junit.runner.RunWith;

public class EmployeeListException_ESTest {

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmployeeListException employeeListException0 = new EmployeeListException();
      EmployeeListException employeeListException1 = new EmployeeListException("3)>tR7I]!bKU", employeeListException0, true, true);
      assertFalse(employeeListException1.equals((Object)employeeListException0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EmployeeListException employeeListException0 = new EmployeeListException();
      EmployeeListException employeeListException1 = new EmployeeListException("3)>tR7I]!bKU", employeeListException0);
      assertFalse(employeeListException1.equals((Object)employeeListException0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EmployeeListException employeeListException0 = new EmployeeListException("*J");
  }
}
