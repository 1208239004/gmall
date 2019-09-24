package com.atguigu.gmall.pms.dao;


import com.atguigu.gmall.pms.entity.BrandEntity;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BrandDaoTest {
    @Autowired
    private BrandDao brandDao;

    @Test
    public void test(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("大傻子");
        brandEntity.setDescript("傻子好啊");
        brandEntity.setFirstLetter("S");
        this.brandDao.insert(brandEntity);
    }
    @Test
    public void test1(){
        this.brandDao.selectList(new QueryWrapper<BrandEntity>().like("name","傻子%")).forEach(System.out::println);

    }


}
