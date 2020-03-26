package com.cluster.api.controller;


import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

@RestController
@CrossOrigin("*")
public class JobAutomateController {



    @PostMapping("/automate")
    @CrossOrigin("*")
    public ResponseEntity<Object> automateJob(@RequestParam @Valid @NotEmpty String clusterLocation,
                                              @RequestParam @Valid @NotEmpty String dataSetLocation,
                                              @RequestParam("file") MultipartFile file,
                                              @RequestParam @Valid @NotEmpty String frequency) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
