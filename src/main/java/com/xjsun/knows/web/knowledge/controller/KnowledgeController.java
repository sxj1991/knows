package com.xjsun.knows.web.knowledge.controller;

import com.xjsun.knows.base.util.RequestHttp;
import com.xjsun.knows.base.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/base")
public class KnowledgeController {

    @GetMapping("/know")
    public Result<String> getKnows() throws IOException {
        String result = new RequestHttp().post("http://localhost:11434/api/generate", """
                {
                   "model": "gemma:2b",
                   "prompt": "你是誰？",
                   "stream": false
                }
                """);
        return Result.success(result);
    }
}
