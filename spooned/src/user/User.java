package user;
public class User {
    private static final java.util.concurrent.atomic.AtomicInteger counter = new java.util.concurrent.atomic.AtomicInteger(0);

    private int userID;

    private java.lang.String name;

    private int age;

    private java.lang.String email;

    private java.lang.String password;

    public User(java.lang.String name, int age, java.lang.String email, java.lang.String password) {
        System.out.println("Enter in the method <init> from class User");
        // auto-increment id
        this.userID = user.User.counter.incrementAndGet();
        this.setName(name);
        this.setAge(age);
        this.setEmail(email);
        this.setPassword(password);
    }

    public java.lang.String toString() {
        System.out.println("Enter in the method toString from class User");
        java.lang.StringBuilder builder = new java.lang.StringBuilder();
        builder.append((("User ID : " + this.getUserID()) + "\nName : ") + this.getName());
        return builder.toString();
    }

    /**
     *
     *
     * @return the userID
     */
    public int getUserID() {
        System.out.println("Enter in the method getUserID from class User");
        return userID;
    }

    /**
     *
     *
     * @return the name
     */
    public java.lang.String getName() {
        System.out.println("Enter in the method getName from class User");
        return name;
    }

    /**
     *
     *
     * @param name
     * 		the name to set
     */
    public void setName(java.lang.String name) {
        System.out.println("Enter in the method setName from class User");
        this.name = name;
    }

    /**
     *
     *
     * @return the age
     */
    public int getAge() {
        System.out.println("Enter in the method getAge from class User");
        return age;
    }

    /**
     *
     *
     * @param age
     * 		the age to set
     */
    public void setAge(int age) {
        System.out.println("Enter in the method setAge from class User");
        this.age = age;
    }

    /**
     *
     *
     * @return the email
     */
    public java.lang.String getEmail() {
        System.out.println("Enter in the method getEmail from class User");
        return email;
    }

    /**
     *
     *
     * @param email
     * 		the email to set
     */
    public void setEmail(java.lang.String email) {
        System.out.println("Enter in the method setEmail from class User");
        this.email = email;
    }

    /**
     *
     *
     * @return the password
     */
    public java.lang.String getPassword() {
        System.out.println("Enter in the method getPassword from class User");
        return password;
    }

    /**
     *
     *
     * @param password
     * 		the password to set
     */
    public void setPassword(java.lang.String password) {
        System.out.println("Enter in the method setPassword from class User");
        this.password = password;
    }
}