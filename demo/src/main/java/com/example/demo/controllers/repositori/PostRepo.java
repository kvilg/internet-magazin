package com.example.demo.controllers.repositori;

import com.example.demo.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepo extends CrudRepository<Post, Long> {

    List<Post> findByName(String name);

}
