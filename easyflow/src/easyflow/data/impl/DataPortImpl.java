/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.data.impl;

import easyflow.data.DataFactory;
import easyflow.data.DataFormat;
import easyflow.data.DataPackage;
import easyflow.data.DataPort;
import easyflow.tool.Tool;
import easyflow.traversal.TraversalCriterion;
import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToDataFormatMapImpl;
import easyflow.util.maps.impl.StringToToolMapImpl;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.data.impl.DataPortImpl#getGroupingCriteria <em>Grouping Criteria</em>}</li>
 *   <li>{@link easyflow.data.impl.DataPortImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link easyflow.data.impl.DataPortImpl#getDataFormats <em>Data Formats</em>}</li>
 *   <li>{@link easyflow.data.impl.DataPortImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link easyflow.data.impl.DataPortImpl#getBitPos <em>Bit Pos</em>}</li>
 *   <li>{@link easyflow.data.impl.DataPortImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.data.impl.DataPortImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link easyflow.data.impl.DataPortImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link easyflow.data.impl.DataPortImpl#getParameterName <em>Parameter Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPortImpl extends MinimalEObjectImpl.Container implements DataPort {
	/**
	 * The cached value of the '{@link #getGroupingCriteria() <em>Grouping Criteria</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<TraversalCriterion> groupingCriteria;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final short CARDINALITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected short cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataFormats() <em>Data Formats</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormats()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, DataFormat> dataFormats;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBitPos() <em>Bit Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitPos()
	 * @generated
	 * @ordered
	 */
	protected static final short BIT_POS_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getBitPos() <em>Bit Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitPos()
	 * @generated
	 * @ordered
	 */
	protected short bitPos = BIT_POS_EDEFAULT;

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
	 * The cached value of the '{@link #getTools() <em>Tools</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTools()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Tool> tools;

	/**
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean static_ = STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected String parameterName = PARAMETER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraversalCriterion> getGroupingCriteria() {
		if (groupingCriteria == null) {
			groupingCriteria = new EObjectResolvingEList<TraversalCriterion>(TraversalCriterion.class, this, DataPackage.DATA_PORT__GROUPING_CRITERIA);
		}
		return groupingCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(short newCardinality) {
		short oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_PORT__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, DataFormat> getDataFormats() {
		if (dataFormats == null) {
			dataFormats = new EcoreEMap<String,DataFormat>(MapsPackage.Literals.STRING_TO_DATA_FORMAT_MAP, StringToDataFormatMapImpl.class, this, DataPackage.DATA_PORT__DATA_FORMATS);
		}
		return dataFormats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_PORT__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getBitPos() {
		return bitPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitPos(short newBitPos) {
		short oldBitPos = bitPos;
		bitPos = newBitPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_PORT__BIT_POS, oldBitPos, bitPos));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Tool> getTools() {
		if (tools == null) {
			tools = new EcoreEMap<String,Tool>(MapsPackage.Literals.STRING_TO_TOOL_MAP, StringToToolMapImpl.class, this, DataPackage.DATA_PORT__TOOLS);
		}
		return tools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		boolean oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_PORT__STATIC, oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterName() {
		return parameterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterName(String newParameterName) {
		String oldParameterName = parameterName;
		parameterName = newParameterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_PORT__PARAMETER_NAME, oldParameterName, parameterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isCompatible(DataPort dataPort) {
		if (dataPort.getName().equalsIgnoreCase(getName()))
			return true;
		for (Entry<String, DataFormat> entryDataFormat:getDataFormats().entrySet())
		{
			for (Entry<String, DataFormat> entryDataFormat2:dataPort.getDataFormats().entrySet())
				if (entryDataFormat.getValue().getName().equalsIgnoreCase(entryDataFormat2.getValue().getName()))
					return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean removeDataPortFrom(EList<DataPort> dataPorts) {
		DataPort foundDataPort=null;
		for (DataPort dataPort:dataPorts)
			if (isCompatible(dataPort))
			{
				foundDataPort=dataPort;
				break;
			}
		if (foundDataPort!=null)
			dataPorts.remove(foundDataPort);
		return foundDataPort!=null;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public DataFormat getFormat() {
		if (!getDataFormats().isEmpty())
			return getDataFormats().get(0).getValue();
		else return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean matches(DataFormat dataFormat) {
		
		for (DataFormat curFormat: getDataFormats().values())
			if (curFormat.getName().equalsIgnoreCase(dataFormat.getName()))
				return true;
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isCompatibleStr(EList<String> formats, boolean requireAll) {
		Iterator<String> it = formats.iterator();
		while (it.hasNext())
		{
			String dataFormat = it.next();
			
			if (!requireAll && isCompatible(dataFormat))
				return true;
			
			if (requireAll && !isCompatible(dataFormat))
				return false;
		}
		return requireAll;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isCompatibleStr(EList<String> formats) {
		return isCompatibleStr(formats, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isCompatible(EList<DataFormat> formats, boolean requireAll) {
		Iterator<DataFormat> it = formats.iterator();
		while (it.hasNext())
		{
			DataFormat dataFormat = it.next();

			if (!requireAll && isCompatible(dataFormat))
				return true;

			if (requireAll && !isCompatible(dataFormat))
				return false;
		}
		return requireAll;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isCompatible(EList<DataFormat> formats) {
		return isCompatible(formats, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isCompatible(String format) {
		
		Iterator<Entry<String, DataFormat>> it = getDataFormats().iterator();
		while (it.hasNext())
		{
			Entry<String, DataFormat> e = it.next();
			if (e.getValue().getName().equalsIgnoreCase(format))
				return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isCompatible(DataFormat format) {
		
		Iterator<Entry<String, DataFormat>> it = getDataFormats().iterator();
		while (it.hasNext())
		{
			Entry<String, DataFormat> e = it.next();
			if (e.getValue().getName().equalsIgnoreCase(format.getName()))
				return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void setFormat(String format) {
		EList<String> formats = new BasicEList<String>();
		formats.add(format);
		setFormats(formats);
	}

	static Map<String, DataFormat> dataFormatMap  = new HashMap<String, DataFormat>();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void setFormats(EList<String> formats) {
		for (String format:formats)
		{
			DataFormat dataFormat = null;
			if (dataFormatMap.containsKey(format))
			{
				dataFormat = dataFormatMap.get(format);
			}
			else
			{
				dataFormat = DataFactory.eINSTANCE.createDataFormat();
				dataFormat.setName(format);
			}
			getDataFormats().put(dataFormat.getName(), dataFormat);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.DATA_PORT__DATA_FORMATS:
				return ((InternalEList<?>)getDataFormats()).basicRemove(otherEnd, msgs);
			case DataPackage.DATA_PORT__TOOLS:
				return ((InternalEList<?>)getTools()).basicRemove(otherEnd, msgs);
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
			case DataPackage.DATA_PORT__GROUPING_CRITERIA:
				return getGroupingCriteria();
			case DataPackage.DATA_PORT__CARDINALITY:
				return getCardinality();
			case DataPackage.DATA_PORT__DATA_FORMATS:
				if (coreType) return getDataFormats();
				else return getDataFormats().map();
			case DataPackage.DATA_PORT__OPTIONAL:
				return isOptional();
			case DataPackage.DATA_PORT__BIT_POS:
				return getBitPos();
			case DataPackage.DATA_PORT__NAME:
				return getName();
			case DataPackage.DATA_PORT__TOOLS:
				if (coreType) return getTools();
				else return getTools().map();
			case DataPackage.DATA_PORT__STATIC:
				return isStatic();
			case DataPackage.DATA_PORT__PARAMETER_NAME:
				return getParameterName();
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
			case DataPackage.DATA_PORT__GROUPING_CRITERIA:
				getGroupingCriteria().clear();
				getGroupingCriteria().addAll((Collection<? extends TraversalCriterion>)newValue);
				return;
			case DataPackage.DATA_PORT__CARDINALITY:
				setCardinality((Short)newValue);
				return;
			case DataPackage.DATA_PORT__DATA_FORMATS:
				((EStructuralFeature.Setting)getDataFormats()).set(newValue);
				return;
			case DataPackage.DATA_PORT__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case DataPackage.DATA_PORT__BIT_POS:
				setBitPos((Short)newValue);
				return;
			case DataPackage.DATA_PORT__NAME:
				setName((String)newValue);
				return;
			case DataPackage.DATA_PORT__TOOLS:
				((EStructuralFeature.Setting)getTools()).set(newValue);
				return;
			case DataPackage.DATA_PORT__STATIC:
				setStatic((Boolean)newValue);
				return;
			case DataPackage.DATA_PORT__PARAMETER_NAME:
				setParameterName((String)newValue);
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
			case DataPackage.DATA_PORT__GROUPING_CRITERIA:
				getGroupingCriteria().clear();
				return;
			case DataPackage.DATA_PORT__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case DataPackage.DATA_PORT__DATA_FORMATS:
				getDataFormats().clear();
				return;
			case DataPackage.DATA_PORT__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case DataPackage.DATA_PORT__BIT_POS:
				setBitPos(BIT_POS_EDEFAULT);
				return;
			case DataPackage.DATA_PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataPackage.DATA_PORT__TOOLS:
				getTools().clear();
				return;
			case DataPackage.DATA_PORT__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case DataPackage.DATA_PORT__PARAMETER_NAME:
				setParameterName(PARAMETER_NAME_EDEFAULT);
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
			case DataPackage.DATA_PORT__GROUPING_CRITERIA:
				return groupingCriteria != null && !groupingCriteria.isEmpty();
			case DataPackage.DATA_PORT__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case DataPackage.DATA_PORT__DATA_FORMATS:
				return dataFormats != null && !dataFormats.isEmpty();
			case DataPackage.DATA_PORT__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
			case DataPackage.DATA_PORT__BIT_POS:
				return bitPos != BIT_POS_EDEFAULT;
			case DataPackage.DATA_PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataPackage.DATA_PORT__TOOLS:
				return tools != null && !tools.isEmpty();
			case DataPackage.DATA_PORT__STATIC:
				return static_ != STATIC_EDEFAULT;
			case DataPackage.DATA_PORT__PARAMETER_NAME:
				return PARAMETER_NAME_EDEFAULT == null ? parameterName != null : !PARAMETER_NAME_EDEFAULT.equals(parameterName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DataPackage.DATA_PORT___IS_COMPATIBLE__DATAPORT:
				return isCompatible((DataPort)arguments.get(0));
			case DataPackage.DATA_PORT___REMOVE_DATA_PORT_FROM__ELIST:
				return removeDataPortFrom((EList<DataPort>)arguments.get(0));
			case DataPackage.DATA_PORT___GET_FORMAT:
				return getFormat();
			case DataPackage.DATA_PORT___MATCHES__DATAFORMAT:
				return matches((DataFormat)arguments.get(0));
			case DataPackage.DATA_PORT___IS_COMPATIBLE_STR__ELIST_BOOLEAN:
				return isCompatibleStr((EList<String>)arguments.get(0), (Boolean)arguments.get(1));
			case DataPackage.DATA_PORT___IS_COMPATIBLE_STR__ELIST:
				return isCompatibleStr((EList<String>)arguments.get(0));
			case DataPackage.DATA_PORT___IS_COMPATIBLE__ELIST_BOOLEAN:
				return isCompatible((EList<DataFormat>)arguments.get(0), (Boolean)arguments.get(1));
			case DataPackage.DATA_PORT___IS_COMPATIBLE__ELIST:
				return isCompatible((EList<DataFormat>)arguments.get(0));
			case DataPackage.DATA_PORT___IS_COMPATIBLE__STRING:
				return isCompatible((String)arguments.get(0));
			case DataPackage.DATA_PORT___IS_COMPATIBLE__DATAFORMAT:
				return isCompatible((DataFormat)arguments.get(0));
			case DataPackage.DATA_PORT___SET_FORMAT__STRING:
				setFormat((String)arguments.get(0));
				return null;
			case DataPackage.DATA_PORT___SET_FORMATS__ELIST:
				setFormats((EList<String>)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(", optional: ");
		result.append(optional);
		result.append(", bitPos: ");
		result.append(bitPos);
		result.append(", name: ");
		result.append(name);
		result.append(", static: ");
		result.append(static_);
		result.append(", parameterName: ");
		result.append(parameterName);
		result.append(')');
		return result.toString();
	}

} //DataPortImpl
