import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import logger.OurFormatter;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import logger.Lps;
import logger.OurFormatter;
public class User {
    private static final Logger LOGGER = Logger.getLogger(User.class.getName());

    public static FileHandler tx;

    private IOException e1639241310015;

    public static OurFormatter of;

    public static final AtomicInteger counter = new AtomicInteger(0);

    private int userID;

    private String name;

    private int age;

    private String email;

    private String password;

    public User(String name, int age, String email, String password) {
        ;
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
        // auto-increment id
        this.userID = counter.incrementAndGet();
        this.setName(name);
        this.setAge(age);
        this.setEmail(email);
        this.setPassword(password);
    }

    public String toString() {
        Lps lps = new Lps(this.getClass().toString() +".toString",String.valueOf(new Date(System.currentTimeMillis())),"no parameters");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        StringBuilder builder = new StringBuilder();
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
    public String getName() {
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
    public void setName(String name) {
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
    public String getEmail() {
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
    public void setEmail(String email) {
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
    public String getPassword() {
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
    public void setPassword(String password) {
        Lps lps = new Lps(this.getClass().toString() +".setPassword",String.valueOf(new Date(System.currentTimeMillis())),String.valueOf(password));
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        this.password = password;
    }
}