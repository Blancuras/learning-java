package spring.marzo22;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/22Marzo")
public class ColorsController {

	private static List<Color> colors = new ArrayList<>();

	public ColorsController() {
		colors.add(new Color(1, "Negro"));
		colors.add(new Color(2, "Blanco"));
		colors.add(new Color(3, "Cafe"));
		colors.add(new Color(4, "Amarillo"));
	}

	@GetMapping("/colors")
	public List<Color> getAllColors() {
		List<Color> colores = new ArrayList<>();
		return colors;
	}

	@GetMapping("/colors/{id}")
	public Color getColorById(@PathVariable("id") Integer id) {

		for (Color color : colors) {
			if (id == color.getIdColor()) {
				return color;
			}
		}
		return null;
	}

	@PostMapping("/color")
	public String saveColor(@RequestBody Color color) {

		colors.add(color);
		return "Usted guardo color: Id: " + color.getIdColor() + " Descripcion: " + color.getDescription();

	}

	@DeleteMapping("/colors/{id} ")
	public String saveColor(@PathVariable("id") Integer id) {

		Color colorToDelete = colors.stream().filter(color -> color.getIdColor().equals(id)).findFirst().get();

		colors.remove(colorToDelete);

		return "Eliminaste el color id: " + colorToDelete.getIdColor() + " desc:" + colorToDelete.getDescription();

	}
}
