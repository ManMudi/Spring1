package spring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spring1.repo.BookRepo;

@Controller
public class BookController {
	
	private final BookRepo bookRepo;

	public BookController(BookRepo bookRepo) {
		this.bookRepo = bookRepo;
	}

	@RequestMapping("/book")
	public String book(Model model) {
		model.addAttribute("books",bookRepo.findAll());
		return "book";
	}
	

}
