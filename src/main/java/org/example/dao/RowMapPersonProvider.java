package org.example.dao;

import org.example.models.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapPersonProvider implements RowMapper<Person> {

    public static final String PERSON_ID = "person_id";
    public static final String PERSON_NAME = "name";
    public static final String PERSON_YEAR_OF_BIRTH = "year_of_birth";

    @Override
    public Person mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Person person = new Person();
        person.setId(resultSet.getInt(PERSON_ID));
        person.setName(resultSet.getString(PERSON_NAME));
        person.setYear_of_birth(resultSet.getInt(PERSON_YEAR_OF_BIRTH));
        return person;
    }
}
