package miniJava.interpreter.miniJava.impl;

import java.lang.Object;
import java.lang.Override;
import miniJava.interpreter.miniJava.MiniJavaPackage;
import miniJava.interpreter.miniJava.Symbol;
import miniJava.interpreter.miniJava.SymbolBinding;
import miniJava.interpreter.miniJava.Value;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

public class SymbolBindingImpl extends MinimalEObjectImpl.Container implements SymbolBinding {
	protected Value value;

	protected Symbol symbol;

	protected SymbolBindingImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.SYMBOL_BINDING;
	}

	public Value getValue() {
		return value;
	}

	public NotificationChain basicSetValue(Value newValue, NotificationChain msgs) {
		Value oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.SYMBOL_BINDING__VALUE, oldValue, newValue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	public void setValue(Value newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject) value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.SYMBOL_BINDING__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject) newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.SYMBOL_BINDING__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.SYMBOL_BINDING__VALUE, newValue, newValue));
	}

	public Symbol getSymbol() {
		if (symbol != null && symbol.eIsProxy()) {
			InternalEObject oldSymbol = (InternalEObject) symbol;
			symbol = (Symbol) eResolveProxy(oldSymbol);
			if (symbol != oldSymbol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiniJavaPackage.SYMBOL_BINDING__SYMBOL, oldSymbol, symbol));
			}
		}
		return symbol;
	}

	public Symbol basicGetSymbol() {
		return symbol;
	}

	public void setSymbol(Symbol newSymbol) {
		Symbol oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.SYMBOL_BINDING__SYMBOL, oldSymbol, symbol));
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case MiniJavaPackage.SYMBOL_BINDING__VALUE :
				return basicSetValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiniJavaPackage.SYMBOL_BINDING__VALUE :
				return getValue();
			case MiniJavaPackage.SYMBOL_BINDING__SYMBOL :
				if (resolve)
					return getSymbol();
				return basicGetSymbol();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MiniJavaPackage.SYMBOL_BINDING__VALUE :
				setValue((Value) newValue);
				return;
			case MiniJavaPackage.SYMBOL_BINDING__SYMBOL :
				setSymbol((Symbol) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MiniJavaPackage.SYMBOL_BINDING__VALUE :
				setValue((Value) null);
				return;
			case MiniJavaPackage.SYMBOL_BINDING__SYMBOL :
				setSymbol((Symbol) null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MiniJavaPackage.SYMBOL_BINDING__VALUE :
				return value != null;
			case MiniJavaPackage.SYMBOL_BINDING__SYMBOL :
				return symbol != null;
		}
		return super.eIsSet(featureID);
	}
}
