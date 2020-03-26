package com.cluster.api.controller;


import com.cluster.api.dto.ClusterDto;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")

public class ClusterController {

    @CrossOrigin("*")
    @GetMapping(value = "/clusters",produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    public ResponseEntity<List<ClusterDto>> getAllClusters() {
        List<ClusterDto> clusters = new ArrayList<>();
        return new ResponseEntity<>(clusters, HttpStatus.OK);
    }

    @CrossOrigin("*")
    @PostMapping("/clusters")
    public ResponseEntity<Void> createCluster(@RequestParam @Valid @NotEmpty String clusterName) {
        //if needs to return then change
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
