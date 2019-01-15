package metier;

public class PilePleineException extends PileException
{
  public PilePleineException(String mess, int code)
  {
    super();
    System.out.println("Exception levée la pile est " + mess);
  }

  public int getCodeErreur()
  {
    return this.code;
  }
}
