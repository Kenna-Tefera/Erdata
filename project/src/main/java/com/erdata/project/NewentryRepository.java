package com.erdata.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewentryRepository  extends JpaRepository<Newentry, Long> {
    
}
