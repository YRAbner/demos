package com.caili.mapper;

import com.caili.pojo.DmsMemberMaster;
import com.caili.pojo.DmsMemberMasterExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DmsMemberMasterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_member_master
     *
     * @mbg.generated
     */
    long countByExample(DmsMemberMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_member_master
     *
     * @mbg.generated
     */
    int deleteByExample(DmsMemberMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_member_master
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_member_master
     *
     * @mbg.generated
     */
    int insert(DmsMemberMaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_member_master
     *
     * @mbg.generated
     */
    int insertSelective(DmsMemberMaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_member_master
     *
     * @mbg.generated
     */
    DmsMemberMaster selectOneByExample(DmsMemberMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_member_master
     *
     * @mbg.generated
     */
    DmsMemberMaster selectOneByExampleSelective(@Param("example") DmsMemberMasterExample example, @Param("selective") DmsMemberMaster.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_member_master
     *
     * @mbg.generated
     */
    List<DmsMemberMaster> selectByExampleSelective(@Param("example") DmsMemberMasterExample example, @Param("selective") DmsMemberMaster.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_member_master
     *
     * @mbg.generated
     */
    List<DmsMemberMaster> selectByExample(DmsMemberMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_member_master
     *
     * @mbg.generated
     */
    DmsMemberMaster selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DmsMemberMaster.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_member_master
     *
     * @mbg.generated
     */
    DmsMemberMaster selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_member_master
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DmsMemberMaster record, @Param("example") DmsMemberMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_member_master
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DmsMemberMaster record, @Param("example") DmsMemberMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_member_master
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DmsMemberMaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_member_master
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DmsMemberMaster record);
}