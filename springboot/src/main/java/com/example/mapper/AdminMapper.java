package com.example.mapper;

import com.example.entity.Admin;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 操作admin相关数据接口
 * 接口定义了组件之间的通信协议
 * 接口可以解耦降低组件之间的耦合度，对单一组件进行修改不会导致其他组件受影响，
 * 明确各组件之间的交互方式（输入和输出），增强代码可读性
 * 接口可以被多个组件共享复用，减少重复开发提高覆盖率
 * 测试接口可以简化组件功能测试是否符合预期
 * 提高扩展性，新增或修改功能可以在接口处修改不需要大规模的改动现有代码
*/
public interface AdminMapper {

    /**
      * 新增
    */
    int insert(Admin admin);

    /**
      * 删除
    */
    int deleteById(Integer id);

    /**
      * 修改
    */
    int updateById(Admin admin);

    /**
      * 根据ID查询
    */
    Admin selectById(Integer id);

    /**
      * 查询所有
    */
    List<Admin> selectAll(Admin admin);

    @Select("select * from admin where username = #{username}")
    Admin selectByUsername(String username);
}