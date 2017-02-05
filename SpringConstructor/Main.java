package springConstructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("applicationContext.xml");  
        BeanFactory factory = new XmlBeanFactory(res);  
          
        Products s1 = (Products)factory.getBean("label1");
        Products s2 = (Products)factory.getBean("label2");
        s1.display(); 
        s2.display(); 
	}

}
