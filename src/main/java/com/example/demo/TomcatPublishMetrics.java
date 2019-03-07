//package com.example.demo;
//
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.management.MBeanServer;
//import javax.management.ObjectName;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.Set;
//import java.util.logging.Logger;
//
//@Component
//public class TomcatPublishMetrics implements PublicMetrics {
//
//    public static final Logger LOG = LoggerFactory.getLogger(TomcatPublishMetrics.class);
//
//    @Autowired
//    private MBeanServer mbeanServer;
//
//    @Override
//    public Collection<Metric<?>> metrics() {
//        try {
//            Set<ObjectName> objectNames = mbeanServer.queryNames(new ObjectName("Tomcat:type=ThreadPool,*"), null);
//            Collection<Metric<?>> result = new ArrayList<>();
//            if (objectNames != null && objectNames.size() == 1) {
//                for (ObjectName objectName : objectNames) {
//                    int maxThreads = (Integer) mbeanServer.getAttribute(objectName, "maxThreads");
//                    int currentThreadCount = (Integer) mbeanServer.getAttribute(objectName, "currentThreadCount");
//                    int currentThreadsBusy = (Integer) mbeanServer.getAttribute(objectName, "currentThreadsBusy");
//                    long connectionCount = (Long) mbeanServer.getAttribute(objectName, "connectionCount");
//                    int maxConnections = (Integer) mbeanServer.getAttribute(objectName, "maxConnections");
//                    result.add(new Metric<Number>("tomcat.thread.busy", currentThreadsBusy, new Date()));
//                    result.add(new Metric<Number>("tomcat.thread.max", maxThreads, new Date()));
//                    result.add(new Metric<Number>("tomcat.thread.current", currentThreadCount, new Date()));
//                    result.add(new Metric<Number>("tomcat.thread.connectionCount", connectionCount, new Date()));
//                    result.add(new Metric<Number>("tomcat.thread.maxConnections", maxConnections, new Date()));
//                }
//            } else {
//                LOG.warn("Tomcat thread pool monitor failed");
//            }
//            return result;
//        } catch (Exception e) {
//            LOG.error("Tomcat thread pool monitor exception", e);
//        }
//        return Collections.emptyList();
//    }
//}
//---------------------
//作者：toxie6415176
//来源：CSDN
//原文：https://blog.csdn.net/toxie6415176/article/details/80294416
//版权声明：本文为博主原创文章，转载请附上博文链接！