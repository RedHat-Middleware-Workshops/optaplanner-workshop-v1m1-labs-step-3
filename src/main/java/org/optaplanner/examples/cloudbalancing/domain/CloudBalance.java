package org.optaplanner.examples.cloudbalancing.domain;

import java.util.List;

import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

@PlanningSolution
public class CloudBalance {
    
    private List<CloudComputer> computerList;
    
	private List<CloudProcess> processList;
	
	private HardSoftScore score;
    
    public CloudBalance() {
    }

    public CloudBalance(List<CloudComputer> computerList, List<CloudProcess> processList) {
        this.computerList = computerList;
        this.processList = processList;
    }

	/**
	 * @return the computerList
	 */
	@ValueRangeProvider(id = "computerRange")
	public List<CloudComputer> getComputerList() {
		return computerList;
	}

	/**
	 * @param computerList the computerList to set
	 */
	public void setComputerList(List<CloudComputer> computerList) {
		this.computerList = computerList;
	}

	/**
	 * @return the processList
	 */
	@PlanningEntityCollectionProperty
	public List<CloudProcess> getProcessList() {
		return processList;
	}

	/**
	 * @param processList the processList to set
	 */
	public void setProcessList(List<CloudProcess> processList) {
		this.processList = processList;
	}

	/**
	 * @return the score
	 */
	@PlanningScore
	public HardSoftScore getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setCcore(HardSoftScore score) {
		this.score = score;
	}
    
}
