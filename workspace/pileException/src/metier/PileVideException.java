package metier;

public class PileVideException extends PileException
{
  public PileVideException(String mess, int code)
  {
    super();
    System.out.println("Exception levée la pile est " + mess);
  }

  public int getCodeErreur()
  {
    return this.code;
  }
}