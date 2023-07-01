package org.blog.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import org.blog.springbootdeveloper.dto.AddUserRequest;
import org.blog.springbootdeveloper.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class UserApiController {

    private final UserService userService;

    @PostMapping("/user")
    public String signup(AddUserRequest request) {
        userService.save(request);  //회원 가입 메소드 호출
        return "redirect:/login";
    }
}
