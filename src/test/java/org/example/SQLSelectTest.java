package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQLSelectTest {
    @Test
    void mustReturnSmallSelectString() {
        SQLSelect sqlSelect = new SQLSelectBuilder()
                .setColumns("id, name, company")
                .setTable("customers")
                .build();

        assertEquals("SELECT id, name, company FROM customers", sqlSelect.toString());
    }

    @Test
    void mustReturnLargeSelectString() {
        SQLSelect sqlSelect = new SQLSelectBuilder()
                .setColumns("*")
                .setTable("products")
                .setOrderBy("value")
                .setGroupBy("category")
                .build();

        assertEquals("SELECT * FROM products ORDER BY value GROUP BY category", sqlSelect.toString());
    }
}