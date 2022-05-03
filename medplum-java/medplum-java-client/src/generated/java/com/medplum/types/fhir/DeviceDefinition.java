package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<String>> version();

  Optional<String> modelNumber();

  Optional<Narrative> text();

  Optional<String> manufacturerString();

  Optional<Reference> manufacturerReference();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> type();

  Optional<List<DeviceDefinition_Specialization>> specialization();

  Optional<List<ProductShelfLife>> shelfLifeStorage();

  Optional<List<ContactPoint>> contact();

  Optional<List<Annotation>> note();

  Optional<List<DeviceDefinition_UdiDeviceIdentifier>> udiDeviceIdentifier();

  Optional<List<CodeableConcept>> safety();

  Optional<Id> id();

  Optional<List<DeviceDefinition_Material>> material();

  Optional<ProdCharacteristic> physicalCharacteristics();

  Optional<List<DeviceDefinition_Property>> property();

  Optional<List<DeviceDefinition_DeviceName>> deviceName();

  Optional<Code> language();

  Optional<Reference> owner();

  Optional<Quantity> quantity();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> languageCode();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<Uri> url();

  Optional<Reference> parentDevice();

  Optional<List<Identifier>> identifier();

  Optional<Uri> onlineInformation();

  Optional<List<DeviceDefinition_Capability>> capability();

  static ImmutableDeviceDefinition.ResourceTypeBuildStage builder() {
    return ImmutableDeviceDefinition.builder();
  }
}
