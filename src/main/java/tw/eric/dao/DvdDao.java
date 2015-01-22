package tw.eric.dao;

import java.util.List;

import tw.eric.domain.Dvd;

public interface DvdDao {
	
	public void add(Dvd dvd);
	
	public List<Dvd> getAll();

}
