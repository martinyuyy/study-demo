import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * created date 2020/8/18 18:21
 * <p>
 *
 * @author martinyuyy
 */
public class AccountDemo {

    public static void main(String[] args) {
        String str = "{\"code\":0,\"message\":\"\",\"data\":{\"authorizer_info\":{\"account_uin\":1849574635,\"account_id\":17431799,\"scope_list\":[\"ads_insights\",\"user_actions\",\"ads_management\",\"audience_management\"],\"wechat_account_id\":\"\",\"account_role_type\":\"ACCOUNT_ROLE_TYPE_ADVERTISER\",\"account_type\":\"ACCOUNT_TYPE_ADVERTISER\",\"role_type\":\"ROLE_TYPE_SELF_OPERATOR\"},\"access_token\":\"5e2941d546feafd58a6508c937356df9\",\"refresh_token\":\"7b3ad63159f0b394c9893b08385c5529\",\"access_token_expires_in\":86400,\"refresh_token_expires_in\":2592000}}\n" +
                "{\"code\":0,\"message\":\"\",\"data\":{\"authorizer_info\":{\"account_uin\":2761774877,\"account_id\":17463077,\"scope_list\":[\"ads_insights\",\"user_actions\",\"ads_management\",\"audience_management\"],\"wechat_account_id\":\"\",\"account_role_type\":\"ACCOUNT_ROLE_TYPE_ADVERTISER\",\"account_type\":\"ACCOUNT_TYPE_ADVERTISER\",\"role_type\":\"ROLE_TYPE_SELF_OPERATOR\"},\"access_token\":\"1e9707371c891f823aa2babe60aeb8b6\",\"refresh_token\":\"a76e87097f6c748979fa33025f4baecc\",\"access_token_expires_in\":86400,\"refresh_token_expires_in\":2592000}}\n" +
                "{\"code\":0,\"message\":\"\",\"data\":{\"authorizer_info\":{\"account_uin\":2761774877,\"account_id\":17466158,\"scope_list\":[\"ads_insights\",\"user_actions\",\"ads_management\",\"audience_management\"],\"wechat_account_id\":\"\",\"account_role_type\":\"ACCOUNT_ROLE_TYPE_ADVERTISER\",\"account_type\":\"ACCOUNT_TYPE_ADVERTISER\",\"role_type\":\"ROLE_TYPE_SELF_OPERATOR\"},\"access_token\":\"b1c8591757258ccaedae3433441957dd\",\"refresh_token\":\"82f8152d116a23e8aed400670b1cf568\",\"access_token_expires_in\":86400,\"refresh_token_expires_in\":2592000}}\n" +
                "{\"code\":0,\"message\":\"\",\"data\":{\"authorizer_info\":{\"account_uin\":2761774877,\"account_id\":17466159,\"scope_list\":[\"ads_insights\",\"user_actions\",\"ads_management\",\"audience_management\"],\"wechat_account_id\":\"\",\"account_role_type\":\"ACCOUNT_ROLE_TYPE_ADVERTISER\",\"account_type\":\"ACCOUNT_TYPE_ADVERTISER\",\"role_type\":\"ROLE_TYPE_SELF_OPERATOR\"},\"access_token\":\"6a683affa6b90e17e8116838163d1e5f\",\"refresh_token\":\"eaa0bd780ff460868a19e6124567ed8a\",\"access_token_expires_in\":86400,\"refresh_token_expires_in\":2592000}}\n" +
                "{\"code\":0,\"message\":\"\",\"data\":{\"authorizer_info\":{\"account_uin\":1583638136,\"account_id\":17466166,\"scope_list\":[\"ads_insights\",\"user_actions\",\"ads_management\",\"audience_management\"],\"wechat_account_id\":\"\",\"account_role_type\":\"ACCOUNT_ROLE_TYPE_ADVERTISER\",\"account_type\":\"ACCOUNT_TYPE_ADVERTISER\",\"role_type\":\"ROLE_TYPE_SELF_OPERATOR\"},\"access_token\":\"44b7b75544f36da011b53782e939da00\",\"refresh_token\":\"28d3c2fc5c1c41b95d57e73b6b1d27d3\",\"access_token_expires_in\":86400,\"refresh_token_expires_in\":2592000}}\n" +
                "{\"code\":0,\"message\":\"\",\"data\":{\"authorizer_info\":{\"account_uin\":1583638136,\"account_id\":17466169,\"scope_list\":[\"ads_insights\",\"user_actions\",\"ads_management\",\"audience_management\"],\"wechat_account_id\":\"\",\"account_role_type\":\"ACCOUNT_ROLE_TYPE_ADVERTISER\",\"account_type\":\"ACCOUNT_TYPE_ADVERTISER\",\"role_type\":\"ROLE_TYPE_SELF_OPERATOR\"},\"access_token\":\"bfb92f318e20026e6dbf5e482e03e169\",\"refresh_token\":\"704e11e8b756b5bb948356a986ce7ab1\",\"access_token_expires_in\":86400,\"refresh_token_expires_in\":2592000}}\n" +
                "{\"code\":0,\"message\":\"\",\"data\":{\"authorizer_info\":{\"account_uin\":1583638136,\"account_id\":17466171,\"scope_list\":[\"ads_insights\",\"user_actions\",\"ads_management\",\"audience_management\"],\"wechat_account_id\":\"\",\"account_role_type\":\"ACCOUNT_ROLE_TYPE_ADVERTISER\",\"account_type\":\"ACCOUNT_TYPE_ADVERTISER\",\"role_type\":\"ROLE_TYPE_SELF_OPERATOR\"},\"access_token\":\"f4d5f9b98b342ca0cc59bb88f2b10f3a\",\"refresh_token\":\"ef012c1fd3b4b60f2f2e4a2c915919e1\",\"access_token_expires_in\":86400,\"refresh_token_expires_in\":2592000}}\n" +
                "{\"code\":0,\"message\":\"\",\"data\":{\"authorizer_info\":{\"account_uin\":3031789162,\"account_id\":17466175,\"scope_list\":[\"ads_insights\",\"user_actions\",\"ads_management\",\"audience_management\"],\"wechat_account_id\":\"\",\"account_role_type\":\"ACCOUNT_ROLE_TYPE_ADVERTISER\",\"account_type\":\"ACCOUNT_TYPE_ADVERTISER\",\"role_type\":\"ROLE_TYPE_SELF_OPERATOR\"},\"access_token\":\"41d21acbd9156b52ee15780f16177bfc\",\"refresh_token\":\"f0d3c790b90bed4a1df47872e89cd9d0\",\"access_token_expires_in\":86400,\"refresh_token_expires_in\":2592000}}\n" +
                "{\"code\":0,\"message\":\"\",\"data\":{\"authorizer_info\":{\"account_uin\":3031789162,\"account_id\":17466179,\"scope_list\":[\"ads_insights\",\"user_actions\",\"ads_management\",\"audience_management\"],\"wechat_account_id\":\"\",\"account_role_type\":\"ACCOUNT_ROLE_TYPE_ADVERTISER\",\"account_type\":\"ACCOUNT_TYPE_ADVERTISER\",\"role_type\":\"ROLE_TYPE_SELF_OPERATOR\"},\"access_token\":\"e12c17cc449846a48c56eb5c9b66fecb\",\"refresh_token\":\"a4a5086924c386dd47be8517b43628f8\",\"access_token_expires_in\":86400,\"refresh_token_expires_in\":2592000}}\n" +
                "{\"code\":0,\"message\":\"\",\"data\":{\"authorizer_info\":{\"account_uin\":3031789162,\"account_id\":17466184,\"scope_list\":[\"ads_insights\",\"user_actions\",\"ads_management\",\"audience_management\"],\"wechat_account_id\":\"\",\"account_role_type\":\"ACCOUNT_ROLE_TYPE_ADVERTISER\",\"account_type\":\"ACCOUNT_TYPE_ADVERTISER\",\"role_type\":\"ROLE_TYPE_SELF_OPERATOR\"},\"access_token\":\"5da3995b4aff97952b5c7cf72d2dd971\",\"refresh_token\":\"6e298d89ab5e81972d62e70aedefa756\",\"access_token_expires_in\":86400,\"refresh_token_expires_in\":2592000}}\n" +
                "{\"code\":0,\"message\":\"\",\"data\":{\"authorizer_info\":{\"account_uin\":3603466204,\"account_id\":17466188,\"scope_list\":[\"ads_insights\",\"user_actions\",\"ads_management\",\"audience_management\"],\"wechat_account_id\":\"\",\"account_role_type\":\"ACCOUNT_ROLE_TYPE_ADVERTISER\",\"account_type\":\"ACCOUNT_TYPE_ADVERTISER\",\"role_type\":\"ROLE_TYPE_SELF_OPERATOR\"},\"access_token\":\"e096eaa333d61d9c09c18a2f8ecf9b4e\",\"refresh_token\":\"3f96cb99a3212b4f2fef085a4ac8a97d\",\"access_token_expires_in\":86400,\"refresh_token_expires_in\":2592000}}\n" +
                "{\"code\":0,\"message\":\"\",\"data\":{\"authorizer_info\":{\"account_uin\":1669330016,\"account_id\":17477681,\"scope_list\":[\"ads_insights\",\"user_actions\",\"ads_management\",\"audience_management\"],\"wechat_account_id\":\"\",\"account_role_type\":\"ACCOUNT_ROLE_TYPE_ADVERTISER\",\"account_type\":\"ACCOUNT_TYPE_ADVERTISER\",\"role_type\":\"ROLE_TYPE_SELF_OPERATOR\"},\"access_token\":\"0c246c5dfe44d80afffc010efc02aa83\",\"refresh_token\":\"207f6620b9147171a84fa07c80adb843\",\"access_token_expires_in\":86400,\"refresh_token_expires_in\":2592000}}\n" +
                "{\"code\":0,\"message\":\"\",\"data\":{\"authorizer_info\":{\"account_uin\":1164966885,\"account_id\":17477658,\"scope_list\":[\"ads_insights\",\"user_actions\",\"ads_management\",\"audience_management\"],\"wechat_account_id\":\"\",\"account_role_type\":\"ACCOUNT_ROLE_TYPE_ADVERTISER\",\"account_type\":\"ACCOUNT_TYPE_ADVERTISER\",\"role_type\":\"ROLE_TYPE_SELF_OPERATOR\"},\"access_token\":\"de2d7c0eee97bace9670b9e87ddef2a1\",\"refresh_token\":\"4a62a64281b83f8717799277276bb19e\",\"access_token_expires_in\":86400,\"refresh_token_expires_in\":2592000}}\n" +
                "{\"code\":0,\"message\":\"\",\"data\":{\"authorizer_info\":{\"account_uin\":3531667483,\"account_id\":17477626,\"scope_list\":[\"ads_insights\",\"user_actions\",\"ads_management\",\"audience_management\"],\"wechat_account_id\":\"\",\"account_role_type\":\"ACCOUNT_ROLE_TYPE_ADVERTISER\",\"account_type\":\"ACCOUNT_TYPE_ADVERTISER\",\"role_type\":\"ROLE_TYPE_SELF_OPERATOR\"},\"access_token\":\"cafa9c605c747a3e8b14f72dd8f10822\",\"refresh_token\":\"9339921ad30fd95281e12fec4720542b\",\"access_token_expires_in\":86400,\"refresh_token_expires_in\":2592000}}\n" +
                "{\"code\":0,\"message\":\"\",\"data\":{\"authorizer_info\":{\"account_uin\":167731980,\"account_id\":17477599,\"scope_list\":[\"ads_insights\",\"user_actions\",\"ads_management\",\"audience_management\"],\"wechat_account_id\":\"\",\"account_role_type\":\"ACCOUNT_ROLE_TYPE_ADVERTISER\",\"account_type\":\"ACCOUNT_TYPE_ADVERTISER\",\"role_type\":\"ROLE_TYPE_SELF_OPERATOR\"},\"access_token\":\"c300f613099d658138ad8bb24f205dca\",\"refresh_token\":\"3254c12223151d11b1ca22cefff4b493\",\"access_token_expires_in\":86400,\"refresh_token_expires_in\":2592000}}\n" +
                "{\"code\":0,\"message\":\"\",\"data\":{\"authorizer_info\":{\"account_uin\":2250132706,\"account_id\":17477569,\"scope_list\":[\"ads_insights\",\"user_actions\",\"ads_management\",\"audience_management\"],\"wechat_account_id\":\"\",\"account_role_type\":\"ACCOUNT_ROLE_TYPE_ADVERTISER\",\"account_type\":\"ACCOUNT_TYPE_ADVERTISER\",\"role_type\":\"ROLE_TYPE_SELF_OPERATOR\"},\"access_token\":\"34bd7cbd0cc14c80525e6a3c1a4046fd\",\"refresh_token\":\"40c38fe9580db1a17ef1b2f0538620fe\",\"access_token_expires_in\":86400,\"refresh_token_expires_in\":2592000}}\n" +
                "{\"code\":0,\"message\":\"\",\"data\":{\"authorizer_info\":{\"account_uin\":977268851,\"account_id\":17477533,\"scope_list\":[\"ads_insights\",\"user_actions\",\"ads_management\",\"audience_management\"],\"wechat_account_id\":\"\",\"account_role_type\":\"ACCOUNT_ROLE_TYPE_ADVERTISER\",\"account_type\":\"ACCOUNT_TYPE_ADVERTISER\",\"role_type\":\"ROLE_TYPE_SELF_OPERATOR\"},\"access_token\":\"ac309cad700fe11ae665b7c851196423\",\"refresh_token\":\"371ab7228a7feb55d30f0bf4af0d4e06\",\"access_token_expires_in\":86400,\"refresh_token_expires_in\":2592000}}\n" +
                "{\"code\":0,\"message\":\"\",\"data\":{\"authorizer_info\":{\"account_uin\":2375039597,\"account_id\":17477470,\"scope_list\":[\"ads_insights\",\"user_actions\",\"ads_management\",\"audience_management\"],\"wechat_account_id\":\"\",\"account_role_type\":\"ACCOUNT_ROLE_TYPE_ADVERTISER\",\"account_type\":\"ACCOUNT_TYPE_ADVERTISER\",\"role_type\":\"ROLE_TYPE_SELF_OPERATOR\"},\"access_token\":\"bf23b766adc3eac938da2f8f60220c40\",\"refresh_token\":\"0026bcf99d14101e2fcc21d95be1f836\",\"access_token_expires_in\":86400,\"refresh_token_expires_in\":2592000}}\n" +
                "{\"code\":0,\"message\":\"\",\"data\":{\"authorizer_info\":{\"account_uin\":3127379930,\"account_id\":17477440,\"scope_list\":[\"ads_insights\",\"user_actions\",\"ads_management\",\"audience_management\"],\"wechat_account_id\":\"\",\"account_role_type\":\"ACCOUNT_ROLE_TYPE_ADVERTISER\",\"account_type\":\"ACCOUNT_TYPE_ADVERTISER\",\"role_type\":\"ROLE_TYPE_SELF_OPERATOR\"},\"access_token\":\"76fe5c3e7a722cc619ce9f7a426d6e82\",\"refresh_token\":\"dc5073c4a64f78dea90edc410b8a4abd\",\"access_token_expires_in\":86400,\"refresh_token_expires_in\":2592000}}\n" +
                "{\"code\":0,\"message\":\"\",\"data\":{\"authorizer_info\":{\"account_uin\":2162885326,\"account_id\":17477393,\"scope_list\":[\"ads_insights\",\"user_actions\",\"ads_management\",\"audience_management\"],\"wechat_account_id\":\"\",\"account_role_type\":\"ACCOUNT_ROLE_TYPE_ADVERTISER\",\"account_type\":\"ACCOUNT_TYPE_ADVERTISER\",\"role_type\":\"ROLE_TYPE_SELF_OPERATOR\"},\"access_token\":\"7026f01f2a574b99b962bb7f785eb6d8\",\"refresh_token\":\"715317206241aee1bc8ad9ac3647b0a0\",\"access_token_expires_in\":86400,\"refresh_token_expires_in\":2592000}}\n";
        String[] arr = str.split("\n");
        for (String s : arr) {
            JSONObject json = JSON.parseObject(s);
            JSONObject data = json.getJSONObject("data");
            String account = data.getJSONObject("authorizer_info").getString("account_id");
            String token = data.getString("refresh_token");
            System.out.println(account + "=" + account + "," + token);
        }
        
    }
}
