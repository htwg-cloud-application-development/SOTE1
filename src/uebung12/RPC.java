package uebung12;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class RPC {

	public static void main(String[] args) {

		try {
			
			List<String> lines = Files.readAllLines(Paths.get("/home/max/workspace/SOTE1/src/uebung12/reflektion.txt"));
			
			for(String line: lines){
				System.out.println(line);
			}
			
			Class<?> newClass = Class.forName(lines.get(0));
			Constructor constr = newClass.getConstructor(String.class);
			Object obj = constr.newInstance(lines.get(1));
			Method method = newClass.getMethod(lines.get(2), String.class);
			method.invoke(obj, lines.get(3));
			
			method = newClass.getMethod("getName");
			System.out.println(method.invoke(obj));
			String test = (String) method.invoke(obj);
			System.out.println(test);
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
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
	}
}
