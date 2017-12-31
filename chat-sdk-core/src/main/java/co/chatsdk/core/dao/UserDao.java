package co.chatsdk.core.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER".
*/
public class UserDao extends AbstractDao<User, Long> {

    public static final String TABLENAME = "USER";

    /**
     * Properties of entity User.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property EntityID = new Property(1, String.class, "entityID", false, "ENTİTY_ID");
        public final static Property AuthenticationType = new Property(2, Integer.class, "authenticationType", false, "AUTHENTİCATİON_TYPE");
        public final static Property LastOnline = new Property(3, java.util.Date.class, "lastOnline", false, "LAST_ONLİNE");
        public final static Property LastUpdated = new Property(4, java.util.Date.class, "lastUpdated", false, "LAST_UPDATED");
        public final static Property MetaData = new Property(5, String.class, "metaData", false, "META_DATA");
    }

    private DaoSession daoSession;


    public UserDao(DaoConfig config) {
        super(config);
    }
    
    public UserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"ENTİTY_ID\" TEXT," + // 1: entityID
                "\"AUTHENTİCATİON_TYPE\" INTEGER," + // 2: authenticationType
                "\"LAST_ONLİNE\" INTEGER," + // 3: lastOnline
                "\"LAST_UPDATED\" INTEGER," + // 4: lastUpdated
                "\"META_DATA\" TEXT);"); // 5: metaData
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, User entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String entityID = entity.getEntityID();
        if (entityID != null) {
            stmt.bindString(2, entityID);
        }
 
        Integer authenticationType = entity.getAuthenticationType();
        if (authenticationType != null) {
            stmt.bindLong(3, authenticationType);
        }
 
        java.util.Date lastOnline = entity.getLastOnline();
        if (lastOnline != null) {
            stmt.bindLong(4, lastOnline.getTime());
        }
 
        java.util.Date lastUpdated = entity.getLastUpdated();
        if (lastUpdated != null) {
            stmt.bindLong(5, lastUpdated.getTime());
        }
 
        String metaData = entity.getMetaData();
        if (metaData != null) {
            stmt.bindString(6, metaData);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, User entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String entityID = entity.getEntityID();
        if (entityID != null) {
            stmt.bindString(2, entityID);
        }
 
        Integer authenticationType = entity.getAuthenticationType();
        if (authenticationType != null) {
            stmt.bindLong(3, authenticationType);
        }
 
        java.util.Date lastOnline = entity.getLastOnline();
        if (lastOnline != null) {
            stmt.bindLong(4, lastOnline.getTime());
        }
 
        java.util.Date lastUpdated = entity.getLastUpdated();
        if (lastUpdated != null) {
            stmt.bindLong(5, lastUpdated.getTime());
        }
 
        String metaData = entity.getMetaData();
        if (metaData != null) {
            stmt.bindString(6, metaData);
        }
    }

    @Override
    protected final void attachEntity(User entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public User readEntity(Cursor cursor, int offset) {
        User entity = new User( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // entityID
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // authenticationType
            cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)), // lastOnline
            cursor.isNull(offset + 4) ? null : new java.util.Date(cursor.getLong(offset + 4)), // lastUpdated
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // metaData
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, User entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setEntityID(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAuthenticationType(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setLastOnline(cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)));
        entity.setLastUpdated(cursor.isNull(offset + 4) ? null : new java.util.Date(cursor.getLong(offset + 4)));
        entity.setMetaData(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(User entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(User entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(User entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
