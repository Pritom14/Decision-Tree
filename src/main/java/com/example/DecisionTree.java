package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DecisionTree {

    private static final Logger LOGGER = Logger.getLogger(DecisionTree.class.getName());

    private final String name;
    private int nodeCount;

    public DecisionTree(String name) {
        this.name = name;
        this.nodeCount = 0;
        LOGGER.log(Level.INFO, "DecisionTree created: {0}", name);
    }

    public void addNode(String label) {
        if (label == null || label.isEmpty()) {
            LOGGER.warning("Attempted to add a node with an empty label");
            return;
        }

        nodeCount++;
        LOGGER.log(Level.FINE, "Added node \"{0}\" to tree \"{1}\" (total nodes: {2})",
                new Object[] { label, name, nodeCount });
    }

    public int getNodeCount() {
        LOGGER.log(Level.FINER, "getNodeCount() called for tree \"{0}\"", name);
        return nodeCount;
    }

    public String getName() {
        return name;
    }
}
