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
  Optional<String> modelNumber();

  Optional<Uri> implicitRules();

  Optional<Reference> manufacturerReference();

  Optional<List<DeviceDefinition_Capability>> capability();

  Optional<Uri> url();

  Optional<Reference> owner();

  Optional<Id> id();

  Optional<List<CodeableConcept>> safety();

  Optional<List<DeviceDefinition_UdiDeviceIdentifier>> udiDeviceIdentifier();

  Optional<List<Annotation>> note();

  Optional<Reference> parentDevice();

  Optional<Uri> onlineInformation();

  Optional<List<ResourceList>> contained();

  Optional<List<DeviceDefinition_DeviceName>> deviceName();

  Optional<Quantity> quantity();

  Optional<List<ContactPoint>> contact();

  Optional<String> manufacturerString();

  Optional<List<DeviceDefinition_Specialization>> specialization();

  Optional<List<DeviceDefinition_Material>> material();

  Optional<List<CodeableConcept>> languageCode();

  Optional<List<Identifier>> identifier();

  Optional<List<ProductShelfLife>> shelfLifeStorage();

  Optional<List<DeviceDefinition_Property>> property();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<ProdCharacteristic> physicalCharacteristics();

  String resourceType();

  Optional<CodeableConcept> type();

  Optional<Narrative> text();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<List<String>> version();

  static ImmutableDeviceDefinition.ResourceTypeBuildStage builder() {
    return ImmutableDeviceDefinition.builder();
  }
}
