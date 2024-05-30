package org.example.module3.lesson17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Optional;

public class Example7 {
}

class User {
    Integer id;
    String name;
}

class Account {

}

interface CrudDao<E> {
    Optional<E> findById(Integer id);
}

interface UserDao extends CrudDao<User> {

}

interface AccountDao extends CrudDao<Account> {
    @Override
    Optional<Account> findById(Integer id);
}


class JdbcUserDao implements UserDao {
    private final ConnectionProvider connectionProvider;

    JdbcUserDao(ConnectionProvider connectionProvider) {
        this.connectionProvider = connectionProvider;
    }

    @Override
    public Optional<User> findById(Integer id) {
        try (Connection connection = connectionProvider.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("....");) {
            // specific operation with prepared statement  A

        } catch (SQLException e) {

        }

        return null; //B
    }
}

class JdbcAccountDao extends AbstractJdbcDao<Account> implements AccountDao {

    JdbcAccountDao(ConnectionProvider connectionProvider) {
        super(connectionProvider);
    }

    @Override
    protected Optional<Account> specificMethodB() {
        return Optional.empty();
    }

    @Override
    protected void specificMethodA(PreparedStatement preparedStatement) {

    }
}

abstract class AbstractJdbcDao<E> implements CrudDao<E> {

    private final ConnectionProvider connectionProvider;

    AbstractJdbcDao(ConnectionProvider connectionProvider) {
        this.connectionProvider = connectionProvider;
    }

    @Override
    public Optional<E> findById(Integer id) {
        try (Connection connection = connectionProvider.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("....");) {
            specificMethodA(preparedStatement);

        } catch (SQLException e) {

        }

        return specificMethodB();
    }

    abstract protected Optional<E> specificMethodB();

    abstract protected void specificMethodA(PreparedStatement preparedStatement);
}


class ConnectionProvider {

    public Connection getConnection() {
        return null;
    }
}
