package tw.eric.service;

import java.util.List;

import tw.eric.domain.Dvd;

public interface DvdService {
	
	public void addDvd(Dvd dvd);
	
	public List<Dvd> getDvds();

}
