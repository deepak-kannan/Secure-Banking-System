package com.group9.bankofaz.component;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.group9.bankofaz.component.BOASendMail;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BOASendMail_ESTest extends BOASendMail_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BOASendMail bOASendMail0 = new BOASendMail();
      // Undeclared exception!
      try { 
        bOASendMail0.SendMailToCustomer("", "", "");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/springframework/mail/SimpleMailMessage
         //
         verifyException("com.group9.bankofaz.component.BOASendMail", e);
      }
  }
}
