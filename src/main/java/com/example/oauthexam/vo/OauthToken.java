package com.example.oauthexam.vo;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * 토큰 관련 정보
 */
@Data
public class OauthToken {
    @JsonIgnoreProperties(ignoreUnknown = true)
    @Data
    public static class response {

        private String access_token;
        private String token_type;
        private String refresh_token;
        private long expires_in;
        private String scope;

    }

    @Data
    public static class request {

        @Data
        public static class accessToken {
            public String code;
            private String grant_type;
            private String redirect_url;

            public Map getMapData() {
                Map map = new HashMap<>();
                map.put("code", code);
                map.put("grant_type", grant_type);
                map.put("redirect_url", redirect_url);
                return map;
            }
        }

        @Data
        public static class refreshToken {
            private String refreshToken;
            private String grant_type;

            public Map getMapData() {
                Map<String, Object> map = new HashMap<>();
                map.put("redirect_url", refreshToken);
                map.put("grant_type", grant_type);
                return map;
            }
        }
    }
}
