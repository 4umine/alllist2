package com.coderbike.otherTest;

import com.coderbike.baseTest.BaseTest;
import com.coderbike.utils.context.SpringContextUtils;
import com.coderbike.web.authen.Authenticator;
import org.junit.Test;

/**
 * <p>描述<p/>
 * Created with IDEA
 * author: liubingguang
 * date: 2016/12/13 11:07
 */
public class SpringContextUtilsTest extends BaseTest {

    @Test
    public void test() {
        Authenticator localAuthenticator = SpringContextUtils.getBean("localCookieAuthenticator");
        Authenticator oauth2CookieAuthenticator = SpringContextUtils.getBean("oauth2CookieAuthenticator");
        System.out.println(localAuthenticator);
        System.out.println(oauth2CookieAuthenticator);
    }
}
