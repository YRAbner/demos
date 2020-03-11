package com.caili.mapper;


import com.caili.pojo.DdmsMemberMaster;
import com.caili.pojo.DdmsMemberMasterExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DdmsMemberMasterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddms_member_master
     *
     * @mbg.generated
     */
    long countByExample(DdmsMemberMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddms_member_master
     *
     * @mbg.generated
     */
    int deleteByExample(DdmsMemberMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddms_member_master
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddms_member_master
     *
     * @mbg.generated
     */
    int insert(DdmsMemberMaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddms_member_master
     *
     * @mbg.generated
     */
    int insertSelective(DdmsMemberMaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddms_member_master
     *
     * @mbg.generated
     */
    DdmsMemberMaster selectOneByExample(DdmsMemberMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddms_member_master
     *
     * @mbg.generated
     */
    DdmsMemberMaster selectOneByExampleSelective(@Param("example") DdmsMemberMasterExample example, @Param("selective") DdmsMemberMaster.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddms_member_master
     *
     * @mbg.generated
     */
    List<DdmsMemberMaster> selectByExampleSelective(@Param("example") DdmsMemberMasterExample example, @Param("selective") DdmsMemberMaster.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddms_member_master
     *
     * @mbg.generated
     */
    List<DdmsMemberMaster> selectByExample(DdmsMemberMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddms_member_master
     *
     * @mbg.generated
     */
    DdmsMemberMaster selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DdmsMemberMaster.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddms_member_master
     *
     * @mbg.generated
     */
    DdmsMemberMaster selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddms_member_master
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DdmsMemberMaster record, @Param("example") DdmsMemberMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddms_member_master
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DdmsMemberMaster record, @Param("example") DdmsMemberMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddms_member_master
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DdmsMemberMaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddms_member_master
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DdmsMemberMaster record);
}