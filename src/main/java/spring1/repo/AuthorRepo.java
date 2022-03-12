package spring1.repo;


import org.springframework.data.repository.CrudRepository;

import spring1.domain.Author;

public interface AuthorRepo  extends CrudRepository<Author, Long>{
	

}
