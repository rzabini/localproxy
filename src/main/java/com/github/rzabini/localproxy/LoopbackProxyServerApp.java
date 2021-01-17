package com.github.rzabini.localproxy;

import com.github.monkeywie.proxyee.server.HttpProxyServer;
import com.github.monkeywie.proxyee.server.HttpProxyServerConfig;
import com.github.rzabini.localproxy.resolver.LoopbackAddressResolverGroup;

public class LoopbackProxyServerApp {
    public static void main(String[] args) {
        int port = 9999;
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        }
        System.out.printf("start loopback proxy server on port %d%n", port);

        new HttpProxyServer()
                .serverConfig(new HttpProxyServerConfig(LoopbackAddressResolverGroup.INSTANCE))
                .start(port);
    }
}
