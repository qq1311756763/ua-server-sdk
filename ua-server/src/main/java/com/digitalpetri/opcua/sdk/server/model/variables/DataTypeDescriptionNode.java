/*
 * digitalpetri OPC-UA SDK
 *
 * Copyright (C) 2015 Kevin Herron
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.digitalpetri.opcua.sdk.server.model.variables;

import java.util.Optional;

import com.digitalpetri.opcua.sdk.core.model.variables.DataTypeDescriptionType;
import com.digitalpetri.opcua.sdk.core.nodes.VariableNode;
import com.digitalpetri.opcua.sdk.core.nodes.VariableTypeNode;
import com.digitalpetri.opcua.sdk.server.api.UaNodeManager;
import com.digitalpetri.opcua.stack.core.types.builtin.ByteString;
import com.digitalpetri.opcua.stack.core.types.builtin.DataValue;
import com.digitalpetri.opcua.stack.core.types.builtin.LocalizedText;
import com.digitalpetri.opcua.stack.core.types.builtin.NodeId;
import com.digitalpetri.opcua.stack.core.types.builtin.QualifiedName;
import com.digitalpetri.opcua.stack.core.types.builtin.unsigned.UByte;
import com.digitalpetri.opcua.stack.core.types.builtin.unsigned.UInteger;

@com.digitalpetri.opcua.sdk.server.util.UaVariableNode(typeName = "0:DataTypeDescriptionType")
public class DataTypeDescriptionNode extends BaseDataVariableNode implements DataTypeDescriptionType {

    public DataTypeDescriptionNode(
            UaNodeManager nodeManager,
            NodeId nodeId,
            VariableTypeNode variableTypeNode) {

        super(nodeManager, nodeId, variableTypeNode);
    }

    public DataTypeDescriptionNode(
            UaNodeManager nodeManager,
            NodeId nodeId,
            QualifiedName browseName,
            LocalizedText displayName,
            Optional<LocalizedText> description,
            Optional<UInteger> writeMask,
            Optional<UInteger> userWriteMask,
            DataValue value,
            NodeId dataType,
            Integer valueRank,
            Optional<UInteger[]> arrayDimensions,
            UByte accessLevel,
            UByte userAccessLevel,
            Optional<Double> minimumSamplingInterval,
            boolean historizing) {

        super(nodeManager, nodeId, browseName, displayName, description, writeMask, userWriteMask,
                value, dataType, valueRank, arrayDimensions, accessLevel, userAccessLevel, minimumSamplingInterval, historizing);
    }


    @Override
    public String getDataTypeVersion() {
        Optional<String> property = getProperty(DataTypeDescriptionType.DATA_TYPE_VERSION);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getDataTypeVersionNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(DataTypeDescriptionType.DATA_TYPE_VERSION.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setDataTypeVersion(String value) {
        setProperty(DataTypeDescriptionType.DATA_TYPE_VERSION, value);
    }

    @Override
    public ByteString getDictionaryFragment() {
        Optional<ByteString> property = getProperty(DataTypeDescriptionType.DICTIONARY_FRAGMENT);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getDictionaryFragmentNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(DataTypeDescriptionType.DICTIONARY_FRAGMENT.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setDictionaryFragment(ByteString value) {
        setProperty(DataTypeDescriptionType.DICTIONARY_FRAGMENT, value);
    }

}
