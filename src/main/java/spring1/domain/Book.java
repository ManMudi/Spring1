package spring1.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String tittle;
	private String isbn;
	@ManyToMany
	@JoinTable(name = "author_book",joinColumns = @JoinColumn(name="bookid"),
	inverseJoinColumns =@JoinColumn(name="authorid")  )
	private Set<Author> author=new HashSet<>();
	
	public Book() {
		
	}

	
	public Book(String tittle, String isbn) {
		this.tittle = tittle;
		this.isbn = isbn;
	
	}

	public Set<Author> getAuthor() {
		return author;
	}


	public void setAuthor(Set<Author> author) {
		this.author = author;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	
}
