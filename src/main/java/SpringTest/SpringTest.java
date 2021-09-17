package SpringTest;



import dao.Person;
import dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class SpringTest {

    @Test
    public void demo(){
        //初始化Spring容器ApplicationContext，加载配置文件
        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获取testDao实例 法一
//        TestDao testDao = (TestDao) application.getBean("testDao");

        //法二
//        TestDao testDao = (TestDao) application.getBean(TestDao.class);
//        testDao.sayHello();
//        Person p1 = (Person) application.getBean("person1");
//        p1.setName("jone");
//        System.out.println(p1.getId());
//        System.out.println(p1.getName());
//        System.out.println(p1.getAddresses());

    }

}
