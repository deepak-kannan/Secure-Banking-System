package com.group9.bankofaz.service;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.model.InternalUser;
import com.group9.bankofaz.model.Task;
import com.group9.bankofaz.model.Users;
import com.group9.bankofaz.service.SystemAdministratorImpl;
import java.util.List;
import org.junit.runner.RunWith;

public class SystemAdministratorImpl_ESTest {

@Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SystemAdministratorImpl systemAdministratorImpl0 = new SystemAdministratorImpl();
      List<Task> list0 = systemAdministratorImpl0.getTasks();
      assertNull(list0);
  }
}
