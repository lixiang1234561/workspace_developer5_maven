package com.ck.Configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement//事务管理器注解
public class TransactionManagerConfiguration {

//    @Autowired
//    private ComboPooledDataSource c3p0;
//    @Bean
//    public DataSourceTransactionManager transactionManager(){
//        DataSourceTransactionManager dt = new DataSourceTransactionManager();
//        dt.setDataSource(c3p0);
//        return dt;
//    }

}
