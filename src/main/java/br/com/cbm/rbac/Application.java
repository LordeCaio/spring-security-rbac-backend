package br.com.cbm.rbac;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.NonNull;

@SpringBootApplication
public class Application implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    /**
     * Get the application context
     * @return the application context
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * Get a bean from the application context
     * @param beanClass the class of the bean
     * @param <T> the type of the bean
     * @return the bean
     */
    public static <T> T getBean(Class<T> beanClass) {
        return applicationContext.getBean(beanClass);
    }

    /**
     * Get a bean from the application context
     * @param name the name of the bean
     * @param beanClass the class of the bean
     * @param <T> the type of the bean
     * @return the bean
     */
    public static <T> T getBean(String name, Class<T> beanClass) {
        return applicationContext.getBean(name, beanClass);
    }

    @Override
    public void setApplicationContext(@NonNull ApplicationContext applicationContext) throws BeansException {
        applyApplicationContext(applicationContext);
    }

    /**
     * Set the application context
     * @param applicationContext the application context
     */
    private static void applyApplicationContext(ApplicationContext applicationContext) {
        Application.applicationContext = applicationContext;
    }

    /**
     * Main method to start the application
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
