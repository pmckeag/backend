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
public class JobController {

    @PostMapping("/job")
    @CrossOrigin("*")
    public ResponseEntity<Object> executeJob(@RequestParam @Valid @NotEmpty String clusterLocation,
                                             @RequestParam(required = false) @Valid @NotEmpty String dataSetLocation,
                                             @RequestParam("file") MultipartFile file) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
