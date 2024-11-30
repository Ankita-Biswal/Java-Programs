package com.exceptionhandling;

public class insufficientBalException extends Exception {
  public insufficientBalException() {
	  super("Less Balance");
  }
}
