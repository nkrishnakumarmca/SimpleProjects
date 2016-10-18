/**
 * 
 */
package com.trainig.junit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;


/**
 * @author 559207
 *
 */
public class EmailValidationTest {
    
    private EmailValidation emailValidation;
    
    @Before
    public void createObj(){
        emailValidation = new EmailValidation();
    }
    
    @Test
    public void test() {
       // fail("Not yet implemented");
        assertTrue(emailValidation.validateEmail("a@gmail.com"));
    }
    
}
