package com.southwind.test;

import com.southwind.entity.Classes;
import com.southwind.entity.Student;
import com.southwind.repository.ClassesRepository;
import com.southwind.repository.CustomerRepository;
import com.southwind.repository.GoodsRepository;
import com.southwind.repository.StudentRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test3 {
    public static void main(String[] args) {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        StudentRepository studentRepository = sqlSession.getMapper(StudentRepository.class);
//        System.out.println(studentRepository.findById(1L));
//        sqlSession.close();

//        ClassesRepository classesRepository = sqlSession.getMapper(ClassesRepository.class);
//        System.out.println(classesRepository.findById(2L));
//        sqlSession.close();

//        CustomerRepository customerRepository = sqlSession.getMapper(CustomerRepository.class);
//        System.out.println(customerRepository.findById(1L));
//        sqlSession.close();

//        GoodsRepository goodsRepository = sqlSession.getMapper(GoodsRepository.class);
//        System.out.println(goodsRepository.findById(1L));
//        sqlSession.close();

//        StudentRepository studentRepository = sqlSession.getMapper(StudentRepository.class);
//        Student student = studentRepository.findByIdLazy(1L);
//        System.out.println(student);
//        ClassesRepository classesRepository = sqlSession.getMapper(ClassesRepository.class);
//        System.out.println(classesRepository.findByIdLazy(student.getClasses().getId()));
//        sqlSession.close();

//        StudentRepository studentRepository = sqlSession.getMapper(StudentRepository.class);
//        System.out.println(studentRepository.findByIdLazy(1L));
//        sqlSession.close();

        StudentRepository studentRepository = sqlSession.getMapper(StudentRepository.class);
        Student student = studentRepository.findByIdLazy(1L);
        System.out.println(student.getName());
    }
}
