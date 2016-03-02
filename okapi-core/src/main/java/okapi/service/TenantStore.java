/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okapi.service;

import io.vertx.core.Handler;
import java.util.List;
import okapi.bean.Tenant;
import okapi.bean.TenantDescriptor;
import okapi.util.ExtendedAsyncResult;

/**
 *
 * @author heikki
 */
public interface TenantStore {

  void delete(String id, Handler<ExtendedAsyncResult<Void>> fut);

  void enableModule(String id, String module, long timestamp, Handler<ExtendedAsyncResult<Void>> fut );

  void get(String id, Handler<ExtendedAsyncResult<Tenant>> fut);

  void insert(Tenant t, Handler<ExtendedAsyncResult<String>> fut);

  void listIds(Handler<ExtendedAsyncResult<List<String>>> fut);
  
  void listTenants(Handler<ExtendedAsyncResult<List<TenantDescriptor>>> fut);
    // TODO - Add list parameters, like which fields, start, and maxrecs

}