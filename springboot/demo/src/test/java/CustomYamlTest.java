import com.example.demo.dao.UserRepository;
import com.example.demo.entity.Family;
import com.example.demo.entity.UsersDao;
import com.example.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)  //Junit4
@SpringBootTest(classes = CustomYamlTest.class)
public class CustomYamlTest {

    @Resource
    Family family;

    @Test
    public void hello() {
        System.out.println(family.toString());
    }
}
