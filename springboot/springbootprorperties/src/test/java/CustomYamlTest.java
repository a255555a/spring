import com.example.entity.Family;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)  //Junit5
@SpringBootTest
public class CustomYamlTest {

    @Resource
    Family family;

    @Test
    public void hello(){
        System.out.println(family.toString());
    }
}