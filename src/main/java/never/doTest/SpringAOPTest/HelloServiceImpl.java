package never.doTest.SpringAOPTest;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello() {
        return "hello";
    }

    @Override
    public String hello(String name) {
        return "hello " + name;
    }

    @Override
    public String hello(String name, Integer age) {
        return "hello " + name + " " + age;
    }
}
