package objects;

public class Token {

    private String accessToken;
    private int accessTokenLifeTime;
    private String refreshToken;
    private int refreshTokenLifeTime;

    public String getAccessToken() {
        return accessToken;
    }

    public int getAccessTokenLifeTime() {
        return accessTokenLifeTime;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public int getRefreshTokenLifeTime() {
        return refreshTokenLifeTime;
    }
}
