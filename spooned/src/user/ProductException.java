package user;
public class ProductException extends java.lang.Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ProductException(java.lang.String s) {
        super(s);
        System.out.println("Enter in the method <init> from class ProductException");
    }
}