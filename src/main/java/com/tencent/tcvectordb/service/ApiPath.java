package com.tencent.tcvectordb.service;

/**
 * Vector DB server API path
 */
public class ApiPath {
    public final static String DB_CREATE = "/database/create";
    public final static String DB_DROP = "/database/drop";
    public final static String DB_LIST = "/database/list";
    public final static String COL_CREATE = "/collection/create";
    public final static String COL_DROP = "/collection/drop";
    public final static String COL_FLUSH = "/collection/truncate";
    public final static String COL_LIST = "/collection/list";
    public final static String SET_COL_ALIAS = "/alias/set";
    public final static String DELETE_COL_ALIAS = "/alias/delete";
    public final static String COL_DESCRIBE = "/collection/describe";
    public final static String DOC_UPSERT = "/document/upsert";
    public final static String DOC_QUERY = "/document/query";
    public final static String DOC_SEARCH = "/document/search";
    public final static String DOC_DELETE = "/document/delete";
    public final static String DOC_UPDATE = "/document/update";
    public final static String REBUILD_INDEX = "/index/rebuild";
}