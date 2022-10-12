package org.example;

public class SQLSelect {
    private String columns;
    private String table;
    private String where;
    private String orderBy;
    private String groupBy;

    public SQLSelect() {
        columns = table = where = orderBy = groupBy = "";
    }

    public String getColumns() {
        return columns;
    }

    public void setColumns(String columns) {
        this.columns = columns;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT ").append(columns).append(" FROM ").append(table);

        if(!where.isBlank()) {
            stringBuilder.append(" WHERE ").append(where);
        }

        if(!orderBy.isBlank()) {
            stringBuilder.append(" ORDER BY ").append(orderBy);
        }

        if(!groupBy.isBlank()) {
            stringBuilder.append(" GROUP BY ").append(groupBy);
        }

        return stringBuilder.toString();
    }
}
