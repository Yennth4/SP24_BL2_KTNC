package Lab4;

import com.SOF304.yennth.Lab4.entity.Item;
import com.SOF304.yennth.Lab4.service.ItemService;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class ItemTest {

    ItemService list = new ItemService();

    @Test
    public void testAddItemValid() {
        Item item = new Item(1 , "Item 1");
        list.addItem(item);
        Assert.assertEquals(1 , list.getAll().size());
    }

    @Test
    public void testAddItemInValid() {
        Item item = new Item(1 , "Item 1");
        list.addItem(item);
        Assert.assertEquals(0 , list.getAll().size());
    }

    @Test
    public void testUpdateItemValid() {
        Item item = new Item(1 , "Item 1");
        list.addItem(item);
        list.updateItem(1 , "Item 2");
        Assert.assertEquals("Item 2" , list.getAll().get(0).getName());
    }

    @Test
    public void testUpdateItemInValid() {
        Item item = new Item(1 , "Item 1");
        list.addItem(item);
        list.updateItem(2 , "Item 2");
        Assert.assertEquals("Item 2" , list.getAll().get(0).getName());
    }

    @Test
    public void testDeleteItemValid() {
        Item item = new Item(1 , "Item 1");
        list.addItem(item);
        int sizeBefore = list.getAll().size();
        list.deleteItem(1);
        int sizeAfter = list.getAll().size();
        Assert.assertEquals(sizeBefore - 1 , sizeAfter);
    }

    @Test
    public void testDeleteItemInValid() {
        Item item = new Item(1 , "Item 1");
        list.addItem(item);
        int sizeBefore = list.getAll().size();
        list.deleteItem(1);
        int sizeAfter = list.getAll().size();
        Assert.assertEquals(sizeBefore , sizeAfter);
    }

}
