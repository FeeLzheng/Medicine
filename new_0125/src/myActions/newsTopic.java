package myActions;
public class newsTopic {
    private int id;//封装新闻栏目ID
    private int parentId;//封装新闻栏目所属父栏目的ID
    private String title;//封装新闻栏目名称
    //无参数构造函数

    //带参数构造函数
    public newsTopic(int id, int parentId, String title) {
        this.id = id;
        this.parentId = parentId;
        this.title = title;
    }
    //其他字段的getXXX和setXXX方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
