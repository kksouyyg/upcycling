package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.FaqDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;


@SpringBootTest
class FaqMapperTest {
    @Autowired
    FaqMapper faqMapper;
    
    @Test
    void select() {
        List<FaqDto> found = faqMapper.selectSearch("업사이클링");
        System.out.println("found = " + found);
    }

    @Test
    void selectAll(){
        List<FaqDto> faqMainList = faqMapper.selectAll();
        System.out.println("faqMainList = " + faqMainList);
    }

    @Test
    void selectBoard(){
        Optional<FaqDto> faqBoard = faqMapper.selectBoard(2L);
        System.out.println("faqBoard = " + faqBoard);
    }
    
    @Test
    void selectBoardLeft(){
        Optional<FaqDto> faqBoardLeft = faqMapper.selectBoardLeft(1L);
        System.out.println("faqBoardLeft = " + faqBoardLeft);
    }

    @Test
    void selectBoardMax(){
        Optional<FaqDto> faqBoardMax = faqMapper.selectBoardMax(1L);
        System.out.println("faqBoardMax = " + faqBoardMax);
    }

    @Test
    void insert(){
        FaqDto faqDto = new FaqDto();
        faqDto.setFaqQuestion("질문제목");
        faqDto.setFaqAnswer("질문제목에 대한 답변입니다.");
        faqDto.setAdministratorNumber(1L);
        faqMapper.insert(faqDto);
    }
}