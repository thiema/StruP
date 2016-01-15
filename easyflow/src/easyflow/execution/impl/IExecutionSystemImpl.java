/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import com.mxgraph.view.mxGraph.mxICellVisitor;
import easyflow.core.Task;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.exception.ParameterNotFoundException;
import easyflow.custom.exception.ResolvingParameterFailedException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.jgraphx.graph.JGraphXUtil;
import easyflow.execution.ExecutionPackage;
import easyflow.execution.IExecutionSystem;
import easyflow.tool.Rule;
import java.io.BufferedWriter;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IExecution System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.execution.impl.IExecutionSystemImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.execution.impl.IExecutionSystemImpl#getWriter <em>Writer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IExecutionSystemImpl extends MinimalEObjectImpl.Container implements IExecutionSystem {
	
	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(IExecutionSystem.class);
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
	protected IExecutionSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.IEXECUTION_SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.IEXECUTION_SYSTEM__WRITER, oldWriter, writer));
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
					task = JGraphXUtil.loadTask(vertex);
					if (task.getTools().isEmpty())
					{
						logger.warn("no tool definition available for "+task.getUniqueString());
					}
					else
					{
						Rule rule = task.createRule();
						rule.setTask(task);
						String cmd = generateExecutionString(rule);

						if (cmd != null)
						{
							logger.info("write rule:\n"+cmd);
							getWriter().write(cmd);
							getWriter().flush();
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
				} catch (ResolvingParameterFailedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (DataLinkNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
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
	 * @generated not
	 */
	public String generateExecutionString(Rule rule) {
		// generate/extend command-line in any case
		String cmd = rule.createCommandLine();
		if (rule.isWriteToPipe())
			return null;
		else
			return cmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionPackage.IEXECUTION_SYSTEM__LOGGER:
				return getLogger();
			case ExecutionPackage.IEXECUTION_SYSTEM__WRITER:
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
			case ExecutionPackage.IEXECUTION_SYSTEM__WRITER:
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
			case ExecutionPackage.IEXECUTION_SYSTEM__WRITER:
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
			case ExecutionPackage.IEXECUTION_SYSTEM__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case ExecutionPackage.IEXECUTION_SYSTEM__WRITER:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExecutionPackage.IEXECUTION_SYSTEM___GET_JGRAPHX_VISITOR:
				return getJgraphxVisitor();
			case ExecutionPackage.IEXECUTION_SYSTEM___GENERATE_EXECUTION_STRING__RULE:
				return generateExecutionString((Rule)arguments.get(0));
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
		result.append(" (logger: ");
		result.append(logger);
		result.append(", writer: ");
		result.append(writer);
		result.append(')');
		return result.toString();
	}

} //IExecutionSystemImpl
