package com.vmware.vsphere.client.vsan.support;

import com.vmware.vim.binding.impl.vmodl.DataObjectImpl;
import com.vmware.vise.core.model.data;

@data
public class VsanSRAttachSpec extends DataObjectImpl {
  private static final long serialVersionUID = 1L;
  
  public String serviceRequestID;
  
  public String description;
}


/* Location:              /Users/haidv/Downloads/h5-vsan-service.jar!/com/vmware/vsphere/client/vsan/support/VsanSRAttachSpec.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */