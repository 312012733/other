package io.renren.modules.sys.oauth2;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * token
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-05-20 13:22
 */
public class OAuth2Token implements AuthenticationToken
{
    private static final long serialVersionUID = 4095493097281368632L;
    
    private String token;
    
    public OAuth2Token(String token)
    {
        this.token = token;
    }
    
    /**
     * 返回在身份验证过程中提交的帐户标识（token）
     */
    @Override
    public String getPrincipal()
    {
        return token;
    }
    
    /**
     * 返回用户在验证提交的帐户标识的身份验证过程中提交的凭据。（token）
     */
    @Override
    public Object getCredentials()
    {
        return token;
    }
}
