package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableDeviceDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DeviceDefinition {
  Optional<code> language();

  Optional<CodeableConcept> type();

  Optional<String> manufacturerString();

  Optional<Narrative> text();

  Optional<List<DeviceDefinition_Material>> material();

  Optional<List<CodeableConcept>> languageCode();

  Optional<List<Extension>> modifierExtension();

  Optional<List<String>> version();

  Optional<uri> url();

  Optional<List<Extension>> extension();

  Optional<List<Annotation>> note();

  Optional<uri> onlineInformation();

  Optional<List<ResourceList>> contained();

  Optional<String> modelNumber();

  Optional<List<ContactPoint>> contact();

  Optional<List<DeviceDefinition_Specialization>> specialization();

  Optional<List<DeviceDefinition_Capability>> capability();

  String resourceType();

  Optional<List<DeviceDefinition_UdiDeviceIdentifier>> udiDeviceIdentifier();

  Optional<Reference> parentDevice();

  Optional<List<DeviceDefinition_Property>> property();

  Optional<Reference> manufacturerReference();

  Optional<Meta> meta();

  Optional<id> id();

  Optional<List<Identifier>> identifier();

  Optional<Quantity> quantity();

  Optional<List<ProductShelfLife>> shelfLifeStorage();

  Optional<ProdCharacteristic> physicalCharacteristics();

  Optional<uri> implicitRules();

  Optional<Reference> owner();

  Optional<List<DeviceDefinition_DeviceName>> deviceName();

  Optional<List<CodeableConcept>> safety();

  static ImmutableDeviceDefinition.ResourceTypeBuildStage builder() {
    return ImmutableDeviceDefinition.builder();
  }
}
