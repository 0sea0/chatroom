package common;

//import common.dao.MessageDao;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;

//public class Main {
//    public static void main(String[] args) throws IOException {
//        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession session = sqlSessionFactory.openSession(true);
//        MessageDao mapper = session.getMapper(MessageDao.class);
//        session.close();
//    }
//}