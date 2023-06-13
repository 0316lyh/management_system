package com.lyh.controller;

import com.lyh.bean.Message;
import com.lyh.controller.result.Result;
import com.lyh.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author :liangyuhang1
 * @className :MessageController
 * @date :2023/6/13/14:27
 */
@RestController
@RequestMapping("/messages")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping
    public Result getAll() {
        Result allMessage = messageService.getAllMessage();
        return allMessage;
    }

    @PostMapping
    public Result addMessage(@RequestBody Message message) {
        Result result = messageService.addMessage(message);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable int id) {
        Result result = messageService.deleteById(id);
        return result;
    }
}
