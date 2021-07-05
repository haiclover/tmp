package com.vmware.vsphere.client.vsan.iscsi.models.target.initiator;

import com.vmware.vim.binding.impl.vmodl.DataObjectImpl;
import com.vmware.vise.core.model.data;

@data
public class TargetInitiatorRemoveSpec extends DataObjectImpl {
  private static final long serialVersionUID = 1L;
  
  public String targetAlias;
  
  public String[] targetInitiatorNames;
}


/* Location:              /Users/haidv/Downloads/h5-vsan-service.jar!/com/vmware/vsphere/client/vsan/iscsi/models/target/initiator/TargetInitiatorRemoveSpec.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */