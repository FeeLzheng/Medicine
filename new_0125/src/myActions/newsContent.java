package myActions;
public class newsContent {
    int id;             //封装新闻ID字段
    int topicid;        //封装新闻栏目ID字段
    String title;       //封装新闻标题字段
    String content;     //封装新闻内容字段
    String author;      //封装新闻作者字段
    String date;        //封装新闻发布日期字段
    String topicTitle;  //封装新闻栏目名称
    //无参数构造函数
    public newsContent() {}
    //带参数构造函数
    public newsContent(int id, int topicid, String title,
            String content, String author, String date, String topicTitle) {
        this.id = id;
        this.topicid = topicid;
        this.title = title;
        this.content = content;
        this.author = author;
        this.date = date;
        this.topicTitle = topicTitle;
    }
    //其他字段的getXXX和setXXX方法
    public String getTopicTitle() {
        return topicTitle;
    }
    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }    
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getTopicid() {
        return topicid;
    }
    public void setTopicid(int topicid) {
        this.topicid = topicid;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }    
}
