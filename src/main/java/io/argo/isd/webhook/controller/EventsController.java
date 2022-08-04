package io.argo.isd.webhook.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class EventsController {

    private ObjectMapper mapper = new ObjectMapper();

    @PostMapping("/event")
    public void captureEvent(@RequestBody Object body) {
        String in = null;
        try {
            in = mapper.writeValueAsString(body);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        log.info("*****************************");
       log.info(in);
       log.info("-----------------------------------");
    }
}
