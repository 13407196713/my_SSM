package com.southwind.test;

import com.southwind.entity.Account;
import com.southwind.repository.AccountRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        Account account = new Account();
////        account.setId(1L);
////        account.setUsername("张三");
////        account.setPassword("123456");
//////        account.setAge(22);
////
////        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);
////        Account account1 = accountRepository.findByAccount(account);
////        System.out.println(account1);
////        sqlSession.close();

//        Account account = new Account();
//        account.setId(1L);
//        account.setUsername("张三");
//        account.setPassword("123456");
////        account.setAge(22);
//
//        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);
//        Account account1 = accountRepository.findByAccount(account);
//        account1.setUsername("小米");
//        System.out.println(accountRepository.update(account1));
//        sqlSession.commit();
//        sqlSession.close();

//        Account account = new Account();
//        account.setId(1L);
//        account.setUsername("张三");
//
//        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);
//        System.out.println(accountRepository.update2(account));
//        sqlSession.commit();
//        sqlSession.close();

        Account account = new Account();
        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        ids.add(4L);
        ids.add(5L);
        account.setIds(ids);

        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);
        System.out.println(accountRepository.findByIds(account));
        sqlSession.commit();
        sqlSession.close();

    }
}
