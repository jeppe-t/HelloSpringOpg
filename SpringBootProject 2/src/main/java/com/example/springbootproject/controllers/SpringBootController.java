package com.example.springbootproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@RestController
public class SpringBootController {

    //----------------------------------------------------------------------------------------------------------------//


    //Giver KUN adgang til URLs indhold

    // 1.1 Exercise
    @GetMapping
    public String welcoming(){

        return "Welcome my friend Chris";
    }

    //----------------------------------------------------------------------------------------------------------------//

    // 1.2 Exercise

    //Giver adgang til URLs indhold, samt mulighed for at ændre ved parametre.
    //Write this path:
    // http://localhost:8080/input?name=HelloDat21v1

    @GetMapping("/input")
    public String echo(@RequestParam String name){

        return "Class name= " + name;
    }

    //----------------------------------------------------------------------------------------------------------------//

    // 1.3 Exercise

    //@ betyder adgang til URL.

    @GetMapping("/friday")
    public String echo(){

        String result = "";
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        if(day == Calendar.FRIDAY){
            result = "Its Friday";

        } else {
            result = "Well.. Its not friday!";
        }

        return result;
    }

    //----------------------------------------------------------------------------------------------------------------//

    }

