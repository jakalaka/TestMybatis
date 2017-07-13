package Mapper;

import Model.CCPSX;
import Model.CCPSXKey;

public interface CCPSXMapper {
    int deleteByPrimaryKey(CCPSXKey key);

    int insert(CCPSX record);

    int insertSelective(CCPSX record);

    CCPSX selectByPrimaryKey(CCPSXKey key);

    int updateByPrimaryKeySelective(CCPSX record);

    int updateByPrimaryKey(CCPSX record);
}