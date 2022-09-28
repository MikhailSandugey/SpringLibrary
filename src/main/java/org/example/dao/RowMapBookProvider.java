package org.example.dao;

import org.example.models.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapBookProvider implements RowMapper<Book> {
    private static final String BOOK_ID = "book_id";
    private static final String BOOK_NAME = "name";
    private static final String BOOK_AUTHOR = "author";
    private static final String BOOK_YEAR = "year";

    @Override
    public Book mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Book book = new Book();
        book.setId(resultSet.getInt(BOOK_ID));
        book.setName(resultSet.getString(BOOK_NAME));
        book.setAuthor(resultSet.getString(BOOK_AUTHOR));
        book.setYear(resultSet.getInt(BOOK_YEAR));
        return book;
    }
}
