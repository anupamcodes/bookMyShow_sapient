package com.sapient.bookMyShow.repository;

import com.sapient.bookMyShow.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<UserDetails, String> {
}
