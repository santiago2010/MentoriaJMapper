package com.carros.controller;

import com.carros.dto.AuthorBookDTO;
import com.carros.model.Author;
import com.carros.model.Book;
import com.googlecode.jmapper.JMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthorBookController {

    @ResponseBody
    @RequestMapping("addAuthorBook")
    public String addAuthorBook(@RequestBody AuthorBookDTO authorBookDTO) {

        JMapper<Author, AuthorBookDTO> authorMapper = new JMapper<>(Author.class, AuthorBookDTO.class);

        Author author = authorMapper.getDestination(authorBookDTO);

        return author.name;

    }

}
