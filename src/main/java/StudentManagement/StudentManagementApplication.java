package StudentManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

  public static void main(String[] args) {

    SpringApplication.run(StudentManagementApplication.class, args);
  }
@GetMapping("/today")
  public String today() {

  return "今日はいい天気!";
}


}

