package com.itheima.springboot01.mapper;



import com.itheima.springboot01.pojo.LoginUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


//在Mapper接口中定义方法，方法名就是sql映射文件的id

@Mapper
public interface UserMapper {

        List<LoginUser>selectAll();


}
