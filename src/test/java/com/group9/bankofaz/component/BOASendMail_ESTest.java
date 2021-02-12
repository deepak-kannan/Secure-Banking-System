package com.group9.bankofaz.component;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.component.BOASendMail;
import org.junit.runner.RunWith;

public class BOASendMail_ESTest {

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
