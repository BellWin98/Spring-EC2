package com.example.demo.post;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

// 사용자의 요청을 주고 받음
//@RestController
@Controller
public class PostController {
    private final PostService postService;

    PostController(){
        this.postService = new PostService();
    }

    @GetMapping("/csr/json") // 사용자가 해당 url을 입력하면 Controller에 있는 해당 url의 메서드를 실행하여 데이터 return
    @ResponseBody // 데이터를 json형식으로 변환해서 줌
    public List<Post> getPosts(){
        return postService.findAll();
    }

    @GetMapping("/ssr")
    public String getPostsSsr(Model model){ // Model: model에 들어간 데이터는 화면(HTML)에 들어가기로 약속됨.
        List<Post> posts = postService.findAll();

        // 모델은 HashMap 형태를 갖고 있으므로 key, value처럼 사용
        // addAttribute는 Map의 put과 같은 기능과 같아서, 이를 통해 해당 모델에 원하는 속성과 값을 주어 전달할 view에 데이터 전달 가능
        model.addAttribute("posts", posts);
        return "post_list"; // templates안에 있는 파일을 지칭
    }
}
