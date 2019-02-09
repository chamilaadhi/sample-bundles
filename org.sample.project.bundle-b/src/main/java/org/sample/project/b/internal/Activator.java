package org.sample.project.b.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.sample.project.b.BundleBService;
import org.sample.project.b.BundleBServiceImpl;
import org.sample.project.b.Greeter;

/**
 * This is a sample bundle activator class.
 *
 * @since 1.0.0
 */
public class Activator implements BundleActivator {
    private Greeter greeter;

    /**
     * This is called when the bundle is started.
     *
     * @param bundleContext BundleContext of this bundle
     * @throws Exception Could be thrown while bundle starting
     */
    public void start(BundleContext bundleContext) throws Exception {
        greeter =  new Greeter("Bundle B");
        greeter.hello();
        bundleContext.registerService(BundleBService.class.getName(), new BundleBServiceImpl(), null);
        
    }

    /**
     * This is called when the bundle is stopped.
     *
     * @param bundleContext BundleContext of this bundle
     * @throws Exception Could be thrown while bundle stopping
     */
    public void stop(BundleContext bundleContext) throws Exception {
        greeter.bye();
    }
}
