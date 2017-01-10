package myActions;
//导入需要的库
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ModelDriven;
import java.util.*;

//声明支持模型驱动的的业务控制器类
public class ContentAdmin extends ActionSupport implements ModelDriven<newsContent> {
    //模型封装了新闻记录的全部字段：（id：新闻ID，topicid：新闻栏目ID，title：新闻标题，
    //content：新闻内容，author：新闻作者，date：新闻发布日期，topicTitle：新闻栏目名称）
    //在通过视图请求控制器时，同名的请求参数保存到对应字段中，
    //并将字段对象存放于ActionContext中，在结果视图中使用字段名称的OGNL表达式获得字段值
    //如果请求参数中无同名参数，模型的int字段默认为0，String字段默认为空字符串。
    private newsContent news = new newsContent();//声明模型
    public newsContent getModel() {//声明模型getXXX方法
        return news;
    }

    //queryTopicId字段用于接收查询参数中传入的新闻栏目ID，
    //并作为参数查询数据库，获得新闻栏目和相关新闻内容数据
    int queryTopicId;
    //声明queryTopicId字段getXXX和setXXX方法
    public int getQueryTopicId() {
        return queryTopicId;
    }
    public void setQueryTopicId(int queryTopicId) {
        this.queryTopicId = queryTopicId;
    }

    //queryTopicTitle字段主要用于保存请求的新闻栏目ID对应的新闻栏目名称
    String queryTopicTitle;
    //getQueryTopicTitle()方法使用queryTopicId作为参数，从数据库查询新闻栏目名称
     public String getQueryTopicTitle() throws Exception {
        String sql = "select title from topics where topicid=" + queryTopicId;
        doSqlDb db = new doSqlDb();
        ResultSet rs = db.doQuery(sql);
        if (rs.next()) {
            queryTopicTitle = rs.getString("title");
        }
        db.close();//清理数据库模型对象
        return queryTopicTitle;
    }
    public void setQueryTopicTitle(String queryTopicTitle) {
        this.queryTopicTitle = queryTopicTitle;
    }

    //subNewsBar字段为结果视图提供请求的新闻栏目的子栏目记录列表
    private List<newsTopic> subNewsBar;
    //getSubNewsBar()方法使用请求的新闻栏目ID（queryTopicId）作为参数，
    //从数据库查询子栏目记录数据，并将数据封装到列表集合对象中
    public List<newsTopic> getSubNewsBar() throws Exception {
        subNewsBar = new ArrayList<newsTopic>();
        int id,parentId;
        String title;
        doSqlDb db = new doSqlDb();
        ResultSet rs = db.doQuery("select all * from topics where parentid=" + queryTopicId);
        while (rs.next()) {
            id = rs.getInt("topicid");//获得新闻栏目ID
            parentId = rs.getInt("parentid");//获得上一级新闻栏目ID
            title = rs.getString("title");//获得栏目名称
            subNewsBar.add(new newsTopic(id, parentId, title));//创建新闻栏目对象，加入列表集合
        }
        db.close();//清理数据库模型对象
        return subNewsBar;
    }
    
    //allNews字段为客户端返回请求的新闻栏目和子栏目新闻
    private List<newsContent> allNews = null;
    //getAllNews()方法从数据库检索指定栏目及其子栏目的新闻记录
    //请求参数queryTopicId提供作为查询条件参数的新闻栏目ID
    public List<newsContent> getAllNews() throws Exception {
        this.allNews = new ArrayList<newsContent>();
        String sql = "SELECT contents.*,topics.title as topictitle FROM contents,topics"
                + " WHERE contents.topicid=topics.topicid and (contents.topicid="
                + queryTopicId + " or parentid=" + queryTopicId + ")";
        doSqlDb db = new doSqlDb();
        ResultSet rs = db.doQuery(sql);
        int id,topicid;
        String title,content,author,date,topicTitle;
        while (rs.next()) {
            id = rs.getInt("id");//获得新闻记录ID
            topicid = rs.getInt("topicid");//获得新闻记录的栏目ID
            title = rs.getString("title");//获得新闻记录的标题
            content = rs.getString("content");//获得新闻记录的内容
            author = rs.getString("author");//获得新闻作者
            date = rs.getString("date");//获得新闻发布日期
            if(date.length()>9) date=date.substring(0, 10);//去掉日期中的时间
            topicTitle = rs.getString("topictitle");//获得新闻栏目名称
            this.allNews.add(new newsContent(id, topicid, title, content, author, date, topicTitle));
        }
        db.close();//清理数据库模型对象
        return allNews;
    }

