package mapper;

import annotation.Select;


public interface UserMapper {


    @Select("""
            select ...
            """)
    String selectUserInfo(String userId);

}
