package com.github.binarylei.dubbo.spi.activate;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Filter;

import java.util.List;

/**
 * `@Activate` 在我看来就是条件装配
 *
 * @author leigang
 * @version 2019-08-01
 * @since 2.0.0
 */
public class ActivateTest {

    public static void main(String[] args) {
        ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(Filter.class);

        URL url = new URL("", "", 3);
        url = url.addParameter("test5Condition", "xxx");
        url = url.addParameter("test4Condition", "xxx");
        List list;
//        list = extensionLoader.getActivateExtension(url, "", CommonConstants.PROVIDER);
//        System.out.println(list);
//        list = extensionLoader.getActivateExtension(url, "", CommonConstants.CONSUMER);
//        System.out.println(list);
        list = extensionLoader.getActivateExtension(url, "",
                CommonConstants.CONSUMER);
        System.out.println(list);
    }
}
