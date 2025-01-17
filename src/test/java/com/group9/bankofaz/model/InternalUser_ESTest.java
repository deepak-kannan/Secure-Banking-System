package com.group9.bankofaz.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.model.InternalUser;
import com.group9.bankofaz.model.Users;
import org.junit.runner.RunWith;

public class InternalUser_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setZipcode("*,0(!SR>}>5AOM9rw',");
      String string0 = internalUser0.getZipcode();
      assertEquals("*,0(!SR>}>5AOM9rw',", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setZipcode("");
      String string0 = internalUser0.getZipcode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setUserid(941);
      int int0 = internalUser0.getUserid();
      assertEquals(941, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setUserid((-2865));
      int int0 = internalUser0.getUserid();
      assertEquals((-2865), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setState("");
      String string0 = internalUser0.getState();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setSsn(" piiacess:");
      String string0 = internalUser0.getSsn();
      assertEquals(" piiacess:", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setSsn("");
      String string0 = internalUser0.getSsn();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setPiiacces(2873);
      int int0 = internalUser0.getPiiaccess();
      assertEquals(2873, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setPiiacces((-1365));
      int int0 = internalUser0.getPiiaccess();
      assertEquals((-1365), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setMiddlename("*,0(!SR>}>5AOM9rw',");
      String string0 = internalUser0.getMiddlename();
      assertEquals("*,0(!SR>}>5AOM9rw',", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setMiddlename("");
      String string0 = internalUser0.getMiddlename();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      Users users0 = new Users();
      internalUser0.setEmail(users0);
      String string0 = internalUser0.getLogDetail();
      assertEquals(" internaluser  userid :0 firstname : null middlename : null lastname : null email : null addressline1 :null addressline2 : null city : null state : null zipcode :null accessprivilege :null piiacess:0", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setLastname(" firstname : ");
      String string0 = internalUser0.getLastname();
      assertEquals(" firstname : ", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setLastname("");
      String string0 = internalUser0.getLastname();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setUserid((-2865));
      Long long0 = internalUser0.getId();
      assertEquals((-2865L), (long)long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setUserid(2352);
      Long long0 = internalUser0.getId();
      assertEquals(2352L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setFirstname("R@s!;r0>0MCM");
      String string0 = internalUser0.getFirstname();
      assertEquals("R@s!;r0>0MCM", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setFirstname("");
      String string0 = internalUser0.getFirstname();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      Users users0 = new Users();
      users0.setFailure(1148);
      internalUser0.setEmail(users0);
      Users users1 = internalUser0.getEmail();
      assertNull(users1.getPassword());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      Users users0 = new Users();
      users0.setFailure((-1));
      internalUser0.setEmail(users0);
      Users users1 = internalUser0.getEmail();
      assertEquals(0, users1.getEnabled());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      Users users0 = new Users();
      internalUser0.setEmail(users0);
      Users users1 = internalUser0.getEmail();
      assertNull(users1.getUsername());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      Users users0 = new Users();
      users0.setEnabled((-67));
      internalUser0.setEmail(users0);
      Users users1 = internalUser0.getEmail();
      assertEquals((-67), users1.getEnabled());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setCity("^:Tk]4)NX.ho8gp");
      String string0 = internalUser0.getCity();
      assertEquals("^:Tk]4)NX.ho8gp", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setCity("");
      String string0 = internalUser0.getCity();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setAddressline2(" accessprivilege :");
      String string0 = internalUser0.getAddressline2();
      assertEquals(" accessprivilege :", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setAddressline2("");
      String string0 = internalUser0.getAddressline2();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setAddressline1("c3@pbd}-2;O]:/77~I*");
      String string0 = internalUser0.getAddressline1();
      assertEquals("c3@pbd}-2;O]:/77~I*", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setAcessPrivilege("0BY");
      String string0 = internalUser0.getAcessPrivilege();
      assertEquals("0BY", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setAcessPrivilege("");
      String string0 = internalUser0.getAcessPrivilege();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      Users users0 = internalUser0.getEmail();
      assertNull(users0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      String string0 = internalUser0.getAddressline1();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      int int0 = internalUser0.getUserid();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      String string0 = internalUser0.getZipcode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      String string0 = internalUser0.getState();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      String string0 = internalUser0.getCity();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      int int0 = internalUser0.getPiiaccess();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      String string0 = internalUser0.getAcessPrivilege();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      String string0 = internalUser0.getSsn();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      Long long0 = internalUser0.getId();
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      String string0 = internalUser0.getLastname();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      String string0 = internalUser0.getFirstname();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setAddressline1("");
      String string0 = internalUser0.getAddressline1();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      Users users0 = new Users();
      internalUser0.setEmail(users0);
      users0.setEnabled(1436);
      Users users1 = internalUser0.getEmail();
      assertNull(users1.getPassword());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      String string0 = internalUser0.getMiddlename();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      String string0 = internalUser0.getAddressline2();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      InternalUser internalUser0 = new InternalUser();
      internalUser0.setState(" intrnaluse ");
      String string0 = internalUser0.getState();
      assertEquals(" intrnaluse ", string0);
  }
}
