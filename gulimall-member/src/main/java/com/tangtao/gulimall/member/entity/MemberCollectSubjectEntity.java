package com.tangtao.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.tangtao.gulimall.common.param.PageParam;
import lombok.Data;

import java.io.Serializable;

/**
 * 会员收藏的专题活动
 * 
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 14:03:01
 */
@Data
@TableName("ums_member_collect_subject")
public class MemberCollectSubjectEntity  extends PageParam implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * subject_id
	 */
	private Long subjectId;
	/**
	 * subject_name
	 */
	private String subjectName;
	/**
	 * subject_img
	 */
	private String subjectImg;
	/**
	 * 活动url
	 */
	private String subjectUrll;

}
