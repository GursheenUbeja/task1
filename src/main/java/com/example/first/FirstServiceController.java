package com.example.first;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/first")
public class FirstServiceController {

	private final static String HELLO_SERVICE = "http://localhost:8082/second/hello";
	private final static String NAME_SERVICE = "http://localhost:8083/third/contactName";

	@GetMapping("/up")
	public ResponseEntity<String> UpService() {
		return new ResponseEntity<>("Up..", HttpStatus.OK);

	}

	@PostMapping("/concatAll")
	public ResponseEntity<String> finalService(@RequestBody String name) {
		try {
			RestTemplate conn = new RestTemplate();
			String helloResponse = conn.getForObject(HELLO_SERVICE, String.class);
			String nameResponse = conn.postForObject(NAME_SERVICE, name, String.class);
			return new ResponseEntity<>(helloResponse + nameResponse, HttpStatus.OK);	
		}catch(Exception e) {
			return new ResponseEntity<>("Problem with the service", HttpStatus.BAD_REQUEST);
		}
		

	}

}
