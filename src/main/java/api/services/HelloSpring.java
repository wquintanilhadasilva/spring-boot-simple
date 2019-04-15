package api.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import domain.Pong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("api/hello")
public class HelloSpring {
	
	public static final Logger logger = LoggerFactory.getLogger(HelloSpring.class);
	
	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	@ResponseBody
    public ResponseEntity<Pong> ping() {
        return new ResponseEntity<Pong>(new Pong("Ping received in server!"), HttpStatus.OK);
    }

}
