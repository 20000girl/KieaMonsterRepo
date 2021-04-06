package org.tain.domain.cell;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.tain.utils.LocalDateDeserializer;
import org.tain.utils.LocalDateSerializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Data;

@Entity
@Table(name = "ci_cell_package")
@Data
public class Cell {

	@Id
	@Column(name = "cell_package_sk")
	private Long cellPackageSk;
	
	@Column(name = "campaign_sk")
	private Long campaignSk;
	
	@Column(name = "campaign_cd", length = 256)
	private String campaignCd;

	@Column(name = "campaign_nm", length = 256)
	private String campaignNm;

	@Column(name = "communication_nm", length = 256)
	private String communicationNm;

	@Column(name = "processed_dttm")
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@CreationTimestamp
	private LocalDate processedDttm;
}
