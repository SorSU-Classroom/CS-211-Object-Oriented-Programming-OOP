package com.oop.AccessModifier.Outside;

/**
 * The import statement below will not work because the
 * DefaultAccessModifier class is in a different package
 * and has default access modifier
 */
//import com.oop.AccessModifier.Default.DefaultAccessModifier;
import com.oop.AccessModifier.Protected.ProtectedAccessModifier;

public class Outside {
	public static void main(String[] args) {
		ProtectedAccessModifier protA = new ProtectedAccessModifier();
	}
}
