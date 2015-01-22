package tw.eric.dao.impl;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.eric.dao.DvdDao;
import tw.eric.domain.Dvd;
import tw.eric.util.HibernateUtil;

@Service
public class DvdDaoImpl implements DvdDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	 
	
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }

	@Override
	public void add(Dvd dvd) {
		System.out.println("DvdDao add");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		dvd.setId(new Random().nextInt(50) + 1);
		session.save(dvd); // 儲存 Dvd 實體
		session.getTransaction().commit(); // 確認變更
		session.close(); // 關閉此次操作過程

	}

	@Override
	public List<Dvd> getAll() {
		// TODO Auto-generated method stub
		System.out.println("DvdDao getAll");
		return null;
	}

}
