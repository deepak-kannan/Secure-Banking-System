package com.group9.bankofaz.service;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.model.BankAccount;
import com.group9.bankofaz.model.ExternalUser;
import com.group9.bankofaz.model.Pii;
import com.group9.bankofaz.model.Users;
import com.group9.bankofaz.service.RegistrationServiceImpl;
import java.security.KeyPair;
import java.security.PrivateKey;
import org.junit.runner.RunWith;

public class RegistrationServiceImpl_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegistrationServiceImpl registrationServiceImpl0 = new RegistrationServiceImpl();
      KeyPair keyPair0 = registrationServiceImpl0.generateKeyPair();
      assertNotNull(keyPair0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RegistrationServiceImpl registrationServiceImpl0 = new RegistrationServiceImpl();
      String string0 = registrationServiceImpl0.getPrivateKeyLocation((String) null);
      assertEquals("C:\\Users\\125164\\AppData\\Local\\Temp\\3\\/null", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RegistrationServiceImpl registrationServiceImpl0 = new RegistrationServiceImpl();
      String string0 = registrationServiceImpl0.getVisaStatus();
      //  // Unstable assertion: assertNotNull(string0);
      //  // Unstable assertion: assertEquals("L2", string0);
  }
