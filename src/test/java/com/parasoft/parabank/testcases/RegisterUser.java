package com.parasoft.parabank.testcases;

import com.parasoft.parabank.base.TestBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.parasoft.parabank.pages.Register;

public class RegisterUser extends TestBase {
    Register reg ;

    @BeforeClass
    public void setup(){

        TestBase.initialize();
        reg= new Register();
    }

    @Test
    public void testRegister(){
        System.out.println("test");

        reg.register();




    }



}
