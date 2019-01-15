package app;

import metier.*;

public class App
{

  public static void main(String[] args)
  {
    Pile stack = new Pile(3);
    try{
      stack.empiler(23);
      stack.empiler(11);
      stack.depiler();
      stack.depiler();
    }
    catch(PileException e)
    {
      System.out.println(e);
    }
 try{
      stack.empiler(23);
      stack.empiler(11);
      stack.empiler(43);
      stack.empiler(99);
    }
    catch(PileException e)
    {
      System.out.println(e);
    }
 try{
      stack.depiler();
      stack.depiler();
      stack.depiler();
      stack.depiler();
    }
    catch(PileException e)
    {
      System.out.println(e);
    }

  }
}
