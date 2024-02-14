package Quiz2;

public interface quiz19 {
    void m1() throws java.io.IOException;

    //1. May not declare to throw any checked exception,
    //2. May declare to throw the same checked exception thrown by super class / interface method,
    //3. May declare to throw the sub class of the exception thrown by super class / interface method,
    //4. Cannot declare to throw the super class of the exception thrown by super class / interface method

    //throw exception, class must capture the exception
}