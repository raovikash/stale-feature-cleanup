package com.feature.clean.stalefeaturecleanup.controller;

import com.feature.clean.stalefeaturecleanup.helper.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/sfc")
public class BasicController {
    @Autowired private FeatureHelper featureHelper;

    @GetMapping("/check")
    public ResponseEntity<String> helloWorld() {
        if (featureHelper.isTreated("STALE_FEATURE")) {
            return ResponseEntity.ok("Hello Piranha");
        }
        return ResponseEntity.ok("Hello World");
    }
}
