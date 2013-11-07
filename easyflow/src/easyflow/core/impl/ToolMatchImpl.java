/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.impl;

import easyflow.core.CorePackage;
import easyflow.core.Task;
import easyflow.core.ToolMatch;

import easyflow.tool.Data;
import easyflow.tool.DataPort;
import easyflow.tool.Parameter;
import easyflow.tool.Tool;

import easyflow.util.maps.MapsPackage;

import easyflow.util.maps.impl.StringToStringMapImpl;

import java.util.Collection;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.core.impl.ToolMatchImpl#getTask <em>Task</em>}</li>
 *   <li>{@link easyflow.core.impl.ToolMatchImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link easyflow.core.impl.ToolMatchImpl#getScore <em>Score</em>}</li>
 *   <li>{@link easyflow.core.impl.ToolMatchImpl#getExpectedScore <em>Expected Score</em>}</li>
 *   <li>{@link easyflow.core.impl.ToolMatchImpl#getExpectedToolScore <em>Expected Tool Score</em>}</li>
 *   <li>{@link easyflow.core.impl.ToolMatchImpl#getMissingInDataPorts <em>Missing In Data Ports</em>}</li>
 *   <li>{@link easyflow.core.impl.ToolMatchImpl#getMissingOutDataPorts <em>Missing Out Data Ports</em>}</li>
 *   <li>{@link easyflow.core.impl.ToolMatchImpl#getMissingGroupingCriteria <em>Missing Grouping Criteria</em>}</li>
 *   <li>{@link easyflow.core.impl.ToolMatchImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.core.impl.ToolMatchImpl#getReverseMissingInDataPorts <em>Reverse Missing In Data Ports</em>}</li>
 *   <li>{@link easyflow.core.impl.ToolMatchImpl#getReverseMissingOutDataPorts <em>Reverse Missing Out Data Ports</em>}</li>
 *   <li>{@link easyflow.core.impl.ToolMatchImpl#getReverseMissingGroupingCriteria <em>Reverse Missing Grouping Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToolMatchImpl extends EObjectImpl implements ToolMatch {
	
	//i-number of matching input ports
	//o-              output ports
	//g-              gropuing crits
	//t-              traversal crits
	//                                   iogt
	//                                   ||||
	static final long defaultScore   = 0x0000;

	static final int     inputOffset = 24;
	static final int    outputOffset = 16;
	static final int  groupingOffset =  8;
	static final int traversalOffset =  0;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Task task;

	/**
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected Tool tool;

	/**
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final long SCORE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected long score = SCORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpectedScore() <em>Expected Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedScore()
	 * @generated
	 * @ordered
	 */
	protected static final long EXPECTED_SCORE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getExpectedScore() <em>Expected Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedScore()
	 * @generated
	 * @ordered
	 */
	protected long expectedScore = EXPECTED_SCORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpectedToolScore() <em>Expected Tool Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedToolScore()
	 * @generated
	 * @ordered
	 */
	protected static final long EXPECTED_TOOL_SCORE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getExpectedToolScore() <em>Expected Tool Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedToolScore()
	 * @generated
	 * @ordered
	 */
	protected long expectedToolScore = EXPECTED_TOOL_SCORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMissingInDataPorts() <em>Missing In Data Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingInDataPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPort> missingInDataPorts;

	/**
	 * The cached value of the '{@link #getMissingOutDataPorts() <em>Missing Out Data Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingOutDataPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPort> missingOutDataPorts;

	/**
	 * The cached value of the '{@link #getMissingGroupingCriteria() <em>Missing Grouping Criteria</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingGroupingCriteria()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> missingGroupingCriteria;

	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(ToolMatch.class);

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
	 * The cached value of the '{@link #getReverseMissingInDataPorts() <em>Reverse Missing In Data Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseMissingInDataPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPort> reverseMissingInDataPorts;

	/**
	 * The cached value of the '{@link #getReverseMissingOutDataPorts() <em>Reverse Missing Out Data Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseMissingOutDataPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPort> reverseMissingOutDataPorts;

	/**
	 * The cached value of the '{@link #getReverseMissingGroupingCriteria() <em>Reverse Missing Grouping Criteria</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseMissingGroupingCriteria()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> reverseMissingGroupingCriteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolMatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.TOOL_MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = (Task)eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.TOOL_MATCH__TASK, oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		Task oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TOOL_MATCH__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tool getTool() {
		if (tool != null && tool.eIsProxy()) {
			InternalEObject oldTool = (InternalEObject)tool;
			tool = (Tool)eResolveProxy(oldTool);
			if (tool != oldTool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.TOOL_MATCH__TOOL, oldTool, tool));
			}
		}
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tool basicGetTool() {
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTool(Tool newTool) {
		Tool oldTool = tool;
		tool = newTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TOOL_MATCH__TOOL, oldTool, tool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScore(long newScore) {
		long oldScore = score;
		score = newScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TOOL_MATCH__SCORE, oldScore, score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getExpectedScore() {
		return expectedScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedScore(long newExpectedScore) {
		long oldExpectedScore = expectedScore;
		expectedScore = newExpectedScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TOOL_MATCH__EXPECTED_SCORE, oldExpectedScore, expectedScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getExpectedToolScore() {
		return expectedToolScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedToolScore(long newExpectedToolScore) {
		long oldExpectedToolScore = expectedToolScore;
		expectedToolScore = newExpectedToolScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TOOL_MATCH__EXPECTED_TOOL_SCORE, oldExpectedToolScore, expectedToolScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPort> getMissingInDataPorts() {
		if (missingInDataPorts == null) {
			missingInDataPorts = new EObjectContainmentEList<DataPort>(DataPort.class, this, CorePackage.TOOL_MATCH__MISSING_IN_DATA_PORTS);
		}
		return missingInDataPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPort> getMissingOutDataPorts() {
		if (missingOutDataPorts == null) {
			missingOutDataPorts = new EObjectContainmentEList<DataPort>(DataPort.class, this, CorePackage.TOOL_MATCH__MISSING_OUT_DATA_PORTS);
		}
		return missingOutDataPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getMissingGroupingCriteria() {
		if (missingGroupingCriteria == null) {
			missingGroupingCriteria = new EcoreEMap<String,String>(MapsPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, CorePackage.TOOL_MATCH__MISSING_GROUPING_CRITERIA);
		}
		return missingGroupingCriteria;
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
	public void setLogger(Logger newLogger) {
		Logger oldLogger = logger;
		logger = newLogger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TOOL_MATCH__LOGGER, oldLogger, logger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPort> getReverseMissingInDataPorts() {
		if (reverseMissingInDataPorts == null) {
			reverseMissingInDataPorts = new EObjectContainmentEList<DataPort>(DataPort.class, this, CorePackage.TOOL_MATCH__REVERSE_MISSING_IN_DATA_PORTS);
		}
		return reverseMissingInDataPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPort> getReverseMissingOutDataPorts() {
		if (reverseMissingOutDataPorts == null) {
			reverseMissingOutDataPorts = new EObjectContainmentEList<DataPort>(DataPort.class, this, CorePackage.TOOL_MATCH__REVERSE_MISSING_OUT_DATA_PORTS);
		}
		return reverseMissingOutDataPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getReverseMissingGroupingCriteria() {
		if (reverseMissingGroupingCriteria == null) {
			reverseMissingGroupingCriteria = new EcoreEMap<String,String>(MapsPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, CorePackage.TOOL_MATCH__REVERSE_MISSING_GROUPING_CRITERIA);
		}
		return reverseMissingGroupingCriteria;
	}

	private void testBitComparison()
	{
		int score=0x000f;
		int res1=0x1000;
		int res2=0x0010;
		logger.debug("("+Integer.toHexString(score)+"<<4) = "+Integer.toHexString(score<<4)+" "+Integer.toBinaryString((score<<4)));
		logger.debug("("+Integer.toHexString(score)+"<<3) = "+Integer.toHexString(score<<3)+" "+Integer.toBinaryString((score<<3)));
		logger.debug("("+Integer.toHexString(score)+"<<2) = "+Integer.toHexString(score<<2)+" "+Integer.toBinaryString((score<<2)));
		logger.debug("("+Integer.toHexString(score)+">>4) = "+Integer.toHexString(score>>4)+" "+Integer.toBinaryString((score>>4)));
		logger.debug("("+Integer.toHexString(score)+"|"+
				Integer.toHexString(res1)+") = "+Integer.toHexString(score|res1));
		logger.debug("("+Integer.toHexString(score)+"|"+
				Integer.toHexString(res2)+") = "+Integer.toHexString(score|res2));
		logger.debug("---");
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public long computeScore() {

		int    inputCount  = 0;
		int   outputCount  = 0;
		score = 0;
		//EMap<String, URI> inputs=tool.getCommand().getInputs(getChunks());
		//EMap<String, URI> outputs=tool.getCommand().getOutputs(getChunks());
		
		EList<DataPort> taskMissingInDataPorts = new BasicEList<DataPort>();
		for (DataPort dataPort:getTask().getInDataPorts())
		{
			taskMissingInDataPorts.add(dataPort);
		}
		EList<DataPort> taskMissingOutDataPorts = new BasicEList<DataPort>();
		for (DataPort dataPort:getTask().getOutDataPorts())
		{
			taskMissingOutDataPorts.add(dataPort);
		}
		logger.debug("name="+getTool().getId()+" "+(getTool().getData()==null ? null:getTool().getData().keySet()));
		for (Entry<String, Parameter> parameterEntry:getTool().getCommand().getParameters().entrySet())
		{
			Parameter parameter = parameterEntry.getValue(); 
			logger.debug(parameter.getName()+" "+parameter.getFormats()+" "
					+parameter.isOptional());
			
			if (getTool().getData().containsKey(parameterEntry.getKey()))
			{
				Data data = getTool().getData().get(parameterEntry.getKey());
				if (data.isOutput())
				{
					DataPort dataPort = isDataPortMatching(parameterEntry.getValue(), getTask().getOutDataPorts(), data.getPort());
					if (dataPort != null)
					{
						score|=1<<(outputOffset+dataPort.getBitPos());
						taskMissingOutDataPorts.remove(dataPort);
					}
					else if (!parameter.isOptional())
					{
						getReverseMissingOutDataPorts().add(data.getPort());
						expectedToolScore|=1<<(outputOffset+getTask().getOutDataPorts().size());
					}
				}
				else
				{
					DataPort dataPort = isDataPortMatching(parameterEntry.getValue(), getTask().getInDataPorts(), data.getPort());
					if (dataPort != null)
					{
						//logger.debug("match input. shift="+inputOffset+" "+dataPort.getBitPos());
						score|=1<<(inputOffset+dataPort.getBitPos());
						taskMissingInDataPorts.remove(dataPort);
					}
					else if (!parameter.isOptional())
					{
						getReverseMissingInDataPorts().add(data.getPort());
						expectedToolScore|=1<<(inputOffset+getTask().getInDataPorts().size());
					}
				}
				
			}
			else if (parameter.getType().equals("data"))
			{
				logger.warn("could not found data(port) for "+parameterEntry.getKey()+".");
			}
			

		}
		expectedToolScore|=expectedScore;
		// collect missing data ports
		// required by Task but not provided by Tool
		for (DataPort dataPort:getTask().getInDataPorts())
		{
			if (taskMissingInDataPorts.contains(dataPort.getName()))
			{
				getMissingInDataPorts().add(dataPort);
				logger.debug("could not resolve: "+dataPort.getName()+" (IN)");
			}
		}
		
		for (DataPort dataPort:getTask().getOutDataPorts())
		{
			if (taskMissingOutDataPorts.contains(dataPort.getName()))
			{
				getMissingOutDataPorts().add(dataPort);
				logger.debug("could not resolve: "+dataPort.getName()+" (OUT)");
			}
		}
		for (DataPort dataPort:getReverseMissingInDataPorts())
		{
			logger.debug("undefined but required dataport="+dataPort.getName()+" (IN, tool) detected.");
		}
		for (DataPort dataPort:getReverseMissingOutDataPorts())
		{
			logger.debug("undefined but required dataport="+dataPort.getName()+" (OUT, tool) detected.");
		}
			
		// retuired by Tool but not provided by Task
		
		return score;
		
	}

	private DataPort isDataPortMatching(Parameter parameter, EList<DataPort> dataPorts, DataPort toolDataPort)
	{
		for (DataPort dataPort : dataPorts)
		{
			//logger.debug(dataPort.getName()+" is compatible="+toolDataPort.isCompatible(dataPort));
			if (toolDataPort.isCompatible(dataPort))
				return dataPort;
		}
		return null;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public long computeExpectedScore() {
		
		for (DataPort dataPort:getTask().getInDataPorts())
		{
			expectedScore|=1<<(inputOffset+dataPort.getBitPos());
		}
		for (DataPort dataPort:getTask().getOutDataPorts())
		{
			expectedScore|=1<<(outputOffset+dataPort.getBitPos());
		}
		expectedScore|=expectedToolScore;
		//for (getTask().getChunks())
		
		return expectedScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.TOOL_MATCH__MISSING_IN_DATA_PORTS:
				return ((InternalEList<?>)getMissingInDataPorts()).basicRemove(otherEnd, msgs);
			case CorePackage.TOOL_MATCH__MISSING_OUT_DATA_PORTS:
				return ((InternalEList<?>)getMissingOutDataPorts()).basicRemove(otherEnd, msgs);
			case CorePackage.TOOL_MATCH__MISSING_GROUPING_CRITERIA:
				return ((InternalEList<?>)getMissingGroupingCriteria()).basicRemove(otherEnd, msgs);
			case CorePackage.TOOL_MATCH__REVERSE_MISSING_IN_DATA_PORTS:
				return ((InternalEList<?>)getReverseMissingInDataPorts()).basicRemove(otherEnd, msgs);
			case CorePackage.TOOL_MATCH__REVERSE_MISSING_OUT_DATA_PORTS:
				return ((InternalEList<?>)getReverseMissingOutDataPorts()).basicRemove(otherEnd, msgs);
			case CorePackage.TOOL_MATCH__REVERSE_MISSING_GROUPING_CRITERIA:
				return ((InternalEList<?>)getReverseMissingGroupingCriteria()).basicRemove(otherEnd, msgs);
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
			case CorePackage.TOOL_MATCH__TASK:
				if (resolve) return getTask();
				return basicGetTask();
			case CorePackage.TOOL_MATCH__TOOL:
				if (resolve) return getTool();
				return basicGetTool();
			case CorePackage.TOOL_MATCH__SCORE:
				return getScore();
			case CorePackage.TOOL_MATCH__EXPECTED_SCORE:
				return getExpectedScore();
			case CorePackage.TOOL_MATCH__EXPECTED_TOOL_SCORE:
				return getExpectedToolScore();
			case CorePackage.TOOL_MATCH__MISSING_IN_DATA_PORTS:
				return getMissingInDataPorts();
			case CorePackage.TOOL_MATCH__MISSING_OUT_DATA_PORTS:
				return getMissingOutDataPorts();
			case CorePackage.TOOL_MATCH__MISSING_GROUPING_CRITERIA:
				if (coreType) return getMissingGroupingCriteria();
				else return getMissingGroupingCriteria().map();
			case CorePackage.TOOL_MATCH__LOGGER:
				return getLogger();
			case CorePackage.TOOL_MATCH__REVERSE_MISSING_IN_DATA_PORTS:
				return getReverseMissingInDataPorts();
			case CorePackage.TOOL_MATCH__REVERSE_MISSING_OUT_DATA_PORTS:
				return getReverseMissingOutDataPorts();
			case CorePackage.TOOL_MATCH__REVERSE_MISSING_GROUPING_CRITERIA:
				if (coreType) return getReverseMissingGroupingCriteria();
				else return getReverseMissingGroupingCriteria().map();
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
			case CorePackage.TOOL_MATCH__TASK:
				setTask((Task)newValue);
				return;
			case CorePackage.TOOL_MATCH__TOOL:
				setTool((Tool)newValue);
				return;
			case CorePackage.TOOL_MATCH__SCORE:
				setScore((Long)newValue);
				return;
			case CorePackage.TOOL_MATCH__EXPECTED_SCORE:
				setExpectedScore((Long)newValue);
				return;
			case CorePackage.TOOL_MATCH__EXPECTED_TOOL_SCORE:
				setExpectedToolScore((Long)newValue);
				return;
			case CorePackage.TOOL_MATCH__MISSING_IN_DATA_PORTS:
				getMissingInDataPorts().clear();
				getMissingInDataPorts().addAll((Collection<? extends DataPort>)newValue);
				return;
			case CorePackage.TOOL_MATCH__MISSING_OUT_DATA_PORTS:
				getMissingOutDataPorts().clear();
				getMissingOutDataPorts().addAll((Collection<? extends DataPort>)newValue);
				return;
			case CorePackage.TOOL_MATCH__MISSING_GROUPING_CRITERIA:
				((EStructuralFeature.Setting)getMissingGroupingCriteria()).set(newValue);
				return;
			case CorePackage.TOOL_MATCH__LOGGER:
				setLogger((Logger)newValue);
				return;
			case CorePackage.TOOL_MATCH__REVERSE_MISSING_IN_DATA_PORTS:
				getReverseMissingInDataPorts().clear();
				getReverseMissingInDataPorts().addAll((Collection<? extends DataPort>)newValue);
				return;
			case CorePackage.TOOL_MATCH__REVERSE_MISSING_OUT_DATA_PORTS:
				getReverseMissingOutDataPorts().clear();
				getReverseMissingOutDataPorts().addAll((Collection<? extends DataPort>)newValue);
				return;
			case CorePackage.TOOL_MATCH__REVERSE_MISSING_GROUPING_CRITERIA:
				((EStructuralFeature.Setting)getReverseMissingGroupingCriteria()).set(newValue);
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
			case CorePackage.TOOL_MATCH__TASK:
				setTask((Task)null);
				return;
			case CorePackage.TOOL_MATCH__TOOL:
				setTool((Tool)null);
				return;
			case CorePackage.TOOL_MATCH__SCORE:
				setScore(SCORE_EDEFAULT);
				return;
			case CorePackage.TOOL_MATCH__EXPECTED_SCORE:
				setExpectedScore(EXPECTED_SCORE_EDEFAULT);
				return;
			case CorePackage.TOOL_MATCH__EXPECTED_TOOL_SCORE:
				setExpectedToolScore(EXPECTED_TOOL_SCORE_EDEFAULT);
				return;
			case CorePackage.TOOL_MATCH__MISSING_IN_DATA_PORTS:
				getMissingInDataPorts().clear();
				return;
			case CorePackage.TOOL_MATCH__MISSING_OUT_DATA_PORTS:
				getMissingOutDataPorts().clear();
				return;
			case CorePackage.TOOL_MATCH__MISSING_GROUPING_CRITERIA:
				getMissingGroupingCriteria().clear();
				return;
			case CorePackage.TOOL_MATCH__LOGGER:
				setLogger(LOGGER_EDEFAULT);
				return;
			case CorePackage.TOOL_MATCH__REVERSE_MISSING_IN_DATA_PORTS:
				getReverseMissingInDataPorts().clear();
				return;
			case CorePackage.TOOL_MATCH__REVERSE_MISSING_OUT_DATA_PORTS:
				getReverseMissingOutDataPorts().clear();
				return;
			case CorePackage.TOOL_MATCH__REVERSE_MISSING_GROUPING_CRITERIA:
				getReverseMissingGroupingCriteria().clear();
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
			case CorePackage.TOOL_MATCH__TASK:
				return task != null;
			case CorePackage.TOOL_MATCH__TOOL:
				return tool != null;
			case CorePackage.TOOL_MATCH__SCORE:
				return score != SCORE_EDEFAULT;
			case CorePackage.TOOL_MATCH__EXPECTED_SCORE:
				return expectedScore != EXPECTED_SCORE_EDEFAULT;
			case CorePackage.TOOL_MATCH__EXPECTED_TOOL_SCORE:
				return expectedToolScore != EXPECTED_TOOL_SCORE_EDEFAULT;
			case CorePackage.TOOL_MATCH__MISSING_IN_DATA_PORTS:
				return missingInDataPorts != null && !missingInDataPorts.isEmpty();
			case CorePackage.TOOL_MATCH__MISSING_OUT_DATA_PORTS:
				return missingOutDataPorts != null && !missingOutDataPorts.isEmpty();
			case CorePackage.TOOL_MATCH__MISSING_GROUPING_CRITERIA:
				return missingGroupingCriteria != null && !missingGroupingCriteria.isEmpty();
			case CorePackage.TOOL_MATCH__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case CorePackage.TOOL_MATCH__REVERSE_MISSING_IN_DATA_PORTS:
				return reverseMissingInDataPorts != null && !reverseMissingInDataPorts.isEmpty();
			case CorePackage.TOOL_MATCH__REVERSE_MISSING_OUT_DATA_PORTS:
				return reverseMissingOutDataPorts != null && !reverseMissingOutDataPorts.isEmpty();
			case CorePackage.TOOL_MATCH__REVERSE_MISSING_GROUPING_CRITERIA:
				return reverseMissingGroupingCriteria != null && !reverseMissingGroupingCriteria.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (score: ");
		result.append(score);
		result.append(", expectedScore: ");
		result.append(expectedScore);
		result.append(", expectedToolScore: ");
		result.append(expectedToolScore);
		result.append(", logger: ");
		result.append(logger);
		result.append(')');
		return result.toString();
	}

} //ToolMatchImpl
