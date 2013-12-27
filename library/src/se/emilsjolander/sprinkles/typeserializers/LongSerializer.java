package se.emilsjolander.sprinkles.typeserializers;

import android.content.ContentValues;
import android.database.Cursor;

/**
 * Created by emilsjolander on 27/12/13.
 */
public class LongSerializer implements TypeSerializer<Long> {

    @Override
    public Long unpack(Cursor c, String name) {
        return c.getLong(c.getColumnIndexOrThrow(name));
    }

    @Override
    public void pack(Long object, ContentValues cv, String name) {
        cv.put(name, object);
    }

    @Override
    public SqlType getSqlType() {
        return SqlType.INTEGER;
    }

}
