package com.spring.cloud.example.SpringCloudExample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GetConfigRepoData {
    @Value("${spring.cloud.config.server.git.uri}") String configData;
    @GetMapping("/getConfigRepo")
    public ResponseEntity<?> getConfigRepoData(){
        return new ResponseEntity("This is the response"+configData, HttpStatus.OK);

    }
}
