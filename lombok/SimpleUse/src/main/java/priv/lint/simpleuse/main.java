package priv.lint.simpleuse;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import priv.lint.simpleuse.entity.Dome;

@RunWith(SpringRunner.class)
@SpringBootTest
public class main {
    private Dome dome;
    @Test
    public void aVoid(){
        dome.setId(1);
        dome.setName("hello");
        System.out.println(dome);
    }
}
