package com.hcl.ex;

class InvalidMailException extends Exception { 
  public InvalidMailException(String error) { 
    super(error);
  }
}