package lt.vu.mybatis.dao;

import java.util.List;
import lt.vu.mybatis.model.Dormitory;
import org.mybatis.cdi.Mapper;

@Mapper
public interface DormitoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.DORMITORY
     *
     * @mbg.generated Sat Mar 18 18:56:57 EET 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.DORMITORY
     *
     * @mbg.generated Sat Mar 18 18:56:57 EET 2017
     */
    int insert(Dormitory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.DORMITORY
     *
     * @mbg.generated Sat Mar 18 18:56:57 EET 2017
     */
    Dormitory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.DORMITORY
     *
     * @mbg.generated Sat Mar 18 18:56:57 EET 2017
     */
    List<Dormitory> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.DORMITORY
     *
     * @mbg.generated Sat Mar 18 18:56:57 EET 2017
     */
    int updateByPrimaryKey(Dormitory record);
}