package com.liang;

import org.aspectj.lang.ProceedingJoinPoint;

import java.beans.Expression;

public interface IHelloWorldService {
    public void sayHello();
    public String sayFuck();
    public void sayAfterThrowing();
    public void sayAround(String w);

}
class HelloWorldService implements IHelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("Helloworld");
    }
    @Override
    public String sayFuck() {
        System.out.println("HelloFuck");
        return "Fuck";
    }
    @Override
    public void sayAfterThrowing(){
        throw new RuntimeException();
    }
    @Override
    public void sayAround(String w){
        System.out.println(w);
        System.out.println("around tEST");
    }
}

class HelloWorldAspect{
    public void beforeAdvice(){
        System.out.println("-----before info");
    }
    public void beforeAdvice2(String what ){
        System.out.println("-----before info2:"+what);
    }
    public void returnTest(String what ){
        System.out.println("-----return info2:"+what);
    }
    public void afterFinallyAdvice(){
        System.out.println("-----after finally info");
    }
    public void afterThrowing(Exception ex){
        System.out.println(ex);
    }
    public Object aroundTest(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("--around before--");
        Object retVal =pjp.proceed(new Object[]{"replace"});
        System.out.println("-----around after-");
        return retVal;
    }
}
