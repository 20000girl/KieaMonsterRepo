package org.tain.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.tain.jpa.domain.TbResult;

@RepositoryRestResource
public interface TbResultRepository extends JpaRepository<TbResult, Long>{

	List<TbResult> findTbResultListBySvrCode(String svrCode);
}
