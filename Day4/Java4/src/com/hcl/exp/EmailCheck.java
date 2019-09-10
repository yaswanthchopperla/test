package com.hcl.exp;

public class EmailCheck { 
  /**
  * the main entry point.
  * @param a passed.
  * @throws.
  * @throws.
  */ 

  public void check(String a) throws InvalidUserNameException,InvalidEmailException {  
    boolean flag = true; 
    int s;
    String q;
    s = a.indexOf('@');
    if (s == -1) {  
      flag = false;
      throw new InvalidUserNameException("invalid username");
    }
    q = a.substring(0,s);
    int b;
    b = q.length();
    if (b > 12) { 
      flag = false;
      throw new InvalidUserNameException("long username");
    }
    if (flag == true) { 
      System.out.println(a);
    }
  }
  /**
  * main program.
  * @param args string.
  */
  
  public static void main(String[] args) {  
    try {  
      new EmailCheck().check("sai@gmail.com");
    } catch (InvalidUserNameException  e) { 
      System.out.println("invalid username");
    } catch (InvalidEmailException  e) { 
      System.out.println("invalid Email");
    } catch (Exception e) { 
      e.printStackTrace();
    }
  }
}

