import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import springprac.Dosa;

public class SouthIndianDish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));		
		Dosa dosa = (Dosa)factory.getBean("dosa");
		dosa.getDosa();
		/*Dosa dosa = new Dosa();
		
		dosa.getDosa();*/
	
	}

}
