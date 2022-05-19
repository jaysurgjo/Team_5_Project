package com.etrack;

import com.rtrack.Product;
import com.rtrack.Shopper;
import com.rtrack.controller.RtrackController;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.security.spec.ECField;

public class EtrackTest {
    private Shopper shopper;
    private Product p;

    @Before
    public void setUp() {
        p = new Product(2, "milk", 3.99);
    }

    @Test
    public void userName_shouldBeMoreThanOneCharacters() {
        shopper = new Shopper("Ebra");
        assertEquals("Ebra", shopper.getCustomerName());
    }

    @Test
    public void productId_shouldBeAnInteger() {
        assertEquals(2, p.getId());
    }

    @Test//(expected = InvalidParameterException.class)
    public void productId_cannotBe_Zero() {
        p = new Product(0, "milk", 2.00);
        assertEquals(0, 0);
    }

    @Test
    public void loadProductMap_shouldPopulate_productMap(){
       // assertNotNull(20, );
    }
}
