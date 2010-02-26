package kr.kosta.mall.memberentity;

import java.io.Reader;

import javax.sql.DataSource;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.ibatis.sqlmap.engine.transaction.TransactionConfig;

/**
 * 엔티티 컴포넌트 환경 인터페이스
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
	 * 기본 생성자
	 */
	private MemberEntityEnv(){
	}

	/**
	 * SQL 수행을 위한 iBatis 제공 인터페이스
	 */
	private SqlMapClient sqlMapClient;


	/**
	 * 데이터소스 설정
	 * @param dataSource	javax.sql.DataSource
	 * @throws Exception
	 */
	public void setDataSource(DataSource dataSource) throws Exception{

		SqlMapClient sqlMapClient = loadSqlMapClient(SQLMAP_CONFIG);

		this.sqlMapClient = sqlMapClient;

	}

	/**
	 * SQL 수행 인터페이스 반환
	 * @return sqlMapClient
	 */
	public SqlMapClient getSqlMapClient(){
		return sqlMapClient;
	}

	/**
     * iBatis 클래스를 이용하여 실제 SqlMapClient 인스턴스를 생성한다.
     *
     * @param sqlmapConfig
     *            sqlmap config 리소스 위치
     * @return SqlMapClient 인스턴스
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
