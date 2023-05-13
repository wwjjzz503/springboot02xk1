package com;

import com.dao.XiangmujinduDao;
import com.entity.Project;
import com.entity.XiangmujingliEntity;
import com.service.XiangmujingliService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootSchemaApplicationTests {
	@Autowired
	XiangmujingliService xiangmujingliService;
    @Autowired
	XiangmujinduDao xiangmujinduDao;
	@Test
	void contextLoads() {
		List<Project> projects = xiangmujinduDao.selectAll();
		for (Project project:projects){
			System.out.println(project.getXiangmumingcheng());
		}
	}

}
