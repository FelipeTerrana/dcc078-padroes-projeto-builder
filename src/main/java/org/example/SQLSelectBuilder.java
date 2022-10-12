package org.example;

public class SQLSelectBuilder {
    private SQLSelect sqlSelect;

    public SQLSelectBuilder() {
        sqlSelect = new SQLSelect();
    }

    public SQLSelect build() {
        if(sqlSelect.getColumns().isBlank()) {
            throw new IllegalArgumentException("Colunas devem ser preenchidas");
        }

        if(sqlSelect.getTable().isBlank()) {
            throw new IllegalArgumentException("Tabela deve ser preenchida");
        }

        return sqlSelect;
    }

    public SQLSelectBuilder setColumns(String columns) {
        sqlSelect.setColumns(columns);
        return this;
    }

    public SQLSelectBuilder setTable(String table) {
        sqlSelect.setTable(table);
        return this;
    }

    public SQLSelectBuilder setWhere(String where) {
        sqlSelect.setWhere(where);
        return this;
    }

    public SQLSelectBuilder setOrderBy(String orderBy) {
        sqlSelect.setOrderBy(orderBy);
        return this;
    }

    public SQLSelectBuilder setGroupBy(String groupBy) {
        sqlSelect.setGroupBy(groupBy);
        return this;
    }
}
