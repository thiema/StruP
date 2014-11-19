/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution.makeflow.impl;

import easyflow.execution.impl.IExecutionSystemImpl;
import easyflow.execution.makeflow.Makeflow;
import easyflow.execution.makeflow.MakeflowPackage;
import easyflow.tool.Rule;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Makeflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MakeflowImpl extends IExecutionSystemImpl implements Makeflow {
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
	 *  a makeflow rule is of the form:
	 * 
	 *  targetA targetB: dep1 dep2 dep3
	 *  	command arg1 arg2 optX optY input1 input2 input3 targetA targetB

	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String generateExecutionString(Rule rule) {
		
		String cmd     = rule.createCommandLine();
		
		if (rule.isWriteToPipe())
			return null;
		
		String delim   = " ";
		String targets = StringUtils.join(rule.getTargets(), delim);
		String deps    = StringUtils.join(rule.getDependencies(), delim);
		
		return targets+": "+deps+"\n\t"+cmd+"\n\n";
	}

} //MakeflowImpl
