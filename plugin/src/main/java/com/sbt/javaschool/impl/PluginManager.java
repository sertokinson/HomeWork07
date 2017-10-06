package com.sbt.javaschool.impl;

import com.sbt.javaschool.api.Plugin;
import java.net.URL;
import java.net.URLClassLoader;

public class PluginManager {
    private final String pluginRootDirectory;

    public PluginManager(String pluginRootDirectory) {
        this.pluginRootDirectory = pluginRootDirectory;
    }

    public Plugin load(String pluginName, String pluginClassName) {
        try {
            URLClassLoader loader = new URLClassLoader(new URL[]{
                    new URL("file:\\\\\\"+pluginRootDirectory+"\\"+pluginName+"\\")
            });
            Class<?> aClass = loader.loadClass(pluginClassName);
            return (Plugin) aClass.newInstance();
        } catch (Exception e) {
            System.out.println("Catched exception "+e.getMessage());
        }
        return null;
    }
}
