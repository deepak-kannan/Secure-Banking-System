package com.group9.bankofaz.service;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.model.ExternalUser;
import com.group9.bankofaz.model.InternalUser;
import com.group9.bankofaz.model.Task;
import com.group9.bankofaz.model.Transaction;
import com.group9.bankofaz.model.Users;
import com.group9.bankofaz.service.RegularEmployeeImpl;
import java.util.List;
import org.junit.runner.RunWith;

public class RegularEmployeeImpl_ESTest {

 @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegularEmployeeImpl regularEmployeeImpl0 = new RegularEmployeeImpl();
      List<Task> list0 = regularEmployeeImpl0.getTasks();
      assertNull(list0);
  }
}
