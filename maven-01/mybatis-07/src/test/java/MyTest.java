import com.lx.dao.BlogDao;
import com.lx.pojo.Blog;
import com.lx.utils.IDutils;
import com.lx.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void test000() {
        Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setTitle("Mybatis的学习笔记");
        blog.setAuthor("lx");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        System.out.println(blog.toString());
    }
    @Test
    public void test00() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogDao blogDao = sqlSession.getMapper(BlogDao.class);

        Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setTitle("Mybatis的学习笔记");
        blog.setAuthor("lx");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        blogDao.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Spring的学习笔记");
        blogDao.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("SpringBoot的学习笔记");
        blogDao.addBlog(blog);

        sqlSession.close();
    }

    @Test
    public void test01() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogDao blogDao = sqlSession.getMapper(BlogDao.class);

        HashMap map = new HashMap();
        map.put("title", "Spring学习笔记");
        List<Blog> blogs = blogDao.queryBlogIF(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }
}
