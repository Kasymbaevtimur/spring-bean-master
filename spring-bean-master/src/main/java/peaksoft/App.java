package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(bean.getMessage());
        System.out.println(bean2.getMessage());
        System.out.println(bean.equals(bean2));
        System.out.println(bean.hashCode());
        System.out.println(bean2.hashCode());

        Cat cat=applicationContext.getBean("getCat",Cat.class);
        Cat cat2=applicationContext.getBean("getCat",Cat.class);
        System.out.println(cat);
        System.out.println(cat2);
        System.out.println(cat.equals(cat2));
        System.out.println(cat.hashCode());
        System.out.println(cat2.hashCode());
    }
}
