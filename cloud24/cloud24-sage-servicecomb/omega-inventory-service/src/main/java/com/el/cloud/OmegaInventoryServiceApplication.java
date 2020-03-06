package com.el.cloud;

import com.el.cloud.dao.InventoryDao;
import com.el.cloud.domain.Inventory;
import org.apache.servicecomb.saga.omega.spring.EnableOmega;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.el.cloud.dao")
@EnableTransactionManagement
@EnableJpaAuditing
@EnableOmega
public class OmegaInventoryServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(OmegaInventoryServiceApplication.class, args);
    }

    @Autowired
    InventoryDao inventoryDao;

    @Override
    public void run(String... args) throws Exception {
        Inventory inventory = Inventory.builder()
                .leftNum(100)
                .productCode("spring-cloud-in-action")
                .build();
        inventoryDao.save(inventory);
    }
}
