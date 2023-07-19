package com.eira.lab;

import org.springframework.stereotype.Service;

@Service
public class StatusService {

    public String processStatus(boolean arriving){
        return arriving ? "springfundamentals/hello" : "springfundamentals/goodbye";
    }
}
