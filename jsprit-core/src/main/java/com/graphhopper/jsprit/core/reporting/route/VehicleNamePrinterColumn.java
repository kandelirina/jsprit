package com.graphhopper.jsprit.core.reporting.route;

import java.util.function.Consumer;

import com.graphhopper.jsprit.core.reporting.AbstractPrinterColumn;
import com.graphhopper.jsprit.core.reporting.DynamicTableDefinition.ColumnDefinition;
import com.graphhopper.jsprit.core.reporting.DynamicTableDefinition.ColumnDefinition.Builder;
import com.graphhopper.jsprit.core.reporting.DynamicTableDefinition.StringColumnType;

public class VehicleNamePrinterColumn extends AbstractPrinterColumn<RoutePrinterContext, String> {

    public VehicleNamePrinterColumn() {
        super();
    }

    public VehicleNamePrinterColumn(Consumer<Builder> decorator) {
        super(decorator);
    }

    @Override
    public ColumnDefinition.Builder getColumnBuilder() {
        return new ColumnDefinition.Builder(new StringColumnType(), "vehicle");
    }

    @Override
    public String getData(RoutePrinterContext context) {
        return context.getRoute().getVehicle().getId();
    }

}