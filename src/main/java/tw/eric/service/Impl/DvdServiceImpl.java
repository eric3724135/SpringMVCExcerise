package tw.eric.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.eric.dao.DirectorDao;
import tw.eric.dao.DvdDao;
import tw.eric.domain.Director;
import tw.eric.domain.Dvd;
import tw.eric.service.DvdService;

@Service
public class DvdServiceImpl implements DvdService {
	
	@Autowired
	private DvdDao dvdDao;
	

	@Override
	public void addDvd(Dvd dvd) {
		System.out.println("DvdService addDvd");
		Director director = new Director("eric");
		director.setId(1);
		dvdDao.add(dvd);

	}

	@Override
	public List<Dvd> getDvds() {
		System.out.println("DvdService getdvds");
		return null;
	}

}
