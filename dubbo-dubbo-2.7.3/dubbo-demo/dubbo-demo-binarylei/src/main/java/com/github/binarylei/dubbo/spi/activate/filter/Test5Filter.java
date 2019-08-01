package com.github.binarylei.dubbo.spi.activate.filter;

import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.Filter;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Result;
import org.apache.dubbo.rpc.RpcException;

/**
 * @author leigang
 * @version 2019-08-01
 * @since 2.0.0
 */
@Activate(group = {CommonConstants.PROVIDER, CommonConstants.CONSUMER},
        order = 5, value = "test5Condition")
public class Test5Filter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        return null;
    }
}
