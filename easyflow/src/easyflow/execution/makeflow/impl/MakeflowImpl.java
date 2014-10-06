/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution.makeflow.impl;

import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map.Entry;
import com.mxgraph.view.mxGraph.mxICellVisitor;
import easyflow.core.Task;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.exception.ParameterNotFoundException;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.ui.GlobalConfig;
import easyflow.custom.util.GlobalVar;
import easyflow.data.DataLink;
import easyflow.execution.DefaultExecutionSystem;
import easyflow.execution.ExecutionPackage;
import easyflow.execution.makeflow.Makeflow;
import easyflow.execution.makeflow.MakeflowPackage;
import easyflow.tool.Tool;
import easyflow.ui.DefaultProject;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Makeflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.execution.makeflow.impl.MakeflowImpl#getProject <em>Project</em>}</li>
 *   <li>{@link easyflow.execution.makeflow.impl.MakeflowImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.execution.makeflow.impl.MakeflowImpl#getWriter <em>Writer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MakeflowImpl extends EObjectImpl implements Makeflow {
	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected DefaultProject project;

	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(Makeflow.class);

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
	 * The default value of the '{@link #getWriter() <em>Writer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriter()
	 * @generated
	 * @ordered
	 */
	protected static final BufferedWriter WRITER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriter() <em>Writer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriter()
	 * @generated
	 * @ordered
	 */
	protected BufferedWriter writer = WRITER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MakeflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MakeflowPackage.Literals.MAKEFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultProject getProject() {
		if (project != null && project.eIsProxy()) {
			InternalEObject oldProject = (InternalEObject)project;
			project = (DefaultProject)eResolveProxy(oldProject);
			if (project != oldProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MakeflowPackage.MAKEFLOW__PROJECT, oldProject, project));
			}
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultProject basicGetProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(DefaultProject newProject) {
		DefaultProject oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MakeflowPackage.MAKEFLOW__PROJECT, oldProject, project));
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
	public BufferedWriter getWriter() {
		return writer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriter(BufferedWriter newWriter) {
		BufferedWriter oldWriter = writer;
		writer = newWriter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MakeflowPackage.MAKEFLOW__WRITER, oldWriter, writer));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws NoValidInOutDataException 
	 * @throws ParameterNotFoundException 
	 * @generated not
	 */
	public String createCommandLine(Task task) throws ParameterNotFoundException, NoValidInOutDataException 
	{
		return task.createCommandLine();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCommandLine(Tool tool) throws ParameterNotFoundException, NoValidInOutDataException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	private EList<String> getFiles(EMap<String, DataLink> data)
	{
		EList<String> files = new BasicEList<String>();
		Iterator<Entry<String, DataLink>> it = data.iterator();
		while (it.hasNext())
		{
			Entry<String, DataLink> e = it.next();
			//if (e.getValue().getData() != null && e.getValue().getData().getDataResourceName() !=  null)
				files.add(e.getValue().getData().getDataResourceName().getPath());
		}
		return files;
	}
	
	/*
	 * a makeflow rule is of the form:
	 * 
	 *  targetA targetB: dep1 dep2 dep3
	 *  	command arg1 arg2 optX optY input1 input2 input3 targetA targetB
	 */
	public String createRule(Task task) throws ParameterNotFoundException, NoValidInOutDataException
	{

		logger.trace("createRule(): task="+task.getUniqueString()+" preferredTool="+task.getPreferredTool().getName()
				+" (all: "+task.getTools().keySet().toString()+") "
				);
		// iterate over incoming cells (-> datalinks) and set the inputs member attribute
		try {
			task.resolveInputs();
			task.resolveOutputs();
			task.resolveParams();
		} catch (DataLinkNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//task.resolveParameters();
		
		String targets = StringUtils.join(getFiles(task.getOutputs()), ' ');
		String deps    = StringUtils.join(getFiles(task.getInputs()), ' ');
		String cmd;

		cmd = createCommandLine(task);
		logger.debug(cmd+" ("+targets+":"+deps+")");
		String rule = targets+": "+deps+"\n\t"+cmd+"\n\n";
		
		return rule;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public mxICellVisitor getJgraphxVisitor() {
		
		mxICellVisitor visitor=new mxICellVisitor()
		{
		
			@Override
			public boolean visit(Object vertex, Object edge) {
				
				// skip root node, since there is no processing task
				if (edge == null)
					return true;
				
				Task task;
				try {
					task = GlobalVar.getGraphUtil().loadTask(vertex);
				if (task.getTools().isEmpty())
					logger.debug("no tool definition available for "+task.getUniqueString());
				else
				{
					
					String cmd = createRule(task);
					try {
						logger.info("write rule:\n"+cmd);
						getWriter().write(cmd);
						getWriter().flush();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParameterNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoValidInOutDataException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return true;
			}
		};
		return visitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MakeflowPackage.MAKEFLOW__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case MakeflowPackage.MAKEFLOW__LOGGER:
				return getLogger();
			case MakeflowPackage.MAKEFLOW__WRITER:
				return getWriter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MakeflowPackage.MAKEFLOW__PROJECT:
				setProject((DefaultProject)newValue);
				return;
			case MakeflowPackage.MAKEFLOW__WRITER:
				setWriter((BufferedWriter)newValue);
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
			case MakeflowPackage.MAKEFLOW__PROJECT:
				setProject((DefaultProject)null);
				return;
			case MakeflowPackage.MAKEFLOW__WRITER:
				setWriter(WRITER_EDEFAULT);
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
			case MakeflowPackage.MAKEFLOW__PROJECT:
				return project != null;
			case MakeflowPackage.MAKEFLOW__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case MakeflowPackage.MAKEFLOW__WRITER:
				return WRITER_EDEFAULT == null ? writer != null : !WRITER_EDEFAULT.equals(writer);
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
		if (baseClass == DefaultExecutionSystem.class) {
			switch (derivedFeatureID) {
				case MakeflowPackage.MAKEFLOW__PROJECT: return ExecutionPackage.DEFAULT_EXECUTION_SYSTEM__PROJECT;
				case MakeflowPackage.MAKEFLOW__LOGGER: return ExecutionPackage.DEFAULT_EXECUTION_SYSTEM__LOGGER;
				case MakeflowPackage.MAKEFLOW__WRITER: return ExecutionPackage.DEFAULT_EXECUTION_SYSTEM__WRITER;
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
		if (baseClass == DefaultExecutionSystem.class) {
			switch (baseFeatureID) {
				case ExecutionPackage.DEFAULT_EXECUTION_SYSTEM__PROJECT: return MakeflowPackage.MAKEFLOW__PROJECT;
				case ExecutionPackage.DEFAULT_EXECUTION_SYSTEM__LOGGER: return MakeflowPackage.MAKEFLOW__LOGGER;
				case ExecutionPackage.DEFAULT_EXECUTION_SYSTEM__WRITER: return MakeflowPackage.MAKEFLOW__WRITER;
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
		result.append(" (logger: ");
		result.append(logger);
		result.append(", writer: ");
		result.append(writer);
		result.append(')');
		return result.toString();
	}

} //MakeflowImpl
