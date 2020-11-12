package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author yangji
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
