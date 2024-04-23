package com.robertogs.mytasks.board.configs;

import com.robertogs.mytasks.board.BoardServiceApplication;
import com.robertogs.mytasks.board.core.usecase.FindBoardByIdUseCase;
import com.robertogs.mytasks.board.core.usecase.InsertBoardUseCase;
import com.robertogs.mytasks.board.integrations.adapters.TaskClientAdapter;
import com.robertogs.mytasks.board.persistence.adapters.FindBoardByIdAdapter;
import com.robertogs.mytasks.board.persistence.adapters.InsertBoardAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = BoardServiceApplication.class)
public class AppBeansConfig {

    @Bean
    public InsertBoardUseCase insertBoardUseCase(InsertBoardAdapter insertBoardAdapter){
        return new InsertBoardUseCase(insertBoardAdapter);
    }

    @Bean
    public FindBoardByIdUseCase findBoardByIdUseCase(FindBoardByIdAdapter findBoardByIdAdapter,
                                                     TaskClientAdapter taskClientAdapter){
        return new FindBoardByIdUseCase(findBoardByIdAdapter, taskClientAdapter);
    }

}
