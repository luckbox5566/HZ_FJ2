package priv.leon.hzfj.hibernate.interfaces;

import java.sql.ResultSet;
import java.util.List;

public interface Query {

    public <T> List<T> query();
}
