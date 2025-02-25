package com.github.dockerhub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DockerHubController {

    @GetMapping("/versions")
    public String getDockerHubVersions() {
        return "Docker Hub API Version: 2.2";
    }
}
