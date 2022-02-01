package com.crm.Organization;

import org.testng.annotations.Test;
public class OrganizationTest {
 
@Test(groups = "smokeTest")
public void createOrgTest() {
System.out.println("excute createOrgTest");
}
@Test(groups = "regressionTest")
public void modifyOrgTest() {
System.out.println("excute modifyOrgTest");
}

}