package com.sjcl.zrsy.controller;

import com.sjcl.zrsy.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/hello")
    public User hello() {
        return new User("liweibo", "123");
    }


    @PostMapping("/insert")
    public String insert(@RequestBody User user) {
        jdbcTemplate.update("insert into users (username, passwd) values  (?, ?)", user.getUsername(), user.getPassword());
        return "更新数据库成功";
    }

    @GetMapping("/getAll")
    public List<User> getAll() {


        return jdbcTemplate.query("select username, passwd as `password` from users limit 1", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User u = new User();
                u.setUsername(resultSet.getString("username"));
                u.setPassword(resultSet.getString("password"));
                return u;
            }
        });
    }

    @GetMapping("/delete")
    public int delete() {


        return jdbcTemplate.update("delete from users where username = \"liweibo\"");

    }


}
