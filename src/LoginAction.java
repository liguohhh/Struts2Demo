import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;


public class LoginAction implements Action {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute() throws Exception {
        getData getdata= new getData();


        if (getdata.login(getUsername(),getPassword())) {
            //获取actionContext
            ActionContext ac=ActionContext.getContext();
            //把登录名保存到application中
            ac.getApplication().put("userName",getUsername());
            //把登录名保存到session中
            ac.getSession().put("userName",getUsername());
            return SUCCESS;
        } else {
            return INPUT;
        }
    }

}
