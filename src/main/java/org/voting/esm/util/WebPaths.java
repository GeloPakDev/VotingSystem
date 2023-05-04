package org.voting.esm.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class WebPaths {

    public static final String JSON = "application/json";
    public static final String BASE_URL = "/voting";
    public static final String API = "/api";
    public static final String CATEGORIES = "/categories";
    public static final String LAWS = "/laws";
    public static final String PRESIDENTS = "/presidents";
    public static final String USERS = "/users";
    public static final String VOTES = "/votes";
    public static final String ADMIN = "/admin";
    public static final String VOTE_FOR = "/voteFor";
    public static final String VOTE_AGAINST = "/voteAgainst";
}
