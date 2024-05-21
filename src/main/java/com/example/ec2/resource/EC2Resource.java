package com.example.ec2.resource;

import com.amazonaws.services.ec2.model.Instance;
import com.example.ec2.service.EC2Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class EC2Resource {

    private final EC2Service ec2Service;

    public EC2Resource(EC2Service ec2Service) {
        this.ec2Service = ec2Service;
    }

    @PostMapping("/ec2/list")
    public ResponseEntity<?> getListEC2Instance() {
        List<Instance> result = ec2Service.getListEC2Instances();
        return ResponseEntity.ok().body(result);
    }

}
