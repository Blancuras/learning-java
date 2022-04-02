package com.saxa.Springdemo.marzo24;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.saxa.Springdemo.marzo24.configuracion.Paginas;

@Controller
@RequestMapping("/24marzo/home")
public class ControllerBasic {
	
	

	static public List<Post> getPosts() {
		ArrayList<Post> post = new ArrayList<>();
		post.add(new Post(1,
				"Desarrollo web es un término que define la creación de sitios web para Internet o una intranet.",
				"/img/c.jpg", new Date(), "Desarrollo Web"));
		post.add(new Post(2,
				"Desarrollo web es un término que define la creación de sitios web para Internet o una intranet.",
				"/img/c.jpg", new Date(), "Desarrollo Web Front-End"));
		post.add(new Post(3,
				"Desarrollo web es un término que define la creación de sitios web para Internet o una intranet.",
				"/img/c.jpg", new Date(), "Desarrollo Web Back-end"));
		post.add(new Post(4,
				"Desarrollo web es un término que define la creación de sitios web para Internet o una intranet.",
				"/img/c.jpg", new Date(), "Desarrollo Web UX/UI"));

		return post;
	}

	@GetMapping(path = { "/posts", "/" })
	public String saludar(Model model) {
		model.addAttribute("posts", getPosts());
		return "index";
	}

	/*
	 * @GetMapping(path ="/public") public ModelAndView post() { ModelAndView
	 * modelAndView = new ModelAndView(Paginas.Home);
	 * modelAndView.addObject("posts", this.getPosts()); return modelAndView; }
	 */

	@GetMapping(path = { "/post" })
	public ModelAndView getPostIndividual(@RequestParam(defaultValue = "1", name = "id", required = false) int id) {
		ModelAndView modelAndView = new ModelAndView(Paginas.POST); // POST filtrado

		List<Post> postFiltrado = getPosts().stream()
				.filter( post -> post.getId() == id)
				.collect(Collectors.toList());

		modelAndView.addObject("post", postFiltrado.get(0));
		return modelAndView;

	} 
	
	@GetMapping(path = { "/post", "/post/post/{post}"})
	public ModelAndView getPostIndividualDos(
			@PathVariable (required = true, name = "post")int id
			) {
		ModelAndView modelAndView = new ModelAndView(Paginas.POST); // POST filtrado

		List<Post> postFiltrado = getPosts().stream()
				.filter( post -> post.getId() == id)
				.collect(Collectors.toList());

		modelAndView.addObject("post", postFiltrado.get(0));
		return modelAndView;

	} 
	
	@GetMapping("/postNew")
		public ModelAndView getForm() {
			return new ModelAndView("form").addObject("post", new Post()); 
	} 
	
	@PostMapping("/addNewPost")
	public String addNewPost(Post post, Model model) {
		List<Post> posts = getPosts(); 
		posts.add(post); 
		model.addAttribute("posts", posts); 
		return "index";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
		List<Post> lista = getPosts();

		lista.stream().forEach(post -> System.out.println(post));
		
		 lista.stream()
				.filter( post -> post.getId() > 1 )
				.map(post -> post.getId())
				.forEach(post -> System.out.println(post));
		 
		Post postID1 = lista.stream().filter( post -> post.getId() > 1 ).findFirst().get();
		
		List<Integer> ids = lista.stream()
				.map(post -> post.getId())
				.collect(Collectors.toList());
		
	}*/
}
