package uebung13;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Codegenerator {

	public void generateStatement(Class<?> type) {

		int fieldCount = 0;
		Field fields[] = type.getDeclaredFields();
		SqlAttribute sqlAttributes[] = new SqlAttribute[fields.length];
		String fieldNames[] = new String[fields.length];

		for (Field field : fields) {

			SqlType annotation = field.getAnnotation(SqlType.class);
			System.out.println(annotation.toString());

			try {

				Method method = annotation.getClass().getMethod("sqlType");
				sqlAttributes[fieldCount] = (SqlAttribute) method.invoke(annotation);
				fieldNames[fieldCount] = field.getName();

			} catch (NoSuchMethodException | SecurityException e) {

				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			fieldCount++;

		}

		String sqlStatement = "CREATE TABLE " + type.getName() + "(";

		for (int i = 0; i < fields.length; i++) {

			if (i < fields.length - 1) {

				sqlStatement = sqlStatement +  fieldNames[i] + " " + sqlAttributes[i] +", ";
			
			} else {

				sqlStatement = sqlStatement + " " + fieldNames[i] + " " + sqlAttributes[i] + ");";				
				
			}
		}

		System.out.println(sqlStatement);

	}

}
