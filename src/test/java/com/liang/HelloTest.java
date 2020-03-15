package com.liang;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class HelloTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testHelloWorld(){
//        xml file must be in resources folder (Marked as 'resources')!
        ApplicationContext context=new ClassPathXmlApplicationContext("META-INF/classes/applicationContext.xml");

//        HelloApi helloApi1=  context.getBean("HelloImpl", HelloApi.class);
//        HelloApi helloApi2= (HelloApi) context.getBean("HelloImpl");
//        HelloApi helloApi3= context.getBean(HelloImpl.class);
////        helloApi1.sayHello();
////        helloApi2.sayHello();
////        helloApi3.sayHello();
//        HelloApi byIndex=context.getBean("ByIndex", HelloApi.class);
//
//        OtherTypeTestBean bean1=context.getBean("OtherTypeTestBean",OtherTypeTestBean.class);
//        System.out.println(bean1.getTestNameSpaceP());
//        byIndex.sayHello();
        IHelloWorldService iHelloWorldService=context.getBean("helloWorldService", IHelloWorldService.class);
//        iHelloWorldService.sayFuck();
//        iHelloWorldService.sayAfterThrowing();
        iHelloWorldService.sayAround("haha");
    }
}
