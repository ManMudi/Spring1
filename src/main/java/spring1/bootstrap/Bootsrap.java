package spring1.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import spring1.domain.Author;
import spring1.domain.Book;
import spring1.repo.AuthorRepo;
import spring1.repo.BookRepo;

@Component
public class Bootsrap implements CommandLineRunner {
	
	private final AuthorRepo arepo;
	private final BookRepo brepo;
	
	

	public Bootsrap(AuthorRepo arepo, BookRepo brepo) {
		this.arepo = arepo;
		this.brepo = brepo;
	}



	@Override
	public void run(String... args) throws Exception {
		
	Author a1=new Author("Mohamed","Yusuph");
	Book b1=new Book("Welcome To JAVA World","ISBN8855");
	
	Author a2=new Author("Zainab","Makame");
	Book b2=new Book("Welcome To Health World","ISBN895100125");
	
	a1.getBook().add(b1);
	b1.getAuthor().add(a1);
	
	a2.getBook().add(b2);
	b2.getAuthor().add(a2);
	
	arepo.save(a1);
	brepo.save(b1);
	
	arepo.save(a2);
	brepo.save(b2);
		
	System.out.println("Welcome to new World");
	System.out.println("Total number of Books is :"+brepo.count());
	System.out.println("Total number of Authors is :"+arepo.count());
		
	}

}
