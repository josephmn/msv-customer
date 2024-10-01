package api.azure.msv_customer.presentation.controllers;

//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
//@Getter
//@Setter
//@RefreshScope
public class TestController {

//    @Value("${test.property.variable}")
//    private String variable;

    @GetMapping
    public String getTestProp() {
        return "mensaje de api";
    }
}
