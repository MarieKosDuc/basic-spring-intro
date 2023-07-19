package com.eira.lab;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class SuccessService {

    // get random boolean
    public boolean MakeTry() {
        Random rd = new Random();
        return rd.nextBoolean();
    }


    // process boolean to return success or failure
    public String ProcessSuccess(boolean success){
        return success ? "It's a success!" : "It's a failure...";
    }
}
