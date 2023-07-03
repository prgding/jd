package me.ding.jd.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import me.ding.jd.product.entity.BrandEntity;
import me.ding.jd.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        List<BrandEntity> brandId = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", "1L"));
        System.out.println("brandId = " + brandId);
    }
}
