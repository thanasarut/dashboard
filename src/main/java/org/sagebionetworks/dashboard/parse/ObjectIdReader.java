package org.sagebionetworks.dashboard.parse;

import java.util.regex.Pattern;

import org.sagebionetworks.dashboard.model.AccessRecord;

/**
 * Extracts the ID value from the object ID field.
 */
public class ObjectIdReader extends RegexRecordReader {

    public ObjectIdReader(Pattern pattern) {
        super(pattern);
    }

    @Override
    String readString(AccessRecord record) {
        return record.getObjectId();
    }
}
