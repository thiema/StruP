/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.core.DataPort;
import easyflow.custom.exception.ParameterNotFoundException;
import java.util.Iterator;
import java.util.Map.Entry;

import easyflow.tool.Command;
import easyflow.tool.DefaultToolElement;
import easyflow.tool.Parameter;
import easyflow.tool.ToolPackage;
import easyflow.traversal.TraversalChunk;
import easyflow.traversal.TraversalCriterion;
import easyflow.util.maps.MapsPackage;

import easyflow.util.maps.impl.StringToParameterMapImpl;

import java.net.URI;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;


import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.w3c.dom.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.tool.impl.CommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.tool.impl.CommandImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link easyflow.tool.impl.CommandImpl#isExecutable <em>Executable</em>}</li>
 *   <li>{@link easyflow.tool.impl.CommandImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.tool.impl.CommandImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandImpl extends EObjectImpl implements Command {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isExecutable() <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXECUTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExecutable() <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecutable()
	 * @generated
	 * @ordered
	 */
	protected boolean executable = EXECUTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(Command.class);

	/**
	 * The cached value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated
	 * @ordered
	 */
	protected Logger logger = LOGGER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Parameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolPackage.Literals.COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.COMMAND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.COMMAND__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExecutable() {
		return executable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutable(boolean newExecutable) {
		boolean oldExecutable = executable;
		executable = newExecutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.COMMAND__EXECUTABLE, oldExecutable, executable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logger getLogger() {
		return logger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EcoreEMap<String,Parameter>(MapsPackage.Literals.STRING_TO_PARAMETER_MAP, StringToParameterMapImpl.class, this, ToolPackage.COMMAND__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String generateCommandString(EMap<String, Object> constaints) {
		Iterator<Parameter> it = getParameters().values().iterator();
		EList<String> tmp = new BasicEList<String>();
		while (it.hasNext()) {
			Parameter parameter = it.next();
			//paramString+="name="+parameter.getName();
			//paramString+=" cmd="+parameter.generateCommandString(null);
			tmp.add(parameter.generateCommandString(constaints));
		}
		String commandString=StringUtils.join(tmp.toArray(), " ");
		return commandString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean resolvePorts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean resolveStaticPorts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EMap<String, URI> getInputs(EMap<String, EList<TraversalChunk>> chunks) {
		EMap<String, URI> inputs = new BasicEMap<String, URI>();
		for (Entry<String, Parameter> parameterEntry:getParameters())
		{
			//if (parameterEntry.getValue())
			logger.debug(parameterEntry.getKey()+" "+parameterEntry.getValue().getName());
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EMap<String, URI> getOutputs(EMap<String, EList<TraversalChunk>> chunks) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, URI> getStaticInputs(EMap<String, EList<TraversalChunk>> chunks) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	
	
	/**
	 * <!-- begin-user-doc -->
	 * find the groupings that are (implicitly) defined for given dataport by 
	 * resolving the associated parameters groupings field.
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<String> getGroupingsForDataPort(DataPort dataPort, boolean isRequired) {
		EList<String> groupings=new BasicEList<String>();
		
		//Parameter parameter=getParameterForDataPort(dataPort);		
		for (TraversalCriterion tc:dataPort.getGroupingCriteria())
		{
			for (String groupingStr:tc.getChunks().keySet())
			{
				if (getParameters().containsKey(groupingStr))
				{
					Parameter parameter = getParameters().get(groupingStr);
					if (!parameter.isOptional() && isRequired)
						groupings.addAll(parameter.getGrouping());
					else
						groupings.addAll(parameter.getGrouping());
				}
			}	
		}
		return groupings;
	}


	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGroupingsForDataPortAny(DataPort dataPort, boolean required, boolean isOutput) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameterForDataPort(DataPort dataPort) throws ParameterNotFoundException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameterForDataPortAny(DataPort dataPort) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void readImplementation(Element element) {
		logger.debug(element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToolPackage.COMMAND__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToolPackage.COMMAND__NAME:
				return getName();
			case ToolPackage.COMMAND__DESCRIPTION:
				return getDescription();
			case ToolPackage.COMMAND__EXECUTABLE:
				return isExecutable();
			case ToolPackage.COMMAND__LOGGER:
				return getLogger();
			case ToolPackage.COMMAND__PARAMETERS:
				if (coreType) return getParameters();
				else return getParameters().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ToolPackage.COMMAND__NAME:
				setName((String)newValue);
				return;
			case ToolPackage.COMMAND__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ToolPackage.COMMAND__EXECUTABLE:
				setExecutable((Boolean)newValue);
				return;
			case ToolPackage.COMMAND__PARAMETERS:
				((EStructuralFeature.Setting)getParameters()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ToolPackage.COMMAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ToolPackage.COMMAND__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ToolPackage.COMMAND__EXECUTABLE:
				setExecutable(EXECUTABLE_EDEFAULT);
				return;
			case ToolPackage.COMMAND__PARAMETERS:
				getParameters().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ToolPackage.COMMAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ToolPackage.COMMAND__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ToolPackage.COMMAND__EXECUTABLE:
				return executable != EXECUTABLE_EDEFAULT;
			case ToolPackage.COMMAND__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case ToolPackage.COMMAND__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DefaultToolElement.class) {
			switch (derivedFeatureID) {
				case ToolPackage.COMMAND__NAME: return ToolPackage.DEFAULT_TOOL_ELEMENT__NAME;
				case ToolPackage.COMMAND__DESCRIPTION: return ToolPackage.DEFAULT_TOOL_ELEMENT__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DefaultToolElement.class) {
			switch (baseFeatureID) {
				case ToolPackage.DEFAULT_TOOL_ELEMENT__NAME: return ToolPackage.COMMAND__NAME;
				case ToolPackage.DEFAULT_TOOL_ELEMENT__DESCRIPTION: return ToolPackage.COMMAND__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", executable: ");
		result.append(executable);
		result.append(", logger: ");
		result.append(logger);
		result.append(')');
		return result.toString();
	}

} //CommandImpl
