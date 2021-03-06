package me.cnlm.busi.dao.init.area;


import me.cnlm.busi.entity.init.area.District;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by zhuxl on 2015/5/20.
 */

@Mapper
public interface DistrictMybatisDao {
    List<District> findDistrictsByCityCode(String cityCode);
}