    //topicList字段为客户端返回新闻栏目下拉列表
    private String topicList = null;
    //getTopicList()方法检索数据库，创建新闻栏目下拉列表
    public String getTopicList() throws Exception {
        List<newsTopic> list1 = new ArrayList<newsTopic>();
        int id, id2;
        int parentId, parentId2;
        String title, title2;
        doSqlDb db = new doSqlDb();
        //因为不能通过一个语句对象同时返回多个ResultSet对象，
        //所以先从数据库检索非一级新闻栏目记录，将其存入列表集合，以便创建新闻栏目下拉列表
        ResultSet rs = db.doQuery("select all * from topics where parentid<>0");
        while (rs.next()) {
            id = rs.getInt("topicid");
            parentId = rs.getInt("parentid");
            title = rs.getString("title");
            list1.add(new newsTopic(id, parentId, title));
        }
        //检索数据库，获得一级新闻栏目记录
        rs = db.doQuery("select all * from topics where parentid=0");
        topicList = "<select name=\"topicid\" id=\"topicid\" style=\"width: 120px\">";
        while (rs.next()) {
            id = rs.getInt("topicid");
            parentId = rs.getInt("parentid");
            title = rs.getString("title");
            topicList = topicList + "<option value =\"" + id + "\" ";
            //如果栏目ID与请求的栏目ID相同，则添加默认选中标记
            if (id == queryTopicId) {
                topicList = topicList + " selected";
            }
            topicList = topicList + ">" + title + "</option>";
            Iterator<newsTopic> ib = list1.iterator();
            newsTopic news;
            while (ib.hasNext()) {//在一级栏目下方添加所有子栏目选项
                news = ib.next();
                id2 = news.getId();
                parentId2 = news.getParentId();
                title2 = news.getTitle();
                if (id == parentId2) {
                    topicList = topicList + "<option value =\"" + id2 + "\" ";
                    //如果栏目ID与请求的栏目ID相同，则添加默认选中标记
                    if (id2 == queryTopicId) {
                        topicList = topicList + " selected";
                    }
                    topicList = topicList + ">&nbsp;" + title + "::" + title2 + "</option>";
                }
            }
        }
        topicList = topicList + "</select>";
        db.close();//清理数据库模型对象
        return topicList;
    }

    //Action默认执行方法
    public String execute() throws Exception {
        return SUCCESS;
    }

    //admin_contentAdd()为完成添加新闻记录操作的同名Action方法，
    //需要加入数据库的新闻记录数据通过请求参数传入模型，
    //Action方法从模型中取得传入的请求参数值。
    //数据库中新闻id字段为自动增量，添加记录时无需（也不能）指定字段值
    public String admin_contentAdd() throws Exception {
        //从模型取得新闻数据
        int topicid = news.getTopicid();
        String title = news.getTitle();
        String content = news.getContent();
        String author = news.getAuthor();
        String date = news.getDate();
        if(date.length()>9)date = date.substring(0, 10);//取消日期中的时间部分
        //构造SQL INSERT命令字符串
        String sql = "INSERT INTO contents(topicid,title,[content],author,date) "
                + "VALUES(" + topicid + ",'" + title + "','" + content + "','"
                + author + "','" + date + "')";
        doSqlDb db = new doSqlDb();
        db.doUpdate(sql);//执行SQL INSERT命令添加新闻记录
        db.close();//清理数据库模型对象
        this.addActionMessage("成功将新闻数据写入数据库！");//为结果视图返回提示信息
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_contentAdd.jsp
        return SUCCESS;
    }

