package metier;

public interface InterfacePile<T> {
	public void empiler(T val) throws PilePleineException;
	public T depiler() throws PileVideException;
}
