
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    public String str;
    private static Singleton instance = null;
    private Singleton(){
        
    }
    public static Singleton getSingleInstance(){
        if(instance==null) instance = new Singleton();
        return instance;
    }
}
