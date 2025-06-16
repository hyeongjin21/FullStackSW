package kr.khj.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.khj.practice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
