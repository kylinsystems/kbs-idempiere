---- Update lastbuildinfo of KylinBizSuite in ad_system
--UPDATE ad_system SET lastbuildinfo = '7.1.0.latest' WHERE ad_system_id = 0;

---- Update APPLICATION_MAIN_VERSION in ad_sysconfig
--update ad_sysconfig set value = '7.1.0.latest' where ad_sysconfig_id = 999999;
	
---- Register SQL
SELECT register_migration_script('DB_Version_20200820.sql') FROM dual;
