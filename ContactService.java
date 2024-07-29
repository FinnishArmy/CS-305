package com.firstprogram;

import java.util.TreeMap;
import java.util.Map;

/**
 * @author ronnyvaltonen_snhu
 * @date 7/17/2024
 * @version 1.0.0
 *
 */
public class ContactService {
    private final Map<String, Contact> contacts;

    public ContactService() {
        this.contacts = new TreeMap<>();
    }

    // Create a new contact
    public void addContact(String contactId, String firstName, String lastName, String phone, String address) {
        contacts.put(contactId, new Contact(contactId, firstName, lastName, phone, address));
    }

    // Given an ID, delete the contact, if it exists.
    public void deleteContact(String contactId) {
    	// Ensure that the ID actually exists.
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Cannot delete ID that does not exist.");
        }
        contacts.remove(contactId);
    }

    // Given an ID, update the contact, if it exists.
    public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
        Contact contact = contacts.get(contactId);
        // Ensure the ID actually exists.
        if (contact == null) {
            throw new IllegalArgumentException("This ID was not found.");
        }

        // Update the fields with the new information.
        // Given that they pass the if statements.
        if (firstName != null && !firstName.isEmpty()) {
            contact.setFirstName(firstName);
        }
        if (lastName != null && !lastName.isEmpty()) {
            contact.setLastName(lastName);
        }
        if (phone != null && !phone.isEmpty()) {
            contact.setPhone(phone);
        }
        if (address != null && !address.isEmpty()) {
            contact.setAddress(address);
        }
    }

    // Use the ID to get the contact.
    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}
