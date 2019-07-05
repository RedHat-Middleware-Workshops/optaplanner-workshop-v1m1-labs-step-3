package org.optaplanner.examples.cloudbalancing.domain;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

@PlanningEntity
public class CloudProcess {
    
    private int requiredCpuPower;
    
    private int requiredMemory;
    
    private int requiredNetworkBandwidth;
    
    private CloudComputer computer;
    
    public CloudProcess() {
    }
    
    public CloudProcess(int requiredCpuPower, int requiredMemory, int requiredNetworkBandwidth) {
        this.requiredCpuPower = requiredCpuPower;
        this.requiredMemory = requiredMemory;
        this.requiredNetworkBandwidth = requiredNetworkBandwidth;
    }

	/**
	 * @return the requiredCpuPower
	 */
	public int getRequiredCpuPower() {
		return requiredCpuPower;
	}

	/**
	 * @param requiredCpuPower the requiredCpuPower to set
	 */
	public void setRequiredCpuPower(int requiredCpuPower) {
		this.requiredCpuPower = requiredCpuPower;
	}

	/**
	 * @return the requiredMemory
	 */
	public int getRequiredMemory() {
		return requiredMemory;
	}

	/**
	 * @param requiredMemory the requiredMemory to set
	 */
	public void setRequiredMemory(int requiredMemory) {
		this.requiredMemory = requiredMemory;
	}

	/**
	 * @return the requiredNetworkBandwidth
	 */
	public int getRequiredNetworkBandwidth() {
		return requiredNetworkBandwidth;
	}

	/**
	 * @param requiredNetworkBandwidth the requiredNetworkBandwidth to set
	 */
	public void setRequiredNetworkBandwidth(int requiredNetworkBandwidth) {
		this.requiredNetworkBandwidth = requiredNetworkBandwidth;
	}

	/**
	 * @return the computer
	 */
	@PlanningVariable(valueRangeProviderRefs = {"computerRange"})
	public CloudComputer getComputer() {
		return computer;
	}

	/**
	 * @param computer the computer to set
	 */
	public void setComputer(CloudComputer computer) {
		this.computer = computer;
	}


	
}
