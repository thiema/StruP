/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.core.Task;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.exception.ParameterNotFoundException;
import easyflow.custom.ui.GlobalConfig;
import easyflow.custom.util.GlobalConstants;
import easyflow.data.DataLink;
import easyflow.tool.ResolvedParam;
import easyflow.tool.Rule;
import easyflow.tool.ToolPackage;

import java.util.Collection;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.tool.impl.RuleImpl#getCmdLine <em>Cmd Line</em>}</li>
 *   <li>{@link easyflow.tool.impl.RuleImpl#getTask <em>Task</em>}</li>
 *   <li>{@link easyflow.tool.impl.RuleImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link easyflow.tool.impl.RuleImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link easyflow.tool.impl.RuleImpl#isReadFromPipe <em>Read From Pipe</em>}</li>
 *   <li>{@link easyflow.tool.impl.RuleImpl#isWriteToPipe <em>Write To Pipe</em>}</li>
 *   <li>{@link easyflow.tool.impl.RuleImpl#getInputParams <em>Input Params</em>}</li>
 *   <li>{@link easyflow.tool.impl.RuleImpl#getOutputParams <em>Output Params</em>}</li>
 *   <li>{@link easyflow.tool.impl.RuleImpl#getOptParams <em>Opt Params</em>}</li>
 *   <li>{@link easyflow.tool.impl.RuleImpl#getPosParams <em>Pos Params</em>}</li>
 *   <li>{@link easyflow.tool.impl.RuleImpl#getExe <em>Exe</em>}</li>
 *   <li>{@link easyflow.tool.impl.RuleImpl#getExeParams <em>Exe Params</em>}</li>
 *   <li>{@link easyflow.tool.impl.RuleImpl#getInterpreter <em>Interpreter</em>}</li>
 *   <li>{@link easyflow.tool.impl.RuleImpl#getInterpreterParams <em>Interpreter Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends EObjectImpl implements Rule {
	
	protected static final Logger logger = Logger.getLogger(Rule.class);
	/**
	 * The cached value of the '{@link #getCmdLine() <em>Cmd Line</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmdLine()
	 * @generated
	 * @ordered
	 */
	protected EList<String> cmdLine;

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
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dependencies;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<String> targets;

	/**
	 * The default value of the '{@link #isReadFromPipe() <em>Read From Pipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadFromPipe()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_FROM_PIPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadFromPipe() <em>Read From Pipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadFromPipe()
	 * @generated
	 * @ordered
	 */
	protected boolean readFromPipe = READ_FROM_PIPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isWriteToPipe() <em>Write To Pipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteToPipe()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRITE_TO_PIPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWriteToPipe() <em>Write To Pipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteToPipe()
	 * @generated
	 * @ordered
	 */
	protected boolean writeToPipe = WRITE_TO_PIPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputParams() <em>Input Params</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParams()
	 * @generated
	 * @ordered
	 */
	protected EList<String> inputParams;

	/**
	 * The cached value of the '{@link #getOutputParams() <em>Output Params</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputParams()
	 * @generated
	 * @ordered
	 */
	protected EList<String> outputParams;

	/**
	 * The cached value of the '{@link #getOptParams() <em>Opt Params</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptParams()
	 * @generated
	 * @ordered
	 */
	protected EList<String> optParams;

	/**
	 * The cached value of the '{@link #getPosParams() <em>Pos Params</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosParams()
	 * @generated
	 * @ordered
	 */
	protected EList<String> posParams;

	/**
	 * The default value of the '{@link #getExe() <em>Exe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExe()
	 * @generated
	 * @ordered
	 */
	protected static final String EXE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExe() <em>Exe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExe()
	 * @generated
	 * @ordered
	 */
	protected String exe = EXE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExeParams() <em>Exe Params</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExeParams()
	 * @generated
	 * @ordered
	 */
	protected EList<String> exeParams;

	/**
	 * The default value of the '{@link #getInterpreter() <em>Interpreter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpreter()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERPRETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterpreter() <em>Interpreter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpreter()
	 * @generated
	 * @ordered
	 */
	protected String interpreter = INTERPRETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterpreterParams() <em>Interpreter Params</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpreterParams()
	 * @generated
	 * @ordered
	 */
	protected EList<String> interpreterParams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCmdLine() {
		if (cmdLine == null) {
			cmdLine = new EDataTypeEList<String>(String.class, this, ToolPackage.RULE__CMD_LINE);
		}
		return cmdLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDependencies() {
		if (dependencies == null) {
			dependencies = new EDataTypeUniqueEList<String>(String.class, this, ToolPackage.RULE__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTargets() {
		if (targets == null) {
			targets = new EDataTypeUniqueEList<String>(String.class, this, ToolPackage.RULE__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadFromPipe() {
		return readFromPipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadFromPipe(boolean newReadFromPipe) {
		boolean oldReadFromPipe = readFromPipe;
		readFromPipe = newReadFromPipe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.RULE__READ_FROM_PIPE, oldReadFromPipe, readFromPipe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWriteToPipe() {
		return writeToPipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteToPipe(boolean newWriteToPipe) {
		boolean oldWriteToPipe = writeToPipe;
		writeToPipe = newWriteToPipe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.RULE__WRITE_TO_PIPE, oldWriteToPipe, writeToPipe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInputParams() {
		if (inputParams == null) {
			inputParams = new EDataTypeUniqueEList<String>(String.class, this, ToolPackage.RULE__INPUT_PARAMS);
		}
		return inputParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOutputParams() {
		if (outputParams == null) {
			outputParams = new EDataTypeUniqueEList<String>(String.class, this, ToolPackage.RULE__OUTPUT_PARAMS);
		}
		return outputParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOptParams() {
		if (optParams == null) {
			optParams = new EDataTypeUniqueEList<String>(String.class, this, ToolPackage.RULE__OPT_PARAMS);
		}
		return optParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPosParams() {
		if (posParams == null) {
			posParams = new EDataTypeUniqueEList<String>(String.class, this, ToolPackage.RULE__POS_PARAMS);
		}
		return posParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExe() {
		return exe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExe(String newExe) {
		String oldExe = exe;
		exe = newExe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.RULE__EXE, oldExe, exe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExeParams() {
		if (exeParams == null) {
			exeParams = new EDataTypeUniqueEList<String>(String.class, this, ToolPackage.RULE__EXE_PARAMS);
		}
		return exeParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterpreter() {
		return interpreter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpreter(String newInterpreter) {
		String oldInterpreter = interpreter;
		interpreter = newInterpreter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.RULE__INTERPRETER, oldInterpreter, interpreter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInterpreterParams() {
		if (interpreterParams == null) {
			interpreterParams = new EDataTypeUniqueEList<String>(String.class, this, ToolPackage.RULE__INTERPRETER_PARAMS);
		}
		return interpreterParams;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToolPackage.RULE__TASK, oldTask, task));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.RULE__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void resolveCommandLineParts() {
		
		//Task           task            = getTask();
		String         commandPattern  = getTask().getCommandLinePattern();
		String[]       commandPatterns = commandPattern.split(" ");
		EList<String>  commandLineParts;// = new BasicEList<String>();
		
		try {
			commandLineParts = getTask().resolveCommandLinePartInterpreter();
			if (!commandLineParts.isEmpty())
			{
				setInterpreter(commandLineParts.get(0));
				if (commandLineParts.size() > 1)
				{
					commandLineParts.remove(0);
					getInterpreterParams().addAll(commandLineParts);
				}
			}
			
			commandLineParts = getTask().resolveCommandLinePartExe();
			if (!commandLineParts.isEmpty())
			{
				setExe(commandLineParts.get(0));
				if (commandLineParts.size() > 1)
				{
					commandLineParts.remove(0);
					getExeParams().addAll(commandLineParts);
				}
			}
			
			String anaType = getTask().resolveCommandLinePartAnalysisType();
			if (anaType != null && !"".equals(anaType))
				getExeParams().add(anaType);
			
		} catch (ParameterNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoValidInOutDataException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		logger.debug(getTask().getUniqueString());
		for (DataLink dataLink : getTask().getInputs().values())
		{
			if (dataLink.getData().getResolvedParam() != null)
				logger.debug(" in="+dataLink.getData().getResolvedParam().resolveName()+" "+dataLink.getData().getResolvedParam().hashCode());
			else
				logger.info(" no parameter resolved for datalink outdata");
		}
		for (DataLink dataLink : getTask().getOutputs().values())
		{
			if (dataLink.getInData().getResolvedParam() != null)
			{
				logger.debug("out="+dataLink.getInData().getResolvedParam().resolveName()+" "+dataLink.getInData().getResolvedParam().hashCode());
			}
			else
			{
				logger.info(" no parameter resolved for datalink indata");
			}
		}
		for (ResolvedParam resolvedParam : getTask().getResolvedCommand().getResolvedParams().values())
		{
			if (resolvedParam.getParameter().isDataParam() ||
					(!resolvedParam.getParameter().isDataParam() && resolvedParam.getChildParams() != null && !resolvedParam.getChildParams().isEmpty()))
				logger.debug("rp="+resolvedParam.resolveName()+"  "+resolvedParam.hashCode());
			if (resolvedParam.getChildParams() != null && !resolvedParam.getChildParams().isEmpty())
				for (ResolvedParam child : resolvedParam.getEffectiveParameters(null, null))
					logger.debug("--child: "+child.resolveName()+" "+child.hashCode());
		}
		getTask().resolveStaticParams(getTask().getResolvedCommand().getResolvedParams());
		
		boolean isInputDefined  = false;
		boolean isOutputDefined = false;
		for (String part : commandPatterns)
		{
			if (part.equalsIgnoreCase(GlobalConstants.PARAM_INPUT))
				isInputDefined = true;
			else if (part.equalsIgnoreCase(GlobalConstants.PARAM_OUTPUT))
				isOutputDefined = true;
		}

		for (String commandLinePart : commandPatterns)
		{
			//logger.trace("createCommandLine(): "+commandLinePart);
			if (GlobalConfig.getValidCommandPatternParts().contains(commandLinePart))
			{
				try {
					if (commandLinePart.equals(GlobalConstants.COMMAND_LINE_PART_INPUT))
						getInputParams().addAll(getTask().resolveCommandLinePart(commandLinePart, false, true));
					else if (commandLinePart.equals(GlobalConstants.COMMAND_LINE_PART_OUTPUT))
						getOutputParams().addAll(getTask().resolveCommandLinePart(commandLinePart, true, false));
					else if (commandLinePart.equals(GlobalConstants.COMMAND_LINE_PART_OPT_PARAMS))
						getOptParams().addAll(getTask().resolveCommandLinePart(commandLinePart, isInputDefined, isOutputDefined));
					else if (commandLinePart.equals(GlobalConstants.COMMAND_LINE_PART_POS_PARAMS))
						getPosParams().addAll(getTask().resolveCommandLinePart(commandLinePart, isInputDefined, isOutputDefined));
					else
						logger.error("resolveCommandLineParts(): dont know what to do for command part="+commandLinePart);
				} catch (ParameterNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoValidInOutDataException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				// add static parts
				
				if (getTask().getStaticParams().containsKey(commandLinePart))
				{
					String staticCmdPart = getTask().getStaticParams().get(commandLinePart);
					
					if (staticCmdPart != null && !staticCmdPart.equals(""))
						if (commandLinePart.equals(GlobalConstants.COMMAND_LINE_PART_OPT_PARAMS))
							getOptParams().add(staticCmdPart);
						else if (commandLinePart.equals(GlobalConstants.COMMAND_LINE_PART_POS_PARAMS))
							getPosParams().add(staticCmdPart);
				}
			}	
		}
		
		logger.debug("Interpreter="+getInterpreter()+"/"+getInterpreterParams()+" Exe="+getExe()+"/"+getExeParams()
				+" Pos="+getPosParams()+" Opt="+getOptParams()
				+" In="+getInputParams()+" Out="+getOutputParams());
		logger.debug("");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String createCommandLine()
	{
		String cmdBetweenPartsSep = " ";
		String cmdWithinPartsSep  = " ";
		cmdWithinPartsSep = getTask().getPreferredTool().getCmdPartDelimiter();
		
		
		if (isReadFromPipe())
		{
			if (getCmdLine() == null || getCmdLine().isEmpty())
				logger.warn("createCommandLine(): empty command line found while input from from pipe expected");
			else
				// add pipe operator to cmd
				getCmdLine().add(GlobalConfig.getPipeOperator());

		}
		else
		{
			getCmdLine().clear();
		}
		resolveCommandLineParts();
				
		if (getInterpreter() != null && !"".equals(getInterpreter()))
			getCmdLine().add(getInterpreter());
		
		if (getInterpreterParams() != null && !getInterpreterParams().isEmpty())
			getCmdLine().add(StringUtils.join(getInterpreterParams(), cmdWithinPartsSep));
		
		if (getExe() != null && !"".equals(getExe()))
			getCmdLine().add(getExe());
		
		if (getExeParams() != null && !getExeParams().isEmpty())
			getCmdLine().add(StringUtils.join(getExeParams(), cmdWithinPartsSep));
		
		String   commandPattern  = getTask().getCommandLinePattern();
		String[] commandPatterns = commandPattern.split(" ");
		
		for (String commandLinePart : commandPatterns)
		{
			//logger.trace("createCommandLine(): "+commandLinePart);
			if (GlobalConfig.getValidCommandPatternParts().contains(commandLinePart))
			{
				if (commandLinePart.equals(GlobalConstants.COMMAND_LINE_PART_INPUT))
					add2Cmd(getInputParams(), cmdWithinPartsSep);
					//getCmdLine().add(StringUtils.join(getInputParams(), cmdWithinPartsSep));
				else if (commandLinePart.equals(GlobalConstants.COMMAND_LINE_PART_OUTPUT))
					add2Cmd(getOutputParams(), cmdWithinPartsSep);
					//getCmdLine().add(StringUtils.join(getOutputParams(), cmdWithinPartsSep));
				else if (commandLinePart.equals(GlobalConstants.COMMAND_LINE_PART_OPT_PARAMS))
					add2Cmd(getOptParams(), cmdWithinPartsSep);
					//getCmdLine().add(StringUtils.join(getOptParams(), cmdWithinPartsSep));
				else if (commandLinePart.equals(GlobalConstants.COMMAND_LINE_PART_POS_PARAMS))
					add2Cmd(getPosParams(), cmdWithinPartsSep);
					//getCmdLine().add(StringUtils.join(getPosParams(), cmdWithinPartsSep));
				else
					logger.error("createCommandLine(): Part "+commandLinePart+" not known. Skipping");
			}
		}
		logger.debug(getCmdLine());
		if (isWriteToPipe())
			return null;
		else
			return StringUtils.join(getCmdLine(), cmdBetweenPartsSep);	
	}

	private void add2Cmd(EList<String> cmd, String sep)
	{
		if (cmd != null && !cmd.isEmpty())
			getCmdLine().add(StringUtils.join(cmd, sep));
	}
	
	public void clearCmdParts()
	{
		setExe(null);
		setInterpreter(null);
		
		getExeParams().clear();
		getInterpreterParams().clear();
		
		getOptParams().clear();
		getPosParams().clear();
		getInputParams().clear();
		getOutputParams().clear();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void clear() {
		
		clearCmdParts();
		getTargets().clear();
		getDependencies().clear();
		
		getCmdLine().clear();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToolPackage.RULE__CMD_LINE:
				return getCmdLine();
			case ToolPackage.RULE__TASK:
				if (resolve) return getTask();
				return basicGetTask();
			case ToolPackage.RULE__DEPENDENCIES:
				return getDependencies();
			case ToolPackage.RULE__TARGETS:
				return getTargets();
			case ToolPackage.RULE__READ_FROM_PIPE:
				return isReadFromPipe();
			case ToolPackage.RULE__WRITE_TO_PIPE:
				return isWriteToPipe();
			case ToolPackage.RULE__INPUT_PARAMS:
				return getInputParams();
			case ToolPackage.RULE__OUTPUT_PARAMS:
				return getOutputParams();
			case ToolPackage.RULE__OPT_PARAMS:
				return getOptParams();
			case ToolPackage.RULE__POS_PARAMS:
				return getPosParams();
			case ToolPackage.RULE__EXE:
				return getExe();
			case ToolPackage.RULE__EXE_PARAMS:
				return getExeParams();
			case ToolPackage.RULE__INTERPRETER:
				return getInterpreter();
			case ToolPackage.RULE__INTERPRETER_PARAMS:
				return getInterpreterParams();
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
			case ToolPackage.RULE__CMD_LINE:
				getCmdLine().clear();
				getCmdLine().addAll((Collection<? extends String>)newValue);
				return;
			case ToolPackage.RULE__TASK:
				setTask((Task)newValue);
				return;
			case ToolPackage.RULE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends String>)newValue);
				return;
			case ToolPackage.RULE__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends String>)newValue);
				return;
			case ToolPackage.RULE__READ_FROM_PIPE:
				setReadFromPipe((Boolean)newValue);
				return;
			case ToolPackage.RULE__WRITE_TO_PIPE:
				setWriteToPipe((Boolean)newValue);
				return;
			case ToolPackage.RULE__INPUT_PARAMS:
				getInputParams().clear();
				getInputParams().addAll((Collection<? extends String>)newValue);
				return;
			case ToolPackage.RULE__OUTPUT_PARAMS:
				getOutputParams().clear();
				getOutputParams().addAll((Collection<? extends String>)newValue);
				return;
			case ToolPackage.RULE__OPT_PARAMS:
				getOptParams().clear();
				getOptParams().addAll((Collection<? extends String>)newValue);
				return;
			case ToolPackage.RULE__POS_PARAMS:
				getPosParams().clear();
				getPosParams().addAll((Collection<? extends String>)newValue);
				return;
			case ToolPackage.RULE__EXE:
				setExe((String)newValue);
				return;
			case ToolPackage.RULE__EXE_PARAMS:
				getExeParams().clear();
				getExeParams().addAll((Collection<? extends String>)newValue);
				return;
			case ToolPackage.RULE__INTERPRETER:
				setInterpreter((String)newValue);
				return;
			case ToolPackage.RULE__INTERPRETER_PARAMS:
				getInterpreterParams().clear();
				getInterpreterParams().addAll((Collection<? extends String>)newValue);
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
			case ToolPackage.RULE__CMD_LINE:
				getCmdLine().clear();
				return;
			case ToolPackage.RULE__TASK:
				setTask((Task)null);
				return;
			case ToolPackage.RULE__DEPENDENCIES:
				getDependencies().clear();
				return;
			case ToolPackage.RULE__TARGETS:
				getTargets().clear();
				return;
			case ToolPackage.RULE__READ_FROM_PIPE:
				setReadFromPipe(READ_FROM_PIPE_EDEFAULT);
				return;
			case ToolPackage.RULE__WRITE_TO_PIPE:
				setWriteToPipe(WRITE_TO_PIPE_EDEFAULT);
				return;
			case ToolPackage.RULE__INPUT_PARAMS:
				getInputParams().clear();
				return;
			case ToolPackage.RULE__OUTPUT_PARAMS:
				getOutputParams().clear();
				return;
			case ToolPackage.RULE__OPT_PARAMS:
				getOptParams().clear();
				return;
			case ToolPackage.RULE__POS_PARAMS:
				getPosParams().clear();
				return;
			case ToolPackage.RULE__EXE:
				setExe(EXE_EDEFAULT);
				return;
			case ToolPackage.RULE__EXE_PARAMS:
				getExeParams().clear();
				return;
			case ToolPackage.RULE__INTERPRETER:
				setInterpreter(INTERPRETER_EDEFAULT);
				return;
			case ToolPackage.RULE__INTERPRETER_PARAMS:
				getInterpreterParams().clear();
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
			case ToolPackage.RULE__CMD_LINE:
				return cmdLine != null && !cmdLine.isEmpty();
			case ToolPackage.RULE__TASK:
				return task != null;
			case ToolPackage.RULE__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case ToolPackage.RULE__TARGETS:
				return targets != null && !targets.isEmpty();
			case ToolPackage.RULE__READ_FROM_PIPE:
				return readFromPipe != READ_FROM_PIPE_EDEFAULT;
			case ToolPackage.RULE__WRITE_TO_PIPE:
				return writeToPipe != WRITE_TO_PIPE_EDEFAULT;
			case ToolPackage.RULE__INPUT_PARAMS:
				return inputParams != null && !inputParams.isEmpty();
			case ToolPackage.RULE__OUTPUT_PARAMS:
				return outputParams != null && !outputParams.isEmpty();
			case ToolPackage.RULE__OPT_PARAMS:
				return optParams != null && !optParams.isEmpty();
			case ToolPackage.RULE__POS_PARAMS:
				return posParams != null && !posParams.isEmpty();
			case ToolPackage.RULE__EXE:
				return EXE_EDEFAULT == null ? exe != null : !EXE_EDEFAULT.equals(exe);
			case ToolPackage.RULE__EXE_PARAMS:
				return exeParams != null && !exeParams.isEmpty();
			case ToolPackage.RULE__INTERPRETER:
				return INTERPRETER_EDEFAULT == null ? interpreter != null : !INTERPRETER_EDEFAULT.equals(interpreter);
			case ToolPackage.RULE__INTERPRETER_PARAMS:
				return interpreterParams != null && !interpreterParams.isEmpty();
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
		result.append(" (cmdLine: ");
		result.append(cmdLine);
		result.append(", dependencies: ");
		result.append(dependencies);
		result.append(", targets: ");
		result.append(targets);
		result.append(", readFromPipe: ");
		result.append(readFromPipe);
		result.append(", writeToPipe: ");
		result.append(writeToPipe);
		result.append(", inputParams: ");
		result.append(inputParams);
		result.append(", outputParams: ");
		result.append(outputParams);
		result.append(", optParams: ");
		result.append(optParams);
		result.append(", posParams: ");
		result.append(posParams);
		result.append(", exe: ");
		result.append(exe);
		result.append(", exeParams: ");
		result.append(exeParams);
		result.append(", interpreter: ");
		result.append(interpreter);
		result.append(", interpreterParams: ");
		result.append(interpreterParams);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