    //admin_contentEdit()为完成进入新闻修改页面操作的同名Action方法，
    //欲编辑的新闻记录的id通过请求参数传入模型，
    //Action方法从模型中取得传入的新闻id，作为参数从数据库检索该新闻记录数据，
    //检索结果封装到模型中，结果视图中使用OGNL表达式后的模型字段中的记录数据
    public String admin_contentEdit() throws Exception {
        int id = news.getId();//获得请求参数中传入的欲编辑的新闻记录的id
        String sql = "SELECT contents.*,topics.title as topictitle FROM contents,topics"
                + " WHERE contents.topicid=topics.topicid and contents.id="
                + id;
        doSqlDb db = new doSqlDb();
        ResultSet rs = db.doQuery(sql);//检索数据库，获得新闻记录数据
        if (rs.next()) {//将查询结果中的新闻记录数据封装到模型字段中
            news.id = rs.getInt("id");
            news.topicid = rs.getInt("topicid");
            news.title = rs.getString("title");
            news.content = rs.getString("content");
            news.author = rs.getString("author");
            news.date = rs.getString("date");
            news.topicTitle = rs.getString("topictitle");
        }
        db.close();//清理数据库模型对象
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_contentEdit.jsp
        return SUCCESS;
    }

    //admin_contentEditSave()为完成保存修改的新闻操作的同名Action方法，
    //欲保存的新闻记录数据通过请求参数传入模型，
    //Action方法从模型中取得传入的新闻数据，将其作为参数修改数据库中的对应新闻记录
    public String admin_contentEditSave() throws Exception {
        //从模型中获得请求传入的新闻数据
        int id = news.getId();
        int topicid = news.getTopicid();
        String title = news.getTitle();
        String content = news.getContent();
        String author = news.getAuthor();
        String date = news.getDate().substring(0, 10);
        //构造修改新闻记录的SQL UPDATE命令
        String sql = "UPDATE contents SET topicid = " + topicid
                + ",title = '" + title + "'"
                + ",content = '" + content + "'"
                + ",author = '" + author + "'"
                + ",date = '" + date + "' WHERE id=" + id;
        doSqlDb db = new doSqlDb();
        db.doUpdate(sql);//SQL UPDATE命令修改新闻记录
        db.close();//清理数据库模型对象
        this.addActionMessage("成功修改新闻数据！");
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
         //admin_contentEditSave未采用动态配置，其success结果视图配置代码如下：
        //<result name="success" type="chain">admin_contentAdmin</result>
        //从结果视图配置可知，完成保存操作后，客户端跳转到Action链admin_contentAdmin
        //即重新进入新闻内容管理页面
        return SUCCESS;
    }

    //admin_contentDelete()为完成删除新闻记录操作的同名Action方法，
    //欲删除新闻记录的ID通过请求参数数传入模型，
    //Action方法从模型中取得传入的请求参数值。
    public String admin_contentDelete() throws Exception {
        int id = news.id;
        String sql = "DELETE FROM contents WHERE id=" + id;
        doSqlDb db = new doSqlDb();
        db.doUpdate(sql);
        db.close();//清理数据库模型对象
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
       //根据Action动态配置规则，结果视图为admin_contentDelete.jsp        
        return SUCCESS;
    }

    //admin_contentAdmin()为完成进入新闻内容管理页面操作的同名Action方法，
    //在Action方法中未执行任何操作，只是通过Action类的各个字段传递数据
    public String admin_contentAdmin() throws Exception {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_contentAdmin.jsp
        return SUCCESS;
    }

