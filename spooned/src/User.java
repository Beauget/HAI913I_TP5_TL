public class User {
    private static final java.util.logging.Logger LOGGER = Logger.getLogger(User.class.getName());

    public static java.util.logging.FileHandler tx;

    private java.io.IOException e1638964630220;

    public static logger.OurFormatter of;

    public static final java.util.concurrent.atomic.AtomicInteger counter = new java.util.concurrent.atomic.AtomicInteger(0);

    private int userID;

    private java.lang.String name;

    private int age;

    private java.lang.String email;

    private java.lang.String password;

    public User(java.lang.String name, int age, java.lang.String email, java.lang.String password) {
        ;
        // auto-increment id
        this.userID = User.counter.incrementAndGet();
        this.setName(name);
        this.setAge(age);
        this.setEmail(email);
        this.setPassword(password);
          of = new OurFormatter();
                try {
                	tx =  new FileHandler("loggingRepository.json");
        		} catch (SecurityException e) {
        		// TODO Auto-generated catch block
        					e.printStackTrace();
        		} catch (IOException e) {
        		// TODO Auto-generated catch block
        					e.printStackTrace();
        				}
                		
                tx.setFormatter(of);
                		
                LOGGER.addHandler(tx);;
    }

    public java.lang.String toString() {
        Lps lps = new Lps(this.getClass().toString() +".toString",String.valueOf(new Date(System.currentTimeMillis())),"no parameters");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
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
        Lps lps = new Lps(this.getClass().toString() +".getUserID",String.valueOf(new Date(System.currentTimeMillis())),"no parameters");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        return userID;
    }

    /**
     *
     *
     * @return the name
     */
    public java.lang.String getName() {
        Lps lps = new Lps(this.getClass().toString() +".getName",String.valueOf(new Date(System.currentTimeMillis())),"no parameters");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        return name;
    }

    /**
     *
     *
     * @param name
     * 		the name to set
     */
    public void setName(java.lang.String name) {
        Lps lps = new Lps(this.getClass().toString() +".setName",String.valueOf(new Date(System.currentTimeMillis())),String.valueOf(name));
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        this.name = name;
    }

    /**
     *
     *
     * @return the age
     */
    public int getAge() {
        Lps lps = new Lps(this.getClass().toString() +".getAge",String.valueOf(new Date(System.currentTimeMillis())),"no parameters");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        return age;
    }

    /**
     *
     *
     * @param age
     * 		the age to set
     */
    public void setAge(int age) {
        Lps lps = new Lps(this.getClass().toString() +".setAge",String.valueOf(new Date(System.currentTimeMillis())),String.valueOf(age));
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        this.age = age;
    }

    /**
     *
     *
     * @return the email
     */
    public java.lang.String getEmail() {
        Lps lps = new Lps(this.getClass().toString() +".getEmail",String.valueOf(new Date(System.currentTimeMillis())),"no parameters");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        return email;
    }

    /**
     *
     *
     * @param email
     * 		the email to set
     */
    public void setEmail(java.lang.String email) {
        Lps lps = new Lps(this.getClass().toString() +".setEmail",String.valueOf(new Date(System.currentTimeMillis())),String.valueOf(email));
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        this.email = email;
    }

    /**
     *
     *
     * @return the password
     */
    public java.lang.String getPassword() {
        Lps lps = new Lps(this.getClass().toString() +".getPassword",String.valueOf(new Date(System.currentTimeMillis())),"no parameters");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        return password;
    }

    /**
     *
     *
     * @param password
     * 		the password to set
     */
    public void setPassword(java.lang.String password) {
        Lps lps = new Lps(this.getClass().toString() +".setPassword",String.valueOf(new Date(System.currentTimeMillis())),String.valueOf(password));
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        this.password = password;
    }
}