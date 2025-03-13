package edu.ifba.hello.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ifba.hello.dto.ErrorResponse;
import edu.ifba.hello.dto.UserDTO;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {

    @PostMapping("/save")
    public String saveUser(@Valid UserDTO user, Model model) {
        log.info("Usuário {} enviado", user); 
        return "redirect:/user";
    }
    
    @GetMapping()
    public String formUser() {
        log.info("Carregando página do formulario");
        return "user-form";
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String handleValidationException(MethodArgumentNotValidException ex, Model model) {
        UserDTO user = (UserDTO) ex.getBindingResult().getTarget();

        log.error("Error ocorrido: {}", ex);

        List<ErrorResponse> errors = ex.getFieldErrors()
            .stream()
            .map(e -> new ErrorResponse(e.getField(), e.getDefaultMessage()))
            .toList();

        model.addAttribute("user", user);
        model.addAttribute("errors", errors);

        return "user-form";
    }

}