    //getNewsList()为进入新闻链接列表页面操作的同名Action方法，
    //在Action方法中未执行任何操作，只是通过Action类的各个字段传递数据
    public String getNewsList() {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为getNewsList.jsp
        return SUCCESS;
    }

    //showList()为完成显示新闻链接列表操作的同名Action方法，
    //在Action方法中未执行任何操作，只是通过Action类的各个字段传递数据
    public String showList() {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为showList.jsp
        return SUCCESS;
    }

    //showIndexList()为完成新闻网站首页中显示新闻链接列表操作的同名Action方法，
    //在Action方法中未执行任何操作，只是通过Action类的各个字段传递数据
    public String showIndexList() {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为showIndexList.jsp
        return SUCCESS;
    }

    //showContent()为完成新闻记录内容显示操作的同名Action方法，
    //欲显示的新闻记录的ID通过请求参数数传入模型，
    //Action方法从模型中取得传入的请求参数值，作为参数从数据库检索新闻记录数据。
    //检索结果封装到模型中，结果视图中使用OGNL表达式后的模型字段中的记录数据
    public String showContent() throws Exception {
        String sql = "SELECT contents.*,topics.title as topictitle FROM contents,topics"
                + " WHERE contents.topicid=topics.topicid and contents.id="
                + queryTopicId;
        doSqlDb db = new doSqlDb();
        ResultSet rs = db.doQuery(sql);//查询数据库，获得新闻记录数据
        if (rs.next()) {//将查询结果中的新闻记录数据封装到模型字段中
            news.id = rs.getInt("id");
            news.topicid = rs.getInt("topicid");
            news.title = rs.getString("title");
            news.content = rs.getString("content");
            news.author = rs.getString("author");
            news.date = rs.getString("date").substring(0, 10);
            news.topicTitle = rs.getString("topictitle");
        }
        db.close();//清理数据库模型对象
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为showContent.jsp
        return SUCCESS;
    }

    //在执行新闻搜索操作时，搜索参数（搜索关键字和字段名称）传入同名Action字段
    private String keyword;//保存请求参数中的新闻搜索关键字
    private String where;//保存请求参数中新闻搜索的字段名称
    public String getKeyword() { return keyword; }
    public void setKeyword(String keyword) {this.keyword = keyword;}
    public String getWhere() {return where;}
    public void setWhere(String where) {this.where = where; }

    //searchList字段为客户端返回包含新闻搜索结果的列表集合
    private List<newsContent> searchList = null;
    //getSearchList()方法使用请求参数中的查询关键字和查询类型，从数据库检索新闻
    public List<newsContent> getSearchList() throws Exception {
        this.searchList = new ArrayList<newsContent>();
        //在新闻搜索时，where字段保存的是字段中文名称，
        //查询时使用对应的数据库表字段名称
        String coltitle = "content";
        if (where.equals("标题"))  coltitle = "title";
        if (where.equals("作者"))  coltitle = "author";
        String sql = "SELECT [id],[title],[date] FROM [contents]"
                + "WHERE " + coltitle + " LIKE '%" + keyword + "%'";
        doSqlDb db = new doSqlDb();
        ResultSet rs = db.doQuery(sql);
        int id,topicid = 0;
        String title,content = "",author = "",date,topicTitle = "";
        while (rs.next()) {
            id = rs.getInt("id");//获得新闻id
            title = rs.getString("title");//获得新闻标题
            date = rs.getString("date");//获得新闻发布日期
            if(date.length()>9) date=date.substring(0, 10);//去掉日期中的时间
            //返回的搜索结果中将使用新闻的id、标题和日期来创建连接列表
            this.searchList.add(new newsContent(id, topicid, title, content, author, date, topicTitle));
        }
        db.close();//清理数据库模型对象
        return searchList;
    }

    //search()为进入新闻搜索结果显示页面的同名Action方法，
    //在Action方法中未执行任何操作，只是通过Action类的各个字段传递数据
    public String search() throws Exception {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为search.jsp
        return SUCCESS;
    }
}
