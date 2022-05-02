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
  Optional<List<CodeableConcept>> languageCode();

  Optional<Reference> parentDevice();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> safety();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  Optional<Uri> url();

  Optional<Uri> implicitRules();

  Optional<List<DeviceDefinition_Specialization>> specialization();

  Optional<List<DeviceDefinition_Capability>> capability();

  Optional<Id> id();

  Optional<List<DeviceDefinition_DeviceName>> deviceName();

  Optional<Code> language();

  String resourceType();

  Optional<List<DeviceDefinition_Property>> property();

  Optional<List<ContactPoint>> contact();

  Optional<List<Annotation>> note();

  Optional<String> manufacturerString();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<Reference> manufacturerReference();

  Optional<List<String>> version();

  Optional<ProdCharacteristic> physicalCharacteristics();

  Optional<String> modelNumber();

  Optional<List<Identifier>> identifier();

  Optional<List<DeviceDefinition_UdiDeviceIdentifier>> udiDeviceIdentifier();

  Optional<Quantity> quantity();

  Optional<List<DeviceDefinition_Material>> material();

  Optional<List<ProductShelfLife>> shelfLifeStorage();

  Optional<Reference> owner();

  Optional<Uri> onlineInformation();

  static ImmutableDeviceDefinition.ResourceTypeBuildStage builder() {
    return ImmutableDeviceDefinition.builder();
  }
}
