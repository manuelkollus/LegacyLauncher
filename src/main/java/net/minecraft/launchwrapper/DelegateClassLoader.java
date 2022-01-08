package net.minecraft.launchwrapper;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * This class has been created to make the code compatible after migration to Java 11
 * From the JDK 9 release notes: "The application class loader is no longer an instance of
 * java.net.URLClassLoader (an implementation detail that was never specified in previous releases).
 * Code that assumes that ClassLoader.getSystemClassLoader() returns a URLClassLoader object will
 * need to be updated. Note that Java SE and the JDK do not provide an API for applications or
 * libraries to dynamically augment the class path at run-time."
 */
public class DelegateClassLoader extends URLClassLoader {

    public DelegateClassLoader(URL[] urls, ClassLoader parent) {
        super(urls, parent);
    }

    public DelegateClassLoader(ClassLoader parent) {
        super(new URL[0], parent);
    }

    public void addURL(URL url) {
        super.addURL(url);
    }

}
