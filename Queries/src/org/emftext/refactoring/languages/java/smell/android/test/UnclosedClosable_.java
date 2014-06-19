package org.emftext.refactoring.languages.java.smell.android.test;

import java.io.Closeable;

public class UnclosedClosable_ {
	public static void close(Closeable closeable) {
	    if (closeable != null) {
	        try {
	            closeable.close();
	        } catch (Exception e) {
	            System.out.println("Unable to close %s");
	        }
	    }
	}
	
	public static void closeAgain(Closeable closeableAgain) {
	    if (closeableAgain != null) {
	        try {
	            closeableAgain.close();
	        } catch (Exception e) {
	            System.out.println("Unable to close %s");
	        }
	    }
	}
}
