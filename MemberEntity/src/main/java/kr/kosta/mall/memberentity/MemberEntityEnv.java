package kr.kosta.mall.memberentity;

import java.io.Reader;

import javax.sql.DataSource;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.ibatis.sqlmap.engine.transaction.TransactionConfig;

/**
 * ��ƼƼ ������Ʈ ȯ�� �������̽�
 *
 */
public class MemberEntityEnv {

    //-------------------------------------------------------------------------
    // static area
    //-------------------------------------------------------------------------

	/**
	 * SqlMap Config
	 */
	private static final String SQLMAP_CONFIG = "sqlmap-config.xml";

	/**
	 *  ElectionInfoQueryEnv singleton instance
	 */
	private static MemberEntityEnv instance = new MemberEntityEnv();

	/**
	 *
	 * @return
	 */
	public static MemberEntityEnv getInstance(){
		if(instance == null){
			instance = new MemberEntityEnv();
		}
		return instance;
	}



    //-------------------------------------------------------------------------
    // instance area
    //-------------------------------------------------------------------------

	/**
	 * �⺻ ������
	 */
	private MemberEntityEnv(){
	}

	/**
	 * SQL ������ ���� iBatis ���� �������̽�
	 */
	private SqlMapClient sqlMapClient;


	/**
	 * �����ͼҽ� ����
	 * @param dataSource	javax.sql.DataSource
	 * @throws Exception
	 */
	public void setDataSource(DataSource dataSource) throws Exception{

		SqlMapClient sqlMapClient = loadSqlMapClient(SQLMAP_CONFIG);

		this.sqlMapClient = sqlMapClient;

	}

	/**
	 * SQL ���� �������̽� ��ȯ
	 * @return sqlMapClient
	 */
	public SqlMapClient getSqlMapClient(){
		return sqlMapClient;
	}

	/**
     * iBatis Ŭ������ �̿��Ͽ� ���� SqlMapClient �ν��Ͻ��� �����Ѵ�.
     *
     * @param sqlmapConfig
     *            sqlmap config ���ҽ� ��ġ
     * @return SqlMapClient �ν��Ͻ�
     * @throws Exception
     */
    private SqlMapClient loadSqlMapClient(String sqlmapConfig) throws Exception {
//        Resources.setCharset(Charset.forName("UTF-8"));
        Reader reader = Resources.getResourceAsReader(sqlmapConfig);
        return SqlMapClientBuilder.buildSqlMapClient(reader);
    }

    protected void setDataSource(TransactionConfig transactionConfig, DataSource dataSource) {
        transactionConfig.setDataSource(dataSource);
    }

}
