import com.lx.dao.TeacherDao;
import com.lx.pojo.Teacher;
import com.lx.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class OneToMoreTest {
    @Test
    public void test01() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherDao teacherDao = sqlSession.getMapper(TeacherDao.class);
        List<Teacher> teacherList = teacherDao.getTeacher();
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }

    @Test
    public void test02() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherDao teacherDao = sqlSession.getMapper(TeacherDao.class);
        Teacher teacher = teacherDao.getTeacherAndStudent(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
