Why strings are immutable in Java? 
  
  // Java Program to demonstrate why
// Java Strings are immutable
 
import java.io.*;
 
class GFG {
    public static void main(String[] args)
    {
        String s1 = "java";
        s1.concat(" rules");
 
        // Yes, s1 still refers to "java"
        System.out.println("s1 refers to " + s1);
    }
}

// Output s1 refers to java

The reference variable s1 still refers to the original string “java”.

Almost every method, applied to a String object in order to modify it, creates a new String object. So, where do these String objects go? Well, these exist in memory, and one of the key goals of any programming language is to make efficient use of memory.

As applications grow, it’s very common for String literals to occupy a large area of memory, which can even cause redundancy. So, in order to make Java more efficient, the JVM sets aside a special area of memory called the “String constant pool”.

When the compiler sees a String literal, it looks for the String in the pool. If a match is found, the reference to the new literal is directed to the existing String and no new String object is created. The existing String simply has one more reference. Here comes the point of making String objects immutable:

In the String constant pool, a String object is likely to have one or many references. If several references point to the same String without even knowing it, it would be bad if one of the references modified that String value. That’s why String objects are immutable.

Well, now you could say, what if someone overrides the functionality of the String class? That’s the reason that the String class is marked final so that nobody can override the behavior of its methods.
