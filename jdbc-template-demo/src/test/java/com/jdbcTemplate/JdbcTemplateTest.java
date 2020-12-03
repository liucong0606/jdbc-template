package com.jdbcTemplate;

import com.utils.JdbcUtil;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class JdbcTemplateTest {
    public void test01() {
        JdbcTemplate template = new JdbcTemplate(JdbcUtil.getDataSource());
        template.execute("");
        template.update("");
    }

    public void test02() {
        JdbcTemplate template = new JdbcTemplate(JdbcUtil.getDataSource());
        // template.queryForObject()
    }
}
