package com.liang;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Aspect
public class AtAspect {
    @Pointcut(value = "execution(* com.liang..*.beforeTest(..)) && args(param) ", argNames = "param")
    public void pointCut(String param){ }

    @Pointcut(value = "execution(* com.liang..*.afterTest(..))")
    public void afterPointCut(){ }
    @AfterReturning(value = "execution(* com.liang..*.afterReturnTest(..))", returning = "returning")
    public void afterReturnAop(String returning){
        System.out.println("AOP warning:"+ returning);
    }
    @Before(value = "pointCut(param)", argNames = "param")
    public void beforeAop(String param){
        System.out.println("before:"+param);
    }
    @After(value = "afterPointCut()")
//    also use JoinPoint to get function args
    public void afterAop(JoinPoint jp){
        System.out.println(jp.getArgs()[0]);
        System.out.println("After");
    }
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("META-INF/classes/applicationContext.xml");
        AtAspectTest atAspectTest=context.getBean("atAspectTest",AtAspectTest.class);
//        atAspectTest.beforeTest("red");
        atAspectTest.afterTest("helo");
//        atAspectTest.afterReturnTest();
    }

}
class AtAspectTest{
    public void beforeTest(String param){
        System.out.println(param);
    }
    public void afterTest(String mag){

        System.out.println("After?");
    }
    public String  afterReturnTest(){
        System.out.println("?");
        return "Fuck";
    }

}
