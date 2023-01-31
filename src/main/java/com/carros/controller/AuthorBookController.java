package com.carros.controller;

import com.carros.dto.AuthorBookDTO;
import com.carros.model.Author;
import com.carros.model.Book;
import com.googlecode.jmapper.JMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthorBookController {
    private static final Logger logger = LogManager.getLogger(AuthorBookController.class);
    @ResponseBody
    @RequestMapping("addAuthorBook")
    public String addAuthorBook(@RequestBody AuthorBookDTO authorBookDTO) {
        logger.info("Esta no adicionando o autor");
        JMapper<Author, AuthorBookDTO> authorMapper = new JMapper<>(Author.class, AuthorBookDTO.class);

        Author author = authorMapper.getDestination(authorBookDTO);

        return author.name;

    }

}
