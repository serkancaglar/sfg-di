package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        System.out.println("----- I18NController -----");
        I18NController i18NController = ctx.getBean(I18NController.class);
        System.out.println(i18NController.getGreeting());

        System.out.println("----- PrimaryInjectedController -----");
        PrimaryInjectedController primaryInjectedController = ctx.getBean(PrimaryInjectedController.class);
        System.out.println(primaryInjectedController.getGreeting());

        System.out.println("----- PropertyInjectedController -----");
        PropertyInjectedController pic = ctx.getBean(PropertyInjectedController.class);
        System.out.println(pic.getGreeting());

        System.out.println("----- SetterInjectedController -----");
        SetterInjectedController sic = ctx.getBean(SetterInjectedController.class);
        System.out.println(sic.getGreeting());

        System.out.println("----- ConstructorInjectedController -----");
        ConstructorInjectedController cic = ctx.getBean(ConstructorInjectedController.class);
        System.out.println(cic.getGreeting());

        System.out.println("----- FakeDataSource -----");
        FakeDataSource fds = ctx.getBean(FakeDataSource.class);
        System.out.println(fds.getUsername());
        System.out.println(fds.getPassword());
        System.out.println(fds.getUrl());
    }
}