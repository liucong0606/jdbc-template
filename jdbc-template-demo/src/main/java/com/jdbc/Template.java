package com.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public interface Template {
    void execute(String sql);

    void update(String sql);
    void update(String sql, Object... params);

    <T> T query4Object(String sql, Class<T> classes);
    <T> T query4Object(String sql, RowMapper<T> rowMapper, Class<T> classes);
    <T> T query4Object(String sql, Class classes, Object... params);
}
