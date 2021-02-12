package com.group9.bankofaz.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.group9.bankofaz.model.BankAccount;
import com.group9.bankofaz.model.ExternalUser;
import com.group9.bankofaz.model.Users;
import java.sql.Blob;
import java.util.LinkedList;
import java.util.List;
import javax.sql.rowset.serial.SerialBlob;
import org.junit.runner.RunWith;

public class ExternalUser_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setZipcode(" email : ");
      String string0 = externalUser0.getZipcode();
      assertEquals(" email : ", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setZipcode("");
      String string0 = externalUser0.getZipcode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setUsertype("rws^V3@E<Y=_%:Q");
      String string0 = externalUser0.getUsertype();
      assertEquals("rws^V3@E<Y=_%:Q", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setUsertype("");
      String string0 = externalUser0.getUsertype();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setUserid(13);
      int int0 = externalUser0.getUserid();
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setUserid((-1));
      int int0 = externalUser0.getUserid();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setState(" usertype :");
      String string0 = externalUser0.getState();
      assertEquals(" usertype :", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setState("");
      String string0 = externalUser0.getState();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setSsn(" lastname : ");
      String string0 = externalUser0.getSsn();
      assertEquals(" lastname : ", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setSsn("");
      String string0 = externalUser0.getSsn();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      byte[] byteArray0 = new byte[4];
      SerialBlob serialBlob0 = new SerialBlob(byteArray0);
      externalUser0.setPublickey(serialBlob0);
      Blob blob0 = externalUser0.getPublickey();
      assertSame(blob0, serialBlob0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setMiddlename("-M>!U");
      String string0 = externalUser0.getMiddlename();
      assertEquals("-M>!U", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setMiddlename("");
      String string0 = externalUser0.getMiddlename();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      Users users0 = new Users();
      externalUser0.setEmail(users0);
      String string0 = externalUser0.getLogDetail();
      assertEquals(" externaluser  userid :0 firstname : null middlename : null lastname : null email : null addressline1 :null addressline2 : null city : null state : null zipcode :null usertype :null", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setLastname("}<u{$N+");
      String string0 = externalUser0.getLastname();
      assertEquals("}<u{$N+", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setLastname("");
      String string0 = externalUser0.getLastname();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setUserid(2340);
      Long long0 = externalUser0.getId();
      assertEquals(2340L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setUserid((-943));
      Long long0 = externalUser0.getId();
      assertEquals((-943L), (long)long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setUserid((-1));
      Long long0 = externalUser0.getId();
      assertEquals((-1L), (long)long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setFirstname("W");
      String string0 = externalUser0.getFirstname();
      assertEquals("W", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setFirstname("");
      String string0 = externalUser0.getFirstname();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      Users users0 = new Users();
      users0.setFailure(1619);
      externalUser0.setEmail(users0);
      Users users1 = externalUser0.getEmail();
      assertEquals(1619, users1.getFailure());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      Users users0 = new Users();
      users0.setFailure((-943));
      externalUser0.setEmail(users0);
      Users users1 = externalUser0.getEmail();
      assertEquals(0, users1.getEnabled());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      Users users0 = new Users();
      users0.setEnabled(52);
      externalUser0.setEmail(users0);
      Users users1 = externalUser0.getEmail();
      assertNull(users1.getUsername());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      Users users0 = new Users();
      users0.setEnabled((-1));
      externalUser0.setEmail(users0);
      Users users1 = externalUser0.getEmail();
      assertNull(users1.getUsername());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setCity("Uy&y#.Vk");
      String string0 = externalUser0.getCity();
      assertEquals("Uy&y#.Vk", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setBname(" externaluser ");
      String string0 = externalUser0.getBname();
      assertEquals(" externaluser ", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setBName("");
      String string0 = externalUser0.getBname();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setBname("}<u{$N+");
      String string0 = externalUser0.getBName();
      assertEquals("}<u{$N+", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setBName("");
      String string0 = externalUser0.getBName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setAddressline2("|u1Iv5");
      String string0 = externalUser0.getAddressline2();
      assertEquals("|u1Iv5", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setAddressline2("");
      String string0 = externalUser0.getAddressline2();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setAddressline1(" addressline1 :");
      String string0 = externalUser0.getAddressline1();
      assertEquals(" addressline1 :", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setAddressline1("");
      String string0 = externalUser0.getAddressline1();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      LinkedList<BankAccount> linkedList0 = new LinkedList<BankAccount>();
      externalUser0.setAccount(linkedList0);
      List<BankAccount> list0 = externalUser0.getAccount();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      LinkedList<BankAccount> linkedList0 = new LinkedList<BankAccount>();
      linkedList0.add((BankAccount) null);
      externalUser0.setAccount(linkedList0);
      List<BankAccount> list0 = externalUser0.getAccount();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      String string0 = externalUser0.getBname();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      String string0 = externalUser0.getState();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      String string0 = externalUser0.getFirstname();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      externalUser0.setCity("");
      String string0 = externalUser0.getCity();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      String string0 = externalUser0.getSsn();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      String string0 = externalUser0.getAddressline2();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      int int0 = externalUser0.getUserid();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      String string0 = externalUser0.getUsertype();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      Blob blob0 = externalUser0.getPublickey();
      assertNull(blob0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      String string0 = externalUser0.getAddressline1();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      String string0 = externalUser0.getMiddlename();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      List<BankAccount> list0 = externalUser0.getAccount();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      String string0 = externalUser0.getCity();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      Long long0 = externalUser0.getId();
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      String string0 = externalUser0.getZipcode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      String string0 = externalUser0.getLastname();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      String string0 = externalUser0.getBName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ExternalUser externalUser0 = new ExternalUser();
      Users users0 = externalUser0.getEmail();
      assertNull(users0);
  }
}
