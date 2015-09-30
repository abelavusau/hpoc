package com.a3m.domain;

import java.io.Serializable;
import java.util.Date;

public class LeadDO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long ld_lead_id;
	private Long ld_contract_id;
	private String ld_passed_code;
	private String ld_target_url;
	private String ld_party_id;
	private Date ld_timestamp;
	private Long ld_process_time;
	private String ld_response_code;
	private String ld_response_message;
	private String ld_confirmed;
	private String ld_banner_code;
	private String ld_client_ip;
	private String ld_client_host;
	private Date ld_date_only;
	private String ld_referring_url;
	private Long ld_dealer_franchise_id;
	private String ld_comment;
	private String ld_user_track;
	private String ld_link_id;
	private String ld_server;
	private String ld_user_session;
	private String ld_prior_url;
	private String ld_syndication_partner;
	private String ld_partner_list;
	private Long ld_order_id;
	private String ld_program_code;
	private Float ld_dealer_distance;
	private Long ld_status_code_id;
	private Long ld_substatus_code_id;
	private Date ld_update_sysdate;
	private Long ld_method_code_id;
	private Long ld_lead_type_id;
	private Long ld_cdd_location_id;
	private Long ld_partner_lead_id;
	private String ld_lead_unique_id;
	private String ld_s3_certificate_url;
	private Boolean ld_price_promise_flag;

	public Long getLd_lead_id() {
		return ld_lead_id;
	}

	public void setLd_lead_id(Long ld_lead_id) {
		this.ld_lead_id = ld_lead_id;
	}

	public Long getLd_contract_id() {
		return ld_contract_id;
	}

	public void setLd_contract_id(Long ld_contract_id) {
		this.ld_contract_id = ld_contract_id;
	}

	public String getLd_passed_code() {
		return ld_passed_code;
	}

	public void setLd_passed_code(String ld_passed_code) {
		this.ld_passed_code = ld_passed_code;
	}

	public String getLd_target_url() {
		return ld_target_url;
	}

	public void setLd_target_url(String ld_target_url) {
		this.ld_target_url = ld_target_url;
	}

	public String getLd_party_id() {
		return ld_party_id;
	}

	public void setLd_party_id(String ld_party_id) {
		this.ld_party_id = ld_party_id;
	}

	public Date getLd_timestamp() {
		return ld_timestamp;
	}

	public void setLd_timestamp(Date ld_timestamp) {
		this.ld_timestamp = ld_timestamp;
	}

	public Long getLd_process_time() {
		return ld_process_time;
	}

	public void setLd_process_time(Long ld_process_time) {
		this.ld_process_time = ld_process_time;
	}

	public String getLd_response_code() {
		return ld_response_code;
	}

	public void setLd_response_code(String ld_response_code) {
		this.ld_response_code = ld_response_code;
	}

	public String getLd_response_message() {
		return ld_response_message;
	}

	public void setLd_response_message(String ld_response_message) {
		this.ld_response_message = ld_response_message;
	}

	public String getLd_confirmed() {
		return ld_confirmed;
	}

	public void setLd_confirmed(String ld_confirmed) {
		this.ld_confirmed = ld_confirmed;
	}

	public String getLd_banner_code() {
		return ld_banner_code;
	}

	public void setLd_banner_code(String ld_banner_code) {
		this.ld_banner_code = ld_banner_code;
	}

	public String getLd_client_ip() {
		return ld_client_ip;
	}

	public void setLd_client_ip(String ld_client_ip) {
		this.ld_client_ip = ld_client_ip;
	}

	public String getLd_client_host() {
		return ld_client_host;
	}

	public void setLd_client_host(String ld_client_host) {
		this.ld_client_host = ld_client_host;
	}

	public Date getLd_date_only() {
		return ld_date_only;
	}

	public void setLd_date_only(Date ld_date_only) {
		this.ld_date_only = ld_date_only;
	}

	public String getLd_referring_url() {
		return ld_referring_url;
	}

	public void setLd_referring_url(String ld_referring_url) {
		this.ld_referring_url = ld_referring_url;
	}

	public Long getLd_dealer_franchise_id() {
		return ld_dealer_franchise_id;
	}

	public void setLd_dealer_franchise_id(Long ld_dealer_franchise_id) {
		this.ld_dealer_franchise_id = ld_dealer_franchise_id;
	}

	public String getLd_comment() {
		return ld_comment;
	}

	public void setLd_comment(String ld_comment) {
		this.ld_comment = ld_comment;
	}

	public String getLd_user_track() {
		return ld_user_track;
	}

	public void setLd_user_track(String ld_user_track) {
		this.ld_user_track = ld_user_track;
	}

	public String getLd_link_id() {
		return ld_link_id;
	}

	public void setLd_link_id(String ld_link_id) {
		this.ld_link_id = ld_link_id;
	}

	public String getLd_server() {
		return ld_server;
	}

	public void setLd_server(String ld_server) {
		this.ld_server = ld_server;
	}

	public String getLd_user_session() {
		return ld_user_session;
	}

	public void setLd_user_session(String ld_user_session) {
		this.ld_user_session = ld_user_session;
	}

	public String getLd_prior_url() {
		return ld_prior_url;
	}

	public void setLd_prior_url(String ld_prior_url) {
		this.ld_prior_url = ld_prior_url;
	}

	public String getLd_syndication_partner() {
		return ld_syndication_partner;
	}

	public void setLd_syndication_partner(String ld_syndication_partner) {
		this.ld_syndication_partner = ld_syndication_partner;
	}

	public String getLd_partner_list() {
		return ld_partner_list;
	}

	public void setLd_partner_list(String ld_partner_list) {
		this.ld_partner_list = ld_partner_list;
	}

	public Long getLd_order_id() {
		return ld_order_id;
	}

	public void setLd_order_id(Long ld_order_id) {
		this.ld_order_id = ld_order_id;
	}

	public String getLd_program_code() {
		return ld_program_code;
	}

	public void setLd_program_code(String ld_program_code) {
		this.ld_program_code = ld_program_code;
	}

	public Float getLd_dealer_distance() {
		return ld_dealer_distance;
	}

	public void setLd_dealer_distance(Float ld_dealer_distance) {
		this.ld_dealer_distance = ld_dealer_distance;
	}

	public Long getLd_status_code_id() {
		return ld_status_code_id;
	}

	public void setLd_status_code_id(Long ld_status_code_id) {
		this.ld_status_code_id = ld_status_code_id;
	}

	public Long getLd_substatus_code_id() {
		return ld_substatus_code_id;
	}

	public void setLd_substatus_code_id(Long ld_substatus_code_id) {
		this.ld_substatus_code_id = ld_substatus_code_id;
	}

	public Date getLd_update_sysdate() {
		return ld_update_sysdate;
	}

	public void setLd_update_sysdate(Date ld_update_sysdate) {
		this.ld_update_sysdate = ld_update_sysdate;
	}

	public Long getLd_method_code_id() {
		return ld_method_code_id;
	}

	public void setLd_method_code_id(Long ld_method_code_id) {
		this.ld_method_code_id = ld_method_code_id;
	}

	public Long getLd_lead_type_id() {
		return ld_lead_type_id;
	}

	public void setLd_lead_type_id(Long ld_lead_type_id) {
		this.ld_lead_type_id = ld_lead_type_id;
	}

	public Long getLd_cdd_location_id() {
		return ld_cdd_location_id;
	}

	public void setLd_cdd_location_id(Long ld_cdd_location_id) {
		this.ld_cdd_location_id = ld_cdd_location_id;
	}

	public Long getLd_partner_lead_id() {
		return ld_partner_lead_id;
	}

	public void setLd_partner_lead_id(Long ld_partner_lead_id) {
		this.ld_partner_lead_id = ld_partner_lead_id;
	}

	public String getLd_lead_unique_id() {
		return ld_lead_unique_id;
	}

	public void setLd_lead_unique_id(String ld_lead_unique_id) {
		this.ld_lead_unique_id = ld_lead_unique_id;
	}

	public String getLd_s3_certificate_url() {
		return ld_s3_certificate_url;
	}

	public void setLd_s3_certificate_url(String ld_s3_certificate_url) {
		this.ld_s3_certificate_url = ld_s3_certificate_url;
	}

	public Boolean getLd_price_promise_flag() {
		return ld_price_promise_flag;
	}

	public void setLd_price_promise_flag(Boolean ld_price_promise_flag) {
		this.ld_price_promise_flag = ld_price_promise_flag;
	}
}
