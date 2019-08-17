package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.ItemDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemDOMapper {

    List<ItemDO> listItem();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Thu Aug 15 17:35:05 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Thu Aug 15 17:35:05 CST 2019
     */
    int insert(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Thu Aug 15 17:35:05 CST 2019
     */
    int insertSelective(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Thu Aug 15 17:35:05 CST 2019
     */
    ItemDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Thu Aug 15 17:35:05 CST 2019
     */
    int updateByPrimaryKeySelective(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Thu Aug 15 17:35:05 CST 2019
     */
    int updateByPrimaryKey(ItemDO record);

    int increaseSales(@Param("id")Integer id, @Param("amount")Integer amount);
}