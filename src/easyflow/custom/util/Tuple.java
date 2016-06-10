package easyflow.custom.util;

public class Tuple<X, Y> { 
	  public final X parent; 
	  public final Y child; 
	  public Tuple(X x, Y y) { 
	    this.parent = x; 
	    this.child = y; 
	  } 
	} 
