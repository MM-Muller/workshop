package com.mmuller.workshop.resources;

import com.mmuller.workshop.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User matheus = new User("1", "Matheus Muller", "m@m.com");
        User nalu = new User("2", "Nalu Muller", "n@n.com");
        List<User> list = new ArrayList<>(Arrays.asList(matheus, nalu));
        return ResponseEntity.ok().body(list);
    }
}
