package co.grandcircus.springlab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		Set<String> availableCities = new HashSet<String>();
	
		for (Hotel hotel : hotelsList) {
//			System.out.println(hotel.toString());
			if (!availableCities.contains(hotel.getCity())) {
				availableCities.add(hotel.getCity());
			}
		}
//		System.out.println(availableCities.toString());
		System.out.println(availableCities.getClass());
		model.addAttribute("availableCities", availableCities);
		return "searchform";
	}

	@PostMapping("/searchform")
	public String showResults(@RequestParam String city, Model model) {
		// do i have to instantiate hotels every mapping or can i do it once under the
		// class declaration?
		List<Hotel> hotelsList = hotelRepo.findAll();
		List<Hotel> matchedSearch = new ArrayList<Hotel>();
		for (Hotel hotel : hotelsList) {
			if (hotel.getCity().equals(city)) {
				matchedSearch.add(hotel);
			}
		}
		model.addAttribute("city", city);
		model.addAttribute("matchedSearch", matchedSearch);

		return "seachresults";
	}

}