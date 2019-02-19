package priv.lint.simpleuse.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
/*
* 读写，构造器，重写toString方法等等，各种简化的操作，保持这个POJO的一个整洁性，对于有代码洁癖的人，这个lombok框架就是一个福音
* SpringBoot，IDEA也集成了这个框架，和推出这个相关的插件
* 使用这个框架有好也有不好，看使用环境
* 
* */
@Component
public class Dome {
    int id;
    String name;
}
