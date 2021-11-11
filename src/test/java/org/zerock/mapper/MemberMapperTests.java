package org.zerock.mapper;


import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.domain.MemberVo;

import java.lang.reflect.Method;

@RunWith(SpringRunner.class)
@ContextConfiguration({"file:webapp/WEB-INF/applicationContext.xml"})
@Log4j
public class MemberMapperTests {
    @Setter(onMethod_= @Autowired)
    private MemberMapper mapper;


    @Test
    public void testRead(){
        MemberVo vo = mapper.read("admin90");
        log.info(vo);
        vo.getAuthList().forEach(authVO -> log.info(authVO));
    }
}
