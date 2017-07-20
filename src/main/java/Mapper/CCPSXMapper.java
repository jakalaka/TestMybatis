package Mapper;

import Model.CCPSX;
import Model.CCPSXExample;
import Model.CCPSXKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CCPSXMapper {
    int countByExample(CCPSXExample example);

    int deleteByExample(CCPSXExample example);

    int deleteByPrimaryKey(CCPSXKey key);

    int insert(CCPSX record);

    int insertSelective(CCPSX record);

    List<CCPSX> selectByExample(CCPSXExample example);

    CCPSX selectByPrimaryKey(CCPSXKey key);

    int updateByExampleSelective(@Param("record") CCPSX record, @Param("example") CCPSXExample example);

    int updateByExample(@Param("record") CCPSX record, @Param("example") CCPSXExample example);

    int updateByPrimaryKeySelective(CCPSX record);

    int updateByPrimaryKey(CCPSX record);
}