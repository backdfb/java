<!-- 의존성 먼저 추가. Maven의 경우! -->

<dependencies>
    <!-- MyBatis Core -->
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis</artifactId>
        <version>3.x.x</version>
    </dependency>
    <!-- MyBatis-Spring -->
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis-spring</artifactId>
        <version>2.x.x</version>
    </dependency>
    <!-- JDBC Driver -->
    <dependency>
        <groupId>your.jdbc.driver</groupId>
        <artifactId>jdbc-driver</artifactId>
        <version>x.x.x</version>
    </dependency>
</dependencies>

/*
사용하는 MyBatis, MyBatis-Spring, 그리고 JDBC 드라이버 의존성을 추가해야 하며, 실제 사용 버전으로 적용 시켜야 한다.
*/

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// MyBatis 설정 파일 경로
String configPath = "mybatis-config.xml";

// MyBatis 설정 파일을 로드
InputStream inputStream = Resources.getResourceAsStream(configPath);

// SqlSessionFactory 생성
SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

// SqlSession 열기
SqlSession sqlSession = sqlSessionFactory.openSession();

// 매퍼 인터페이스 가져오기
UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

// SQL 실행
User user = userMapper.selectUser(userId);

// 결과 처리
System.out.println(user);
  
