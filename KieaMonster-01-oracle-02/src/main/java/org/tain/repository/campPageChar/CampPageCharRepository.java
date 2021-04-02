package org.tain.repository.campPageChar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;
import org.tain.domain.campPageChar.CampPageChar;

@RepositoryRestResource
@Transactional
public interface CampPageCharRepository extends JpaRepository<CampPageChar, Long>{

}
