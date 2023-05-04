package org.voting.esm.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ColumnName {

    //COMMON names
    public static final String VOTE_ID = "vote_id";
    public static final String CATEGORY_ID = "category_id";
    public static final String DESCRIPTION = "description";
    //USER table
    public static final String USER_TABLE_NAME = "user";
    public static final String USER_FIRST_NAME = "first_name";
    public static final String USER_LAST_NAME = "last_name";
    public static final String USER_BIRTH_DATE = "birth_date";
    public static final String USER_ADDRESS = "address";
    public static final String USER_PASSPORT_NUMBER = "passport_number";
    public static final String USER_PASSPORT_ISSUE_DATE = "passport_issue_date";
    public static final String USER_PASSPORT_EXPIRE_DATE = "passport_expire_date";
    public static final String USER_LOGIN = "login";
    public static final String USER_PASSWORD = "password";
    public static final String USER_ROLE = "role";

    //CATEGORY table name
    public static final String CATEGORY_TABLE_NAME = "category";
    public static final String CATEGORY_NAME = "name";
    //LAW table name
    public static final String LAW_TABLE_NAME = "law";
    public static final String LAW_TITLE = "title";
    public static final String LAW_DESCRIPTION = "description";
    public static final String LAW_CREATE_DATE = "create_date";
    public static final String LAW_TYPE = "type";
    //PRESIDENT table name
    public static final String PRESIDENT_TABLE_NAME = "president";

    public static final String PRESIDENT_FIRST_NAME = "first_name";
    public static final String PRESIDENT_LAST_NAME = "last_name";
    public static final String PRESIDENT_PARTY_NAME = "party_name";
    public static final String PRESIDENT_BIOGRAPHY = "biography";
    public static final String PRESIDENT_FUTURE_PLANS = "future_plans";
    public static final String PRESIDENT_BIRTH_DATE = "birth_date";
    public static final String PRESIDENT_VOTE_NUMBERS = "vote_numbers";
    //VOTE TABLE
    public static final String VOTE_TABLE_NAME = "vote";
    public static final String VOTE_START_DATE = "start_date";
    public static final String VOTE_END_DATE = "end_date";
    public static final String VOTE_TOTAL_VOTES = "total_votes";
    public static final String VOTE_FOR = "vote_for";
    public static final String VOTE_AGAINST = "vote_against";

}
