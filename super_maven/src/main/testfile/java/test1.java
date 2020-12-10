
import com.dao.ItemDao;
import com.domain.Item;
import com.services.ItemService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;

public class test1 {

    @Test
    public void testfindById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemDao itemDao=ac.getBean(ItemDao.class);
        Item item=itemDao.findById(1);
        System.out.println(item.getName());
        ItemService itemService = ac.getBean(ItemService.class);
        Item item1 = itemService.findById(2);
        System.out.println(item1.getName());
    }
}
