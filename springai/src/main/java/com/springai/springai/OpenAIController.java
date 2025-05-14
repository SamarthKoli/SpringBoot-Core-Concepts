package com.springai.springai;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class OpenAIController {


    @Autowired
    private OpenAiChatModel chatModel;

    @GetMapping("/get/{message}")
    public ResponseEntity<String>openAI(@PathVariable String message){
       
        String response=chatModel.call(message).toString();

        return ResponseEntity.ok(response);

    }
}
