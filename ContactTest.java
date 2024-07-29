package com.firstprogram;

import static org.junit.jupiter.api.Assertions.*;

//Import so we can give a name to the JUnit testing
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

// I was confused on how to run JUnit Tests in Eclipse
// so I used this website to help me: https://www.seas.upenn.edu/~cis120/archive/20sp/eclipse_setup.shtml
/**
 * @author ronnyvaltonen_snhu
 * @date 7/17/2024
 * @version 1.0.0
 *
 */
public class ContactTest {
	
	// When creating object contact, pass the values in from the constructor
	
    @Test
    @DisplayName("Contact ID is less than 10 characters.")
    // The contact object shall have a required unique contact ID string that cannot be longer than 10 characters.
    public void testIDgreaterThan10characters() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        	// Create a contact with an ID with more than 10 characters.
            new Contact("22222222222", "Ronny", "Valtonen", "9713972852", "1234 Hawthorne St");
        });
        // Due to longer than 10, throw an error.
        assertEquals("Invalid contact ID", exception.getMessage());
    }

    @Test
    @DisplayName("Contact ID is not NULL.")
    // The contact ID shall not be null.
    public void testIDisNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        	// Create a contact with a null Contact ID.
            new Contact(null, "Ronny", "Valtonen", "9713972852", "1234 Hawthorne St");
        });
        // Product an error since the Contact ID is null.
        assertEquals("Invalid contact ID", exception.getMessage());
    }
    
    @Test
    @DisplayName("Contact ID is not updatable.")
    // The contact ID shall not be updatable.
    
    /* 
     * This can be checked by making sure that there is no method allowing the field to be changed
     * after the object is constructed.
     */
    public void testIDNotUpdatable() throws NoSuchFieldException, SecurityException {
        // Verify there's no setter for contactId.
        assertThrows(NoSuchMethodException.class, () -> {
            Contact.class.getDeclaredMethod("setContactId", String.class);
        });

        // Ensure contactId field is final.
        Field field = Contact.class.getDeclaredField("contactId");
        assertTrue(Modifier.isFinal(field.getModifiers()));
    }

    @Test
    @DisplayName("First Name is less than 10 characters.")
    // The contact object shall have a required firstName String field that cannot be longer than 10 characters.
    public void testFirstNameGreaterThan10Characters() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        	// Create a contact with a first name field longer than 10 characters.
            new Contact("1111111111", "RonnyRonnyy", "Valtonen", "9713972852", "1234 Hawthorne St");
        });
        // Throw an error because the first name is longer than 10 characters.
        assertEquals("Invalid first name", exception.getMessage());
    }

    @Test
    @DisplayName("First name is not NULL.")
    // The firstName field shall not be null.
    public void testFirstNameIsNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        	// Create a contact with the first name field set to Null.
            new Contact("1111111111", null, "Valtonen", "9713972852", "1234 Hawthorne St");
        });
        // Throw an error because the first name is null.
        assertEquals("Invalid first name", exception.getMessage());
    }

    @Test
    @DisplayName("Last name is less than 10 characters.")
    // The contact object shall have a required lastName field that cannot be longer than 10 characters.
    public void testLastNameGreaterThan10Characters() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        	// Create a contact with the last longer than 10 characters.
            new Contact("1111111111", "Ronny", "Valtonennnn", "9713972852", "1234 Hawthorne St");
        });
        // Throw an error because the last name is longer than 10 characters.
        assertEquals("Invalid last name", exception.getMessage());
    }

    @Test
    @DisplayName("Last name is not NULL.")
    // The lastName field shall not be null.
    public void testLastNameIsNull() {
    	// Create a contact with the lastName field as Null.
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1111111111", "Ronny", null, "9713972852", "1234 Hawthorne St");
        });
        // Throw an error because the last name field is null.
        assertEquals("Invalid last name", exception.getMessage());
    }

    @Test
    @DisplayName("Phone field is exactly 10 characters.")
    // The contact object shall have a required phone String field that must be exactly 10 digits.
    public void testPhoneIsNot10Digits() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        	// Create a contact where the phone field is not 10 digits.
            new Contact("1111111111", "Ronny", "Valtonen", "971397", "1234 Hawthorne St");
        });
        // Throw an error because the phone number is not 10 digits.
        assertEquals("Invalid phone number", exception.getMessage());
    }

    @Test
    @DisplayName("Phoen field is not NULL.")
    // The phone field shall not be null.
    public void testPhoneIsNull() {
    	// Create a contact where the phone field is null.
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1111111111", "Ronny", "Valtonen", null, "1234 Hawthorne St");
        });
        // Throw an error an error because the phone field is Null.
        assertEquals("Invalid phone number", exception.getMessage());
    }

    @Test
    // The contact object shall have a required address field that must be no longer than 30 characters.
    public void testAddressIsGreaterThan30Characters() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        	// Create a contact with an address field too long
            new Contact("1111111111", "Ronny", "Valtonen", "9713972852", "7770 North Bradford Drive Wellington, FL 33414");
        });
        // Throw an error because the contact address is too long.
        assertEquals("Invalid address", exception.getMessage());
    }

    @Test
    public void testAddressIsNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "John", "Doe", "0123456789", null);
        });
        assertEquals("Invalid address", exception.getMessage());
    }
}
