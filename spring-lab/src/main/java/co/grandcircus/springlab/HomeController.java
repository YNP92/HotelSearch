package co.grandcircus.springlab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@Autowired
	private HotelRepository hotelRepo;
	

	@RequestMapping("/")
	public String showSearch(Model model) {
		List<Hotel> hotelsList = hotelRepo.findAll();
		model.addAttribute("hotels", hotelsList);
		return "searchform";
	}

	@PostMapping("/searchform")
	public String showResults(@RequestParam String city, Model model) {
		// do i have to instantiate hotels every mapping or can i do it once under the
		// class declaration?
		List<Hotel> hotelsList = hotelRepo.findAll();
		for (Hotel hotels : hotelsList) {
			if (hotels.getCity().equals(city)) {
				model.addAttribute("hotels", hotels);
			}
		}
		return "seachresults";
	}

}