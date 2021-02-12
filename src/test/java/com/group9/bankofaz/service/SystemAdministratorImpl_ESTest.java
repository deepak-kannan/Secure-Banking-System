/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 12 03:45:01 GMT 2021
 */

package com.group9.bankofaz.service;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.group9.bankofaz.model.InternalUser;
import com.group9.bankofaz.model.Task;
import com.group9.bankofaz.model.Users;
import com.group9.bankofaz.service.SystemAdministratorImpl;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SystemAdministratorImpl_ESTest extends SystemAdministratorImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SystemAdministratorImpl systemAdministratorImpl0 = new SystemAdministratorImpl();
      InternalUser internalUser0 = new InternalUser();
      try { 
        systemAdministratorImpl0.deleteInternalUserAccount(internalUser0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Insufficient privileges to perform the action
         //
         verifyException("com.group9.bankofaz.service.SystemAdministratorImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      SystemAdministratorImpl systemAdministratorImpl0 = new SystemAdministratorImpl();
      try { 
        systemAdministratorImpl0.modifyInternalUserAccount(internalUser0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Insufficient privileges to perform the action
         //
         verifyException("com.group9.bankofaz.service.SystemAdministratorImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SystemAdministratorImpl systemAdministratorImpl0 = new SystemAdministratorImpl();
      InternalUser internalUser0 = new InternalUser();
      try { 
        systemAdministratorImpl0.addInternalUserAccount(internalUser0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Insufficient privileges to perform the action
         //
         verifyException("com.group9.bankofaz.service.SystemAdministratorImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SystemAdministratorImpl systemAdministratorImpl0 = new SystemAdministratorImpl();
      // Undeclared exception!
      try { 
        systemAdministratorImpl0.setUser("Insufficient privileges to perform the action");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.group9.bankofaz.service.SystemAdministratorImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SystemAdministratorImpl systemAdministratorImpl0 = new SystemAdministratorImpl();
      // Undeclared exception!
      try { 
        systemAdministratorImpl0.updateTasks();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.group9.bankofaz.service.SystemAdministratorImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SystemAdministratorImpl systemAdministratorImpl0 = new SystemAdministratorImpl();
      // Undeclared exception!
      try { 
        systemAdministratorImpl0.viewSystemLogs();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.group9.bankofaz.service.SystemAdministratorImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SystemAdministratorImpl systemAdministratorImpl0 = new SystemAdministratorImpl();
      InternalUser internalUser0 = new InternalUser();
      // Undeclared exception!
      try { 
        systemAdministratorImpl0.updateInfo(internalUser0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.group9.bankofaz.service.SystemAdministratorImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SystemAdministratorImpl systemAdministratorImpl0 = new SystemAdministratorImpl();
      // Undeclared exception!
      try { 
        systemAdministratorImpl0.updatePasswd((Users) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.group9.bankofaz.service.SystemAdministratorImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SystemAdministratorImpl systemAdministratorImpl0 = new SystemAdministratorImpl();
      // Undeclared exception!
      try { 
        systemAdministratorImpl0.completeTask(962);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.group9.bankofaz.service.SystemAdministratorImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SystemAdministratorImpl systemAdministratorImpl0 = new SystemAdministratorImpl();
      List<Task> list0 = systemAdministratorImpl0.getTasks();
      assertNull(list0);
  }
}