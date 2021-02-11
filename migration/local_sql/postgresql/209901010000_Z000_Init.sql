---- Update ad_system to KylinBizSuite
UPDATE ad_system SET lastbuildinfo = '0.0.0', name = 'KylinBizSuite' WHERE ad_system_id = 0;

---- Setup APPLICATION_MAIN_VERSION
INSERT INTO ad_sysconfig(
	ad_sysconfig_id, ad_client_id, ad_org_id, created, updated, createdby, updatedby, isactive, name, value, description, entitytype, configurationlevel, ad_sysconfig_uu)
	VALUES (999999, 0, 0, '2020-01-01', '2020-01-01', 100, 100, 'Y', 'APPLICATION_MAIN_VERSION', '0.0.0', 'Application Main Version', 'D', 'S', 'c44e2ee5-68b5-46cb-adef-98fb3511269c');
	
---- Setup APPLICATION_IMPLEMENTATION_VENDOR
INSERT INTO ad_sysconfig(
	ad_sysconfig_id, ad_client_id, ad_org_id, created, updated, createdby, updatedby, isactive, name, value, description, entitytype, configurationlevel, ad_sysconfig_uu)
	VALUES (999998, 0, 0, '2020-01-01', '2020-01-01', 100, 100, 'Y', 'APPLICATION_IMPLEMENTATION_VENDOR', 'Supported by KSYS', 'Supported by KSYS', 'D', 'S', '811c8b1f-544a-483f-a4bf-b281490e1b72');

---- Setup DB_READ_REPLICA_URLS
--INSERT INTO ad_sysconfig(
--	ad_sysconfig_id, ad_client_id, ad_org_id, created, updated, createdby, updatedby, isactive, name, value, description, entitytype, configurationlevel, ad_sysconfig_uu)
--	VALUES (999994, 0, 0, '2020-01-01', '2020-01-01', 100, 100, 'Y', 'DB_READ_REPLICA_URLS', 'jdbc:postgresql://kbs-pgslave:5432/idempiere?encoding=unicode', 'DB_READ_REPLICA_URLS', 'D', 'S', '2871cc29-7691-45a7-a5e8-8fefded48734');

---- Setup ZK_THEME to kbs
update ad_sysconfig set value = 'kbs' where name = 'ZK_THEME';

---- Setup ALogin_ShowDate to N
update ad_sysconfig set value = 'N' where name = 'ALogin_ShowDate';
---- Setup ZK_PAGING_SIZE to 100
update ad_sysconfig set value = 100 where name = 'ZK_PAGING_SIZE';
---- Setup ZK_PAGING_DETAIL_SIZE to 100
update ad_sysconfig set value = 100 where name = 'ZK_PAGING_DETAIL_SIZE';
---- Setup ZK_THEME_USE_FONT_ICON_FOR_IMAGE (Y - Use css font icon instead of image for button, toolbar button and menu)
update ad_sysconfig set Value = 'Y' where name = 'ZK_THEME_USE_FONT_ICON_FOR_IMAGE';
---- Setup ZK_MAX_UPLOAD_SIZE to 20m
update ad_sysconfig set value = 20480 where name = 'ZK_MAX_UPLOAD_SIZE';
---- Setup "ZK_GRID_AFTER_FIND"
update ad_sysconfig set value = 'Y' where name = 'ZK_GRID_AFTER_FIND';
---- Setup "Forgot My Password" 
update ad_sysconfig set value = 'N' where name = 'LOGIN_SHOW_RESETPASSWORD';

---- Toolbar Customization
---- Window - Help
update ad_toolbarbutton set seqno = 999 where ad_toolbarbutton_id = 200030;

---- Disable Accounting Processor
-- UPDATE c_acctprocessor SET isactive = 'N';
---- Disable Workflow Processor
-- update ad_workflowprocessor set isactive = 'N';
---- Disable Request Processor
-- update r_requestprocessor set isactive = 'N';
---- Disable Alert Processor
---- update ad_alertprocessor set isactive = 'N';

---- Disable All Alert Job
-- update ad_alert set isactive = 'N';
---- Disable All Scheduler Job
-- update ad_scheduler set isactive = 'N';

---- Disable Country
update c_country set isactive = 'N' where countrycode not in ('CN', 'US');

---- Setup AD_Language
---- disable es_CO
UPDATE ad_language SET issystemlanguage = 'N', isloginlocale = 'N' WHERE ad_language = 'es_CO';
---- enable zh_CN
UPDATE ad_language SET issystemlanguage = 'Y', isloginlocale = 'Y' WHERE ad_language = 'zh_CN';

---- Setup Active Currency
 UPDATE c_currency SET isactive = 'N';
 UPDATE c_currency SET isactive = 'Y' WHERE iso_code='CNY' OR iso_code='USD' OR iso_code='EUR';


---- Register SQL
SELECT register_migration_script('209901010000_Z000_Init.sql') FROM dual;
