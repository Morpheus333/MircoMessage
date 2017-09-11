package testDAO;

import org.junit.Test;

import com.Dao.MessageDao;
import com.service.MessageService;

/**
 * ����MessageDao�ķ���
 * ����MessageService�ķ���
 * @author Administrator
 *
 */
public class MessageTest {
	private MessageDao messageDao = new MessageDao();
	private MessageService messageService = new MessageService();
	/**
	 * ����deleteOne����
	 */
	@Test
	public void testDeleteOne(){
		messageDao.deleteOne(1);
	}
	@Test
	public void testDeleteBatch(){
		String[] list = new String[2];
		list[0] = "3";
		list[1] = "4";
		messageService.deleteBatch(list);
	}
	
}
