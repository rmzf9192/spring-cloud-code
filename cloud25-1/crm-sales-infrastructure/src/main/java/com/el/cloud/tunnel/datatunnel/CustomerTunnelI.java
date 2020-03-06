package com.el.cloud.tunnel.datatunnel;

import com.el.cloud.tunnel.dataobject.CustomerDO;
import org.xujin.halo.repository.DataTunnel;

import java.util.List;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
public interface CustomerTunnelI extends DataTunnel<CustomerDO>{

    public List<CustomerDO> findByCriteria(String... params);

}
