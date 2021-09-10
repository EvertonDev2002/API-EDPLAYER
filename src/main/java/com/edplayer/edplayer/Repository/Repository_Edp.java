package com.edplayer.edplayer.Repository;

import com.edplayer.edplayer.Model.Model_Edp;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface Repository_Edp extends JpaRepository<Model_Edp, Long> {

    Model_Edp findById(long id);
}
