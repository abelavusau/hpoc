-- Table: f_carcode

DROP TABLE f_carcode;

CREATE TABLE f_carcode
(
  k_carcode_id character(200),
  partner_lead_id bigint,
  cdd_location_id bigint,
  cdd_dealer_id bigint,
  cc_message_id bigint,
  cc_reply_id bigint,
  message_type character(255),
  cc_sales_person_id bigint,
  name character(255),
  body character(5000),
  state character(255),
  stoprequested bigint,
  startrequested bigint,
  from_num bigint,
  to_num bigint,
  phonelabel character(255),
  createdtime date,
  repliedtime date,
  updatedtime date,
  failedtime date,
  readtime date,
  providermsg character(4096),
  requestid character(255),
  vehicleiid bigint,
  uploadid character(1024),
  creditappid bigint,
  pricepromiseurl character(255),
  isauto boolean,
  process_datetime date,
  conversationtype character(255),
  customerinitiated boolean
)
WITH (
  OIDS=FALSE
);
ALTER TABLE f_carcode
  OWNER TO postgres;

DROP TABLE f_lead;

CREATE TABLE f_lead
(
  k_lead_id bigint NOT NULL,
  lead_date timestamp without time zone NOT NULL,
  lead_time character varying(10) NOT NULL,
  user_event_guid_timestamp bigint,
  visitor_id character varying(100),
  visitor_key bigint,
  session_id character varying(50),
  ip character varying(50),
  customer_first_name character varying(50),
  customer_last_name character varying(50),
  customer_email character varying(100),
  customer_phone_number character varying(100),
  customer_address_street character varying(100),
  customer_address_city character varying(100),
  customer_address_state character varying(100),
  customer_address_zip character varying(10),
  customer_address_dma character varying(10),
  vehicle_vin character varying(20),
  vehicle_year character varying(10),
  vehicle_make character varying(100),
  vehicle_model character varying(100),
  vehicle_style character varying(100),
  vehicle_make_id character varying(50),
  vehicle_model_link_code character varying(50),
  vehicle_model_year_id character varying(50),
  vehicle_key bigint,
  contract_name character varying(100),
  contract_id bigint,
  contract_report_type character varying(100),
  contract_application_type character varying(100),
  dealer_line_item_id character varying(50),
  dealer_franchise_id character varying(50),
  dealer_location_id character varying(50),
  dealer_distance character varying(50),
  inventory_id character varying(50),
  status_code character varying(50),
  status_id smallint,
  program_code character varying(50),
  confirmed_flag character varying(1),
  internal_flag character varying(1),
  price_promise_flag character varying(1),
  response_message character varying(3000),
  referring_url character varying(2000),
  lead_type character varying(5),
  lead_comment character varying(3000),
  syndication_partner character varying(100),
  offer_price character varying(100),
  lead_attribute_key_value_pair character varying(3000),
  program_lead_type character varying(255),
  partner_lead_id bigint,
  CONSTRAINT f_lead_pkey PRIMARY KEY (k_lead_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE f_lead
  OWNER TO postgres;

DROP TABLE sales;

CREATE TABLE sales
(
  f_transaction_id bigint NOT NULL,
  purchase_dealer_id bigint,
  purchase_dealer character(100),
  match_type character(100),
  lead_id bigint,
  lead_dealer character(100),
  lead_comment character(255),
  partner_lead_id bigint
)
WITH (
  OIDS=FALSE
);
ALTER TABLE sales
  OWNER TO postgres;