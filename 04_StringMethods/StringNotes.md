# Strings
String is a non-primitive type. String is sequence of characters(Array of characters). String is a class in java.

    public final class String extends Object implements CharSequence, Serializable, comparable
    {
        _ _ ___________
        _ _ ___________Methods
    }

**🔸So, if string is class in java we can create an object of string:**

    String s = new String( );       # We create object with the help of new keyword

    # This object is immutable

**🔸We can create string with the help of 3 classes:**

**1. String**

**2. StringBuffer**

**3. StringBuilder**

**🔸"==" operator** is used to compare the references/address of the object.

**🔸equals( ) Method** is used to compare the content or value of object of String class but equals(Object obj) method of Object class is used to compare references and "equals( )" method is method of Object class in java.

**🔸There are total 11 methods inside the Object Class:**

**1. clone( )** 

**2. equals(Object obj)**

**3. finalize( )**

**4. getClass( )**

**5. hashCode( )**

**6. notify( )**

**7. notifyAll( )**

**8. toString( )**

**9. wait( )**

**10. wait( long timeout)**

**11. wait(long timeout, int nanos)**

**🔸Some commonly used constructors inside String class:**

**1. No argument constructor -- public String() { }**

**2. public String(String s) {---}**

**3. public String(StringBuffer sb) {---}**

**4. public String(StringBuilder sb) {---}**

**5. public String(char [] ch) {---}**

**6. public String(byte[] b) {---}**

