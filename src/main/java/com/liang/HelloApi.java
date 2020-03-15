package com.liang;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public interface HelloApi {
    public void sayHello();
}
class HelloImpl implements HelloApi{
    public HelloImpl() {
    }

    @Override
    public void sayHello() {
        System.out.println("Hello Word!");
    }
}
class HelloImpl3 implements HelloApi{
    private String message;
    private int index;
    public HelloImpl3() {
    }

    public HelloImpl3(String message, int index) {
        this.message = message;
        this.index = index;
    }
    @Override
    public void sayHello() {
        System.out.println(index +":"+message);
    }
}
class HelloImpl4 implements HelloApi{
    private String message;
    private int index;
    public HelloImpl4() {
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getMessage() {
        return message;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public void sayHello() {
        System.out.println(index+":"+message);
    }
}
class OtherTypeTestBean {
    private List<String> stringList;
    private Map<Integer,String> map;
    private Collection<String> collection;
    private String[] array;
    private String[] array2;
    private Properties values;
    private HelloImpl3 hello;
    private String testNameSpaceP;
    private Other hello2;

    public String getTestNameSpaceP() {
        return testNameSpaceP;
    }

    public void setTestNameSpaceP(String testNameSpaceP) {
        this.testNameSpaceP = testNameSpaceP;
    }

    public OtherTypeTestBean(HelloImpl3 hello) {
        this.hello = hello;
    }

    public OtherTypeTestBean(Other hello2) {
        this.hello2 = hello2;
    }

    public HelloImpl3 getHello() {
        return hello;
    }

    public void setHello(HelloImpl3 hello) {
        this.hello = hello;
    }

    public Properties getValues() {
        return values;
    }

    public void setValues(Properties values) {
        this.values = values;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public String[] getArray2() {
        return array2;
    }

    public void setArray2(String[] array2) {
        this.array2 = array2;
    }

    public OtherTypeTestBean() {
    }

    public Collection<String> getCollection() {
        return collection;
    }

    public void setCollection(Collection<String> collection) {
        this.collection = collection;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public OtherTypeTestBean(List<String> stringList) {
        this.stringList = stringList;
    }

}
class Other{

}