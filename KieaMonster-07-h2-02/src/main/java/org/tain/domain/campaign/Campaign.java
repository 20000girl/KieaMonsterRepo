package org.tain.domain.campaign;

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
@Table(name = "ci_campaign")
@Data
public class Campaign {

	@Id
	@Column(name = "campaign_sk")
	private Long campaignSk;
	
	@Column(name = "campaign_cd", length = 256)
	private String campaignCd;
	
	@Column(name = "campaign_nm", length = 256)
	private String campaignNm;
	
	@Column(name = "processed_dttm")
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@CreationTimestamp
	private LocalDate processedDttm;
}
