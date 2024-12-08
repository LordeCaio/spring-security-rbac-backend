package br.com.cbm.rbac;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ApplicationTests {

    @Test
    void should_LoadContext() {
        assertNotNull(Application.getApplicationContext());
    }

}
