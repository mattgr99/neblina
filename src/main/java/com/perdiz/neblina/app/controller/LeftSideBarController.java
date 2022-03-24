/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.perdiz.neblina.app.controller;

import com.jfoenix.controls.JFXButton;
import com.perdiz.neblina.app.resource.ImageResource;
import com.perdiz.neblina.app.resource.Resource;
import javafx.event.EventHandler;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

/**
 *
 * @author alexander
 */
public class LeftSideBarController extends VBox {

    protected JFXButton cloudServerBtn = new JFXButton("", new ImageResource(Resource.CLOUDSERVERLIGHT));
    protected JFXButton fogServerBtn = new JFXButton("", new ImageResource(Resource.FOGSERVERLIGHT));
    protected JFXButton actuatorBtn = new JFXButton("", new ImageResource(Resource.ACTUATORLIGHT));
    protected JFXButton sensorBtn = new JFXButton("", new ImageResource(Resource.SENSORLIGHT));
    protected JFXButton trafficBtn = new JFXButton("", new ImageView("file:src/main/resources/image/email1.png"));
    protected JFXButton trafficRanBtn = new JFXButton("", new ImageView("file:src/main/resources/image/cartab.png"));
    protected JFXButton chartBarBtn = new JFXButton("", new ImageView("file:src/main/resources/image/bar-graph.png"));
    protected JFXButton chartLineVmBtn = new JFXButton("", new ImageView("file:src/main/resources/image/line-graph.png"));
    protected JFXButton chartLineTrBtn = new JFXButton("", new ImageView("file:src/main/resources/image/statistics.png"));

    public LeftSideBarController() {
        this.cloudServerBtn.setTooltip(new Tooltip("Cloud Server"));
        this.fogServerBtn.setTooltip(new Tooltip("Fog Server"));
        this.sensorBtn.setTooltip(new Tooltip("Sensor"));
        this.actuatorBtn.setTooltip(new Tooltip("Actuator"));
        this.trafficBtn.setTooltip(new Tooltip("Traffic"));
        this.trafficRanBtn.setTooltip(new Tooltip("Traffic Random"));
        this.chartBarBtn.setTooltip(new Tooltip("Energy Consumption Server"));
        this.chartLineVmBtn.setTooltip(new Tooltip("VM - ON"));
        this.chartLineTrBtn.setTooltip(new Tooltip("Arrival Per Slot"));

    }

    public void setCloudServerActionEvent(EventHandler<MouseEvent> cloudServerActionEvent) {
        this.cloudServerBtn.setOnMouseClicked(cloudServerActionEvent);
    }

    public void setFogServerActionEvent(EventHandler<MouseEvent> fogServerActionEvent) {
        this.fogServerBtn.setOnMouseClicked(fogServerActionEvent);
    }

    public void setActuatorActionEvent(EventHandler<MouseEvent> macbookActionEvent) {
        this.actuatorBtn.setOnMouseClicked(macbookActionEvent);
    }

    public void setSensorActionEvent(EventHandler<MouseEvent> sensorActionEvent) {
        this.sensorBtn.setOnMouseClicked(sensorActionEvent);
    }

    public void setTrafficActionEvent(EventHandler<MouseEvent> sensorActionEvent) {
        this.trafficBtn.setOnMouseClicked(sensorActionEvent);
    }

    public void setTrafficRanActionEvent(EventHandler<MouseEvent> sensorActionEvent) {
        this.trafficRanBtn.setOnMouseClicked(sensorActionEvent);
    }

    public void setChartBarBtnEvent(EventHandler<MouseEvent> sensorActionEvent) {
        this.chartBarBtn.setOnMouseClicked(sensorActionEvent);
    }

    public void setChartLineVmBtnEvent(EventHandler<MouseEvent> chartActionEvent) {
        this.chartLineVmBtn.setOnMouseClicked(chartActionEvent);
    }

    public void setChartLineTrBtnEvent(EventHandler<MouseEvent> chartActionEvent) {
        this.chartLineTrBtn.setOnMouseClicked(chartActionEvent);
    }
}
