package miniJava.interpreter.miniJava;

import java.lang.String;
import org.eclipse.emf.ecore.EObject;

public interface ArrayRefValue extends EObject, Value {
	ArrayInstance getInstance();

	void setInstance(ArrayInstance value);

	Value copyj();

	String customToString();
}
