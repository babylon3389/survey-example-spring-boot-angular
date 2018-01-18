package com.github.joumenharzli.surveypoc.repository.dao;

import java.util.List;

/**
 * User Dao
 *
 * @author Joumen HARZLI
 */
public interface UserDao {

  /**
   * Returns the list of ids of the not found users using ids
   *
   * @param usersIds ids of the users to check
   * @return a list of the ids of the not found users
   * @throws DaoException             if there is an sql exception
   * @throws IllegalArgumentException if any given argument is invalid
   */
  List<Long> findNonSavedUsersByUsersIds(List<Long> usersIds);
}