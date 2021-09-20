package com.southwind.test;

import com.southwind.entity.Account;
import com.southwind.repository.AccountRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);

        // 全查询
//        List<Account> list = accountRepository.findAll();
//        for (Account account:list){
//            System.out.println(account);
//        }

//        // 增
//        Account account = new Account(3L, "王五","123123",11);
//        int result   = accountRepository.save(account);
//        sqlSession.commit();// 提交事务

//        // id查
//        Account account = accountRepository.findById(2L);
//        System.out.println(account);
//        sqlSession.close();

//        // 改
//        Account account = accountRepository.findById(2L);
//        account.setUsername("小米");
//        account.setPassword("qwe");
//        account.setAge(5);
//        int result = accountRepository.update(account);
//        sqlSession.commit();
//        System.out.println(result);
//        sqlSession.close();

//        // 删
//        int result = accountRepository.deleteById(2L);
//        System.out.println(result);
//        sqlSession.commit();
//        sqlSession.close();

//        // findByName
//        System.out.println(accountRepository.findByName("张三"));
//        sqlSession.close();

//        // 包装类
//        Long id = Long.parseLong("1");
//        System.out.println(accountRepository.findById2(id));
//        sqlSession.close();

//        // 多参数 name、age
//        System.out.println(accountRepository.findByNameAndAge("张三",22));
//        sqlSession.close();

        // resultType

//        // 基本数据类型 Account 的个数
//        System.out.println(accountRepository.count());
//        sqlSession.close();

//        // 包装类 Account 的个数
//        System.out.println(accountRepository.count2());
//        sqlSession.close();

        // String 类型 通过id查name
        System.out.println(accountRepository.findNameById(1L));
        sqlSession.close();
    }
}
