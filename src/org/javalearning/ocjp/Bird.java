package org.javalearning.ocjp;
import java.io.*;
class Tail {}
public class Bird implements Serializable {
    private String name;
    private transient int age;
    private Tail tail;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public Tail getTail() { return tail; }
    public void setTail(Tail tail) { this.tail = tail; }

    public static void main(String[] args) {
        try(ObjectInputStream is = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("birds.dat")))) {
            Bird bird = (Bird) is.readObject();
        } catch (ClassNotFoundException | IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}

/*
    A. It compiles and runs without issue.
    B. The code will not compile because of line 3.
    C. The code will not compile because of line 5.
    D. The code will not compile because of lines 16–17.
    E. The code will not compile because of line 18.
    F. It compiles but throws an exception at runtime.
 */
// Ans - D, E
// Note : code has been modified to fix CE
/*
    The code does not compile due to a number of issues, so A and F are incorrect. First off, the readObject() method
    is not available to the InputStream class, and since the ObjectInputStream has been upcast to InputStream,
    the code will not compile due to line 18, so E is correct. Line 18 will also not compile because the return
    type of readObject() is of type Object and must be cast explicitly to Bird in order to be assigned to the Bird
    reference. Furthermore, constructors and methods on lines 16, 17, and 18 throw checked IOExceptions that must be
    caught, so D is also correct. Note that line 18 also throws ClassNotFoundException. Lines 3 and 5 compile without
    issue, so B and C are incorrect. It should be noted that even if the compilation problems were resolved, the code
    would still throw an exception at runtime since the Bird class includes a Tail reference as a member, and the Tail
    class does not implement Serializable.
 */