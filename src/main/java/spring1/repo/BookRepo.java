package spring1.repo;

import org.springframework.data.repository.CrudRepository;

import spring1.domain.Book;

public interface BookRepo extends CrudRepository<Book, Long> {
	
	

}
