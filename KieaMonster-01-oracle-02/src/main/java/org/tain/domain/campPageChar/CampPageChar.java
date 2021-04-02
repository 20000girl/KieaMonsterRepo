package org.tain.domain.campPageChar;

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
@Table(name = "ci_camp_page_char_udf")
@Data
public class CampPageChar {

	@Id
	@Column(name = "campaign_sk")
	private Long campaignSk;
	
	@Column(name = "page_nm", length = 256)
	private String pageNm;
	
	@Column(name = "char_udf_nm", length = 256)
	private String charUdfNm;

	@Column(name = "char_udf_val", length = 256)
	private String charUdfVal;
	
	@Column(name = "char_ext_column_nm", length = 256)
	private String charExtColumnNm;
	
	@Column(name = "processed_dttm")
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@CreationTimestamp
	private LocalDate processedDttm;
}
