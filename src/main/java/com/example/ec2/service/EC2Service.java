package com.example.ec2.service;

import com.amazonaws.services.ec2.model.Instance;

import java.util.List;

public interface EC2Service {

    List<Instance> getListEC2Instances();

}
