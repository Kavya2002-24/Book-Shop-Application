package BookWeb_Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import BookWeb_Dto.Book_Dto;


public class Book_Dao {
  EntityManagerFactory e=Persistence.createEntityManagerFactory("Book");
  EntityManager m=e.createEntityManager();
  EntityTransaction t=m.getTransaction();
  
  
public String insert(Book_Dto bto) {
	t.begin();
	m.persist(bto);
	t.commit();
	return "Record is Registerd succesfully";
	
}


        public Object fetchAll() {
	   	//select vn from table_name vn;
	   	Query q=m.createQuery("select a from Book_Dto a");
	   	List<Book_Dto> ls=q.getResultList();
	   	if(ls.isEmpty())
	   	{
	   		return "no data found";
	   	}
	   	else
	   		return ls;
	   }

        
		public String deleteById(int id) {
			Book_Dto ds=m.find(Book_Dto.class, id);
			if(ds!=null)
			{
				t.begin();
				m.remove(ds);
				t.commit();
				return "data deleted";
			}
			else
				return "no data deleted";
		
		}


	


		public String update(Book_Dto bto) {
			t.begin();
			m.merge(bto);
			t.commit();
			
			return "data updated";
		}


	
}

