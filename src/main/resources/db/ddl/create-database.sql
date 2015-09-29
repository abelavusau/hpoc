DROP TABLE f_user_event;
CREATE TABLE
    f_user_event
    (
        k_uuid BIGINT NOT NULL,
        f_date DATE,
        f_time CHARACTER VARYING(10),
        f_remotehost CHARACTER VARYING(100),
        f_requestdate CHARACTER VARYING(100),
        f_requesttype CHARACTER VARYING(100),
        f_requestprotocol CHARACTER VARYING(100),
        f_acceptlanguage CHARACTER VARYING(1000),
        f_useragent CHARACTER VARYING(3000),
        f_event_guid_userid CHARACTER VARYING(100),
        f_event_guid_sessionid CHARACTER VARYING(100),
        f_event_guid_timestamp BIGINT,
        f_event_location_zipcode CHARACTER VARYING(100),
        f_event_location_dma CHARACTER VARYING(100),
        f_event_request_requesturl CHARACTER VARYING(3000),
        f_event_request_referringurl CHARACTER VARYING(3000),
        f_event_request_pagecategory CHARACTER VARYING(100),
        f_event_request_pagename CHARACTER VARYING(100),
        f_event_request_pagetid CHARACTER VARYING,
        f_event_request_abtesting CHARACTER VARYING(100),
        f_event_request_title CHARACTER VARYING,
        f_event_request_ts BIGINT,
        f_event_request_synpartner CHARACTER VARYING(100),
        f_event_uservehicle_makename CHARACTER VARYING(100),
        f_event_uservehicle_modelname CHARACTER VARYING(100),
        f_event_uservehicle_modelyear INTEGER,
        f_event_uservehicle_styleid BIGINT,
        f_event_uservehicle_submodel CHARACTER VARYING(100),
        f_event_uservehicle_usein CHARACTER VARYING(100),
        f_event_uservehicle_type CHARACTER VARYING(100),
        f_event_eventdata_eventtype CHARACTER VARYING(100),
        f_event_registration_userid CHARACTER VARYING(100),
        f_event_registration_member CHARACTER VARYING(100),
        f_event_registration_source CHARACTER VARYING(100),
        f_event_registration_login CHARACTER VARYING(100),
        f_event_paidmarketing_marketid CHARACTER VARYING(100),
        f_event_paidmarketing_marketcategory CHARACTER VARYING(100),
        f_event_browser_useragent CHARACTER VARYING(3000),
        f_event_browser_screenres CHARACTER VARYING(100),
        f_internalip CHARACTER(1),
        load_flag CHARACTER(1),
        process_datetime TIMESTAMP(6) WITHOUT TIME ZONE,
        record_datetime TIMESTAMP(6) WITHOUT TIME ZONE,
        additional_data CHARACTER VARYING(100),
        status_msg CHARACTER VARYING(100),
        f_platformtype CHARACTER VARYING(100),
        f_devicemake CHARACTER VARYING(100),
        f_devicemodel CHARACTER VARYING(100),
        f_os CHARACTER VARYING(100),
        f_osversion CHARACTER VARYING(100),
        f_browser CHARACTER VARYING(100),
        f_browserversion CHARACTER VARYING(100),
        i_eventdata_key_value_pairs CHARACTER VARYING(3000),
        f_event_guid_userid_opt BIGINT,
        process_date DATE,
        f_event_uservehicle_makeid BIGINT,
        f_event_uservehicle_modellinkcode CHARACTER VARYING(100),
        f_event_uservehicle_modelyearid BIGINT,
        f_event_uservehicle_submodelid BIGINT,
        f_event_vehicle_key BIGINT,
        log_date TIMESTAMP(6) WITHOUT TIME ZONE,
        f_audseg_verticalsegment CHARACTER VARYING(25),
        f_audseg_type CHARACTER VARYING(25),
        f_audseg_usedin CHARACTER VARYING(25),
        f_audseg_make CHARACTER VARYING(50),
        f_audseg_model CHARACTER VARYING(50),
        f_audseg_submodel CHARACTER VARYING(75),
        f_audseg_inferredtype CHARACTER VARYING(50),
        f_audseg_count INTEGER,
        f_audseg_alternate1 CHARACTER VARYING(100),
        f_audseg_alternate1_count INTEGER,
        f_audseg_alternate2 CHARACTER VARYING(100),
        f_audseg_alternate2_count INTEGER,
        f_audseg_organic_type CHARACTER VARYING(100),
        f_audseg_organic_usedin CHARACTER VARYING(20),
        f_audseg_organic_make CHARACTER VARYING(50),
        f_audseg_organic_model CHARACTER VARYING(50),
        f_audseg_organic_submodel CHARACTER VARYING(75)
    );
DROP TABLE f_carcode;
CREATE TABLE
    f_carcode
    (
        k_carcode_id CHARACTER(200),
        partner_lead_id BIGINT,
        cdd_location_id BIGINT,
        cdd_dealer_id BIGINT,
        cc_message_id BIGINT,
        cc_reply_id BIGINT,
        message_type CHARACTER(255),
        cc_sales_person_id BIGINT,
        name CHARACTER(255),
        body CHARACTER(5000),
        state CHARACTER(255),
        stoprequested BIGINT,
        startrequested BIGINT,
        from_num BIGINT,
        to_num BIGINT,
        phonelabel CHARACTER(255),
        createdtime DATE,
        repliedtime DATE,
        updatedtime DATE,
        failedtime DATE,
        readtime DATE,
        providermsg CHARACTER(4096),
        requestid CHARACTER(255),
        vehicleiid BIGINT,
        uploadid CHARACTER(1024),
        creditappid BIGINT,
        pricepromiseurl CHARACTER(255),
        isauto BOOLEAN,
        process_datetime DATE,
        conversationtype CHARACTER(255),
        customerinitiated BOOLEAN
    );
