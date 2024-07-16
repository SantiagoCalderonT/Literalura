package com.xpsw.literalura;

import com.xpsw.literalura.repository.AuthorRepository;
import com.xpsw.literalura.repository.BookRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	BookRepository libroRepositorio;
	@Autowired
	AuthorRepository autorRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Literalura principal = new Literalura(libroRepositorio, autorRepositorio);
		principal.mostrarMenu();
	}
}