/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author tim78317
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String state;
    private String zip;
    private String email;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String streetAddress, String state, String zip, String email, 
            String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" + "firstName=" + firstName + ", lastName=" + lastName + ", streetAddress=" 
                + streetAddress + ", state=" + state + ", zip=" + zip + ", email=" + email + 
                ", phoneNumber=" + phoneNumber + '}';
    }
    
}
