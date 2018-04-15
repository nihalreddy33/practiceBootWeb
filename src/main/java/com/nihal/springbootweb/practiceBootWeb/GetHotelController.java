package com.nihal.springbootweb.practiceBootWeb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetHotelController {
	
	@GetMapping("/hotelInfo")
	public List<HotelDetails> getHotelDetails() {
		List<HotelDetails> hd = new ArrayList<HotelDetails>();
		hd.add(new HotelDetails(1, "Avasa", "Hyd", 4000));
		hd.add(new HotelDetails(1, "Mango", "Banglore", 5000));
		hd.add(new HotelDetails(1, "Orchids", "Mumbai", 5678));
		hd.add(new HotelDetails(1, "LemonTree", "Vizag", 3000));
		return hd;
	}
	
}
