/**
 * 
 */
package com.firstprogram;

/**
 * @author ronnyvaltonen_snhu
 * @date 7/17/2024
 * @version 1.0.0
 *
 *
 *	@description This contact class creates and stores information related to contacts of a person.
 */
public class Contact {
	// Constants for field sizes
	private static final int CONTACT_ID_MAX_LENGTH = 10;
	private static final int NAME_MAX_LENGTH = 10;
	private static final int PHONE_LENGTH = 10;
	private static final int ADDRESS_MAX_LENGTH = 30;
    // Required fields
    private final String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    // Constructor
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        // Assign contact id if its not null and less than 10
        if (contactId == null || contactId.length() > CONTACT_ID_MAX_LENGTH) {
            throw new IllegalArgumentException("Invalid contact ID");
        }
        this.contactId = contactId;

        // Assign first name if its not null and less than 10
        if (firstName == null || firstName.length() > NAME_MAX_LENGTH) {
            throw new IllegalArgumentException("Invalid first name");
        }
        this.firstName = firstName;

        // Assign last name if its not null and less than 10
        if (lastName == null || lastName.length() > NAME_MAX_LENGTH) {
            throw new IllegalArgumentException("Invalid last name");
        }
        this.lastName = lastName;

        // Assign phone number if its not null
        // Check to also ensure the phone number doesn't have other characters except digits.
        if (phone == null || phone.length() != PHONE_LENGTH || !phone.matches("\\d+")) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phone = phone;

        // Assign address if its not null and less than 30
        if (address == null || address.length() > ADDRESS_MAX_LENGTH) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }

    // Getters
    // Return the values given by the data.
    // Set to protected, which means they can only be accessed within the same package and subclasses.
    protected String getContactId() {
        return contactId;
    }

    protected String getFirstName() {
        return firstName;
    }

    protected String getLastName() {
        return lastName;
    }

    protected String getPhone() {
        return phone;
    }

    protected String getAddress() {
        return address;
    }

    // Setters
    // Set the values as long as it passes the test.
    public void setFirstName(String firstName) {
    	// Set the first name if its not null and not greater than 10 characters.
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
    	// Set the last name if its not null and not greater than 10 characters.
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
    	// Set the phone field if its not null and matches exactly 10 characters .
        if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phone = phone;
    }

    public void setAddress(String address) {
    	// Set the address if it's not null and not greater than 30 characters.
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }
}
