package config.mybatis;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author HT
 * @date 2021/4/4
 **/
//@Configuration
//@MapperScan("com.geek-pi.**.mapper")
public class MybatisPlusConfig {

    /**
     * 乐观锁配置
     */


    /**
     * 自定义ID生成器
     *
     */

//    @Bean
//    public IdentifierGenerator identifierGenerator(){
//        return new CustomIdGenerator();
//    }

    /**
     * 分页插件
     */
//    public MybatisPlusInterceptor mybatisPlusInterceptor (){
//        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
//        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
//        return interceptor;
//    }


}
