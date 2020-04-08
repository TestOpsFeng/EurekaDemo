package top.testops.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.testops.dao.been.User;

/**
  * @ClassName UserReository
  * @Description TODO
  * @author carson
  * @date 2020/4/8
**/
@Repository
public interface UserRepository  extends JpaRepository<User, Long> {
}
