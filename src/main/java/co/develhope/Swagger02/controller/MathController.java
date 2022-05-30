package co.develhope.Swagger02.controller;

import co.develhope.Swagger02.entity.ArithmeticOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("/welcomeMathMsg")
    public String welcomeMathMsg(){
        return "Welcome!";
    }

    @GetMapping("division-info")
    public ArithmeticOperation divisionInfo(){
        String[] properties = {"Distributive", "invariant"};
        return new ArithmeticOperation(
                "Division",
                2,
                "A simple division between two numbers",
                properties);
    }

    @GetMapping("/multiplication/{id}")
    public int multiplication(int num, int numb2){
        return num*numb2;
    }

    @GetMapping("square/{n}")
    public double square(double num1){
        return Math.sqrt(num1);
    }

}
