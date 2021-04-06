package org.tain.repository.cell;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;
import org.tain.domain.cell.Cell;

@RepositoryRestResource
@Transactional
public interface CellRepository extends JpaRepository<Cell, Long>{

}