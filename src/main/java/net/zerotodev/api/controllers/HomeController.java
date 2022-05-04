package net.zerotodev.api.controllers;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * packageName: net.zerotodev.api.controllers
 * fileName   : HomeController
 * author     : parkjungkwan
 * date       : 2022-05-03
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-03   parkjungkwan  최초 생성
 */
@RestController
public class HomeController {
    @GetMapping("/")
        public String now(){
            return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
    }
}
