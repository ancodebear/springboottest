package com.hyq;

import com.hyq.entity.Phone;
import org.springframework.aop.framework.AopProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * PROJECT springboottest
 * createdate 2019/7/21 20:18
 *
 * @author hyq
 * @version 1.0
 */
@SpringBootApplication
public class Application {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Application.run(SpringApplication::run);
    }
    public static void run(RunApplication ra) {
        ra.run(Application.class);
    }
}
interface RunApplication {
    void run(Class primarySource, String... args);
}