package com.group9.bankofaz.service;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.model.ExternalUser;
import com.group9.bankofaz.model.InternalUser;
import com.group9.bankofaz.model.Task;
import com.group9.bankofaz.model.Transaction;
import com.group9.bankofaz.model.Users;
import com.group9.bankofaz.service.SystemManagerImpl;
import java.util.List;
import org.junit.runner.RunWith;

public class SystemManagerImpl_ESTest {

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SystemManagerImpl systemManagerImpl0 = new SystemManagerImpl();
      Transaction transaction0 = systemManagerImpl0.viewTransaction((-1));
      assertNull(transaction0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SystemManagerImpl systemManagerImpl0 = new SystemManagerImpl();
      List<Transaction> list0 = systemManagerImpl0.viewTransactions("");
      assertNull(list0);
  }
 
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SystemManagerImpl systemManagerImpl0 = new SystemManagerImpl();
      List<Task> list0 = systemManagerImpl0.getTasks();
      assertNull(list0);
  }

}
