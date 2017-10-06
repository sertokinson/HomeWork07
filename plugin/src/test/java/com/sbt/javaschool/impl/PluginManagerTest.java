package com.sbt.javaschool.impl;


import com.sbt.javaschool.api.Plugin;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Admin on 04.10.2017.
 */
public class PluginManagerTest {
    @Test
    public void load() throws Exception {
        PluginManager pluginManager = new PluginManager("D:\\JavaSchool\\lections\\07 ClassLoader\\hw\\classloader\\MyPlugin");
        Plugin load=pluginManager.load("MyPlugin1","MyPlugin");
        load.doUsefull();
        Assert.assertEquals("MyPlugin",load.getClass().getSimpleName());

        load=pluginManager.load("MyPlugin2","MyPlugin");
        load.doUsefull();
        Assert.assertEquals("MyPlugin",load.getClass().getSimpleName());

    }
}
