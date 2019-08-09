package ca.jrvs.apps.trading.controller;

import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Api(value = "App", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Controller
@RequestMapping("/")
public class AppController {

  @ResponseStatus(HttpStatus.OK)
  @ResponseBody
  @GetMapping(path = "/health")
  public String heath() {
<<<<<<< HEAD
    return "I'm very healthy and happy!";
=======
    return "I'm very healthy and proud x2!!";
>>>>>>> 99adf52dbd4bc3a0c6ad6c6e3d8d6d709e3bf29b
  }

}