DROP TABLE lead;
CREATE TABLE
    lead
    (
        ld_lead_id NUMERIC(10,0) NOT NULL,
        ld_contract_id NUMERIC(10,0) NOT NULL,
        ld_passed_code CHARACTER VARYING(20),
        ld_target_url CHARACTER VARYING(2000),
        ld_party_id NUMERIC(10,0),
        ld_timestamp TIMESTAMP(6) WITHOUT TIME ZONE DEFAULT now() NOT NULL,
        ld_process_time NUMERIC,
        ld_response_code CHARACTER VARYING(500),
        ld_response_message CHARACTER VARYING(2000),
        ld_confirmed CHARACTER(1) DEFAULT 'N'::bpchar NOT NULL,
        ld_banner_code CHARACTER VARYING(340),
        ld_client_ip CHARACTER VARYING(15),
        ld_client_host CHARACTER VARYING(100),
        ld_date_only TIMESTAMP(6) WITHOUT TIME ZONE NOT NULL,
        ld_referring_url CHARACTER VARYING(2000),
        ld_dealer_franchise_id NUMERIC(10,0),
        ld_comment CHARACTER VARYING(2000),
        ld_user_track CHARACTER VARYING(2000),
        ld_link_id CHARACTER VARYING(340),
        ld_server CHARACTER VARYING(50),
        ld_user_session CHARACTER VARYING(1000),
        ld_prior_url CHARACTER VARYING(2000),
        ld_syndication_partner CHARACTER VARYING(10),
        ld_partner_list CHARACTER VARYING(1000),
        ld_order_id NUMERIC(10,0),
        ld_program_code CHARACTER VARYING(20),
        ld_dealer_distance NUMERIC(11,1),
        ld_status_code_id NUMERIC(10,0),
        ld_substatus_code_id NUMERIC(10,0),
        ld_update_sysdate TIMESTAMP(6) WITHOUT TIME ZONE,
        ld_method_code_id NUMERIC(10,0),
        ld_lead_type_id NUMERIC(2,0),
        ld_cdd_location_id NUMERIC(10,0),
        ld_partner_lead_id NUMERIC(10,0),
        ld_lead_unique_id CHARACTER VARYING(36),
        ld_s3_certificate_url CHARACTER VARYING(2000),
        ld_price_promise_flag BOOLEAN
    );
DROP TABLE referral;
CREATE TABLE
    referral
    (
        rf_lead_id NUMERIC(10,0) NOT NULL,
        rf_edmunds_make CHARACTER VARYING(80) NOT NULL,
        rf_edmunds_year NUMERIC(4,0) NOT NULL,
        rf_edmunds_midyear NUMERIC(2,0) NOT NULL,
        rf_edmunds_model CHARACTER VARYING(80) NOT NULL,
        rf_edmunds_style CHARACTER VARYING(100),
        rf_match_type CHARACTER VARYING(5) NOT NULL,
        rf_partner_make CHARACTER VARYING(80),
        rf_partner_year NUMERIC(4,0),
        rf_partner_model CHARACTER VARYING(80),
        rf_partner_style CHARACTER VARYING(100),
        rf_partner_key CHARACTER VARYING(200),
        rf_display_order NUMERIC(3,0) DEFAULT 0 NOT NULL,
        rf_doors NUMERIC(2,0),
        rf_trans_type CHARACTER(1),
        rf_cylinders NUMERIC(2,0),
        rf_interior_color CHARACTER VARYING(100),
        rf_exterior_color CHARACTER VARYING(100),
        rf_leather CHARACTER(1),
        rf_payment_method CHARACTER VARYING(50),
        rf_down_payment NUMERIC(12,2),
        rf_trade_in CHARACTER(1),
        rf_trade_year NUMERIC(4,0),
        rf_trade_make CHARACTER VARYING(80),
        rf_trade_model CHARACTER VARYING(80),
        rf_trade_mileage CHARACTER VARYING(30),
        rf_comments CHARACTER VARYING(4000),
        rf_contact_time CHARACTER VARYING(30),
        rf_purchase_status CHARACTER VARYING(100),
        rf_zip_code CHARACTER VARYING(10),
        rf_granularity CHARACTER VARYING(10),
        rf_dealer_code CHARACTER VARYING(30),
        rf_vin CHARACTER VARYING(21),
        rf_stock_id CHARACTER VARYING(20),
        rf_msr_price NUMERIC(10,2),
        rf_tmv_price NUMERIC(10,2),
        rf_invoice_price NUMERIC(10,2),
        rf_regional_adjustment NUMERIC(10,2),
        rf_color_adjustment NUMERIC(10,2),
        rf_destination_charge NUMERIC(10,2),
        rf_mileage_adjustment NUMERIC(10,2),
        rf_is_new CHARACTER(1),
        rf_condition CHARACTER VARYING(4000),
        rf_trade_style CHARACTER VARYING(100),
        rf_trade_color CHARACTER VARYING(70),
        rf_ed_style_id NUMERIC(18,0),
        rf_offer_price NUMERIC(10,2),
        rf_vid CHARACTER VARYING(100),
        rf_total_msr_price NUMERIC(10,2),
        rf_min_price NUMERIC(10,2),
        rf_max_price NUMERIC(10,2)
    );
DROP TABLE sales;
CREATE TABLE
    sales
    (
        f_transaction_id BIGINT NOT NULL,
        purchase_dealer_id BIGINT,
        purchase_dealer CHARACTER(100),
        match_type CHARACTER(100),
        lead_id BIGINT,
        lead_dealer CHARACTER(100),
        lead_comment CHARACTER(255),
        partner_lead_id BIGINT
    );