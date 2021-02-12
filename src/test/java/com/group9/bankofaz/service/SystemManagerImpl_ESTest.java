/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 12 03:46:16 GMT 2021
 */

package com.group9.bankofaz.service;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.group9.bankofaz.model.ExternalUser;
import com.group9.bankofaz.model.InternalUser;
import com.group9.bankofaz.model.Task;
import com.group9.bankofaz.model.Transaction;
import com.group9.bankofaz.model.Users;
import com.group9.bankofaz.service.SystemManagerImpl;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SystemManagerImpl_ESTest extends SystemManagerImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SystemManagerImpl systemManagerImpl0 = new SystemManagerImpl();
      try { 
        systemManagerImpl0.deleteExternalUserAcct((ExternalUser) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Insufficient privileges to perform the action
         //
         verifyException("com.group9.bankofaz.service.SystemManagerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SystemManagerImpl systemManagerImpl0 = new SystemManagerImpl();
      ExternalUser externalUser0 = new ExternalUser();
      try { 
        systemManagerImpl0.modifyExternalUserAcct(externalUser0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Insufficient privileges to perform the action
         //
         verifyException("com.group9.bankofaz.service.SystemManagerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SystemManagerImpl systemManagerImpl0 = new SystemManagerImpl();
      ExternalUser externalUser0 = systemManagerImpl0.viewExternalUserAcct("]s9nBt-(wU+@y");
      assertNull(externalUser0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SystemManagerImpl systemManagerImpl0 = new SystemManagerImpl();
      try { 
        systemManagerImpl0.authorizeTransaction((Transaction) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Insufficient privileges to perform the action
         //
         verifyException("com.group9.bankofaz.service.SystemManagerImpl", e);
      }
  }

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
  public void test06()  throws Throwable  {
      SystemManagerImpl systemManagerImpl0 = new SystemManagerImpl();
      // Undeclared exception!
      try { 
        systemManagerImpl0.setUser("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.group9.bankofaz.service.SystemManagerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SystemManagerImpl systemManagerImpl0 = new SystemManagerImpl();
      // Undeclared exception!
      try { 
        systemManagerImpl0.completeTask(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.group9.bankofaz.service.SystemManagerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SystemManagerImpl systemManagerImpl0 = new SystemManagerImpl();
      // Undeclared exception!
      try { 
        systemManagerImpl0.requestPrivileges("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.group9.bankofaz.service.SystemManagerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SystemManagerImpl systemManagerImpl0 = new SystemManagerImpl();
      List<Task> list0 = systemManagerImpl0.getTasks();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SystemManagerImpl systemManagerImpl0 = new SystemManagerImpl();
      Users users0 = new Users();
      // Undeclared exception!
      try { 
        systemManagerImpl0.updatePasswd(users0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.group9.bankofaz.service.SystemManagerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SystemManagerImpl systemManagerImpl0 = new SystemManagerImpl();
      InternalUser internalUser0 = new InternalUser();
      // Undeclared exception!
      try { 
        systemManagerImpl0.updateInfo(internalUser0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.group9.bankofaz.service.SystemManagerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SystemManagerImpl systemManagerImpl0 = new SystemManagerImpl();
      // Undeclared exception!
      try { 
        systemManagerImpl0.updateTasks();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.group9.bankofaz.service.SystemManagerImpl", e);
      }
  }
}
