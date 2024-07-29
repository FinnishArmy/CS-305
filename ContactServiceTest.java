package com.firstprogram;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
// Import so we can give a name to the JUnit testing
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author ronnyvaltonen_snhu
 * @date 7/17/2024
 * @version 1.0.0
 *
 */

// Using the following website, I learned that you can give a name to each JUnit 5 test.
// https://junit.org/junit5/docs/5.0.3/api/org/junit/jupiter/api/DisplayName.html#:~:text=Annotation%20Type%20DisplayName&text=%40DisplayName%20is%20used%20to%20declare,special%20characters%2C%20and%20even%20emoji.
// Display names are typically used for test reporting in IDEs and build tools and may contain spaces, special characters, and even emoji.

public class ContactServiceTest {
    private ContactService contactService;

    @BeforeEach
    // Before every test, use the ContactService function to create a new contact.
    public void setUp() {
        contactService = new ContactService();
    }

    @Test
    @DisplayName("Contact creation has unique ID")
    // The contact service shall be able to add contact with a unique ID
    public void testAddContactSuccess() {
    	//Attempt to create a contact ID
        contactService.addContact("1111111111", "Ronny", "Valtonen", "9713972852", "1234 Hawthorne St");
        Contact contact = contactService.getContact("1111111111");
        assertNotNull(contact);
        assertEquals("1111111111", contact.getContactId());
        assertEquals("Ronny", contact.getFirstName());
        assertEquals("Valtonen", contact.getLastName());
        assertEquals("9713972852", contact.getPhone());
        assertEquals("1234 Hawthorne St", contact.getAddress());
    }

    @Test
    @DisplayName("Contact serice can delite contact using contact ID")
    // The contact service shall be able to delete contact per contact ID.
    public void testDeleteContactSuccess() {
    	// Make the contact
        contactService.addContact("1111111111", "Ronny", "Valtonen", "9713972852", "1234 Hawthorne St");
        // Delete the contact
        contactService.deleteContact("1111111111");
        // Check for the contact
        assertNull(contactService.getContact("1111111111"));
    }

    @Test
    @DisplayName("Contact service can update contact using all fields.")
    // The contact service shall be able to update contact fields per contact ID, firstName, lastName, Number and Address.
    public void testUpdateContactSuccess() {
    	// Make the contact
        contactService.addContact("1111111111", "Ronny", "Valtonen", "9713972852", "1234 Hawthorne St");
        // Run the update contact function
        contactService.updateContact("1111111111", "Randel", "Zacharias", "3607876620", "8103 NE 13th Ave");
        Contact updatedContact = contactService.getContact("1111111111");
        assertEquals("Randel", updatedContact.getFirstName());
        assertEquals("Zacharias", updatedContact.getLastName());
        assertEquals("3607876620", updatedContact.getPhone());
        assertEquals("8103 NE 13th Ave", updatedContact.getAddress());
    }
}
