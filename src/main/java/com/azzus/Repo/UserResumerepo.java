package com.azzus.Repo;

import com.azzus.domain.Userresume;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by azzus on 3/26/2018.
 */
public interface UserResumerepo extends JpaRepository<Userresume, Long> {
}
