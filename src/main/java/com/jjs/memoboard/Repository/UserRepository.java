package com.jjs.memoboard.Repository;


import com.jjs.memoboard.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
