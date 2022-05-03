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
  Optional<List<Extension>> extension();

  Optional<String> modelNumber();

  Optional<List<DeviceDefinition_DeviceName>> deviceName();

  Optional<Reference> parentDevice();

  Optional<List<CodeableConcept>> languageCode();

  Optional<CodeableConcept> type();

  Optional<List<DeviceDefinition_Capability>> capability();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Optional<List<DeviceDefinition_Property>> property();

  Optional<List<DeviceDefinition_Specialization>> specialization();

  Optional<Uri> url();

  Optional<Quantity> quantity();

  Optional<ProdCharacteristic> physicalCharacteristics();

  Optional<List<Extension>> modifierExtension();

  Optional<List<String>> version();

  Optional<List<DeviceDefinition_UdiDeviceIdentifier>> udiDeviceIdentifier();

  Optional<List<ContactPoint>> contact();

  Optional<List<ProductShelfLife>> shelfLifeStorage();

  Optional<Meta> meta();

  Optional<Reference> owner();

  Optional<Reference> manufacturerReference();

  Optional<Uri> implicitRules();

  Optional<List<DeviceDefinition_Material>> material();

  Optional<Id> id();

  Optional<List<Annotation>> note();

  Optional<Narrative> text();

  Optional<String> manufacturerString();

  Optional<List<CodeableConcept>> safety();

  Optional<Code> language();

  Optional<Uri> onlineInformation();

  String resourceType();

  static ImmutableDeviceDefinition.ResourceTypeBuildStage builder() {
    return ImmutableDeviceDefinition.builder();
  }
}
