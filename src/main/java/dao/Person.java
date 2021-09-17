package dao;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

// new Person() 通过工厂
public class Person implements InitializingBean {
    private Integer id;
    private String name;
    private List<String> hobby;

//    private String[] emails;
//
//    private Set<String> tels;
//
    private List<String> addresses;
//
//    private Properties p;
//
//    private Map<String,String> qqs;
    public Person(){
        System.out.println("构造方法执行完成！");
    }

//    public Properties getP() {
//        return p;
//    }

//    public void setP(Properties p) {
//        this.p = p;
//    }
//
//    public Map<String, String> getQqs() {
//        return qqs;
//    }
//
//    public void setQqs(Map<String, String> qqs) {
//        this.qqs = qqs;
//    }
//
    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }
//
//    public Set<String> getTels() {
//        return tels;
//    }
//
//    public void setTels(Set<String> tels) {
//        this.tels = tels;
//    }
//
//    public String[] getEmails() {
//        return emails;
//    }
//
//    public void setEmails(String[] emails) {
//        this.emails = emails;
//    }
//

    public void setHobby(String ho) {
        this.hobby.add(ho);
        System.out.println("set hobby finish");
    }
    public void getHobby() {
        System.out.println(this.hobby);
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
        System.out.println("set id finish");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override //因为调用了接口 所以要覆盖初始化函数，这样在建立工厂对象后就会初始化
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean,spring自动初始化完成！");
    }

    public void myInit(){
        System.out.println("MyInit!");
    }

    //
//    public Person() {
//        System.out.println("Person.Person");
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
}