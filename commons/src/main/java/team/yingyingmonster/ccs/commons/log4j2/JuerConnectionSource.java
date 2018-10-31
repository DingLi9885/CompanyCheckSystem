package team.yingyingmonster.ccs.commons.log4j2;

import org.apache.logging.log4j.core.appender.db.jdbc.ConnectionSource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Juer Whang <br/>
 * - project: CompanyCheckSystem
 * - create: 16:03 2018/10/29
 * -
 **/
public class JuerConnectionSource implements ConnectionSource {
    private DataSource dataSource;

    private JuerConnectionSource() { }

    public static JuerConnectionSource newInstance(DataSource dataSource) {
        JuerConnectionSource result = new JuerConnectionSource();
        result.dataSource = dataSource;
        return result;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
