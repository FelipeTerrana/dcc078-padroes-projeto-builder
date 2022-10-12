package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQLSelectBuilderTest {
    @Test
    void mustThrowExceptionWithoutColumns() {
        try {
            SQLSelectBuilder sqlSelectBuilder = new SQLSelectBuilder();

            SQLSelect sqlSelect = sqlSelectBuilder
                    .setTable("customers")
                    .setWhere("id=1")
                    .setGroupBy("category")
                    .build();

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Colunas devem ser preenchidas", e.getMessage());
        }
    }

    @Test
    void mustThrowExceptionWithoutTable() {
        try {
            SQLSelectBuilder sqlSelectBuilder = new SQLSelectBuilder();

            SQLSelect sqlSelect = sqlSelectBuilder
                    .setColumns("*")
                    .setGroupBy("category")
                    .build();

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tabela deve ser preenchida", e.getMessage());
        }
    }

    @Test
    void mustReturnValidSelect() {
        SQLSelectBuilder sqlSelectBuilder = new SQLSelectBuilder();

        SQLSelect sqlSelect = sqlSelectBuilder
                .setColumns("*")
                .setTable("products")
                .build();

        assertNotNull(sqlSelect);
    }
}