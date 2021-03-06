/*******************************************************************************
 *  Copyright (c) 2014 Mentor Graphics and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *     Mentor Graphics - initial API and implementation
 *******************************************************************************/
package com.codesourcery.installer;

import java.util.Map;

import org.eclipse.equinox.p2.core.IProvisioningAgent;


/**
 * Abstract install module
 * @see {@link com.codesourcery.installer.IInstallModule}
 */
public abstract class AbstractInstallModule implements IInstallModule {
	/** Install description */
	private IInstallDescription installDescription;
	
	@Override
	public void init(IInstallDescription installDescription) {
		this.installDescription = installDescription;
	}
	
	@Override
	public void initAgent(IProvisioningAgent agent) {
		// Base does nothing
	}

	@Override
	public void setDataDefaults(IInstallData data) {
		// Base does nothing
	}

	@Override
	public IInstallWizardPage[] getInstallPages(IInstallMode installMode) {
		return null;
	}

	@Override
	public IInstallAction[] getInstallActions(IProvisioningAgent agent, IInstallData data, 
			IInstallMode installMode) {
		return null;
	}
	
	@Override
	public void setEnvironmentVariables(Map<String, String> environmentVariables) {
	}

	/**
	 * Returns the install description.
	 * 
	 * @return Install description
	 */
	protected IInstallDescription getInstallDescription() {
		return installDescription;
	}
}
