package com.robertogs.mytasks.board.persistence.repositories;

import com.robertogs.mytasks.board.persistence.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardJpaRepository extends JpaRepository<BoardEntity, Long> {
}
