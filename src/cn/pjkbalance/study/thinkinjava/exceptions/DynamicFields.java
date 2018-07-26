package cn.pjkbalance.study.thinkinjava.exceptions;

import java.sql.ResultSet;

/**
 * Created by jiakang on 2018/7/25.
 */
class DynamicFieldException extends Exception {
}

public class DynamicFields {
    private Object[][] fields;
    public DynamicFields(int initialSize) {
        fields = new Object[initialSize][2];
        for (int i = 0 ; i < initialSize; i++) {
            fields[i] = new Object[]{null, null};
        }
    }
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("");
        for(Object[] objects : fields) {
            sb.append(objects[0]).append(": ").append(objects[1]).append("\n");
        }
        return sb.toString();
    }
    private int hasField(String id) {
        for (int i = 0; i < fields.length; i++) {
            if (id.equals(fields[i][0])) {
                return i;
            }
        }
        return -1;
    }

    private int getFieldNumber(String id) throws NoSuchFieldException {
        int fieldNum = hasField(id);
        if(fieldNum == -1) {
            throw new NoSuchFieldException("no such field");
        }
        return fieldNum;
    }

    private int makeField(String id) {
        for (int i = 0 ; i < fields.length; i++) {
            if (fields[i][0] == null){
                fields[i][0] = id;
                return i;
            }
        }
        Object[][] temp = new Object[fields.length+1][2];
        for (int i = 0; i < fields.length; i++) {
            temp[i] = fields[i];
        }
        temp[fields.length] = new Object[] {null, null};
        fields = temp;
        return makeField(id);
    }

    public Object getField(String id) throws NoSuchFieldException {
        return fields[getFieldNumber(id)];
    }

    public Object setField(String id , Object value) throws DynamicFieldException {
        if (value == null) {
            /*DynamicFieldException e = new DynamicFieldException();
            e.initCause(new NullPointerException());
            throw e;*/
            throw new RuntimeException(new NullPointerException("value is null"));
        }

        int fieldNumber = hasField(id);
        if (fieldNumber == -1) {
            fieldNumber = makeField(id);
        }
        Object result = null;
        try {
            result = getField(id);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException("test"+e);
        }
        fields[fieldNumber][1] = value;
        return result;
    }

    public static void main(String... args) {
        DynamicFields df = new DynamicFields(3);
        System.out.println(df);

        try {
            df.setField("d", "A value for d");
            df.setField("no1", 47);
            df.setField("no2", 48);
            System.out.println(df);
            df.setField("d", "A new value for d");
            System.out.println("================================");
            System.out.println(df);
            df.setField("d", null);

        } catch (DynamicFieldException e) {
            e.printStackTrace(System.out);
        }
    }
}

