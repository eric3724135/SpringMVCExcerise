package tw.eric.dao;

import java.util.List;

import tw.eric.domain.Director;

public interface DirectorDao {

	public void add(Director director);

	public List<Director> getAll();
}
