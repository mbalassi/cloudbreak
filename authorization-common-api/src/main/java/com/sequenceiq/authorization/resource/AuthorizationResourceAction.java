package com.sequenceiq.authorization.resource;

public enum AuthorizationResourceAction {
    CHANGE_CREDENTIAL,
    EDIT_CREDENTIAL,
    EDIT_ENVIRONMENT,
    START_ENVIRONMENT,
    STOP_ENVIRONMENT,
    DELETE_CREDENTIAL,
    DESCRIBE_CREDENTIAL,
    DELETE_ENVIRONMENT,
    DESCRIBE_ENVIRONMENT,
    ACCESS_ENVIRONMENT,
    ADMIN_FREEIPA,
    CREATE_CREDENTIAL,
    CREATE_ENVIRONMENT,
    GET_KEYTAB,
    CREATE_IMAGE_CATALOG,
    EDIT_IMAGE_CATALOG,
    DESCRIBE_IMAGE_CATALOG,
    DELETE_IMAGE_CATALOG,
    DESCRIBE_CLUSTER_DEFINITION,
    DELETE_CLUSTER_DEFINITION,
    CREATE_CLUSTER_DEFINITION,
    DESCRIBE_CLUSTER_TEMPLATE,
    DELETE_CLUSTER_TEMPLATE,
    CREATE_CLUSTER_TEMPLATE,
    GET_OPERATION_STATUS,
    CREATE_DATALAKE,
    DESCRIBE_DATALAKE,
    DESCRIBE_DETAILED_DATALAKE,
    DELETE_DATALAKE,
    REPAIR_DATALAKE,
    SYNC_DATALAKE,
    RETRY_DATALAKE_OPERATION,
    START_DATALAKE,
    STOP_DATALAKE,
    UPGRADE_DATALAKE,
    CREATE_DATAHUB,
    DESCRIBE_DATAHUB,
    DELETE_DATAHUB,
    REPAIR_DATAHUB,
    SYNC_DATAHUB,
    RETRY_DATAHUB_OPERATION,
    DESCRIBE_RETRYABLE_DATAHUB_OPERATION,
    START_DATAHUB,
    STOP_DATAHUB,
    SCALE_DATAHUB,
    DELETE_DATAHUB_INSTANCE,
    SET_DATAHUB_MAINTENANCE_MODE,
    DESCRIBE_DATABASE,
    DESCRIBE_DATABASE_SERVER,
    DELETE_DATABASE,
    DELETE_DATABASE_SERVER,
    REGISTER_DATABASE,
    REGISTER_DATABASE_SERVER,
    CREATE_DATABASE_SERVER,
    CREATE_DATABASE,
    START_DATABASE_SERVER,
    STOP_DATABASE_SERVER,
    BACKUP_DATALAKE,
    RESTORE_DATALAKE,
    // deprecated actions, please do not use them
    ENVIRONMENT_READ,
    ENVIRONMENT_WRITE,
    DATALAKE_READ,
    DATALAKE_WRITE,
    DATAHUB_READ,
    DATAHUB_WRITE;
}
