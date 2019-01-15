package metier;

import java.util.ArrayList;

public class Pile<T> implements InterfacePile<T> {
	private ArrayList<T> l;
	private int size;

	static final int ERR_VIDE = -1;
	static final int ERR_PLEINE = -2;
	
	public ArrayList<T> getL() {
		return l;
	}
	
	public Pile(int x) {
		this.l = new ArrayList<T>();
		this.size = x;
	}

	public Pile() {
		this.l = new ArrayList<T>();
	}
	
	public void empiler(T val) throws PilePleineException
	{
		if (this.size == this.l.size()) 
			throw new PilePleineException("Pleine", ERR_PLEINE);
		l.add(val);
	}

	public T depiler() throws PileVideException {
		if (l.isEmpty()) throw new PileVideException("Vide",ERR_VIDE);
		T deleted = (T)l.get(l.size() - 1);
		l.remove(l.size() - 1);
		return deleted;
	}
}
