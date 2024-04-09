/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edu.csuohio.maventtestlib;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fiske
 */
public class MaventTestLibTest {
    
    public MaventTestLibTest() {
    }

 /*
    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
*/    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of someMethod method, of class MaventTestLib.
     */
    @org.junit.Test
    public void testSomeMethod() {
        System.out.println("someMethod");
        MaventTestLib instance = new MaventTestLib();
        int expResult = 64;
        int result = instance.someMethod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    
    
    @org.junit.Test
    public void testSomeMethodFail() {
        System.out.println("someMethod");
        MaventTestLib instance = new MaventTestLib();
        int expResult = 64;
        int result = instance.someMethod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
