package com.helloWorld1.helloWorld1;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
	
	@GetMapping
    public final String hola() throws UnknownHostException {
        return "Hola! Puedes encontrarme en !!.." + InetAddress.getLocalHost().getHostAddress();
    }

}
