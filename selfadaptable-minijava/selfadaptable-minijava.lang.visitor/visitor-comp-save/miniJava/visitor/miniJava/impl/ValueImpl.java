package miniJava.visitor.miniJava.impl;

import java.lang.Object;
import java.lang.Override;
import miniJava.visitor.miniJava.MiniJavaPackage;
import miniJava.visitor.miniJava.Value;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import visitor.IDynamicModule;
import visitor.VisitorInterface;

public class ValueImpl extends MinimalEObjectImpl.Container implements Value {
	protected ValueImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.VALUE;
	}

	@Override
	public Object accept(VisitorInterface visitor) {
		return visitor.visitminiJava__Value(this);
	}

	@Override
	public void attach(IDynamicModule dm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detach(IDynamicModule dm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyDynamicModules() {
		// TODO Auto-generated method stub
		
	}
}
