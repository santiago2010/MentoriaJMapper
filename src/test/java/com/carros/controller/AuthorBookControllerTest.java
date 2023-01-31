package com.carros.controller;

import com.carros.dto.AuthorBookDTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorBookControllerTest {
    AuthorBookController authorBookController = new AuthorBookController();


    @Test
    void addAuthorBook() {
        AuthorBookDTO dto = new AuthorBookDTO();
        dto.setAuthorAge(17);
        dto.setAuthorName("Santiago");
        dto.setTitle("Lua de testes");

        String resultado =  authorBookController.addAuthorBook(dto);
        assertEquals(resultado, "Santiago");
    }
}