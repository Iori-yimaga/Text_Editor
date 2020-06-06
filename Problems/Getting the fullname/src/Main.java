class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName; // write your code here
    }

    public void setLastName(String lastName) {
        this.lastName = lastName; // write your code here
    }

    public String getFullName() {

        if (firstName == null && lastName == null) {
            return "Unknown";
        } else if (lastName == null) {
            return firstName;
        } else if (firstName == null) {
            return lastName;
        } else {
            return firstName + " " + lastName;
        }

    }
}