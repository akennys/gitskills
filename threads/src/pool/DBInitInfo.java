package pool;

import java.util.ArrayList;
import java.util.List;
/**
 * ��ʼ����ģ��������е������ļ�
 * @author Ran
 *
 */
public class DBInitInfo {
	public  static List<DBbean>  beans = null;
	static{
		beans = new ArrayList<DBbean>();
		// �������� ���Դ�xml �������ļ����л�ȡ
		// Ϊ�˲��ԣ�������ֱ��д��
		DBbean beanOracle = new DBbean();
		beanOracle.setDriverName("oracle.jdbc.driver.OracleDriver");
		beanOracle.setUrl("jdbc:oracle:thin:@7MEXGLUY95W1Y56:1521:orcl");
		beanOracle.setUserName("mmsoa");
		beanOracle.setPassword("password1234");
		
		beanOracle.setMinConnections(5);
		beanOracle.setMaxConnections(100);
		
		beanOracle.setPoolName("testPool");
		beans.add(beanOracle);
	}
}
